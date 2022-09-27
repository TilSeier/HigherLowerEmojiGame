package com.tilseier.higherloweremojigame.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.tilseier.higherloweremojigame.R

val iOS14EmojiFont = FontFamily(
    Font(R.font.ios14_emoji, FontWeight.Normal),
    Font(R.font.ios14_emoji, FontWeight.SemiBold),
    Font(R.font.ios14_emoji, FontWeight.Bold),
    Font(R.font.ios14_emoji, FontWeight.Black)
)

// Set of Material typography styles to start with
val Typography = Typography(
    h1 = TextStyle(
        fontWeight = FontWeight.Black,
        fontSize = 30.sp
    ),

    h2 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 21.sp
    ),

    h3 = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    ),

    body1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)