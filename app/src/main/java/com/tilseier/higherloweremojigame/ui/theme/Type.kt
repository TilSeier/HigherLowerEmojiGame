package com.tilseier.higherloweremojigame.ui.theme

import android.os.Build
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.tilseier.higherloweremojigame.R

// Unfortunately, this font cause IllegalStateException: Could not load font
// on devices that have Android version less then 7.0
val iOS14EmojiFont = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
    FontFamily(
        Font(R.font.ios14_emoji, FontWeight.Normal),
        Font(R.font.ios14_emoji, FontWeight.SemiBold),
        Font(R.font.ios14_emoji, FontWeight.Bold),
        Font(R.font.ios14_emoji, FontWeight.Black)
    )
} else {
    FontFamily.Default
}

// Set of Material typography styles to start with
val Typography = Typography(
    titleLarge = TextStyle( // h1
        fontWeight = FontWeight.Black,
        fontSize = 30.sp
    ),

    titleMedium = TextStyle( // h2
        fontWeight = FontWeight.Bold,
        fontSize = 21.sp
    ),

    titleSmall = TextStyle( // h3
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp
    ),

    bodyLarge = TextStyle( // body1
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