package com.tilseier.higherloweremojigame.presentation.screen.game

import android.widget.Toast
import androidx.activity.compose.BackHandler
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterExitState
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.animateColor
import androidx.compose.animation.core.ExperimentalTransitionApi
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateInt
import androidx.compose.animation.core.tween
import androidx.compose.animation.core.updateTransition
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalClipboardManager
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.tilseier.higherloweremojigame.R
import com.tilseier.higherloweremojigame.common.Game
import com.tilseier.higherloweremojigame.domain.model.Item
import com.tilseier.higherloweremojigame.extantions.formatNumberToString
import com.tilseier.higherloweremojigame.extantions.spNotScalable
import com.tilseier.higherloweremojigame.presentation.GameViewModel
import com.tilseier.higherloweremojigame.presentation.common.WindowInfo
import com.tilseier.higherloweremojigame.presentation.common.rememberWindowInfo
import com.tilseier.higherloweremojigame.presentation.components.AutoSizeText
import com.tilseier.higherloweremojigame.presentation.navigation.Screen
import com.tilseier.higherloweremojigame.presentation.screen.game.components.BackgroundWithImageURL
import com.tilseier.higherloweremojigame.presentation.screen.game.components.BackgroundWithTextSign
import com.tilseier.higherloweremojigame.presentation.screen.game.components.EmojiPin
import com.tilseier.higherloweremojigame.presentation.screen.game.components.LazyColumnOrRow
import com.tilseier.higherloweremojigame.ui.theme.DarkHover
import com.tilseier.higherloweremojigame.ui.theme.Gray
import com.tilseier.higherloweremojigame.ui.theme.HigherLowerEmojiGameTheme
import com.tilseier.higherloweremojigame.ui.theme.ItemNumber
import com.tilseier.higherloweremojigame.ui.theme.PinShape
import com.tilseier.higherloweremojigame.ui.theme.RightAnswer
import com.tilseier.higherloweremojigame.ui.theme.Typography
import com.tilseier.higherloweremojigame.ui.theme.WrongAnswer
import com.tilseier.higherloweremojigame.ui.theme.iOS14EmojiFont
import com.tilseier.higherloweremojigame.util.ColorUtil
import com.tilseier.higherloweremojigame.util.Intents
import com.tilseier.higherloweremojigame.util.TrackingUtil
import dev.chrisbanes.snapper.ExperimentalSnapperApi
import dev.chrisbanes.snapper.SnapOffsets
import dev.chrisbanes.snapper.rememberSnapperFlingBehavior
import kotlinx.coroutines.delay

