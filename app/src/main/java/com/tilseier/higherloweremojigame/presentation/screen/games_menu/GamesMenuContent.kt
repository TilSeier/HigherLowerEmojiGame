package com.tilseier.higherloweremojigame.presentation.screen.games_menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import com.tilseier.higherloweremojigame.extantions.dpScalable
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
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        item {
            GamesMenuHeader()
        }
        item {
            Box(
                modifier = Modifier
                    .padding(horizontal = 24.dp)
                    .width(dimensionResource(id = R.dimen.max_content_width))
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    verticalArrangement = Arrangement.spacedBy(48.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    inventionGame?.let {
                        GameCard(
                            modifier = Modifier.fillMaxWidth(),
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
                            modifier = Modifier.fillMaxWidth(),
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
                Spacer(modifier = Modifier.height(95.dpScalable))

                Text(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    text = menuGame.title.asString(),
                    color = Color.White,
                    style = Typography.titleMedium.copy(
                        fontSize = 26.sp,
                        letterSpacing = 2.sp
                    )
                )

                Spacer(modifier = Modifier.height(24.dp))

                Text(
                    modifier = Modifier.padding(horizontal = 16.dp),
                    text = stringResource(id = R.string.text_game_rules),
                    color = Color.White.copy(alpha = 0.8f),
                    style = Typography.titleMedium.copy(fontSize = 20.sp),
                )

                Spacer(modifier = Modifier.height(12.dp))

                Text(
                    modifier = Modifier.padding(start = 16.dp, end = 24.dp),
                    text = menuGame.description.asString(),
                    color = Color.White,
                    style = Typography.bodyLarge.copy(fontSize = 18.sp),
                )

                Spacer(modifier = Modifier.height(36.dp))

                RoundButton(
                    modifier = Modifier.padding(start = 12.dp, bottom = 15.dp),
                    onClick = { onClick(menuGame) },
                    colors = ButtonDefaults.buttonColors(containerColor = menuGame.buttonColor),
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
                .padding(start = 8.dpScalable)
                .size(100.dpScalable)
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
