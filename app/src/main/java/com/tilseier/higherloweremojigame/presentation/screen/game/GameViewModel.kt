package com.tilseier.higherloweremojigame.presentation.screen.game

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.plcoding.cryptocurrencyappyt.common.Resource
import com.tilseier.higherloweremojigame.domain.use_case.get_items.GetItemsUseCase
import com.tilseier.higherloweremojigame.util.AppPreferences
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class GameViewModel constructor(
    private val getItemsUseCase: GetItemsUseCase,
) : ViewModel() {
    private val _state = mutableStateOf(GameState())
    val state: State<GameState> = _state

    init {
        loadItems()
    }

    private fun loadItems() {
        getItemsUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = _state.value.copy(
                        allItems = result.data ?: emptyList(),
                        isLoading = false,
                        error = ""
                    )
                }
                // this part of code is not used so far
                is Resource.Error -> {
                    _state.value = _state.value.copy(
                        error = result.message ?: "An unexpected error occured",
                        isLoading = false
                    )
                }
                is Resource.Loading -> {
                    _state.value = _state.value.copy(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }

    fun newGame() {
        _state.value = _state.value.copy(
            currentItems = _state.value.generateItems(),
            currentItemIndex = 0,
            score = 0,
            isGameOver = false,
            higherScore = AppPreferences.preferences()?.higherScore()
                ?: AppPreferences.DEFAULT_HIGHER_SCORE,
            isLoading = false,
            error = ""
        )
    }

    fun continueGame() {
        _state.value = _state.value.copy(isGameOver = false)
        nextItem()
    }

    fun onMoreClick() {
        if (_state.value.guessItem.number >= _state.value.compareItem.number) {
            rightAnswer()
        } else {
            wrongAnswer()
        }
    }

    fun onLessClick() {
        if (_state.value.guessItem.number <= _state.value.compareItem.number) {
            rightAnswer()
        } else {
            wrongAnswer()
        }
    }

    private fun rightAnswer() {
        _state.value = _state.value.copy(score = _state.value.score + 1)
        nextItem()
    }

    private fun wrongAnswer() {
        val score = _state.value.score
        val higherScore = _state.value.higherScore
        val changeHigherScore = score > higherScore
        if (changeHigherScore) {
            AppPreferences.preferences()?.setHigherScore(score)
            _state.value = _state.value.copy(higherScore = score)
        }
        _state.value = _state.value.copy(isGameOver = true)
    }

    private fun nextItem() {
        val itemIndex = _state.value.currentItemIndex + 1
        if (_state.value.currentItems.size <= itemIndex) {
            return
        }
        _state.value = _state.value.copy(currentItemIndex = itemIndex)
    }
}
