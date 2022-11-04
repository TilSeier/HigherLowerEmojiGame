package com.tilseier.higherloweremojigame.presentation.screen.games_menu.model

import androidx.annotation.DrawableRes
import androidx.compose.ui.graphics.Color
import com.tilseier.higherloweremojigame.common.Game
import com.tilseier.higherloweremojigame.common.UiText

data class MenuGame(
    val title: UiText,
    val game: Game,
    val score: Int,
    val sign: String,
    @DrawableRes val icon: Int,
    val color: Color,
    val borderColor: Color,
    val buttonColor: Color,
)
