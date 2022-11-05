package com.tilseier.higherloweremojigame.presentation.screen.games_menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.tilseier.higherloweremojigame.R
import com.tilseier.higherloweremojigame.common.Difficulty
import com.tilseier.higherloweremojigame.common.Game
import com.tilseier.higherloweremojigame.presentation.GameViewModel
import com.tilseier.higherloweremojigame.presentation.common.RoundButton
import com.tilseier.higherloweremojigame.presentation.components.dialog.RateDialog
import com.tilseier.higherloweremojigame.presentation.navigation.Screen
import com.tilseier.higherloweremojigame.presentation.screen.games_menu.model.MenuGame
import com.tilseier.higherloweremojigame.ui.theme.GameItemShape
import com.tilseier.higherloweremojigame.ui.theme.HigherLowerEmojiGameTheme
import com.tilseier.higherloweremojigame.ui.theme.Typography
import com.tilseier.higherloweremojigame.ui.theme.iOS14EmojiFont
import com.tilseier.higherloweremojigame.util.ShareUtil
import com.tilseier.higherloweremojigame.util.TrackingUtil

@Composable
fun GamesMenuContent(
    navController: NavHostController,
    viewModel: GameViewModel,
    menuViewModel: GamesMenuViewModel = viewModel()
) {
    SideEffect {
        menuViewModel.updateMenuGames()
    }

    val menuGames = menuViewModel.menuGames.value
    val inventionGame = menuGames.firstOrNull { it.game == Game.INVENTION_GAME }
    val emojiGame = menuGames.firstOrNull { it.game == Game.EMOJI_GAME }

    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        item {
            GamesMenuHeader()
        }
        item {
            Box(modifier = Modifier
                .padding(horizontal = 24.dp)
                .width(dimensionResource(id = R.dimen.max_content_width))) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(18.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    inventionGame?.let {
                        GameCard(
                            modifier = Modifier
                                .weight(1f)
                                .height(260.dp),
                            menuGame = it,
                            onClick = {
                                viewModel.newGame(Game.INVENTION_GAME, Difficulty.EASY)
                                navController.navigate(
                                    route = Screen.Game.pass(
                                        Game.INVENTION_GAME.name,
                                        Difficulty.EASY.name // make no sense
                                    )
                                )
                                TrackingUtil.trackPlayClick(Game.INVENTION_GAME)
                            }
                        )
                    }
                    emojiGame?.let {
                        GameCard(
                            modifier = Modifier
                                .weight(1f)
                                .height(260.dp),
                            menuGame = it,
                            onClick = {
                                navController.navigate(
                                    route = Screen.EmojiDifficultiesMenu.route
                                )
                                TrackingUtil.trackPlayClick(Game.EMOJI_GAME)
                            }
                        )
                    }
                }
            }
        }
        item {
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

// TODO Implement Users' Choice
@Composable
fun GameCard(
    modifier: Modifier = Modifier,
    menuGame: MenuGame,
    onClick: (MenuGame) -> Unit,
) {
    val density =  LocalDensity.current
    val topRadiusPx = with(density) { 23.dp.toPx() }
    val bottomRadiusPx = with(density) { 5.dp.toPx() }
    Box(modifier = modifier.fillMaxWidth()) {
        Box(
            modifier = Modifier
                .padding(top = 10.dp)
                .fillMaxSize()
                .clip(GameItemShape(topRadiusPx, bottomRadiusPx))
                .background(menuGame.borderColor)
                .padding(bottom = 3.dp)
                .clip(GameItemShape(topRadiusPx, bottomRadiusPx))
                .background(menuGame.color)
                .clickable { onClick(menuGame) },
            contentAlignment = Alignment.BottomEnd
        ) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Spacer(modifier = Modifier.height(85.dp))

                Text(
                    modifier = Modifier.padding(horizontal = 12.dp),
                    text = menuGame.title.asString(),
                    color = Color.White,
                    style = Typography.h2.copy(
                        fontSize = 18.sp,
                        letterSpacing = 2.sp
                    ),
                )

                Spacer(modifier = Modifier.weight(1f))

                RoundButton(
                    modifier = Modifier.padding(start = 12.dp, bottom = 15.dp),
                    onClick = { onClick(menuGame) },
                    colors = ButtonDefaults.buttonColors(backgroundColor = menuGame.buttonColor),
                    contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
                ) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = stringResource(id = R.string.button_play),
                            fontSize = 12.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.width(6.dp))
                        Icon(
                            painter = painterResource(id = R.drawable.ic_rounded_play),
                            contentDescription = null,
                            modifier = Modifier.size(12.dp),
                            tint = Color.White
                        )
                    }
                }
            }

            Text(
                modifier = Modifier
                    .offset(x = 30.dp, y = 30.dp)
                    .rotate(-25f),
                text = menuGame.sign,
                fontSize = 100.sp,
                fontFamily = iOS14EmojiFont,
            )
        }
        Image(
            painter = painterResource(id = menuGame.icon),
            contentDescription = null,
            modifier = Modifier
                .padding(start = 8.dp)
                .size(90.dp)
        )
    }
}

@Composable
fun GamesMenuHeader() {
    val context = LocalContext.current
    var showRateDialog by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(
                onClick = {
                    showRateDialog = true
                    TrackingUtil.trackThumbUpClick()
                }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_thumb_up),
                    contentDescription = "Rate",
                    tint = Color.White
                )
            }
            IconButton(
                onClick = {
                    ShareUtil.shareGame(context)
                    TrackingUtil.trackGamesMenuShareClick()
                }
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_share),
                    contentDescription = "Share",
                    tint = Color.White
                )
            }
        }
        Spacer(modifier = Modifier.height(6.dp))
        Image(
            painter = painterResource(id = R.drawable.logo_emoji_game),
            contentDescription = "The Higher Lower Emoji Game Logo",
            modifier = Modifier.width(300.dp),
            contentScale = ContentScale.FillWidth
        )
        Spacer(modifier = Modifier.height(50.dp))
    }

    if (showRateDialog) {
        RateDialog(
            onDismissRequest = {
                showRateDialog = false
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
private fun MenuContentPreview() {
    HigherLowerEmojiGameTheme {
        GamesMenuContent(
            navController = rememberNavController(),
            viewModel = viewModel()
        )
    }
}
