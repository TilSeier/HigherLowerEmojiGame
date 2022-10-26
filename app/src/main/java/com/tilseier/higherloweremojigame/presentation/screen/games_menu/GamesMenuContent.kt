package com.tilseier.higherloweremojigame.presentation.screen.games_menu

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
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
import com.tilseier.higherloweremojigame.common.Constants
import com.tilseier.higherloweremojigame.common.Difficulty
import com.tilseier.higherloweremojigame.common.Game
import com.tilseier.higherloweremojigame.presentation.GameViewModel
import com.tilseier.higherloweremojigame.presentation.common.RoundButton
import com.tilseier.higherloweremojigame.presentation.components.dialog.RateDialog
import com.tilseier.higherloweremojigame.presentation.navigation.Screen
import com.tilseier.higherloweremojigame.presentation.screen.games_menu.model.MenuGame
import com.tilseier.higherloweremojigame.presentation.screen.menu.EmojisAroundElement
import com.tilseier.higherloweremojigame.presentation.screen.menu.model.MenuDifficulty
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

    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        item {
            GamesMenuHeader()
        }
        val menuDifficulties = menuViewModel.menuGames.value
        itemsIndexed(menuDifficulties) { _, item ->
            GamesMenuItem(
                menuGame = item,
                onClick = {
                    when(it.game) {
                        Game.EMOJI_GAME -> {
                            navController.navigate(
                                route = Screen.EmojiDifficultiesMenu.route
                            )
                        }
                        Game.INVENTION_GAME -> {
                            viewModel.newGame(Game.INVENTION_GAME, Difficulty.EASY)
                            navController.navigate(
                                route = Screen.Game.pass(
                                    Game.INVENTION_GAME.name,
                                    Difficulty.EASY.name // make no sense
                                )
                            )
                            // TODO TrackingUtil.trackSelectDifficulty(it.difficulty)
                        }
                    }
                }
            )
        }
        item {
            Spacer(modifier = Modifier.height(16.dp))
        }
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
                    TrackingUtil.trackMenuShareClick()
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
        Spacer(modifier = Modifier.height(20.dp))
    }

    if (showRateDialog) {
        RateDialog(
            onDismissRequest = {
                showRateDialog = false
            }
        )
    }
}

@Composable
fun GamesMenuItem(
    modifier: Modifier = Modifier,
    menuGame: MenuGame,
    onClick: (MenuGame) -> Unit,
) {
    Box(
        modifier = modifier
            .width(310.dp)
            .height(100.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(5.dp))
                .background(menuGame.borderColor)
                .padding(bottom = 3.dp)
                .clip(RoundedCornerShape(5.dp))
                .background(menuGame.color)
                .clickable { onClick(menuGame) },
        ) {
            EmojisAroundElement(
                sign = menuGame.sign,
                modifier = Modifier.fillMaxSize(),
                fontFamily = iOS14EmojiFont
            ) {
                RoundButton(
                    onClick = { onClick(menuGame) },
                    colors = ButtonDefaults.buttonColors(backgroundColor = menuGame.buttonColor)
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

            Column(modifier = Modifier.padding(start = 11.dp, top = 8.dp)) {
                Text(
                    text = menuGame.title.asString(),
                    color = Color.White,
                    style = Typography.h3.copy(fontSize = 26.sp)
                )
                Text(
                    text = stringResource(id = R.string.text_your_score, menuGame.score.toString()),
                    color = Color.White,
                    style = Typography.body1.copy(fontSize = 14.sp)
                )
            }
        }
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
