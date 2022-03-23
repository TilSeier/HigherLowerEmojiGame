package com.tilseier.higherloweremojigame.presentation.screen.game

import androidx.lifecycle.ViewModel
import com.tilseier.higherloweremojigame.data.ItemsLocalDataSource
import com.tilseier.higherloweremojigame.data.ItemsRepository
import com.tilseier.higherloweremojigame.model.GameModel
import com.tilseier.higherloweremojigame.util.AppPreferences
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class GameViewModel : ViewModel() {
    private val itemsRepository: ItemsRepository = ItemsRepository(ItemsLocalDataSource())

    // val allItems: List<Item> = itemsRepository.emojiItems
    // val currentItems: MutableState<List<Item>> = mutableStateOf(listOf())
    // val currentItemIndex: MutableState<Int> = mutableStateOf(0)
    // val score: MutableState<Int> = mutableStateOf(0)
    // val higherScore: MutableState<Int> = mutableStateOf(0)

    // TODO maybe remove one model
    val state: StateFlow<GameModel>
        get() = _state

    private val _state: MutableStateFlow<GameModel> by lazy {
        MutableStateFlow(GameModel(allItems = itemsRepository.emojiItems))
    }

    fun newGame() {
        _state.update { model ->
            model.copy(
                currentItems = _state.value.generateItems(),
                currentItemIndex = 0,
                score = 0,
                isGameOver = false,
                higherScore = AppPreferences.preferences()?.higherScore()
                    ?: AppPreferences.DEFAULT_HIGHER_SCORE,
            )
        }
    }

    fun continueGame() {
        _state.update { model -> model.copy(isGameOver = false) }
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
        _state.update { model -> model.copy(score = _state.value.score + 1) }
        nextItem()
    }

    private fun wrongAnswer() {
        val score = _state.value.score
        val higherScore = _state.value.higherScore
        val changeHigherScore = score > higherScore
        if (changeHigherScore) {
            AppPreferences.preferences()?.setHigherScore(score)
            _state.update { model -> model.copy(higherScore = score) }
        }
        _state.update { model -> model.copy(isGameOver = true) }
    }

    private fun nextItem() {
        val itemIndex = _state.value.currentItemIndex + 1
        if (_state.value.currentItems.size <= itemIndex) {
            return
        }
        _state.update { model -> model.copy(currentItemIndex = itemIndex) }
    }
}