@Composable
fun GameContent(
    navController: NavHostController,
    viewModel: GameViewModel
) {
    val context = LocalContext.current
    val state = viewModel.state.value
    val currentItems: List<Item> = state.currentItems
    val currentItemIndex: Int = state.currentItemIndex
    val showAnswerForItemIndex: Int = state.showAnswerForItemIndex
    val moveToItemAnimation: MoveAnimation = state.moveToItemAnimation
    val isGameOver: Boolean = state.isGameOver
    val higherScore: Int = state.higherScore
    val score: Int = state.score
    val game: Game = state.game

    val onBackClick: () -> Unit = {
        if (score > 0) {
            navController.navigate(route = Screen.ExitDialog.route)
        } else {
            navController.popBackStack(
                route = Screen.GamesMenu.route,
                inclusive = false
            )
        }
    }
    val lazyListState: LazyListState = rememberLazyListState()

    var vsDividerState: VsDividerState by remember { mutableStateOf(VsDividerState.ShowVsBox) }

    BackHandler(onBack = onBackClick)
    LaunchedEffect(key1 = isGameOver) {
        if (isGameOver) {
            vsDividerState = VsDividerState.SqueezeVsBox
            delay(VsDividerState.SqueezeVsBox.delayAfterAnimation)
            vsDividerState = VsDividerState.ShowWrongAnswer
            delay(VsDividerState.ShowWrongAnswer.delayAfterAnimation)
            navController.navigate(route = Screen.GameOver.route) {
                popUpTo(Screen.GamesMenu.route)
            }
        }
    }

    LaunchedEffect(key1 = currentItemIndex) {
        if (lazyListState.firstVisibleItemIndex == currentItemIndex) return@LaunchedEffect
        when (moveToItemAnimation) {
            MoveAnimation.ShowRightAnswerAndMove -> {
                vsDividerState = VsDividerState.SqueezeVsBox
                delay(VsDividerState.SqueezeVsBox.delayAfterAnimation)
                vsDividerState = VsDividerState.ShowRightAnswer
                delay(VsDividerState.ShowRightAnswer.delayAfterAnimation)
                vsDividerState = VsDividerState.SqueezeRightAnswer
                delay(VsDividerState.SqueezeRightAnswer.delayAfterAnimation)
                lazyListState.animateScrollToItem(currentItemIndex)
                delay(100)
                vsDividerState = VsDividerState.ShowVsBox
            }
            MoveAnimation.SqueezeVsAndMove -> {
                vsDividerState = VsDividerState.SqueezeVsBoxWithLine
                delay(VsDividerState.SqueezeVsBoxWithLine.delayAfterAnimation)
                lazyListState.animateScrollToItem(currentItemIndex)
                delay(100)
                vsDividerState = VsDividerState.ShowVsBox
            }
            MoveAnimation.None -> {
                lazyListState.animateScrollToItem(currentItemIndex)
            }
        }
    }

    Column(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.fillMaxSize()) {
            ItemsList(
                game = game,
                items = currentItems,
                currentItemIndex = currentItemIndex,
                showAnswerForItemIndex = showAnswerForItemIndex,
                modifier = Modifier.fillMaxSize(),
                state = lazyListState,
                onMoreClick = {
                    viewModel.onMoreClick()
                },
                onLessClick = {
                    viewModel.onLessClick()
                },
                onMoreInfoClick = { item ->
                    val itemUrl = item.invention?.urlWithMoreInformationUiText?.asString(context)
                    val itemName = item.invention?.nameOfInvention?.asString(context) ?: ""
                    val itemEmoji = item.invention?.emoji ?: ""
                    val itemColor = item.backgroundColor ?: ColorUtil.getItemBackgroundColor(itemName.length)
                    itemUrl?.let { url ->
                        context.startActivity(
                            Intents.toBrowser(
                                context = context,
                                url = url,
                                itemName = itemName,
                                itemEmoji = itemEmoji,
                                itemColorArgb = itemColor.toArgb()
                            )
                        )
                    }
                    TrackingUtil.trackMoreInfoClick(itemName, itemEmoji, game)
                }
            )

            StatusBar(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 3.dp, horizontal = 5.dp),
                score = score,
                higherScore = higherScore,
                onMenuClick = onBackClick
            )

            VsDivider(state = vsDividerState)
        }
    }
}

/*
* ANIMATION
* When user clicks More or Less
* Right Answer:
* 1. Show answer with animation
* 2. Squeeze VS Box together with line
* 3. Show Right Answer Box together with Right line
* 4. Squeeze Right Answer Box together with line
* 5. Animate Scroll to next item
* 6. Show VS Box (together with line)
* Wrong Answer:
* 1. Show answer with animation
* 2. Squeeze VS Box together with line
* 3. Show Wrong Answer Box together with Wrong line
* 4. Move to game over screen
* */
sealed class VsDividerState(val delayAfterAnimation: Long) {
    object ShowVsBox : VsDividerState(200)
    object SqueezeVsBox : VsDividerState(300)
    object SqueezeVsBoxWithLine : VsDividerState(300)
    object ShowRightAnswer : VsDividerState(1000)
    object SqueezeRightAnswer : VsDividerState(200)
    object ShowWrongAnswer : VsDividerState(2000)
    object SqueezeWrongAnswer : VsDividerState(200)
}

