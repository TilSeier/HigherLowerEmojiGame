package com.tilseier.higherloweremojigame.presentation.screen.game

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.tilseier.higherloweremojigame.data.ItemsLocalDataSource
import com.tilseier.higherloweremojigame.data.ItemsRepository
import com.tilseier.higherloweremojigame.model.GameModel
import com.tilseier.higherloweremojigame.util.AppPreferences

class GameViewModel : ViewModel() {
    private val itemsRepository: ItemsRepository = ItemsRepository(ItemsLocalDataSource())

    private val _state = mutableStateOf(GameModel(allItems = itemsRepository.emojiItems))
    val state: State<GameModel> = _state

    fun newGame() {
        _state.value = _state.value.copy(
            currentItems = _state.value.generateItems(),
            currentItemIndex = 0,
            score = 0,
            isGameOver = false,
            higherScore = AppPreferences.preferences()?.higherScore()
                ?: AppPreferences.DEFAULT_HIGHER_SCORE,
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
