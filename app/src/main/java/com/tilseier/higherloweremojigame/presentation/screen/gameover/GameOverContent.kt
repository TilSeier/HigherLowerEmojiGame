package com.tilseier.higherloweremojigame.presentation.screen.gameover

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
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
import com.tilseier.higherloweremojigame.presentation.navigation.Screen
import com.tilseier.higherloweremojigame.presentation.screen.game.GameViewModel
import com.tilseier.higherloweremojigame.ui.theme.*

@Composable
fun GameOverContent(
    navController: NavHostController,
    viewModel: GameViewModel
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
            NextStepsButtons(
                modifier = Modifier.padding(horizontal = 56.dp),
                navController = navController,
                viewModel = viewModel
            )

            // TODO emoji facts
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
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_restart),
                contentDescription = null,
                modifier = Modifier.size(27.dp)
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
        ) {
            Icon(
                painter = painterResource(id = R.drawable.ic_restart),
                contentDescription = null,
                modifier = Modifier.size(27.dp)
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
    contentPadding: PaddingValues = PaddingValues(horizontal = 30.dp, vertical = 24.dp),
    content: @Composable RowScope.() -> Unit
) {
    Row(
        modifier = modifier
            .clip(RoundedCornerShape(5.dp))
            .background(borderColor)
            .padding(bottom = 3.dp)
            .clip(RoundedCornerShape(5.dp))
            .background(backgroundColor)
            .clickable { onClick() }
            .padding(contentPadding),
        verticalAlignment = Alignment.CenterVertically
    ) {
        content()
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

@Preview(showBackground = true)
@Composable
private fun GameOverContentPreview() {
    HigherLowerEmojiGameTheme {
        GameOverContent(
            navController = rememberNavController(),
            viewModel = viewModel()
        )
    }
}