@Composable
fun VsDivider(
    modifier: Modifier = Modifier,
    windowInfo: WindowInfo = rememberWindowInfo(),
    state: VsDividerState = VsDividerState.ShowVsBox,
) {
    val transition = updateTransition(targetState = state, label = "transition")

    val vsScale by transition.animateFloat(label = "vs scale") {
        when (it) {
            VsDividerState.ShowVsBox -> 1f
            else -> 0f
        }
    }
    val rightAnswerScale by transition.animateFloat(label = "vs scale") {
        when (it) {
            VsDividerState.ShowRightAnswer -> 1f
            else -> 0f
        }
    }
    val wrongAnswerScale by transition.animateFloat(label = "vs scale") {
        when (it) {
            VsDividerState.ShowWrongAnswer -> 1f
            else -> 0f
        }
    }
    val lineScale by transition.animateFloat(label = "line scale") {
        when (it) {
            VsDividerState.ShowRightAnswer,
            VsDividerState.ShowWrongAnswer,
            VsDividerState.ShowVsBox,
            VsDividerState.SqueezeVsBox -> 1f
            else -> 0f
        }
    }
    val lineColor by transition.animateColor(label = "line color") {
        when (it) {
            VsDividerState.ShowRightAnswer -> RightAnswer
            VsDividerState.ShowWrongAnswer -> WrongAnswer
            else -> Color.White
        }
    }

    Box(modifier = modifier.fillMaxSize()) {
        if (windowInfo.isCompactScreenWidth) {
            HorizontalVsDivider(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.Center),
                vsScale = vsScale,
                rightAnswerScale = rightAnswerScale,
                wrongAnswerScale = wrongAnswerScale,
                lineScale = lineScale,
                lineColor = lineColor
            )
        } else {
            VerticalVsDivider(
                modifier = Modifier
                    .fillMaxHeight()
                    .align(Alignment.Center),
                vsScale = vsScale,
                rightAnswerScale = rightAnswerScale,
                wrongAnswerScale = wrongAnswerScale,
                lineScale = lineScale,
                lineColor = lineColor
            )
        }
    }
}

@OptIn(ExperimentalTransitionApi::class)
@Composable
fun HorizontalVsDivider(
    modifier: Modifier = Modifier,
    vsScale: Float = 1f,
    rightAnswerScale: Float = 0f,
    wrongAnswerScale: Float = 0f,
    lineScale: Float = 1f,
    lineColor: Color = Color.White,
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Divider(
            modifier = Modifier
                .scale(scaleX = lineScale, scaleY = 1f)
                .align(Alignment.Center),
            color = lineColor,
            thickness = 3.dp
        )
        VsBox(
            vsScale = vsScale,
            rightAnswerScale = rightAnswerScale,
            wrongAnswerScale = wrongAnswerScale
        )
    }
}

@Composable
fun VerticalVsDivider(
    modifier: Modifier = Modifier,
    vsScale: Float = 1f,
    rightAnswerScale: Float = 0f,
    wrongAnswerScale: Float = 0f,
    lineScale: Float = 1f,
    lineColor: Color = Color.White,
) {
    Box(
        modifier = modifier,
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .scale(scaleX = 1f, scaleY = lineScale)
                .fillMaxHeight()
                .width(3.dp)
                .background(lineColor)
                .align(Alignment.Center),
        )
        VsBox(
            vsScale = vsScale,
            rightAnswerScale = rightAnswerScale,
            wrongAnswerScale = wrongAnswerScale
        )
    }
}

@Composable
fun VsBox(
    modifier: Modifier = Modifier,
    vsScale: Float = 1f,
    rightAnswerScale: Float = 0f,
    wrongAnswerScale: Float = 0f,
) {
    val vsSize = 30.dp
    Box(modifier = modifier) {
        Box(modifier = Modifier.scale(vsScale)) {
            Box(
                modifier = Modifier
                    .size(vsSize)
                    .rotate(45f)
                    .background(color = Color.White)
            )
            Text(
                text = stringResource(id = R.string.vs),
                modifier = Modifier
                    .align(Alignment.Center)
                    .padding(bottom = 2.dp),
                style = Typography.titleSmall.copy(fontSize = 18.sp),
                textAlign = TextAlign.Center,
                color = Color.Black
            )
        }
        // right answer
        Box(modifier = Modifier.scale(rightAnswerScale)) {
            Box(
                modifier = Modifier
                    .size(vsSize)
                    .rotate(45f)
                    .background(color = RightAnswer)
            )
            Icon(
                imageVector = Icons.Default.Done,
                contentDescription = "Right",
                modifier = Modifier
                    .size(20.dp)
                    .align(Alignment.Center),
                tint = Color.White
            )
        }
        // wrong answer
        Box(modifier = Modifier.scale(wrongAnswerScale)) {
            Box(
                modifier = Modifier
                    .size(vsSize)
                    .rotate(45f)
                    .background(color = WrongAnswer)
            )
            Icon(
                imageVector = Icons.Default.Close,
                contentDescription = "Wrong",
                modifier = Modifier
                    .size(20.dp)
                    .align(Alignment.Center),
                tint = Color.White
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
                modifier = Modifier
                    .clip(RoundedCornerShape(8.dp))
                    .clickable { onMenuClick() },
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_home),
                    contentDescription = null,
                    modifier = Modifier
                        .size(24.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = stringResource(id = R.string.button_main_menu),
                    fontSize = 16.spNotScalable,
                    color = Color.White
                )
            }
        }
        Text(
            text = stringResource(id = R.string.high_score, higherScore),
            fontSize = 16.spNotScalable,
            color = Color.White
        )
        Spacer(modifier = Modifier.width(15.dp))
        Text(
            text = stringResource(id = R.string.score, score),
            fontSize = 16.spNotScalable,
            color = Color.White
        )
    }
}

