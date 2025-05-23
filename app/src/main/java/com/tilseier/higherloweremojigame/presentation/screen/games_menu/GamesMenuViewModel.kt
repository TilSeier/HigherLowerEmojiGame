package com.tilseier.higherloweremojigame.presentation.screen.games_menu

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.tilseier.higherloweremojigame.R
import com.tilseier.higherloweremojigame.common.Difficulty
import com.tilseier.higherloweremojigame.common.Game
import com.tilseier.higherloweremojigame.common.UiText
import com.tilseier.higherloweremojigame.presentation.screen.games_menu.model.MenuGame
import com.tilseier.higherloweremojigame.ui.theme.MenuDifficultyEasy
import com.tilseier.higherloweremojigame.ui.theme.MenuDifficultyEasyBorder
import com.tilseier.higherloweremojigame.ui.theme.MenuDifficultyEasyButton
import com.tilseier.higherloweremojigame.ui.theme.MenuDifficultyMedium
import com.tilseier.higherloweremojigame.ui.theme.MenuDifficultyMediumBorder
import com.tilseier.higherloweremojigame.ui.theme.MenuDifficultyMediumButton
import com.tilseier.higherloweremojigame.util.AppPreferences

class GamesMenuViewModel : ViewModel() {
    val menuGames: MutableState<List<MenuGame>> = mutableStateOf(emptyList())

    fun updateMenuGames() {
        menuGames.value = listOf(
            MenuGame(
                title = UiText.StringResource(resId = R.string.text_invention_game_title),
                description = UiText.StringResource(resId = R.string.text_invention_game_description),
                game = Game.INVENTION_GAME,
                score = AppPreferences.preferences()?.higherScore(Game.INVENTION_GAME, Difficulty.EASY)
                    ?: AppPreferences.DEFAULT_HIGHER_SCORE,
                sign = "\uD83D\uDCF1", // 📱
                icon = R.drawable.icon_invention_game,
                color = MenuDifficultyMedium,
                borderColor = MenuDifficultyMediumBorder,
                buttonColor = MenuDifficultyMediumButton
            ),
            MenuGame(
                title = UiText.StringResource(resId = R.string.text_emoji_game_title),
                description = UiText.StringResource(resId = R.string.text_emoji_game_description),
                game = Game.EMOJI_GAME,
                score = AppPreferences.preferences()?.higherScore(Game.EMOJI_GAME, Difficulty.EASY)
                    ?: AppPreferences.DEFAULT_HIGHER_SCORE,
                sign = "\uD83D\uDE0A", // 😊
                icon = R.drawable.icon_emoji_game,
                color = MenuDifficultyEasy,
                borderColor = MenuDifficultyEasyBorder,
                buttonColor = MenuDifficultyEasyButton
            ),
        )
    }
}
