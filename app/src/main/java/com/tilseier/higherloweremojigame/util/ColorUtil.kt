package com.tilseier.higherloweremojigame.util

import androidx.compose.ui.graphics.Color
import com.tilseier.higherloweremojigame.ui.theme.*

object ColorUtil {
    fun getItemBackgroundColor(number: Int): Color {
        val colors = listOf(
            ItemBackgroundPurple,
            ItemBackgroundLightPurple,
            ItemBackgroundRed,
            ItemBackgroundDarkGreen,
            ItemBackgroundLightGreen,
            ItemBackgroundDarkOrange,
            ItemBackgroundOrange,
            ItemBackgroundTurquoise,
        )
        return colors[number % colors.size]
    }
}
