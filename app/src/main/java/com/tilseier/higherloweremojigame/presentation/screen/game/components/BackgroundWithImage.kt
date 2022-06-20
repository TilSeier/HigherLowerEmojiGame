package com.tilseier.higherloweremojigame.presentation.screen.game.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import coil.compose.rememberImagePainter
import com.tilseier.higherloweremojigame.R
import com.tilseier.higherloweremojigame.ui.theme.ItemBackgroundDarkPurple

@Composable
fun BackgroundWithImageURL(
    modifier: Modifier = Modifier,
    imageURL: String,
    color: Color,
) {
    BasicImageBackground(
        modifier = modifier,
        imageURL = imageURL,
        color = color,
    )
}

@Composable
fun BackgroundWithImageRes(
    modifier: Modifier = Modifier,
    imageRes: Int,
    color: Color,
) {
    BasicImageBackground(
        modifier = modifier,
        imageRes = imageRes,
        color = color,
    )
}

@Composable
fun BasicImageBackground(
    modifier: Modifier = Modifier,
    imageURL: String? = null,
    imageRes: Int? = null,
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


        Image(
            painter = imageURL?.let { rememberImagePainter(it) }
                ?: imageRes?.let { painterResource(id = it) }
                ?: rememberImagePainter(imageURL),
            contentDescription = null,
            modifier = Modifier
                .size(126.dp)
                .constrainAs(center_emoji) {
                    start.linkTo(parent.start)
                    top.linkTo(parent.top)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                }
        )

        // top left visible emojis
        Image(
            painter = imageURL?.let { rememberImagePainter(it) }
                ?: imageRes?.let { painterResource(id = it) }
                ?: rememberImagePainter(imageURL),
            contentDescription = null,
            modifier = Modifier
                .size(19.dp)
                .constrainAs(top_left_emoji_2) {
                    start.linkTo(anchor = top_left_emoji_1.start, margin = 24.dp)
                    bottom.linkTo(anchor = top_left_emoji_1.bottom, margin = 26.dp)
                }
                .rotate(-32f)
        )

        Image(
            painter = imageURL?.let { rememberImagePainter(it) }
                ?: imageRes?.let { painterResource(id = it) }
                ?: rememberImagePainter(imageURL),
            contentDescription = null,
            modifier = Modifier
                .size(37.dp)
                .constrainAs(top_left_emoji_1) {
                    end.linkTo(anchor = center_emoji.start, margin = 37.dp)
                    bottom.linkTo(anchor = center_emoji.top)
                }
                .rotate(-32f)
        )

        // top left alpha emojis
        Image(
            painter = imageURL?.let { rememberImagePainter(it) }
                ?: imageRes?.let { painterResource(id = it) }
                ?: rememberImagePainter(imageURL),
            contentDescription = null,
            modifier = Modifier
                .size(27.dp)
                .constrainAs(top_left_alpha_emoji_1) {
                    end.linkTo(anchor = top_left_emoji_1.end, margin = 34.dp)
                    bottom.linkTo(anchor = top_left_emoji_1.top, margin = 12.dp)
                }
                .rotate(17f)
                .alpha(0.2f)
        )

        Image(
            painter = imageURL?.let { rememberImagePainter(it) }
                ?: imageRes?.let { painterResource(id = it) }
                ?: rememberImagePainter(imageURL),
            contentDescription = null,
            modifier = Modifier
                .size(31.dp)
                .constrainAs(top_left_alpha_emoji_2) {
                    start.linkTo(anchor = top_left_emoji_1.end, margin = 60.dp)
                    bottom.linkTo(anchor = top_left_emoji_1.bottom, margin = 28.dp)
                }
                .rotate(17f)
                .alpha(0.2f)
        )

        Image(
            painter = imageURL?.let { rememberImagePainter(it) }
                ?: imageRes?.let { painterResource(id = it) }
                ?: rememberImagePainter(imageURL),
            contentDescription = null,
            modifier = Modifier
                .size(20.dp)
                .constrainAs(top_left_alpha_emoji_3) {
                    start.linkTo(anchor = top_left_emoji_1.end, margin = 14.dp)
                    top.linkTo(anchor = top_left_emoji_1.bottom, margin = 10.dp)
                }
                .rotate(-17f)
                .alpha(0.2f)
        )

        Image(
            painter = imageURL?.let { rememberImagePainter(it) }
                ?: imageRes?.let { painterResource(id = it) }
                ?: rememberImagePainter(imageURL),
            contentDescription = null,
            modifier = Modifier
                .size(33.dp)
                .constrainAs(top_left_alpha_emoji_4) {
                    end.linkTo(anchor = top_left_emoji_1.start, margin = 12.dp)
                    top.linkTo(anchor = top_left_emoji_1.bottom, margin = 35.dp)
                }
                .rotate(-5f)
                .alpha(0.2f)
        )

        // top right visible emojis
        Image(
            painter = imageURL?.let { rememberImagePainter(it) }
                ?: imageRes?.let { painterResource(id = it) }
                ?: rememberImagePainter(imageURL),
            contentDescription = null,
            modifier = Modifier
                .size(32.dp)
                .constrainAs(top_right_emoji_2) {
                    start.linkTo(anchor = top_right_emoji_1.start, margin = 26.dp)
                    top.linkTo(anchor = top_right_emoji_1.top, margin = 28.dp)
                }
        )

        Image(
            painter = imageURL?.let { rememberImagePainter(it) }
                ?: imageRes?.let { painterResource(id = it) }
                ?: rememberImagePainter(imageURL),
            contentDescription = null,
            modifier = Modifier
                .size(44.dp)
                .constrainAs(top_right_emoji_1) {
                    start.linkTo(anchor = center_emoji.end, margin = 20.dp)
                    bottom.linkTo(anchor = center_emoji.top)
                }
                .rotate(16f)
        )

        // top right alpha emojis
        Image(
            painter = imageURL?.let { rememberImagePainter(it) }
                ?: imageRes?.let { painterResource(id = it) }
                ?: rememberImagePainter(imageURL),
            contentDescription = null,
            modifier = Modifier
                .size(24.dp)
                .constrainAs(top_right_alpha_emoji_1) {
                    end.linkTo(anchor = top_right_emoji_1.start, margin = 18.dp)
                    top.linkTo(anchor = top_right_emoji_1.top, margin = 28.dp)
                }
                .rotate(18f)
                .alpha(0.2f)
        )

        Image(
            painter = imageURL?.let { rememberImagePainter(it) }
                ?: imageRes?.let { painterResource(id = it) }
                ?: rememberImagePainter(imageURL),
            contentDescription = null,
            modifier = Modifier
                .size(35.dp)
                .constrainAs(top_right_alpha_emoji_2) {
                    start.linkTo(anchor = top_right_emoji_1.end, margin = 26.dp)
                    top.linkTo(anchor = top_right_emoji_1.top, margin = 20.dp)
                }
                .rotate(17f)
                .alpha(0.2f)
        )

        Image(
            painter = imageURL?.let { rememberImagePainter(it) }
                ?: imageRes?.let { painterResource(id = it) }
                ?: rememberImagePainter(imageURL),
            contentDescription = null,
            modifier = Modifier
                .size(20.dp)
                .constrainAs(top_right_alpha_emoji_3) {
                    start.linkTo(anchor = top_right_emoji_1.start, margin = 18.dp)
                    top.linkTo(anchor = top_right_emoji_1.bottom, margin = 38.dp)
                }
                .rotate(-18f)
                .alpha(0.2f)
        )

        // bottom right visible emojis
        Image(
            painter = imageURL?.let { rememberImagePainter(it) }
                ?: imageRes?.let { painterResource(id = it) }
                ?: rememberImagePainter(imageURL),
            contentDescription = null,
            modifier = Modifier
                .size(19.dp)
                .constrainAs(bottom_right_emoji_2) {
                    start.linkTo(anchor = bottom_right_emoji_1.start, margin = 30.dp)
                    top.linkTo(anchor = bottom_right_emoji_1.top, margin = 0.dp)
                }
                .rotate(16f)
        )

        Image(
            painter = imageURL?.let { rememberImagePainter(it) }
                ?: imageRes?.let { painterResource(id = it) }
                ?: rememberImagePainter(imageURL),
            contentDescription = null,
            modifier = Modifier
                .size(37.dp)
                .constrainAs(bottom_right_emoji_1) {
                    start.linkTo(anchor = center_emoji.end, margin = 20.dp)
                    top.linkTo(anchor = center_emoji.bottom, margin = 4.dp)
                }
                .rotate(16f)
        )

        // bottom right alpha emojis
        Image(
            painter = imageURL?.let { rememberImagePainter(it) }
                ?: imageRes?.let { painterResource(id = it) }
                ?: rememberImagePainter(imageURL),
            contentDescription = null,
            modifier = Modifier
                .size(31.dp)
                .constrainAs(bottom_right_alpha_emoji_1) {
                    start.linkTo(anchor = bottom_right_emoji_1.end, margin = 20.dp)
                    bottom.linkTo(anchor = bottom_right_emoji_1.top, margin = 30.dp)
                }
                .rotate(16f)
                .alpha(0.2f)
        )

        Image(
            painter = imageURL?.let { rememberImagePainter(it) }
                ?: imageRes?.let { painterResource(id = it) }
                ?: rememberImagePainter(imageURL),
            contentDescription = null,
            modifier = Modifier
                .size(24.dp)
                .constrainAs(bottom_right_alpha_emoji_2) {
                    top.linkTo(anchor = bottom_right_emoji_1.top, margin = 15.dp)
                    end.linkTo(anchor = bottom_right_emoji_1.start, margin = 36.dp)
                }
                .rotate(-18f)
                .alpha(0.2f)
        )

        // bottom left visible emojis
        Image(
            painter = imageURL?.let { rememberImagePainter(it) }
                ?: imageRes?.let { painterResource(id = it) }
                ?: rememberImagePainter(imageURL),
            contentDescription = null,
            modifier = Modifier
                .size(33.dp)
                .constrainAs(bottom_left_emoji_2) {
                    start.linkTo(anchor = bottom_left_emoji_1.start, margin = 34.dp)
                    bottom.linkTo(anchor = bottom_left_emoji_1.bottom, margin = 8.dp)
                }
                .rotate(39f)
        )

        Image(
            painter = imageURL?.let { rememberImagePainter(it) }
                ?: imageRes?.let { painterResource(id = it) }
                ?: rememberImagePainter(imageURL),
            contentDescription = null,
            modifier = Modifier
                .size(44.dp)
                .constrainAs(bottom_left_emoji_1) {
                    end.linkTo(anchor = center_emoji.start, margin = 38.dp)
                    top.linkTo(anchor = center_emoji.bottom)
                }
                .rotate(16f)
        )

        // bottom left alpha emojis
        Image(
            painter = imageURL?.let { rememberImagePainter(it) }
                ?: imageRes?.let { painterResource(id = it) }
                ?: rememberImagePainter(imageURL),
            contentDescription = null,
            modifier = Modifier
                .size(19.dp)
                .constrainAs(bottom_left_alpha_emoji_1) {
                    start.linkTo(anchor = bottom_left_emoji_1.end, margin = 1.dp)
                    bottom.linkTo(anchor = bottom_left_emoji_1.top, margin = 22.dp)
                }
                .rotate(-17f)
                .alpha(0.2f)
        )

        Image(
            painter = imageURL?.let { rememberImagePainter(it) }
                ?: imageRes?.let { painterResource(id = it) }
                ?: rememberImagePainter(imageURL),
            contentDescription = null,
            modifier = Modifier
                .size(33.dp)
                .constrainAs(bottom_left_alpha_emoji_2) {
                    start.linkTo(anchor = bottom_left_emoji_1.end, margin = 63.dp)
                    top.linkTo(anchor = bottom_left_emoji_1.top, margin = 38.dp)
                }
                .rotate(17f)
                .alpha(0.2f)
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun BackgroundWithImageResPreview() {
    BackgroundWithImageRes(
        modifier = Modifier.fillMaxSize(),
        imageRes = R.drawable.face_with_tears_of_joy,
        color = ItemBackgroundDarkPurple
    )
}
