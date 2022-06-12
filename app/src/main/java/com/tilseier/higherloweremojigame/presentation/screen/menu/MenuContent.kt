package com.tilseier.higherloweremojigame.presentation.screen.menu

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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.tilseier.higherloweremojigame.R
import com.tilseier.higherloweremojigame.common.Constants
import com.tilseier.higherloweremojigame.presentation.common.RoundButton
import com.tilseier.higherloweremojigame.presentation.navigation.Screen
import com.tilseier.higherloweremojigame.presentation.screen.game.GameViewModel
import com.tilseier.higherloweremojigame.presentation.screen.menu.model.MenuDifficulty
import com.tilseier.higherloweremojigame.ui.theme.HigherLowerEmojiGameTheme
import com.tilseier.higherloweremojigame.ui.theme.Typography
import com.tilseier.higherloweremojigame.ui.theme.iOS11EmojiFont

@Composable
fun MenuContent(
    navController: NavHostController,
    viewModel: GameViewModel,
    menuViewModel: MenuViewModel = viewModel()
) {
    SideEffect {
        menuViewModel.updateMenuDifficulties()
    }

    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(14.dp)
    ) {
        item {
            MenuHeader()
        }
        val menuDifficulties = menuViewModel.menuDifficulties.value
        itemsIndexed(menuDifficulties) { index, item ->
            MenuDifficultyItem(
                menuDifficulty = item,
                onClick = {
                    viewModel.newGame(it.difficulty)
                    navController.navigate(
                        route = Screen.Game.pass(
                            Constants.CATEGORY_EMOJI,
                            it.difficulty.name
                        )
                    )
                }
            )
        }
    }
}

@Composable
fun MenuHeader() {
    Column(
        modifier = Modifier.fillMaxWidth()
            .padding(horizontal = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_thumb_up),
                    contentDescription = "Rate",
                    tint = Color.White
                )
            }
            IconButton(onClick = { /*TODO*/ }) {
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
}

@Composable
fun MenuDifficultyItem(
    modifier: Modifier = Modifier,
    menuDifficulty: MenuDifficulty,
    onClick: (MenuDifficulty) -> Unit,
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
                .background(menuDifficulty.borderColor)
                .padding(bottom = 3.dp)
                .clip(RoundedCornerShape(5.dp))
                .background(menuDifficulty.color)
                .clickable { onClick(menuDifficulty) },
        ) {
            EmojisAroundElement(
                sign = menuDifficulty.sign,
                modifier = Modifier.fillMaxSize(),
                fontFamily = iOS11EmojiFont
            ) {
                RoundButton(
                    onClick = { onClick(menuDifficulty) },
                    colors = ButtonDefaults.buttonColors(backgroundColor = menuDifficulty.buttonColor)
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
                    text = menuDifficulty.title.asString(),
                    color = Color.White,
                    style = Typography.h3.copy(fontSize = 26.sp)
                )
                Text(
                    text = menuDifficulty.score.toString(),
                    color = Color.White,
                    style = Typography.body1.copy(fontSize = 14.sp)
                )
            }
        }
    }
}

