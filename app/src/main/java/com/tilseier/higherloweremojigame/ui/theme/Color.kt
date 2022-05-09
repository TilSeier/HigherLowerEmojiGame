package com.tilseier.higherloweremojigame.ui.theme

import androidx.compose.material.Colors
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val Gray = Color(0xFFBDBDBD)

val DarkHover = Color(0x66000000)

val ItemNumber = Color(0xFFFFFC4D)

val StatusBar = Color(0xFF250544)
val Background = Color(0xFF2F0655)

val ItemBackgroundPurple = Color(0xFF69369C)
val ItemBackgroundLightPurple = Color(0xFF8C47E3)
val ItemBackgroundRed = Color(0xFFFF2052)
val ItemBackgroundDarkGreen = Color(0xFF14443C)
val ItemBackgroundLightGreen = Color(0xFF37D877)
val ItemBackgroundDarkOrange = Color(0xFFE34747)
val ItemBackgroundOrange = Color(0xFFFF9534)
val ItemBackgroundTurquoise = Color(0xFF3AF6D4)

val MenuDifficultyEasy = Color(0xFFF9D423)
val MenuDifficultyEasyBorder = Color(0xFFBB9C09)
val MenuDifficultyEasyButton = Color(0xFFE7C007)
val MenuDifficultyMedium = Color(0xFFFC913A)
val MenuDifficultyMediumBorder = Color(0xFFD77424)
val MenuDifficultyMediumButton = Color(0xFFF48225)
val MenuDifficultyHard = Color(0xFFFF4E50)
val MenuDifficultyHardBorder = Color(0xFFD7393B)
val MenuDifficultyHardButton = Color(0xFFFF3C3E)

val DialogBackground = Color(0xFFF9D423)
val DialogBorder = Color(0xFFBB9C09)

val HigherScore = Color(0xFFF9D423)

val ButtonYellow = Color(0xFFF9D423)
val ButtonYellowBorder = Color(0xFFBB9C09)

val ButtonRed = Color(0xFFFF4E50)
val ButtonRedBorder = Color(0xFFD7393B)

val FactTitle = Color(0xFFE3BF0F)

val Colors.AppThemeColor
    get() = if (isLight) Color.White else Color.Black

val Colors.AppContentColor
    get() = if (isLight) Color.Black else Color.White
