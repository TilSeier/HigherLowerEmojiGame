package com.tilseier.higherloweremojigame.ui.theme

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val DarkHover = Color(0x66000000)

val ItemNumber = Color(0xFFFFFC4D)

val ItemBackgroundPurple = Color(0xFF69369C)
val ItemBackgroundLightPurple = Color(0xFF8C47E3)
val ItemBackgroundRed = Color(0xFFFF2052)
val ItemBackgroundDarkGreen = Color(0xFF14443C)
val ItemBackgroundLightGreen = Color(0xFF37D877)
val ItemBackgroundDarkOrange = Color(0xFFE34747)
val ItemBackgroundOrange = Color(0xFFFF9534)
val ItemBackgroundTurquoise = Color(0xFF3AF6D4)

val Colors.AppThemeColor
    get() = if (isLight) Color.White else Color.Black

val Colors.AppContentColor
    get() = if (isLight) Color.Black else Color.White
