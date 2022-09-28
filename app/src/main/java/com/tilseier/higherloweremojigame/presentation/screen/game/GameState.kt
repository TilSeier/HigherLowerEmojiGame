package com.tilseier.higherloweremojigame.presentation.screen.game

import com.tilseier.higherloweremojigame.common.Difficulty
import com.tilseier.higherloweremojigame.domain.model.EmojiItems
import com.tilseier.higherloweremojigame.domain.model.Item
import kotlin.math.absoluteValue

sealed class MoveAnimation {
    object ShowRightAnswerAndMove: MoveAnimation()
    object SqueezeVsAndMove: MoveAnimation()
    object None: MoveAnimation()
}

const val SHOW_ANSWER_DURATION: Long = 1500
const val NUMBER_ANIMATION_DURATION: Int = (SHOW_ANSWER_DURATION - 500).toInt()

// TODO remove this model if it doesn't work properly
data class GameState(
    val allItems: EmojiItems = EmojiItems(emptyList(), emptyList(), emptyList()),
    val currentItems: List<Item> = listOf(),
    val currentItemIndex: Int = 0,
    val showAnswerForItemIndex: Int = 0,
    val moveToItemAnimation: MoveAnimation = MoveAnimation.None,
    val score: Int = 0,
    val higherScore: Int = 0,
    val continueCount: Int = 0,
    val isGameOver: Boolean = false,
    val isLoading: Boolean = false,
    val difficulty: Difficulty = Difficulty.EASY,
    val error: String = ""
) {

    // TODO generate items properly
    fun generateItems(difficulty: Difficulty): List<Item> {
        return when (difficulty) {
            Difficulty.EASY -> {
                // TODO fix more less more less issue for big difference number
                shuffleItemsWithDifferenceFirst(allItems.easyItems, 2_000_000)
            }
            Difficulty.MEDIUM -> shuffleItemsWithDifferenceFirst(allItems.mediumItems, 500_000)
            Difficulty.HARD -> allItems.hardItems.shuffled()
        }
    }

    private enum class ListOrder { FIRST, SECOND, THIRD, FORTH }

    private fun shuffleItemsWithDifferenceFirst(items: List<Item>, difference: Long): List<Item> {

        // TODO
        //  1. Shuffle list
        //  2. Pair previous and current elements
        //  3. Filter pairs with .partition
        //  4. Make list

        val shuffledItems = items.shuffled()

        val first = ArrayList<Item>()
        val second = ArrayList<Item>()
        val third = ArrayList<Item>()
        val forth = ArrayList<Item>()

        for (item in shuffledItems) {
            val lastElementFirst = first.lastOrNull()
            val lastElementSecond = second.lastOrNull()
            val lastElementThird = third.lastOrNull()
            val number = item.number
            val listOrder = when {
                number.haveMinDifferenceWith(lastElementFirst?.number, difference) -> ListOrder.FIRST
                number.haveMinDifferenceWith(lastElementSecond?.number, difference) -> ListOrder.SECOND
                number.haveMinDifferenceWith(lastElementThird?.number, difference) -> ListOrder.THIRD
                else -> ListOrder.FORTH
            }

            when (listOrder) {
                ListOrder.FIRST -> first.add(item)
                ListOrder.SECOND -> second.add(item)
                ListOrder.THIRD -> third.add(item)
                else -> forth.add(item)
            }
        }

        return first + second + third + forth
    }

    private fun Long.haveMinDifferenceWith(number: Long?, minDifference: Long): Boolean {
        return if (number == null) {
            true
        } else {
            val numberDifference = (number - this).absoluteValue
            numberDifference >= minDifference
        }
    }

    val compareItem: Item
        get() = currentItems[currentItemIndex]

    val guessItem: Item
        get() = currentItems[currentItemIndex + 1]
}
