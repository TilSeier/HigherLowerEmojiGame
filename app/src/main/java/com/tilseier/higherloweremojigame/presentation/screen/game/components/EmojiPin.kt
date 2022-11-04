package com.tilseier.higherloweremojigame.presentation.screen.game.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.tilseier.higherloweremojigame.ui.theme.iOS14EmojiFont

@Composable
fun EmojiPin(
    emoji: String,
    mainColor: Color,
    borderColor: Color,
    modifier: Modifier = Modifier,
    fontFamily: FontFamily? = iOS14EmojiFont,
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Box(
            modifier = modifier,
            contentAlignment = Alignment.BottomCenter
        ) {
            Canvas(
                modifier = Modifier
                    .width(40.dp)
                    .height(20.dp)
            ) {
                val path = Path().apply {
                    moveTo(0f, 0f)
                    lineTo(size.width, 0f)
                    lineTo(size.width / 2f, size.height)
                    close()
                }

                drawPath(
                    path = path,
                    brush = SolidColor(mainColor)
                )
            }
            Box(
                modifier = Modifier
                    .padding(bottom = 10.dp)
                    .size(50.dp)
                    .clip(CircleShape)
                    .background(mainColor)
                    .padding(4.dp)
                    .clip(CircleShape)
                    .background(borderColor)
                    .padding(4.dp)
                    .clip(CircleShape)
                    .background(mainColor),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = emoji,
                    fontSize = 16.sp,
                    fontFamily = fontFamily
                )
            }
        }
        Spacer(modifier = Modifier.height(2.dp))
        Box(
            modifier = Modifier
                .size(6.dp)
                .clip(CircleShape)
                .background(mainColor)
        )
    }
}
