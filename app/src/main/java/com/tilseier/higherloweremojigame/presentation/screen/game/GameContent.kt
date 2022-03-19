package com.tilseier.higherloweremojigame.presentation.screen.game

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberImagePainter
import com.tilseier.higherloweremojigame.R
import com.tilseier.higherloweremojigame.model.Item
import com.tilseier.higherloweremojigame.presentation.navigation.Screen
import com.tilseier.higherloweremojigame.ui.theme.DarkHover
import dev.chrisbanes.snapper.ExperimentalSnapperApi
import com.tilseier.higherloweremojigame.ui.theme.HigherLowerEmojiGameTheme
import dev.chrisbanes.snapper.SnapOffsets
import dev.chrisbanes.snapper.rememberSnapperFlingBehavior
import kotlinx.coroutines.delay
import tilseier.tiktaktoktoe.extantions.formatNumberToString

@OptIn(ExperimentalSnapperApi::class)
@Composable
fun GameContent(
    navController: NavHostController,
    viewModel: GameViewModel
) {
    val state by viewModel.state.collectAsState()
    val currentItems: List<Item> = state.currentItems
    val currentItemIndex: Int = state.currentItemIndex
    val isGameOver: Boolean = state.isGameOver

    // TODO can we use Flow here?
    // val currentItems: List<Item> by viewModel.state
    //    .map { it.currentItems }
    //    .collectAsState(initial = listOf())

    LaunchedEffect(key1 = isGameOver) {
        if (isGameOver) {
            // TODO animate wrong answer
            navController.navigate(route = Screen.GameOver.route) {
                popUpTo(Screen.Menu.route)
            }
        }
    }

    Column {

        val lazyListState: LazyListState = rememberLazyListState()

        // TODO move logic to ViewModel
        // TODO design of game screen
        // TODO disable user scroll interaction

        // TODO use answer object
        LaunchedEffect(key1 = currentItemIndex) {
            // TODO animate right answer
            lazyListState.animateScrollToItem(currentItemIndex)
        }

        LazyColumn(
            modifier = Modifier.fillMaxSize(),
            state = lazyListState,
            flingBehavior = rememberSnapperFlingBehavior(
                lazyListState = lazyListState,
                snapOffsetForItem = SnapOffsets.Start
            ),
        ) {
            itemsIndexed(currentItems) { index, item ->
                val previousItemIndex = index - 1
                val previousItem = currentItems.getOrNull(previousItemIndex)
//                if (item.sign == null) {
                ItemWithEmojiImage(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillParentMaxHeight(fraction = 0.5f)
                        .background(color = item.backgroundColor),
                    item = item,
                    compareItem = previousItem,
                    isAnswerVisible = index <= currentItemIndex,
                    onMoreClick = {
                        viewModel.onMoreClick()
                    },
                    onLessClick = {
                        viewModel.onLessClick()
                    }
                )
                // TODO finish ItemWithEmojiSign
//                } else {
//                    ItemWithEmojiSign(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .fillParentMaxHeight(fraction = 0.5f)
//                            .background(color = item.backgroundColor),
//                        item = item
//                    )
//                }
            }
        }
    }
}

@Composable
private fun ItemWithEmojiImage(
    modifier: Modifier = Modifier,
    item: Item,
    compareItem: Item?,
    isAnswerVisible: Boolean,
    onMoreClick: () -> Unit,
    onLessClick: () -> Unit,
) {
    // TODO background from blur image
    Box(modifier = modifier) {
        // TODO shown answer with animation
        BackgroundWithImage(
            modifier = Modifier.fillMaxSize(),
            imageURL = item.imageUrl
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = DarkHover),
            contentAlignment = Alignment.TopCenter
        ) {
            Column(modifier = Modifier.padding(top = 20.dp)) {
                Text(text = stringResource(id = R.string.item_name, item.name))
                Text(text = stringResource(id = R.string.text_is_used))

                var moreClick by rememberSaveable { mutableStateOf(false) }
                var lessClick by rememberSaveable { mutableStateOf(false) }
                var showAnswer by rememberSaveable { mutableStateOf(false) }

                LaunchedEffect(key1 = moreClick) {
                    if (moreClick) {
                        showAnswer = true
                        delay(1000)
                        moreClick = false
                        onMoreClick()
                    }
                }
                LaunchedEffect(key1 = lessClick) {
                    if (lessClick) {
                        showAnswer = true
                        delay(1000)
                        lessClick = false
                        onLessClick()
                    }
                }

                AnimatedVisibility(visible = isAnswerVisible || showAnswer) {
                    AnswerNumber(number = item.number.formatNumberToString())
                }

                if (!isAnswerVisible && !showAnswer) {
                    OutlinedButton(onClick = {
                        if (!lessClick) {
                            moreClick = true
                        }
                    }) {
                        Text(text = stringResource(id = R.string.button_more))
                    }
                    OutlinedButton(onClick = {
                        if (!moreClick) {
                            lessClick = true
                        }
                    }) {
                        Text(text = stringResource(id = R.string.button_less))
                    }
                    Text(
                        text = stringResource(
                            id = R.string.text_than_this_item,
                            compareItem?.name ?: ""
                        )
                    )
                }
            }
        }
    }
}

@Composable
private fun BackgroundWithImage(
    modifier: Modifier = Modifier,
    imageURL: String,
) {
    ConstraintLayout(modifier = modifier.clip(shape = RectangleShape)) {
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
            painter = rememberImagePainter(imageURL),
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
            painter = rememberImagePainter(imageURL),
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
            painter = rememberImagePainter(imageURL),
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
            painter = rememberImagePainter(imageURL),
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
            painter = rememberImagePainter(imageURL),
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
            painter = rememberImagePainter(imageURL),
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
            painter = rememberImagePainter(imageURL),
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
            painter = rememberImagePainter(imageURL),
            contentDescription = null,
            modifier = Modifier
                .size(32.dp)
                .constrainAs(top_right_emoji_2) {
                    start.linkTo(anchor = top_right_emoji_1.start, margin = 26.dp)
                    top.linkTo(anchor = top_right_emoji_1.top, margin = 28.dp)
                }
        )

        Image(
            painter = rememberImagePainter(imageURL),
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
            painter = rememberImagePainter(imageURL),
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
            painter = rememberImagePainter(imageURL),
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
            painter = rememberImagePainter(imageURL),
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
            painter = rememberImagePainter(imageURL),
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
            painter = rememberImagePainter(imageURL),
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
            painter = rememberImagePainter(imageURL),
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
            painter = rememberImagePainter(imageURL),
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
            painter = rememberImagePainter(imageURL),
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
            painter = rememberImagePainter(imageURL),
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
            painter = rememberImagePainter(imageURL),
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
            painter = rememberImagePainter(imageURL),
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

@Composable
private fun AnswerNumber(number: String) {
    Column {
        Text(text = stringResource(id = R.string.formatted_number, number))
        Text(text = stringResource(id = R.string.text_on_average_monthly))
    }
}

@Composable
private fun ItemWithEmojiSign(
    modifier: Modifier = Modifier,
    item: Item
) {
    Box(modifier = modifier) {
        item.sign?.let { sign ->
            Text(
                text = sign,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(30.dp),
                fontSize = 120.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun GameContentPreview() {
    HigherLowerEmojiGameTheme {
        GameContent(
            navController = rememberNavController(),
            viewModel = viewModel()
        )
    }
}
