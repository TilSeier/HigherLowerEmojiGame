package com.tilseier.higherloweremojigame.presentation.screen.game

import com.tilseier.higherloweremojigame.common.Difficulty
import com.tilseier.higherloweremojigame.domain.model.EmojiItems
import com.tilseier.higherloweremojigame.domain.model.Item

// TODO remove this model if it doesn't work properly
data class GameState(
    val allItems: EmojiItems = EmojiItems(emptyList(), emptyList(), emptyList()),
    val currentItems: List<Item> = listOf(),
    val currentItemIndex: Int = 0,
    val score: Int = 0,
    val higherScore: Int = 0,
    val isGameOver: Boolean = false,
    val isLoading: Boolean = false,
    val difficulty: Difficulty = Difficulty.EASY,
    val error: String = ""
) {

    // TODO generate items properly
    fun generateItems(difficulty: Difficulty): List<Item> {
        return when(difficulty) {
            Difficulty.EASY -> allItems.easyItems // .shuffled()
            Difficulty.MEDIUM -> allItems.mediumItems
            Difficulty.HARD -> allItems.hardItems
        }
    }

    val compareItem: Item
        get() = currentItems[currentItemIndex]

    val guessItem: Item
        get() = currentItems[currentItemIndex + 1]
}
