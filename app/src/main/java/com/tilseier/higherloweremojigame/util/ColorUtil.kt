package com.tilseier.higherloweremojigame.util

import androidx.compose.ui.graphics.Color
import com.tilseier.higherloweremojigame.ui.theme.*

object ColorUtil {
    fun getItemBackgroundColor(number: Int): Color {
        val colors = listOf(
            ItemBackgroundDarkPurple,
            ItemBackgroundLightPurple,
            ItemBackgroundRed,
            ItemBackgroundDarkGreen,
            ItemBackgroundLightGreen,
            ItemBackgroundDarkOrange,
            ItemBackgroundOrange,
            ItemBackgroundTurquoise,
            // New colors
            ItemBackgroundLightGreen2,
            ItemBackgroundDarkGreen2,
            ItemBackgroundDarkRed,
            ItemBackgroundLightBlue,
            ItemBackgroundDarkBlue,
            ItemBackgroundDarkOrange2,
            ItemBackgroundDarkPurple2,
            ItemBackgroundDarkYellow,
            ItemBackgroundDarkGray,
        )
        return colors[number % colors.size]
    }
}
