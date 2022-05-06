package com.tilseier.higherloweremojigame.presentation.screen.menu

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.tilseier.higherloweremojigame.R
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
                score = AppPreferences.preferences()?.higherScore()
                    ?: AppPreferences.DEFAULT_HIGHER_SCORE, // TODO higher score for easy mode
                sign = "\uD83D\uDE0A", // 😊
                color = MenuDifficultyEasy,
                borderColor = MenuDifficultyEasyBorder,
                buttonColor = MenuDifficultyEasyButton
            ),
            MenuDifficulty(
                title = UiText.StringResource(resId = R.string.menu_difficulty_medium),
                score = AppPreferences.preferences()?.higherScore()
                    ?: AppPreferences.DEFAULT_HIGHER_SCORE, // TODO higher score for easy mode
                sign = "\uD83D\uDE15", // 😕
                color = MenuDifficultyMedium,
                borderColor = MenuDifficultyMediumBorder,
                buttonColor = MenuDifficultyMediumButton
            ),
            MenuDifficulty(
                title = UiText.StringResource(resId = R.string.menu_difficulty_easy),
                score = AppPreferences.preferences()?.higherScore()
                    ?: AppPreferences.DEFAULT_HIGHER_SCORE, // TODO higher score for easy mode
                sign = "\uD83D\uDE21", // 😡
                color = MenuDifficultyHard,
                borderColor = MenuDifficultyHardBorder,
                buttonColor = MenuDifficultyHardButton
            )
        )
    }
}
