package com.tilseier.higherloweremojigame.presentation

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.plcoding.cryptocurrencyappyt.common.Resource
import com.tilseier.higherloweremojigame.common.Difficulty
import com.tilseier.higherloweremojigame.common.Game
import com.tilseier.higherloweremojigame.domain.model.EmojiItems
import com.tilseier.higherloweremojigame.domain.use_case.get_items.GetItemsUseCase
import com.tilseier.higherloweremojigame.presentation.monetization.MonetizationEvent
import com.tilseier.higherloweremojigame.presentation.screen.game.GameState
import com.tilseier.higherloweremojigame.presentation.screen.game.MoveAnimation
import com.tilseier.higherloweremojigame.presentation.screen.game.SHOW_ANSWER_DURATION
import com.tilseier.higherloweremojigame.util.AppPreferences
import com.tilseier.higherloweremojigame.util.TrackingUtil
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
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

    fun newGame(game: Game, difficulty: Difficulty) {
        _state.value = _state.value.copy(
            currentItems = _state.value.generateItems(game, difficulty),
            currentItemIndex = 0,
            showAnswerForItemIndex = 0,
            moveToItemAnimation = MoveAnimation.None,
            score = 0,
            continueCount = 0,
            isGameOver = false,
            higherScore = AppPreferences.preferences()?.higherScore(game, difficulty)
                ?: AppPreferences.DEFAULT_HIGHER_SCORE,
            isLoading = false,
            difficulty = difficulty,
            game = game,
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

            when (_state.value.game) {
                Game.EMOJI_GAME -> {
                    val itemNumber = _state.value.guessItem.emoji?.number ?: 0
                    val compareItemNumber = _state.value.compareItem.emoji?.number ?: 0
                    if (itemNumber >= compareItemNumber) {
                        rightAnswer()
                    } else {
                        wrongAnswer()
                    }
                }
                Game.INVENTION_GAME -> {
                    val itemYearOfInvention =
                        _state.value.guessItem.invention?.yearOfInvention ?: 0
                    val itemYearOfInventionEnd =
                        _state.value.guessItem.invention?.yearOfInventionEnd ?: itemYearOfInvention
                    val compareItemYearOfInvention =
                        _state.value.compareItem.invention?.yearOfInvention ?: 0

                    if (itemYearOfInventionEnd >= compareItemYearOfInvention) {
                        rightAnswer()
                    } else {
                        wrongAnswer()
                    }
                }
            }
        }
    }

    fun onLessClick() {
        viewModelScope.launch {
            _state.value = _state.value.copy(
                showAnswerForItemIndex = _state.value.currentItemIndex + 1
            )
            delay(SHOW_ANSWER_DURATION)

            when (_state.value.game) {
                Game.EMOJI_GAME -> {
                    val itemNumber = _state.value.guessItem.emoji?.number ?: 0
                    val compareItemNumber = _state.value.compareItem.emoji?.number ?: 0
                    if (itemNumber <= compareItemNumber) {
                        rightAnswer()
                    } else {
                        wrongAnswer()
                    }
                }
                Game.INVENTION_GAME -> {
                    val itemYearOfInvention =
                        _state.value.guessItem.invention?.yearOfInvention ?: 0
                    val compareItemYearOfInvention =
                        _state.value.compareItem.invention?.yearOfInvention ?: 0
                    val compareItemYearOfInventionEnd =
                        _state.value.compareItem.invention?.yearOfInventionEnd ?: compareItemYearOfInvention

                    if (itemYearOfInvention <= compareItemYearOfInventionEnd) {
                        rightAnswer()
                    } else {
                        wrongAnswer()
                    }
                }
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
                // nothing to do here
            }
            is GameEvent.OnContinueButtonClick -> {
                viewModelScope.launch {
                    _eventFlow.emit(UiEvent.ShowRewardedVideo)
                }
            }
        }
    }

    fun onEvent(event: MonetizationEvent.Ads) {
        when (event) {
            is MonetizationEvent.Ads.Initialized -> {}
            is MonetizationEvent.Ads.ObtainedConsent -> {
                TrackingUtil.trackObtainedConsent()
            }
            is MonetizationEvent.Ads.ConsentFormStatusUpdated -> {
                if (event.consentError != null) {
                    TrackingUtil.trackConsentFormError(
                        message = event.consentError.message ?: "NULL",
                        code = event.consentError.errorCode.toString(),
                    )
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
            AppPreferences.preferences()?.setHigherScore(_state.value.game, score, _state.value.difficulty)
            _state.value = _state.value.copy(higherScore = score)
        }
        _state.value = _state.value.copy(isGameOver = true)
    }

    private fun nextItem() {
        val itemIndex = _state.value.currentItemIndex + 1
        if (_state.value.currentItems.size - 2 <= itemIndex) {
            _state.value = _state.value.copy(
                currentItems = _state.value.currentItems + _state.value.generateItems(_state.value.game, _state.value.difficulty)
            )
        }
        if (_state.value.currentItems.size <= itemIndex) {
            return
        }
        _state.value = _state.value.copy(currentItemIndex = itemIndex)
    }
}
