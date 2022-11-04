package com.tilseier.higherloweremojigame.presentation.screen.games_menu

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.tilseier.higherloweremojigame.R
import com.tilseier.higherloweremojigame.common.Difficulty
import com.tilseier.higherloweremojigame.common.Game
import com.tilseier.higherloweremojigame.common.UiText
import com.tilseier.higherloweremojigame.presentation.screen.games_menu.model.MenuGame
import com.tilseier.higherloweremojigame.presentation.screen.menu.model.MenuDifficulty
import com.tilseier.higherloweremojigame.ui.theme.*
import com.tilseier.higherloweremojigame.util.AppPreferences

class GamesMenuViewModel : ViewModel() {
    val menuGames: MutableState<List<MenuGame>> = mutableStateOf(emptyList())

    fun updateMenuGames() {
        menuGames.value = listOf(
            MenuGame(
                title = UiText.StringResource(resId = R.string.text_invention_game_title),
                game = Game.INVENTION_GAME,
                score = AppPreferences.preferences()?.higherScore(Game.INVENTION_GAME, Difficulty.EASY)
                    ?: AppPreferences.DEFAULT_HIGHER_SCORE,
                sign = "\uD83D\uDCF1", // 📱
                color = MenuDifficultyMedium,
                borderColor = MenuDifficultyMediumBorder,
                buttonColor = MenuDifficultyMediumButton
            ),
            MenuGame(
                title = UiText.StringResource(resId = R.string.text_emoji_game_title),
                game = Game.EMOJI_GAME,
                score = AppPreferences.preferences()?.higherScore(Game.EMOJI_GAME, Difficulty.EASY)
                    ?: AppPreferences.DEFAULT_HIGHER_SCORE,
                sign = "\uD83D\uDE0A", // 😊
                color = MenuDifficultyEasy,
                borderColor = MenuDifficultyEasyBorder,
                buttonColor = MenuDifficultyEasyButton
            ),
        )
    }
}
