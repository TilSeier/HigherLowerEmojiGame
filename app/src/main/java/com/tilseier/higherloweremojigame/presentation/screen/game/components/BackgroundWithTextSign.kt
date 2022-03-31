package com.tilseier.higherloweremojigame.presentation.screen.game

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.tilseier.higherloweremojigame.ui.theme.ItemBackgroundPurple

@Composable
fun BackgroundWithTextSign(
    modifier: Modifier = Modifier,
    sign: String,
    color: Color,
) {
    ConstraintLayout(
        modifier = modifier
            .clip(shape = RectangleShape)
            .background(color = color)
    ) {
        val (
            center_emoji,
            top_left_emoji_1, top_left_emoji_2,
            top_right_emoji_1, top_right_emoji_2,
            bottom_right_emoji_1, bottom_right_emoji_2,
            bottom_left_emoji_1, bottom_left_emoji_2
        ) = createRefs()
        val (
            top_left_alpha_emoji_1, top_left_alpha_emoji_2, top_left_alpha_emoji_3, top_left_alpha_emoji_4,
            top_right_alpha_emoji_1, top_right_alpha_emoji_2, top_right_alpha_emoji_3,
            bottom_left_alpha_emoji_1, bottom_left_alpha_emoji_2,
            bottom_right_alpha_emoji_1, bottom_right_alpha_emoji_2
        ) = createRefs()

        val fontSizeScale = 0.85f
        val alpha = 0.2f

        Box(
            modifier = Modifier
                .constrainAs(center_emoji) {
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                },
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (126 * fontSizeScale).sp
            )
        }

        // top left visible emojis
        Box(
            modifier = Modifier
                .constrainAs(top_left_emoji_2) {
                    start.linkTo(anchor = top_left_emoji_1.start, margin = 24.dp)
                    bottom.linkTo(anchor = top_left_emoji_1.bottom, margin = 26.dp)
                }
                .rotate(-32f),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (19 * fontSizeScale).sp
            )
        }

        Box(
            modifier = Modifier
                .constrainAs(top_left_emoji_1) {
                    end.linkTo(anchor = center_emoji.start, margin = 37.dp)
                    bottom.linkTo(anchor = center_emoji.top)
                }
                .rotate(-32f),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (37 * fontSizeScale).sp
            )
        }

        // top left alpha emojis
        Box(
            modifier = Modifier
                .constrainAs(top_left_alpha_emoji_1) {
                    end.linkTo(anchor = top_left_emoji_1.end, margin = 34.dp)
                    bottom.linkTo(anchor = top_left_emoji_1.top, margin = 12.dp)
                }
                .rotate(17f)
                .alpha(alpha),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (27 * fontSizeScale).sp
            )
        }

        Box(
            modifier = Modifier
                .constrainAs(top_left_alpha_emoji_2) {
                    start.linkTo(anchor = top_left_emoji_1.end, margin = 60.dp)
                    bottom.linkTo(anchor = top_left_emoji_1.bottom, margin = 28.dp)
                }
                .rotate(17f)
                .alpha(alpha),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (31 * fontSizeScale).sp
            )
        }

        Box(
            modifier = Modifier
                .constrainAs(top_left_alpha_emoji_3) {
                    start.linkTo(anchor = top_left_emoji_1.end, margin = 14.dp)
                    top.linkTo(anchor = top_left_emoji_1.bottom, margin = 10.dp)
                }
                .rotate(-17f)
                .alpha(alpha),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (20 * fontSizeScale).sp
            )
        }

        Box(
            modifier = Modifier
                .constrainAs(top_left_alpha_emoji_4) {
                    end.linkTo(anchor = top_left_emoji_1.start, margin = 12.dp)
                    top.linkTo(anchor = top_left_emoji_1.bottom, margin = 35.dp)
                }
                .rotate(-5f)
                .alpha(alpha),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (33 * fontSizeScale).sp
            )
        }

        // top right visible emojis
        Box(
            modifier = Modifier
                .constrainAs(top_right_emoji_2) {
                    start.linkTo(anchor = top_right_emoji_1.start, margin = 26.dp)
                    top.linkTo(anchor = top_right_emoji_1.top, margin = 28.dp)
                },
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (32 * fontSizeScale).sp
            )
        }

        Box(
            modifier = Modifier
                .constrainAs(top_right_emoji_1) {
                    start.linkTo(anchor = center_emoji.end, margin = 20.dp)
                    bottom.linkTo(anchor = center_emoji.top)
                }
                .rotate(16f),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (44 * fontSizeScale).sp
            )
        }

        // top right alpha emojis
        Box(
            modifier = Modifier
                .constrainAs(top_right_alpha_emoji_1) {
                    end.linkTo(anchor = top_right_emoji_1.start, margin = 18.dp)
                    top.linkTo(anchor = top_right_emoji_1.top, margin = 28.dp)
                }
                .rotate(18f)
                .alpha(alpha),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (24 * fontSizeScale).sp
            )
        }

        Box(
            modifier = Modifier
                .constrainAs(top_right_alpha_emoji_2) {
                    start.linkTo(anchor = top_right_emoji_1.end, margin = 26.dp)
                    top.linkTo(anchor = top_right_emoji_1.top, margin = 20.dp)
                }
                .rotate(17f)
                .alpha(alpha),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (35 * fontSizeScale).sp
            )
        }

        Box(
            modifier = Modifier
                .constrainAs(top_right_alpha_emoji_3) {
                    start.linkTo(anchor = top_right_emoji_1.start, margin = 18.dp)
                    top.linkTo(anchor = top_right_emoji_1.bottom, margin = 38.dp)
                }
                .rotate(-18f)
                .alpha(alpha),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (20 * fontSizeScale).sp
            )
        }

        // bottom right visible emojis
        Box(
            modifier = Modifier
                .constrainAs(bottom_right_emoji_2) {
                    start.linkTo(anchor = bottom_right_emoji_1.start, margin = 30.dp)
                    top.linkTo(anchor = bottom_right_emoji_1.top, margin = 0.dp)
                }
                .rotate(16f),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (19 * fontSizeScale).sp
            )
        }

        Box(
            modifier = Modifier
                .constrainAs(bottom_right_emoji_1) {
                    start.linkTo(anchor = center_emoji.end, margin = 20.dp)
                    top.linkTo(anchor = center_emoji.bottom, margin = 4.dp)
                }
                .rotate(16f),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (37 * fontSizeScale).sp
            )
        }

        // bottom right alpha emojis
        Box(
            modifier = Modifier
                .constrainAs(bottom_right_alpha_emoji_1) {
                    start.linkTo(anchor = bottom_right_emoji_1.end, margin = 20.dp)
                    bottom.linkTo(anchor = bottom_right_emoji_1.top, margin = 30.dp)
                }
                .rotate(16f)
                .alpha(alpha),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (31 * fontSizeScale).sp
            )
        }

        Box(
            modifier = Modifier
                .constrainAs(bottom_right_alpha_emoji_2) {
                    top.linkTo(anchor = bottom_right_emoji_1.top, margin = 15.dp)
                    end.linkTo(anchor = bottom_right_emoji_1.start, margin = 36.dp)
                }
                .rotate(-18f)
                .alpha(alpha),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (24 * fontSizeScale).sp
            )
        }

        // bottom left visible emojis
        Box(
            modifier = Modifier
                .constrainAs(bottom_left_emoji_2) {
                    start.linkTo(anchor = bottom_left_emoji_1.start, margin = 34.dp)
                    bottom.linkTo(anchor = bottom_left_emoji_1.bottom, margin = 8.dp)
                }
                .rotate(39f),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (33 * fontSizeScale).sp
            )
        }

        Box(
            modifier = Modifier
                .constrainAs(bottom_left_emoji_1) {
                    end.linkTo(anchor = center_emoji.start, margin = 38.dp)
                    top.linkTo(anchor = center_emoji.bottom)
                }
                .rotate(16f),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (44 * fontSizeScale).sp
            )
        }

        // bottom left alpha emojis
        Box(
            modifier = Modifier
                .constrainAs(bottom_left_alpha_emoji_1) {
                    start.linkTo(anchor = bottom_left_emoji_1.end, margin = 1.dp)
                    bottom.linkTo(anchor = bottom_left_emoji_1.top, margin = 22.dp)
                }
                .rotate(-17f)
                .alpha(alpha),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (19 * fontSizeScale).sp
            )
        }

        Box(
            modifier = Modifier
                .constrainAs(bottom_left_alpha_emoji_2) {
                    start.linkTo(anchor = bottom_left_emoji_1.end, margin = 63.dp)
                    top.linkTo(anchor = bottom_left_emoji_1.top, margin = 38.dp)
                }
                .rotate(17f)
                .alpha(alpha),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (33 * fontSizeScale).sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun BackgroundWithTextSignPreview() {
    BackgroundWithTextSign(
        modifier = Modifier.fillMaxSize(),
        sign = "\uD83D\uDE02",
        color = ItemBackgroundPurple
    )
}
