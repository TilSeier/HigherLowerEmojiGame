package com.tilseier.higherloweremojigame.presentation.screen.menu

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.tilseier.higherloweremojigame.R
import com.tilseier.higherloweremojigame.common.Difficulty
import com.tilseier.higherloweremojigame.common.UiText
import com.tilseier.higherloweremojigame.presentation.screen.menu.model.MenuDifficulty
import com.tilseier.higherloweremojigame.ui.theme.*
import com.tilseier.higherloweremojigame.util.AppPreferences

class MenuViewModel : ViewModel() {
    val menuDifficulties: MutableState<List<MenuDifficulty>> = mutableStateOf(emptyList())

    fun updateMenuDifficulties() {
        menuDifficulties.value = listOf(
            MenuDifficulty(
                title = UiText.StringResource(resId = R.string.menu_difficulty_easy),
                difficulty = Difficulty.EASY,
                score = AppPreferences.preferences()?.higherScore(Difficulty.EASY)
                    ?: AppPreferences.DEFAULT_HIGHER_SCORE,
                sign = "\uD83D\uDE0A", // 😊
                color = MenuDifficultyEasy,
                borderColor = MenuDifficultyEasyBorder,
                buttonColor = MenuDifficultyEasyButton
            ),
            MenuDifficulty(
                title = UiText.StringResource(resId = R.string.menu_difficulty_medium),
                difficulty = Difficulty.MEDIUM,
                score = AppPreferences.preferences()?.higherScore(Difficulty.MEDIUM)
                    ?: AppPreferences.DEFAULT_HIGHER_SCORE,
                sign = "\uD83D\uDE15", // 😕
                color = MenuDifficultyMedium,
                borderColor = MenuDifficultyMediumBorder,
                buttonColor = MenuDifficultyMediumButton
            ),
            MenuDifficulty(
                title = UiText.StringResource(resId = R.string.menu_difficulty_hard),
                difficulty = Difficulty.HARD,
                score = AppPreferences.preferences()?.higherScore(Difficulty.HARD)
                    ?: AppPreferences.DEFAULT_HIGHER_SCORE,
                sign = "\uD83D\uDE21", // 😡
                color = MenuDifficultyHard,
                borderColor = MenuDifficultyHardBorder,
                buttonColor = MenuDifficultyHardButton
            )
        )
    }
}
