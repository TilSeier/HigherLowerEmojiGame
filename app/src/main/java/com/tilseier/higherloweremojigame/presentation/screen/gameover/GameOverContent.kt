package com.tilseier.higherloweremojigame.presentation.screen.gameover

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.tilseier.higherloweremojigame.R
import com.tilseier.higherloweremojigame.common.Constants
import com.tilseier.higherloweremojigame.common.Difficulty
import com.tilseier.higherloweremojigame.domain.model.EmojiFact
import com.tilseier.higherloweremojigame.presentation.GameEvent
import com.tilseier.higherloweremojigame.presentation.GameViewModel
import com.tilseier.higherloweremojigame.presentation.components.ButtonWithBottomBorder
import com.tilseier.higherloweremojigame.presentation.navigation.Screen
import com.tilseier.higherloweremojigame.ui.theme.*
import com.tilseier.higherloweremojigame.util.ShareUtil
import com.tilseier.higherloweremojigame.util.TrackingUtil
import dev.chrisbanes.snapper.ExperimentalSnapperApi
import dev.chrisbanes.snapper.SnapOffsets
import dev.chrisbanes.snapper.rememberSnapperFlingBehavior

@Composable
fun GameOverContent(
    navController: NavHostController,
    viewModel: GameViewModel,
    gameOverViewModel: GameOverViewModel,
) {
    LaunchedEffect(key1 = true) {
        viewModel.onEvent(GameEvent.OnGameOverScreenOpen)
        TrackingUtil.trackGameOverScreenOpen(
            viewModel.state.value.score,
            viewModel.state.value.higherScore,
            viewModel.state.value.difficulty
        )
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
    ) {
        GameOverStatusBar(
            onMenuClick = {
                navController.popBackStack(
                    route = Screen.EmojiDifficultiesMenu.route,
                    inclusive = false
                )
            }
        )
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            item {
                Spacer(modifier = Modifier.height(60.dp))
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Scores(
                        score = viewModel.state.value.score,
                        higherScore = viewModel.state.value.higherScore,
                        difficulty = viewModel.state.value.difficulty
                    )
                    Spacer(modifier = Modifier.height(60.dp))
                    NextStepsButtons(
                        modifier = Modifier.padding(horizontal = 56.dp),
                        navController = navController,
                        viewModel = viewModel
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
        if (gameOverViewModel.emojiFacts.value.isNotEmpty()) {
            val listState: LazyListState = rememberLazyListState()
            Spacer(modifier = Modifier.height(8.dp))
            EmojiFactsCarousel(
                gameOverViewModel = gameOverViewModel,
                state = listState
            )
            Spacer(modifier = Modifier.height(50.dp))
        }
    }
}

@Composable
fun GameOverStatusBar(
    modifier: Modifier = Modifier,
    onMenuClick: () -> Unit,
) {
    Row(
        modifier = modifier
            .padding(2.dp)
            .clip(RoundedCornerShape(8.dp))
            .clickable { onMenuClick() }
            .padding(vertical = 3.dp, horizontal = 5.dp),
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
            fontSize = 16.sp,
            color = Color.White
        )
    }
}

@Composable
fun Scores(
    modifier: Modifier = Modifier,
    score: Int,
    higherScore: Int,
    difficulty: Difficulty
) {
    val context = LocalContext.current
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = score.toString(),
            fontSize = 60.sp,
            fontWeight = FontWeight.Bold,
            lineHeight = 0.sp,
            color = Color.White
        )
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                painter = painterResource(id = R.drawable.ic_crown),
                contentDescription = null,
                modifier = Modifier.size(27.dp),
                tint = HigherScore
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                text = higherScore.toString(),
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = HigherScore
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Icon(
            painter = painterResource(id = R.drawable.ic_ios_share),
            contentDescription = "Share",
            modifier = Modifier
                .size(34.dp)
                .clip(CircleShape)
                .background(Color.White)
                .clickable {
                    ShareUtil.shareScore(context, score)
                    TrackingUtil.trackScoreShareClick(score, higherScore, difficulty)
                }
                .padding(7.dp),
            tint = ButtonRed
        )
    }
}

@Composable
fun NextStepsButtons(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    viewModel: GameViewModel,
) {
    val rewardedVideoState = viewModel.rewardedVideoState.collectAsState()
    val showContinueButton = rewardedVideoState.value == GameViewModel.RewardedVideoState.Loaded &&
            viewModel.state.value.score > 0 &&
            viewModel.state.value.continueCount <= 0
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        RestartButton(
            viewModel = viewModel,
            navController = navController
        )

        if (showContinueButton) {
            ContinueButton(viewModel = viewModel)
        }
    }
}

@Composable
fun RestartButton(
    viewModel: GameViewModel,
    navController: NavHostController,
) {
    ButtonWithBottomBorder(
        onClick = {
            viewModel.newGame(viewModel.state.value.game, viewModel.state.value.difficulty)
            navController.navigate(
                Screen.Game.pass(
                    Constants.CATEGORY_EMOJI,
                    viewModel.state.value.difficulty.name
                )
            ) {
                popUpTo(Screen.EmojiDifficultiesMenu.route)
            }
            TrackingUtil.trackRestartClick()
        },
        modifier = Modifier.fillMaxWidth(),
        backgroundColor = ButtonYellow,
        borderColor = ButtonYellowBorder,
        contentPadding = PaddingValues(horizontal = 28.dp, vertical = 24.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_restart),
            contentDescription = null,
            modifier = Modifier.size(30.dp),
            tint = Color.White
        )
        Spacer(modifier = Modifier.width(5.dp))
        Text(
            text = stringResource(id = R.string.button_restart),
            modifier = Modifier.weight(1f),
            color = Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            letterSpacing = 2.sp
        )
    }
}

