package com.tilseier.higherloweremojigame.presentation.screen.menu.model

import androidx.compose.ui.graphics.Color
import com.tilseier.higherloweremojigame.common.Difficulty
import com.tilseier.higherloweremojigame.common.UiText

data class MenuDifficulty(
    val title: UiText,
    val difficulty: Difficulty,
    val score: Int,
    val sign: String,
    val color: Color,
    val borderColor: Color,
    val buttonColor: Color,
)
