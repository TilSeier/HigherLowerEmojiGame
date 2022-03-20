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

// TODO finish BackgroundWithTextSign
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

        Box(
            modifier = Modifier
                .size(126.dp)
                .background(Color.Black)
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
                fontSize = 20.sp
            )
        }

        // top left visible emojis
        Box(
            modifier = Modifier
                .size(19.dp)
                .constrainAs(top_left_emoji_2) {
                    start.linkTo(anchor = top_left_emoji_1.start, margin = 24.dp)
                    bottom.linkTo(anchor = top_left_emoji_1.bottom, margin = 26.dp)
                }
                .rotate(-32f)
        ) {
            Text(
                text = sign,
                fontSize = 100.sp
            )
        }

        Box(
            modifier = Modifier
                .size(37.dp)
                .constrainAs(top_left_emoji_1) {
                    end.linkTo(anchor = center_emoji.start, margin = 37.dp)
                    bottom.linkTo(anchor = center_emoji.top)
                }
                .rotate(-32f)
        ) {
            Text(
                text = sign,
                fontSize = 100.sp
            )
        }

        // top left alpha emojis
        Box(
            modifier = Modifier
                .size(27.dp)
                .constrainAs(top_left_alpha_emoji_1) {
                    end.linkTo(anchor = top_left_emoji_1.end, margin = 34.dp)
                    bottom.linkTo(anchor = top_left_emoji_1.top, margin = 12.dp)
                }
                .rotate(17f)
                .alpha(0.2f)
        ) {
            Text(
                text = sign,
                fontSize = 100.sp
            )
        }

        Box(
            modifier = Modifier
                .size(31.dp)
                .constrainAs(top_left_alpha_emoji_2) {
                    start.linkTo(anchor = top_left_emoji_1.end, margin = 60.dp)
                    bottom.linkTo(anchor = top_left_emoji_1.bottom, margin = 28.dp)
                }
                .rotate(17f)
                .alpha(0.2f)
        ) {
            Text(
                text = sign,
                fontSize = 100.sp
            )
        }

        Box(
            modifier = Modifier
                .size(20.dp)
                .constrainAs(top_left_alpha_emoji_3) {
                    start.linkTo(anchor = top_left_emoji_1.end, margin = 14.dp)
                    top.linkTo(anchor = top_left_emoji_1.bottom, margin = 10.dp)
                }
                .rotate(-17f)
                .alpha(0.2f)
        ) {
            Text(
                text = sign,
                fontSize = 100.sp
            )
        }

        Box(
            modifier = Modifier
                .size(33.dp)
                .constrainAs(top_left_alpha_emoji_4) {
                    end.linkTo(anchor = top_left_emoji_1.start, margin = 12.dp)
                    top.linkTo(anchor = top_left_emoji_1.bottom, margin = 35.dp)
                }
                .rotate(-5f)
                .alpha(0.2f)
        ) {
            Text(
                text = sign,
                fontSize = 100.sp
            )
        }

        // top right visible emojis
        Box(
            modifier = Modifier
                .size(32.dp)
                .constrainAs(top_right_emoji_2) {
                    start.linkTo(anchor = top_right_emoji_1.start, margin = 26.dp)
                    top.linkTo(anchor = top_right_emoji_1.top, margin = 28.dp)
                }
        ) {
            Text(
                text = sign,
                fontSize = 100.sp
            )
        }

        Box(
            modifier = Modifier
                .size(44.dp)
                .constrainAs(top_right_emoji_1) {
                    start.linkTo(anchor = center_emoji.end, margin = 20.dp)
                    bottom.linkTo(anchor = center_emoji.top)
                }
                .rotate(16f)
        ) {
            Text(
                text = sign,
                fontSize = 100.sp
            )
        }

        // top right alpha emojis
        Box(
            modifier = Modifier
                .size(24.dp)
                .constrainAs(top_right_alpha_emoji_1) {
                    end.linkTo(anchor = top_right_emoji_1.start, margin = 18.dp)
                    top.linkTo(anchor = top_right_emoji_1.top, margin = 28.dp)
                }
                .rotate(18f)
                .alpha(0.2f)
        ) {
            Text(
                text = sign,
                fontSize = 100.sp
            )
        }

        Box(
            modifier = Modifier
                .size(35.dp)
                .constrainAs(top_right_alpha_emoji_2) {
                    start.linkTo(anchor = top_right_emoji_1.end, margin = 26.dp)
                    top.linkTo(anchor = top_right_emoji_1.top, margin = 20.dp)
                }
                .rotate(17f)
                .alpha(0.2f)
        ) {
            Text(
                text = sign,
                fontSize = 100.sp
            )
        }

        Box(
            modifier = Modifier
                .size(20.dp)
                .constrainAs(top_right_alpha_emoji_3) {
                    start.linkTo(anchor = top_right_emoji_1.start, margin = 18.dp)
                    top.linkTo(anchor = top_right_emoji_1.bottom, margin = 38.dp)
                }
                .rotate(-18f)
                .alpha(0.2f)
        ) {
            Text(
                text = sign,
                fontSize = 100.sp
            )
        }

        // bottom right visible emojis
        Box(
            modifier = Modifier
                .size(19.dp)
                .constrainAs(bottom_right_emoji_2) {
                    start.linkTo(anchor = bottom_right_emoji_1.start, margin = 30.dp)
                    top.linkTo(anchor = bottom_right_emoji_1.top, margin = 0.dp)
                }
                .rotate(16f)
        ) {
            Text(
                text = sign,
                fontSize = 100.sp
            )
        }

        Box(
            modifier = Modifier
                .size(37.dp)
                .constrainAs(bottom_right_emoji_1) {
                    start.linkTo(anchor = center_emoji.end, margin = 20.dp)
                    top.linkTo(anchor = center_emoji.bottom, margin = 4.dp)
                }
                .rotate(16f)
        ) {
            Text(
                text = sign,
                fontSize = 100.sp
            )
        }

        // bottom right alpha emojis
        Box(
            modifier = Modifier
                .size(31.dp)
                .constrainAs(bottom_right_alpha_emoji_1) {
                    start.linkTo(anchor = bottom_right_emoji_1.end, margin = 20.dp)
                    bottom.linkTo(anchor = bottom_right_emoji_1.top, margin = 30.dp)
                }
                .rotate(16f)
                .alpha(0.2f)
        ) {
            Text(
                text = sign,
                fontSize = 100.sp
            )
        }

        Box(
            modifier = Modifier
                .size(24.dp)
                .constrainAs(bottom_right_alpha_emoji_2) {
                    top.linkTo(anchor = bottom_right_emoji_1.top, margin = 15.dp)
                    end.linkTo(anchor = bottom_right_emoji_1.start, margin = 36.dp)
                }
                .rotate(-18f)
                .alpha(0.2f)
        ) {
            Text(
                text = sign,
                fontSize = 100.sp
            )
        }

        // bottom left visible emojis
        Box(
            modifier = Modifier
                .size(33.dp)
                .constrainAs(bottom_left_emoji_2) {
                    start.linkTo(anchor = bottom_left_emoji_1.start, margin = 34.dp)
                    bottom.linkTo(anchor = bottom_left_emoji_1.bottom, margin = 8.dp)
                }
                .rotate(39f)
        ) {
            Text(
                text = sign,
                fontSize = 100.sp
            )
        }

        Box(
            modifier = Modifier
                .size(44.dp)
                .constrainAs(bottom_left_emoji_1) {
                    end.linkTo(anchor = center_emoji.start, margin = 38.dp)
                    top.linkTo(anchor = center_emoji.bottom)
                }
                .rotate(16f)
        ) {
            Text(
                text = sign,
                fontSize = 100.sp
            )
        }

        // bottom left alpha emojis
        Box(
            modifier = Modifier
                .size(19.dp)
                .constrainAs(bottom_left_alpha_emoji_1) {
                    start.linkTo(anchor = bottom_left_emoji_1.end, margin = 1.dp)
                    bottom.linkTo(anchor = bottom_left_emoji_1.top, margin = 22.dp)
                }
                .rotate(-17f)
                .alpha(0.2f)
        ) {
            Text(
                text = sign,
                fontSize = 100.sp
            )
        }

        Box(
            modifier = Modifier
                .size(33.dp)
                .constrainAs(bottom_left_alpha_emoji_2) {
                    start.linkTo(anchor = bottom_left_emoji_1.end, margin = 63.dp)
                    top.linkTo(anchor = bottom_left_emoji_1.top, margin = 38.dp)
                }
                .rotate(17f)
                .alpha(0.2f)
        ) {
            Text(
                text = sign,
                fontSize = 100.sp
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
