package com.tilseier.higherloweremojigame.presentation.screen.game

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.tilseier.higherloweremojigame.R
import com.tilseier.higherloweremojigame.domain.model.Item
import com.tilseier.higherloweremojigame.extantions.disabledHorizontalPointerInputScroll
import com.tilseier.higherloweremojigame.extantions.disabledVerticalPointerInputScroll
import com.tilseier.higherloweremojigame.extantions.formatNumberToString
import com.tilseier.higherloweremojigame.presentation.common.rememberWindowInfo
import com.tilseier.higherloweremojigame.presentation.components.AutoSizeText
import com.tilseier.higherloweremojigame.presentation.navigation.Screen
import com.tilseier.higherloweremojigame.presentation.screen.game.components.BackgroundWithImageURL
import com.tilseier.higherloweremojigame.presentation.screen.game.components.BackgroundWithTextSign
import com.tilseier.higherloweremojigame.presentation.screen.game.components.LazyColumnOrRow
import com.tilseier.higherloweremojigame.ui.theme.DarkHover
import com.tilseier.higherloweremojigame.ui.theme.HigherLowerEmojiGameTheme
import com.tilseier.higherloweremojigame.ui.theme.ItemNumber
import com.tilseier.higherloweremojigame.ui.theme.Typography
import com.tilseier.higherloweremojigame.util.ColorUtil
import dev.chrisbanes.snapper.ExperimentalSnapperApi
import dev.chrisbanes.snapper.SnapOffsets
import dev.chrisbanes.snapper.rememberSnapperFlingBehavior
import kotlinx.coroutines.delay

@OptIn(ExperimentalSnapperApi::class)
@Composable
fun GameContent(
    navController: NavHostController,
    viewModel: GameViewModel
) {
    val state = viewModel.state.value
    val currentItems: List<Item> = state.currentItems
    val currentItemIndex: Int = state.currentItemIndex
    val isGameOver: Boolean = state.isGameOver
    val higherScore: Int = state.higherScore
    val score: Int = state.score

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

        Box {
            ItemsList(
                items = currentItems,
                currentItemIndex = currentItemIndex,
                modifier = Modifier.fillMaxSize(),
                state = lazyListState,
                onMoreClick = {
                    viewModel.onMoreClick()
                },
                onLessClick = {
                    viewModel.onLessClick()
                }
            )

            StatusBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 3.dp, horizontal = 5.dp),
                score = score,
                higherScore = higherScore,
                onMenuClick = {
                    navController.popBackStack()
                }
            )

            val windowInfo = rememberWindowInfo()
            if (windowInfo.isCompactScreenWidth) {
                HorizontalVsDivider(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.Center)
                )
            } else {
                VerticalVsDivider(
                    modifier = Modifier
                        .fillMaxHeight()
                        .align(Alignment.Center)
                )
            }
        }
    }
}