@OptIn(ExperimentalSnapperApi::class)
@Composable
fun ItemsList(
    game: Game,
    items: List<Item>,
    currentItemIndex: Int,
    showAnswerForItemIndex: Int,
    modifier: Modifier = Modifier,
    state: LazyListState = rememberLazyListState(),
    onMoreClick: () -> Unit,
    onLessClick: () -> Unit,
    onMoreInfoClick: (Item) -> Unit,
) {
    val windowInfo = rememberWindowInfo()
    val context = LocalContext.current
    val localClipboardManager = LocalClipboardManager.current
    val onCopyToClipboardClick: (String) -> Unit = { sign ->
        localClipboardManager.setText(AnnotatedString(sign))
        Toast.makeText(
            context,
            context.getString(R.string.share_copy_message, sign),
            Toast.LENGTH_SHORT
        ).show()
        TrackingUtil.trackCopyEmojiClick(sign, game)
    }
    LazyColumnOrRow(
        modifier = modifier,
        useLazyColumn = windowInfo.isCompactScreenWidth,
        state = state,
        userScrollEnabled = false,
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
            when (game) {
                Game.EMOJI_GAME -> {
                    ItemWithEmoji(
                        modifier = itemModifier,
                        item = item,
                        compareItem = previousItem,
                        isAnswerVisible = index <= currentItemIndex,
                        showAnswerWithAnimation = index == showAnswerForItemIndex,
                        onMoreClick = onMoreClick,
                        onLessClick = onLessClick,
                        onCopyToClipboardClick = { onCopyToClipboardClick(it) }
                    )
                }
                Game.INVENTION_GAME -> {
                    ItemWithInvention(
                        modifier = itemModifier,
                        item = item,
                        compareItem = previousItem,
                        isAnswerVisible = index <= currentItemIndex,
                        showAnswerWithAnimation = index == showAnswerForItemIndex,
                        onMoreClick = onMoreClick,
                        onLessClick = onLessClick,
                        onCopyToClipboardClick = { onCopyToClipboardClick(it) },
                        onMoreInfoClick = { onMoreInfoClick(it) }
                    )
                }
            }
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
private fun ItemWithEmoji(
    modifier: Modifier = Modifier,
    item: Item,
    compareItem: Item?,
    isAnswerVisible: Boolean,
    showAnswerWithAnimation: Boolean,
    onMoreClick: () -> Unit,
    onLessClick: () -> Unit,
    onCopyToClipboardClick: (sign: String) -> Unit,
) {
    val itemSign = item.emoji?.sign
    val itemName = item.emoji?.name ?: ""
    val itemNumber = item.emoji?.number?.toInt() ?: 0
    val itemImageUrl = item.emoji?.imageUrl ?: ""
    val compareItemName = compareItem?.emoji?.name
    // TODO background from gradient colors?
    Box(modifier = modifier) {
        itemSign?.let { sign ->
            BackgroundWithTextSign(
                modifier = Modifier.fillMaxSize(),
                sign = sign,
                color = item.backgroundColor ?: ColorUtil.getItemBackgroundColor(itemName.length),
                fontFamily = iOS14EmojiFont
            )
        } ?: run {
            BackgroundWithImageURL(
                modifier = Modifier.fillMaxSize(),
                imageURL = itemImageUrl,
                color = item.backgroundColor ?: ColorUtil.getItemBackgroundColor(itemName.length)
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
                    text = stringResource(id = R.string.item_name_emoji, itemName),
                    modifier = Modifier.padding(horizontal = 16.dp),
                    color = Color.White,
                    maxFontSize = 24.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = stringResource(id = R.string.text_is_used),
                    color = Color.White,
                    fontSize = 14.sp,
                    textAlign = TextAlign.Center
                )

                var moreClick by rememberSaveable { mutableStateOf(false) }
                var lessClick by rememberSaveable { mutableStateOf(false) }

                AnimatedVisibility(
                    visible = isAnswerVisible || showAnswerWithAnimation,
                    enter = if (showAnswerWithAnimation) {
                        fadeIn() + expandVertically()
                    } else {
                        EnterTransition.None
                    },
                    exit = if (showAnswerWithAnimation) {
                        fadeOut() + shrinkVertically()
                    } else {
                        ExitTransition.None
                    },
                ) {
                    val animatedNumber = transition.animateInt(
                        transitionSpec = { tween(durationMillis = NUMBER_ANIMATION_DURATION) },
                        label = "number animation"
                    ) { state ->
                        if (state == EnterExitState.Visible) itemNumber else 0
                    }.value.toLong()
                    AnswerNumber(
                        modifier = Modifier.fillMaxWidth(),
                        number = animatedNumber.formatNumberToString(),
                        description = stringResource(id = R.string.text_on_average_monthly)
                    )
                }

                if (!isAnswerVisible && !showAnswerWithAnimation) {
                    Spacer(modifier = Modifier.height(8.dp))
                    ItemButton(
                        onClick = {
                            if (!lessClick) {
                                moreClick = true
                                onMoreClick()
                            }
                        }
                    ) {
                        Box(modifier = Modifier.defaultMinSize(minWidth = 140.dp)) {
                            Text(
                                text = stringResource(id = R.string.button_more),
                                fontSize = 18.sp,
                                modifier = Modifier.align(Alignment.Center)
                            )
                            Icon(
                                painter = painterResource(id = R.drawable.ic_arrow_drop_up),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(end = 8.dp)
                                    .size(32.dp)
                                    .align(Alignment.CenterEnd),
                                tint = Color.White
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(4.dp))
                    ItemButton(
                        onClick = {
                            if (!moreClick) {
                                lessClick = true
                                onLessClick()
                            }
                        }
                    ) {
                        Box(modifier = Modifier.defaultMinSize(minWidth = 140.dp)) {
                            Text(
                                text = stringResource(id = R.string.button_less),
                                fontSize = 18.sp,
                                modifier = Modifier.align(Alignment.Center)
                            )
                            Icon(
                                painter = painterResource(id = R.drawable.ic_arrow_drop_down),
                                contentDescription = null,
                                modifier = Modifier
                                    .padding(end = 8.dp)
                                    .size(32.dp)
                                    .align(Alignment.CenterEnd),
                                tint = Color.White
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(8.dp))

                    AutoSizeText(
                        text = stringResource(
                            id = R.string.text_than_this_item,
                            compareItemName ?: ""
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

        itemSign?.let { sign ->
            Image(
                painter = painterResource(id = R.drawable.ic_content_copy),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(top = 34.dp, end = 16.dp)
                    .size(24.dp)
                    .clip(RoundedCornerShape(4.dp))
                    .alpha(0.5f)
                    .clickable { onCopyToClipboardClick(sign) }
            )
        }
    }
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
private fun ItemWithInvention(
    modifier: Modifier = Modifier,
    item: Item,
    compareItem: Item?,
    isAnswerVisible: Boolean,
    showAnswerWithAnimation: Boolean,
    onMoreClick: () -> Unit,
    onLessClick: () -> Unit,
    onCopyToClipboardClick: (sign: String) -> Unit,
    onMoreInfoClick: (Item) -> Unit,
) {
    val itemSign = item.invention?.emoji
    val itemName = item.invention?.nameOfInvention?.asString() ?: ""
    val itemNumber = item.invention?.yearOfInvention ?: 0
    val itemSecondNumber = item.invention?.yearOfInventionEnd ?: 0
    val itemImageUrl = item.invention?.imageUrl ?: ""
    val itemMoreInfoUrl = item.invention?.urlWithMoreInformationUiText?.asString() ?: ""
    val itemSubtext =
        item.invention?.subtextOfInvention?.asString() ?: getInventionSubtextFromName(itemName)
    val compareItemName = compareItem?.invention?.nameOfInvention?.asString() ?: ""
    val compareItemSign = compareItem?.invention?.emoji ?: ""
    val compareItemBackgroundColor = compareItem?.backgroundColor
        ?: ColorUtil.getItemBackgroundColor(compareItemName.length)
    var compareItemYear = compareItem?.invention?.yearOfInvention?.toString() ?: "0"
    compareItem?.invention?.yearOfInventionEnd?.let {
        compareItemYear += "-$it"
    }
    val showAnswerOptions = !isAnswerVisible && !showAnswerWithAnimation
    val canOpenMoreInfo = !showAnswerOptions && itemMoreInfoUrl.contains("wikipedia.org")

    // TODO background from gradient colors?
    Box(modifier = modifier.clickable(canOpenMoreInfo) { onMoreInfoClick(item) }) {
        itemSign?.let { sign ->
            BackgroundWithTextSign(
                modifier = Modifier.fillMaxSize(),
                sign = sign,
                color = item.backgroundColor ?: ColorUtil.getItemBackgroundColor(itemName.length),
                fontFamily = iOS14EmojiFont
            )
        } ?: run {
            BackgroundWithImageURL(
                modifier = Modifier.fillMaxSize(),
                imageURL = itemImageUrl,
                color = item.backgroundColor ?: ColorUtil.getItemBackgroundColor(itemName.length)
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
                Spacer(modifier = Modifier.height(84.dp))
                AutoSizeText(
                    text = itemName,
                    modifier = Modifier.padding(horizontal = 16.dp),
                    color = Color.White,
                    maxFontSize = 24.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.height(8.dp))
                val wasInventedText = if (showAnswerOptions) {
                    itemSubtext
                } else {
                    stringResource(id = R.string.text_was_in, itemSubtext)
                }
                Text(
                    text = wasInventedText,
                    color = Color.White,
                    fontSize = 16.sp,
                    textAlign = TextAlign.Center
                )

                Spacer(modifier = Modifier.weight(1f))

                var moreClick by rememberSaveable { mutableStateOf(false) }
                var lessClick by rememberSaveable { mutableStateOf(false) }

                AnimatedVisibility(
                    visible = isAnswerVisible || showAnswerWithAnimation,
                    enter = if (showAnswerWithAnimation) {
                        fadeIn() + expandVertically()
                    } else {
                        EnterTransition.None
                    },
                    exit = if (showAnswerWithAnimation) {
                        fadeOut() + shrinkVertically()
                    } else {
                        ExitTransition.None
                    },
                ) {
                    val animatedNumber = transition.animateInt(
                        transitionSpec = { tween(durationMillis = NUMBER_ANIMATION_DURATION) },
                        label = "number animation"
                    ) { state ->
                        if (state == EnterExitState.Visible) itemNumber else 0
                    }.value.toLong()
                    val animatedSecondNumber = transition.animateInt(
                        transitionSpec = { tween(durationMillis = NUMBER_ANIMATION_DURATION) },
                        label = "number animation"
                    ) { state ->
                        if (state == EnterExitState.Visible) itemSecondNumber else 0
                    }.value.toLong()
                    AnswerNumber(
                        modifier = Modifier.fillMaxWidth(),
                        number = animatedNumber.toString(),
                        secondNumber = if (itemSecondNumber > 0) {
                            animatedSecondNumber.toString()
                        } else {
                            null
                        },
                        description = stringResource(id = R.string.text_year),
                    )
                }

                if (showAnswerOptions) {
                    Spacer(modifier = Modifier.height(16.dp))
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.BottomCenter
                    ) {
                        Divider(
                            modifier = Modifier
                                .padding(bottom = 2.dp)
                                .height(2.dp),
                            color = Gray
                        )
                        Row(verticalAlignment = Alignment.Bottom) {
                            InventedItemButton(
                                modifier = Modifier.padding(bottom = 4.dp),
                                onClick = {
                                    if (!moreClick) {
                                        lessClick = true
                                        onLessClick()
                                    }
                                },
                                text = stringResource(id = R.string.button_before)
                            )
                            Spacer(modifier = Modifier.width(36.dp))
                            EmojiPin(
                                emoji = compareItemSign,
                                mainColor = compareItemBackgroundColor,
                                borderColor = Color.Black
                            )
                            Spacer(modifier = Modifier.width(36.dp))
                            InventedItemButton(
                                modifier = Modifier.padding(bottom = 4.dp),
                                onClick = {
                                    if (!lessClick) {
                                        moreClick = true
                                        onMoreClick()
                                    }
                                },
                                text = stringResource(id = R.string.button_after)
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = compareItemYear,
                        color = Color.White,
                        fontSize = 12.sp,
                        textAlign = TextAlign.Center
                    )

                    AutoSizeText(
                        text = compareItemName,
                        modifier = Modifier.padding(horizontal = 16.dp),
                        color = Color.White,
                        maxFontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        textAlign = TextAlign.Center
                    )
                }
                Spacer(modifier = Modifier.height(36.dp))
            }
        }

        itemSign?.let { sign ->
            Image(
                painter = painterResource(id = R.drawable.ic_content_copy),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(top = 36.dp, end = 16.dp)
                    .size(24.dp)
                    .clip(RoundedCornerShape(4.dp))
                    .alpha(0.5f)
                    .clickable { onCopyToClipboardClick(sign) }
            )
        }

        if (canOpenMoreInfo) {
            Image(
                painter = painterResource(id = R.drawable.ic_more_info),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(bottom = 28.dp, end = 16.dp)
                    .size(24.dp)
                    .clip(RoundedCornerShape(4.dp))
                    .alpha(0.5f)
                    .clickable { onMoreInfoClick(item) }
            )
        }
    }
}

@Composable
private fun AnswerNumber(
    modifier: Modifier = Modifier,
    number: String,
    secondNumber: String? = null,
    description: String? = null
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = stringResource(id = R.string.formatted_number, number),
                color = ItemNumber,
                fontSize = 35.sp
            )
            secondNumber?.let {
                Text(
                    text = stringResource(id = R.string.number_divider),
                    color = ItemNumber,
                    fontSize = 35.sp
                )
                Text(
                    text = stringResource(id = R.string.formatted_number, it),
                    color = ItemNumber,
                    fontSize = 35.sp
                )
            }
        }
        description?.let {
            Text(
                text = it,
                color = Color.White,
                fontSize = 14.sp
            )
        }
        Spacer(modifier = Modifier.height(50.dp))
    }
}

@Composable
private fun ItemButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = CircleShape,
    content: @Composable RowScope.() -> Unit
) {
    OutlinedButton(
        onClick = onClick,
        modifier = modifier,
        shape = shape,
        border = BorderStroke((1.2).dp, Color.White),
        elevation = ButtonDefaults.buttonElevation(defaultElevation = 0.dp, pressedElevation = 2.dp),
        contentPadding = PaddingValues(vertical = 6.dp, horizontal = 8.dp),
        colors = ButtonDefaults.outlinedButtonColors(
            containerColor = Color.Transparent,
            contentColor = ItemNumber
        )
    ) {
        content()
    }
}

@Composable
private fun InventedItemButton(
    onClick: () -> Unit,
    text: String,
    modifier: Modifier = Modifier,
) {
    ItemButton(
        modifier = modifier,
        shape = PinShape(angleDegrees = 270f), // 340f
        onClick = onClick
    ) {
        Box(
            modifier = Modifier
                .width(70.dp)
                .height(100.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                modifier = Modifier.align(Alignment.Center),
                text = text,
                style = Typography.titleSmall.copy(
                    fontSize = 18.spNotScalable,
                    letterSpacing = 0.5.spNotScalable,
                ),
            )
        }
    }
}

@Composable
fun getInventionSubtextFromName(name: String): String {
    return if (name.contains("Перша")) {
        stringResource(R.string.text_was_she)
    } else if (name.contains("Перший")) {
        stringResource(R.string.text_was_he)
    } else if (name.contains("Перше")) {
        stringResource(R.string.text_was_it)
    } else if (name.contains("Перші")) {
        stringResource(R.string.text_was_plural)
    } else {
        stringResource(R.string.text_was_it)
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