@Composable
fun ContinueButton(viewModel: GameViewModel) {
    ButtonWithBottomBorder(
        onClick = {
            viewModel.onEvent(GameEvent.OnContinueButtonClick)
            TrackingUtil.trackContinueClick()
        },
        modifier = Modifier.fillMaxWidth(),
        backgroundColor = ButtonRed,
        borderColor = ButtonRedBorder,
        contentPadding = PaddingValues(horizontal = 20.dp, vertical = 24.dp)
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_continue_with_video),
            contentDescription = null,
            modifier = Modifier.size(47.dp),
            tint = Color.White
        )
        Spacer(modifier = Modifier.width(5.dp))
        Text(
            text = stringResource(id = R.string.button_continue),
            modifier = Modifier.weight(1f),
            color = Color.White,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            letterSpacing = 2.sp
        )
    }
}

@OptIn(ExperimentalSnapperApi::class)
@Composable
fun EmojiFactsCarousel(
    gameOverViewModel: GameOverViewModel,
    state: LazyListState = rememberLazyListState(),
) {
    LaunchedEffect(key1 = gameOverViewModel.moveToFactIndex.value) {
        state.animateScrollToItem(gameOverViewModel.moveToFactIndex.value)
    }
    val firstVisibleItemIndex by remember { derivedStateOf { state.firstVisibleItemIndex } }
    LaunchedEffect(key1 = firstVisibleItemIndex) {
        gameOverViewModel.setCurrentFactIndex(state.firstVisibleItemIndex)
    }
    var showFactDialog by remember { mutableStateOf(false) }
    var factForDialog: EmojiFact? by remember { mutableStateOf(null) }
    Row {
        FactNavigationButton(onClick = { gameOverViewModel.previousFact() }) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowLeft,
                contentDescription = "Previous Fact",
                modifier = Modifier.size(56.dp),
                tint = Color.White
            )
        }
        LazyRow(
            modifier = Modifier.weight(1f),
            state = state,
            flingBehavior = rememberSnapperFlingBehavior(
                lazyListState = state,
                snapOffsetForItem = SnapOffsets.Start
            )
        ) {
            items(gameOverViewModel.emojiFacts.value) { emojiFact ->
                FactCardView(
                    modifier = Modifier
                        .fillParentMaxWidth()
                        .padding(horizontal = 6.dp),
                    onClick = {
                        factForDialog = it
                        showFactDialog = true
                        TrackingUtil.trackFactClick(it)
                    },
                    emojiFact = emojiFact,
                    backgroundColor = Color.White,
                    borderColor = Gray
                )
            }
        }
        FactNavigationButton(onClick = { gameOverViewModel.nextFact() }) {
            Icon(
                imageVector = Icons.Default.KeyboardArrowRight,
                contentDescription = "Next Fact",
                modifier = Modifier.size(56.dp),
                tint = Color.White
            )
        }
        if (showFactDialog) {
            factForDialog?.let {
                FactDialog(
                    emojiFact = it,
                    onDismissRequest = {
                        showFactDialog = false
                    }
                )
            }
        }
    }
}

@Composable
fun FactCardView(
    modifier: Modifier = Modifier,
    onClick: (EmojiFact) -> Unit,
    emojiFact: EmojiFact,
    borderColor: Color,
    backgroundColor: Color,
    contentPadding: PaddingValues = PaddingValues(horizontal = 16.dp, vertical = 16.dp),
) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(5.dp))
            .background(borderColor)
            .padding(bottom = 4.dp)
            .clip(RoundedCornerShape(5.dp))
            .background(backgroundColor)
            .clickable(onClick = { onClick(emojiFact) })
            .padding(contentPadding),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = emojiFact.title,
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
            fontWeight = FontWeight.Bold,
            color = FactTitle
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = emojiFact.shortDescription,
            modifier = Modifier.heightIn(min = 36.dp),
            textAlign = TextAlign.Center,
            fontSize = 14.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Black
        )
    }
}

@Composable
fun FactNavigationButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable BoxScope.() -> Unit
) {
    Box(
        modifier = modifier
            .width(50.dp)
            .height(100.dp)
            .fillMaxHeight()
            .clip(RoundedCornerShape(8.dp))
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center
    ) {
        content()
    }
}

@Composable
fun FactDialog(
    emojiFact: EmojiFact,
    onDismissRequest: () -> Unit,
) {
    Dialog(onDismissRequest = onDismissRequest) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(5.dp))
                .background(Gray)
                .padding(bottom = 4.dp)
                .clip(RoundedCornerShape(5.dp))
                .background(Color.White)
                .clickable {
                    // TODO open dialog with emojiFact
                }
                .padding(PaddingValues(16.dp)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = emojiFact.title,
                textAlign = TextAlign.Center,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = FactTitle
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = emojiFact.shortDescription,
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = emojiFact.description,
                textAlign = TextAlign.Center,
                fontSize = 14.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Black
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun GameOverContentPreview() {
    HigherLowerEmojiGameTheme {
        GameOverContent(
            navController = rememberNavController(),
            viewModel = viewModel(),
            gameOverViewModel = viewModel()
        )
    }
}