@Composable
fun HorizontalVsDivider(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Divider(
            modifier = Modifier.align(Alignment.Center),
            color = Color.White,
            thickness = 3.dp
        )
        Box {
            Box(
                modifier = Modifier
                    .size(30.dp)
                    .rotate(45f)
                    .background(color = Color.White)
            )
            Text(
                text = stringResource(id = R.string.vs),
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(bottom = 2.dp),
                style = Typography.h3.copy(fontSize = 18.sp),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun VerticalVsDivider(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .width(3.dp)
                .background(Color.White)
                .align(Alignment.Center),
        )
        Box {
            Box(
                modifier = Modifier
                    .size(30.dp)
                    .rotate(45f)
                    .background(color = Color.White)
            )
            Text(
                text = stringResource(id = R.string.vs),
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(bottom = 2.dp),
                style = Typography.h3.copy(fontSize = 18.sp),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun StatusBar(
    modifier: Modifier = Modifier,
    score: Int,
    higherScore: Int,
    onMenuClick: () -> Unit,
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(modifier = Modifier.weight(1f)) {
            Row(
                modifier = Modifier.clickable { onMenuClick() },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_home),
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp)
                )
                Text(
                    text = stringResource(id = R.string.button_main_menu),
                    fontSize = 16.sp,
                    color = Color.White
                )
            }
        }
        Text(
            text = stringResource(id = R.string.high_score, higherScore),
            fontSize = 16.sp,
            color = Color.White
        )
        Spacer(modifier = Modifier.width(15.dp))
        Text(
            text = stringResource(id = R.string.score, score),
            fontSize = 16.sp,
            color = Color.White
        )
    }
}

@OptIn(ExperimentalSnapperApi::class)
@Composable
fun ItemsList(
    items: List<Item>,
    currentItemIndex: Int,
    modifier: Modifier = Modifier,
    state: LazyListState = rememberLazyListState(),
    onMoreClick: () -> Unit,
    onLessClick: () -> Unit,
) {
    val windowInfo = rememberWindowInfo()
    // TODO use userScrollEnabled when it's ready (instead of disabledVerticalPointerInputScroll)
    val disablePointerInputScrollModifier = if (windowInfo.isCompactScreenWidth) {
        modifier.disabledVerticalPointerInputScroll() // TODO sometimes cause continue issue
    } else {
        modifier.disabledHorizontalPointerInputScroll() // TODO sometimes cause continue issue
    }
    LazyColumnOrRow(
        useLazyColumn = windowInfo.isCompactScreenWidth,
        modifier = disablePointerInputScrollModifier,
        state = state,
        flingBehavior = rememberSnapperFlingBehavior(
            lazyListState = state,
            snapOffsetForItem = SnapOffsets.Start
        )
    ) {
        itemsIndexed(items) { index, item ->
            val previousItemIndex = index - 1
            val previousItem = items.getOrNull(previousItemIndex)

            val itemModifier = if (windowInfo.isCompactScreenWidth) {
                Modifier
                    .fillMaxWidth()
                    .fillParentMaxHeight(fraction = 0.5f)
            } else {
                Modifier
                    .fillMaxHeight()
                    .fillParentMaxWidth(fraction = 0.5f)
            }
            ItemWithEmoji(
                modifier = itemModifier,
                item = item,
                compareItem = previousItem,
                isAnswerVisible = index <= currentItemIndex,
                onMoreClick = onMoreClick,
                onLessClick = onLessClick
            )
        }
    }
}

@Composable
private fun ItemWithEmoji(
    modifier: Modifier = Modifier,
    item: Item,
    compareItem: Item?,
    isAnswerVisible: Boolean,
    onMoreClick: () -> Unit,
    onLessClick: () -> Unit,
) {
    // TODO background from blur image?
    Box(modifier = modifier) {
        // TODO shown answer with animation
        item.sign?.let { sign ->
            BackgroundWithTextSign(
                modifier = Modifier.fillMaxSize(),
                sign = sign,
                color = item.backgroundColor ?: ColorUtil.getItemBackgroundColor(item.name.length)
            )
        } ?: run {
            BackgroundWithImageURL(
                modifier = Modifier.fillMaxSize(),
                imageURL = item.imageUrl,
                color = item.backgroundColor ?: ColorUtil.getItemBackgroundColor(item.name.length)
            )
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = DarkHover),
            contentAlignment = Alignment.TopCenter
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                AutoSizeText(
                    text = stringResource(id = R.string.item_name, item.name),
                    modifier = Modifier.padding(horizontal = 16.dp),
                    color = Color.White,
                    maxFontSize = 24.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = stringResource(id = R.string.text_is_used),
                    color = Color.White,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center
                )

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
                    AnswerNumber(
                        modifier = Modifier.fillMaxWidth(),
                        number = item.number.formatNumberToString()
                    )
                }

                if (!isAnswerVisible && !showAnswer) {
                    ItemButton(
                        onClick = {
                            if (!lessClick) {
                                moreClick = true
                            }
                        },
                        modifier = Modifier.padding()
                    ) {
                        Text(
                            text = stringResource(id = R.string.button_more),
                            fontSize = 18.sp
                        )
                    }
                    ItemButton(
                        onClick = {
                            if (!moreClick) {
                                lessClick = true
                            }
                        },
                        modifier = Modifier.padding()
                    ) {
                        Text(
                            text = stringResource(id = R.string.button_less),
                            fontSize = 18.sp
                        )
                    }

                    AutoSizeText(
                        text = stringResource(
                            id = R.string.text_than_this_item,
                            compareItem?.name ?: ""
                        ),
                        modifier = Modifier.padding(horizontal = 16.dp),
                        color = Color.White,
                        maxFontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}

@Composable
private fun AnswerNumber(
    modifier: Modifier = Modifier,
    number: String
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.formatted_number, number),
            color = ItemNumber,
            fontSize = 35.sp
        )
        Text(
            text = stringResource(id = R.string.text_on_average_monthly),
            color = Color.White,
            fontSize = 14.sp
        )
    }
}

@Composable
private fun ItemButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RowScope.() -> Unit
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier,
        shape = CircleShape,
        border = BorderStroke((1.2).dp, Color.White),
        elevation = ButtonDefaults.elevation(defaultElevation = 0.dp, pressedElevation = 2.dp),
        contentPadding = PaddingValues(vertical = 6.dp, horizontal = 30.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            backgroundColor = Color.Transparent,
            contentColor = ItemNumber
        )
    ) {
        content()
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