@Composable
fun EmojisAroundElement(
    sign: String,
    modifier: Modifier = Modifier,
    fontFamily: FontFamily? = null,
    element: @Composable () -> Unit
) {
    ConstraintLayout(modifier = modifier.clip(shape = RectangleShape)) {
        val (
            main_element,
            parent_top_left_emoji,
            top_left_emoji_1, top_left_emoji_2, top_left_emoji_3,
            top_left_emoji_4, top_left_emoji_5, top_left_emoji_6
        ) = createRefs()

        val (
            top_right_emoji_1,
            bottom_right_emoji_1, bottom_right_emoji_2,
            bottom_left_emoji_1, bottom_left_emoji_2
        ) = createRefs()

        val fontSizeScale = 1.2f
        val alpha = 0.2f

        Box(
            modifier = Modifier
                .constrainAs(main_element) {
                    end.linkTo(parent.end, margin = 31.dp)
                    bottom.linkTo(parent.bottom, margin = 11.dp)
                },
            contentAlignment = Alignment.Center
        ) {
            element()
        }

        // parent emojis
        Box(
            modifier = Modifier
                .constrainAs(parent_top_left_emoji) {
                    start.linkTo(anchor = parent.start, margin = (-5).dp)
                    top.linkTo(anchor = parent.top, margin = (-5).dp)
                }
                .rotate(49f)
                .alpha(alpha),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (17 * fontSizeScale).sp,
                fontFamily = fontFamily,
            )
        }

        // top left visible emojis
        Box(
            modifier = Modifier
                .constrainAs(top_left_emoji_1) {
                    end.linkTo(anchor = main_element.start, margin = 12.dp)
                    bottom.linkTo(anchor = main_element.bottom, margin = 18.dp)
                }
                .rotate(-39f)
                .alpha(alpha),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (8 * fontSizeScale).sp,
                fontFamily = fontFamily
            )
        }

        Box(
            modifier = Modifier
                .constrainAs(top_left_emoji_2) {
                    start.linkTo(anchor = main_element.start, margin = 5.dp)
                    bottom.linkTo(anchor = main_element.top, margin = 15.dp)
                }
                .rotate(10f)
                .alpha(alpha),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (10 * fontSizeScale).sp,
                fontFamily = fontFamily
            )
        }

        Box(
            modifier = Modifier
                .constrainAs(top_left_emoji_3) {
                    end.linkTo(anchor = top_left_emoji_1.start, margin = 24.dp)
                    top.linkTo(anchor = top_left_emoji_1.top, margin = 5.dp)
                }
                .rotate(16f)
                .alpha(alpha),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (10 * fontSizeScale).sp,
                fontFamily = fontFamily
            )
        }

        Box(
            modifier = Modifier
                .constrainAs(top_left_emoji_4) {
                    end.linkTo(anchor = top_left_emoji_1.start, margin = 7.dp)
                    bottom.linkTo(anchor = top_left_emoji_1.top, margin = 19.dp)
                }
                .rotate(31f)
                .alpha(alpha),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (10 * fontSizeScale).sp,
                fontFamily = fontFamily
            )
        }

        Box(
            modifier = Modifier
                .constrainAs(top_left_emoji_5) {
                    end.linkTo(anchor = top_left_emoji_3.start, margin = 32.dp)
                    bottom.linkTo(anchor = top_left_emoji_3.bottom, margin = 6.dp)
                }
                .rotate(7f)
                .alpha(alpha),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (6 * fontSizeScale).sp,
                fontFamily = fontFamily
            )
        }

        Box(
            modifier = Modifier
                .constrainAs(top_left_emoji_6) {
                    end.linkTo(anchor = top_left_emoji_5.start, margin = 32.dp)
                    top.linkTo(anchor = top_left_emoji_5.top, margin = 4.dp)
                }
                .rotate(7f)
                .alpha(alpha),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (11 * fontSizeScale).sp,
                fontFamily = fontFamily
            )
        }

        // top right visible emojis
        Box(
            modifier = Modifier
                .constrainAs(top_right_emoji_1) {
                    start.linkTo(anchor = main_element.start, margin = 50.dp)
                    bottom.linkTo(anchor = main_element.top, margin = 20.dp)
                }
                .rotate(-39f)
                .alpha(alpha),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (17 * fontSizeScale).sp,
                fontFamily = fontFamily
            )
        }

        // bottom right visible emojis
        Box(
            modifier = Modifier
                .constrainAs(bottom_right_emoji_2) {
                    end.linkTo(anchor = parent.end, margin = 5.dp)
                    bottom.linkTo(anchor = parent.bottom, margin = 25.dp)
                }
                .rotate(-22f)
                .alpha(alpha),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (10 * fontSizeScale).sp,
                fontFamily = fontFamily
            )
        }

        Box(
            modifier = Modifier
                .constrainAs(bottom_right_emoji_1) {
                    end.linkTo(anchor = parent.end, margin = 49.dp)
                    bottom.linkTo(anchor = parent.bottom, margin = (-4).dp)
                }
                .rotate(10f)
                .alpha(alpha),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (10 * fontSizeScale).sp,
                fontFamily = fontFamily
            )
        }

        // bottom left visible emojis
        Box(
            modifier = Modifier
                .constrainAs(bottom_left_emoji_1) {
                    start.linkTo(anchor = parent.start, margin = 160.dp)
                    bottom.linkTo(anchor = parent.bottom, margin = (-8).dp)
                }
                .rotate(49f)
                .alpha(alpha),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (17 * fontSizeScale).sp,
                fontFamily = fontFamily
            )
        }

        Box(
            modifier = Modifier
                .constrainAs(bottom_left_emoji_2) {
                    end.linkTo(anchor = bottom_left_emoji_1.start, margin = 39.dp)
                    top.linkTo(anchor = bottom_left_emoji_1.top, margin = 8.dp)
                }
                .rotate(49f)
                .alpha(alpha),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = sign,
                fontSize = (10 * fontSizeScale).sp,
                fontFamily = fontFamily
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MenuContentPreview() {
    HigherLowerEmojiGameTheme {
        MenuContent(
            navController = rememberNavController(),
            viewModel = viewModel()
        )
    }
}
