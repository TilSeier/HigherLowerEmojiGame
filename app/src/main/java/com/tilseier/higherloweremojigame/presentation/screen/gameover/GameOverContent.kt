package com.tilseier.higherloweremojigame.presentation.screen.gameover

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
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
import com.tilseier.higherloweremojigame.common.Constants
import com.tilseier.higherloweremojigame.domain.model.EmojiFact
import com.tilseier.higherloweremojigame.presentation.navigation.Screen
import com.tilseier.higherloweremojigame.presentation.screen.game.GameViewModel
import com.tilseier.higherloweremojigame.ui.theme.*
import dev.chrisbanes.snapper.ExperimentalSnapperApi
import dev.chrisbanes.snapper.SnapOffsets
import dev.chrisbanes.snapper.rememberSnapperFlingBehavior

@Composable
fun GameOverContent(
    navController: NavHostController,
    viewModel: GameViewModel,
    gameOverViewModel: GameOverViewModel,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Background)
    ) {
        GameOverStatusBar(
            onMenuClick = {
                navController.popBackStack(
                    route = Screen.Menu.route,
                    inclusive = false
                )
            }
        )
        Spacer(modifier = Modifier.height(60.dp))
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Scores(
                score = viewModel.state.value.score,
                higherScore = viewModel.state.value.higherScore
            )
            Spacer(modifier = Modifier.height(60.dp))
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                NextStepsButtons(
                    modifier = Modifier.padding(horizontal = 56.dp),
                    navController = navController,
                    viewModel = viewModel
                )

                Spacer(modifier = Modifier.height(30.dp))

                if (gameOverViewModel.emojiFacts.value.isNotEmpty()) {
                    val listState: LazyListState = rememberLazyListState()
                    EmojiFactsCarousel(
                        gameOverViewModel = gameOverViewModel,
                        state = listState
                    )
                }
            }
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
    higherScore: Int
) {
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
    }
}

@Composable
fun NextStepsButtons(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    viewModel: GameViewModel,
) {
    Column(modifier = modifier) {
        ButtonWithBottomBorder(
            onClick = {
                viewModel.newGame(viewModel.state.value.difficulty)
                navController.navigate(
                    Screen.Game.pass(
                        Constants.CATEGORY_EMOJI,
                        viewModel.state.value.difficulty.name
                    )
                ) {
                    popUpTo(Screen.Menu.route)
                }
            },
            modifier = Modifier.fillMaxWidth(),
            backgroundColor = ButtonYellow,
            borderColor = ButtonYellowBorder,
            contentPadding = PaddingValues(horizontal = 28.dp, vertical = 24.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_restart),
                contentDescription = null,
                modifier = Modifier.size(30.dp)
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                text = stringResource(id = R.string.button_restart),
                modifier = Modifier.weight(1f),
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                letterSpacing = 2.sp
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        ButtonWithBottomBorder(
            onClick = {
                viewModel.continueGame()
                navController.navigate(Screen.Game.route) {
                    popUpTo(Screen.Menu.route)
                }
            },
            modifier = Modifier.fillMaxWidth(),
            backgroundColor = ButtonRed,
            borderColor = ButtonRedBorder,
            contentPadding = PaddingValues(horizontal = 20.dp, vertical = 24.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_continue_with_video),
                contentDescription = null,
                modifier = Modifier.size(47.dp)
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                text = stringResource(id = R.string.button_continue),
                modifier = Modifier.weight(1f),
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                letterSpacing = 2.sp
            )
        }
    }
}

@Composable
fun ButtonWithBottomBorder(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    borderColor: Color,
    backgroundColor: Color,
    contentPadding: PaddingValues = PaddingValues(horizontal = 28.dp, vertical = 24.dp),
    content: @Composable RowScope.() -> Unit
) {
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(5.dp))
            .background(borderColor)
            .padding(bottom = 4.dp)
            .clip(RoundedCornerShape(5.dp))
            .background(backgroundColor)
            .clickable { onClick() }
            .padding(contentPadding),
        verticalAlignment = Alignment.CenterVertically
    ) {
        content()
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
    LaunchedEffect(key1 = state.firstVisibleItemIndex) {
        gameOverViewModel.setCurrentFactIndex(state.firstVisibleItemIndex)
    }
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
    }
}

@Composable
fun FactCardView(
    modifier: Modifier = Modifier,
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
            .clickable {
                // TODO open dialog with emojiFact
            }
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
            modifier = Modifier.defaultMinSize(minHeight = 36.dp),
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
