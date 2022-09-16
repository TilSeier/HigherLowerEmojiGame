package com.tilseier.higherloweremojigame.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.plcoding.cryptocurrencyappyt.common.Resource
import com.tilseier.higherloweremojigame.common.Difficulty
import com.tilseier.higherloweremojigame.domain.model.EmojiItems
import com.tilseier.higherloweremojigame.domain.use_case.get_items.GetItemsUseCase
import com.tilseier.higherloweremojigame.presentation.screen.game.GameState
import com.tilseier.higherloweremojigame.presentation.screen.game.MoveAnimation
import com.tilseier.higherloweremojigame.presentation.screen.game.SHOW_ANSWER_DURATION
import com.tilseier.higherloweremojigame.util.AppPreferences
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

class GameViewModel constructor(
    private val getItemsUseCase: GetItemsUseCase,
) : ViewModel() {
    private val _state = mutableStateOf(GameState())
    val state: State<GameState> = _state

    init {
        loadItems()
    }

    sealed class RewardedVideoState {
        object None: RewardedVideoState()
        object Loaded: RewardedVideoState()
        object FailedToLoad: RewardedVideoState()
    }

    sealed class UiEvent {
        object LoadRewardedVideo : UiEvent()
        object ShowRewardedVideo : UiEvent()
        object OnReward : UiEvent()
    }

    private val _eventFlow = MutableSharedFlow<UiEvent>()
    val eventFlow = _eventFlow.asSharedFlow()

    val rewardedVideoState = MutableStateFlow<RewardedVideoState>(RewardedVideoState.None)

    private fun loadItems() {
        getItemsUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = _state.value.copy(
                        allItems = result.data ?: EmojiItems(emptyList(), emptyList(), emptyList()),
                        isLoading = false,
                        error = ""
                    )
                }
                // this part of code is not used so far because we use only local data
                is Resource.Error -> {
                    _state.value = _state.value.copy(
                        isLoading = false,
                        error = result.message ?: "An unexpected error occured"
                    )
                }
                is Resource.Loading -> {
                    _state.value = _state.value.copy(
                        isLoading = true,
                        error = ""
                    )
                }
            }
        }.launchIn(viewModelScope)
    }

    fun newGame(difficulty: Difficulty) {
        _state.value = _state.value.copy(
            currentItems = _state.value.generateItems(difficulty),
            currentItemIndex = 0,
            showAnswerForItemIndex = 0,
            moveToItemAnimation = MoveAnimation.None,
            score = 0,
            continueCount = 0,
            isGameOver = false,
            higherScore = AppPreferences.preferences()?.higherScore(difficulty)
                ?: AppPreferences.DEFAULT_HIGHER_SCORE,
            isLoading = false,
            difficulty = difficulty,
            error = ""
        )
    }

    fun continueGame() {
        _state.value = _state.value.copy(
            isGameOver = false,
            continueCount = _state.value.continueCount + 1,
            moveToItemAnimation = MoveAnimation.SqueezeVsAndMove
        )
        nextItem()
    }

    fun onMoreClick() {
        viewModelScope.launch {
            _state.value = _state.value.copy(
                showAnswerForItemIndex = _state.value.currentItemIndex + 1
            )
            delay(SHOW_ANSWER_DURATION)

            if (_state.value.guessItem.number >= _state.value.compareItem.number) {
                rightAnswer()
            } else {
                wrongAnswer()
            }
        }
    }

    fun onLessClick() {
        viewModelScope.launch {
            _state.value = _state.value.copy(
                showAnswerForItemIndex = _state.value.currentItemIndex + 1
            )
            delay(SHOW_ANSWER_DURATION)

            if (_state.value.guessItem.number <= _state.value.compareItem.number) {
                rightAnswer()
            } else {
                wrongAnswer()
            }
        }
    }

    fun onEvent(event: GameEvent) {
        when (event) {
            is GameEvent.OnRewardedVideoLoaded -> {
                rewardedVideoState.value = RewardedVideoState.Loaded
            }
            is GameEvent.OnRewardedVideoFailedToLoad -> {
                rewardedVideoState.value = RewardedVideoState.FailedToLoad
            }
            is GameEvent.OnRewardedVideoDismissed -> {
                rewardedVideoState.value = RewardedVideoState.None
            }
            is GameEvent.OnRewardedVideoReward -> {
                viewModelScope.launch {
                    _eventFlow.emit(UiEvent.OnReward)
                }
            }
            is GameEvent.OnGameOverScreenOpen -> {
                viewModelScope.launch {
                    _eventFlow.emit(UiEvent.LoadRewardedVideo)
                }
            }
            is GameEvent.OnContinueButtonClick -> {
                viewModelScope.launch {
                    _eventFlow.emit(UiEvent.ShowRewardedVideo)
                }
            }
        }
    }

    private fun rightAnswer() {
        _state.value = _state.value.copy(
            score = _state.value.score + 1,
            moveToItemAnimation = MoveAnimation.ShowRightAnswerAndMove
        )
        nextItem()
    }

    private fun wrongAnswer() {
        val score = _state.value.score
        val higherScore = _state.value.higherScore
        val changeHigherScore = score > higherScore
        if (changeHigherScore) {
            AppPreferences.preferences()?.setHigherScore(score, _state.value.difficulty)
            _state.value = _state.value.copy(higherScore = score)
        }
        _state.value = _state.value.copy(isGameOver = true)
    }

    private fun nextItem() {
        val itemIndex = _state.value.currentItemIndex + 1
        if (_state.value.currentItems.size - 2 <= itemIndex) {
            _state.value = _state.value.copy(
                currentItems = _state.value.currentItems + _state.value.generateItems(_state.value.difficulty)
            )
        }
        if (_state.value.currentItems.size <= itemIndex) {
            return
        }
        _state.value = _state.value.copy(currentItemIndex = itemIndex)
    }
}