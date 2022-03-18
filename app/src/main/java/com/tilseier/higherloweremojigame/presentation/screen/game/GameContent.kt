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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import coil.compose.rememberImagePainter
import com.tilseier.higherloweremojigame.R
import com.tilseier.higherloweremojigame.model.Item
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

    // TODO can we use Flow here?
    // val currentItems: List<Item> by viewModel.state
    //    .map { it.currentItems }
    //    .collectAsState(initial = listOf())

    Column {

        val lazyListState: LazyListState = rememberLazyListState()

        // TODO move logic to ViewModel
        // TODO design of game screen
        // TODO disable user scroll interaction

        // TODO use answer object
        LaunchedEffect(key1 = currentItemIndex) {
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
        val emojiImage = rememberImagePainter(item.imageUrl)
        // TODO shown answer with animation
        Image(
            painter = emojiImage,
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
                .padding(30.dp)
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
                        text = stringResource(id = R.string.text_than_this_item, compareItem?.name ?: "")
                    )
                }
            }
        }
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
