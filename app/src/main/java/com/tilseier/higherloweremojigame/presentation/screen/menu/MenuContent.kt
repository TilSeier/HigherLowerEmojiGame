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
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
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
import com.tilseier.higherloweremojigame.presentation.common.RoundButton
import com.tilseier.higherloweremojigame.presentation.navigation.Screen
import com.tilseier.higherloweremojigame.presentation.screen.game.GameViewModel
import com.tilseier.higherloweremojigame.presentation.screen.menu.model.MenuDifficulty
import com.tilseier.higherloweremojigame.ui.theme.HigherLowerEmojiGameTheme
import com.tilseier.higherloweremojigame.ui.theme.Typography

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
        contentPadding = PaddingValues(horizontal = 40.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            Spacer(modifier = Modifier.height(50.dp))
            Image(
                painter = painterResource(id = R.drawable.logo_emoji_game),
                contentDescription = "The Higher Lower Emoji Game Logo",
                modifier = Modifier.width(300.dp),
                contentScale = ContentScale.FillWidth
            )
            Spacer(modifier = Modifier.height(50.dp))
        }
        val menuDifficulties = menuViewModel.menuDifficulties.value
        itemsIndexed(menuViewModel.menuDifficulties.value) { index, item ->
            MenuDifficultyItem(
                menuDifficulty = item,
                onClick = {
                    viewModel.newGame(it.difficulty)
                    navController.navigate(route = Screen.Game.pass(Constants.CATEGORY_EMOJI, it.difficulty.name))
                }
            )
            if (menuDifficulties.size > index + 1) {
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
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
            .fillMaxWidth()
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
            // TODO emoji background
            RoundButton(
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .padding(end = 31.dp, bottom = 11.dp),
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
                        modifier = Modifier.size(12.dp)
                    )
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

// TODO
//@Composable
//fun EmojisAroundElement(
//    modifier: Modifier = Modifier,
//    sign: String,
//    fontFamily: FontFamily? = null,
//    elementAlignment: Alignment,
//    elementPadding: PaddingValues = PaddingValues(0.dp),
//    element: @Composable () -> Unit
//) {
//    ConstraintLayout(modifier = modifier.clip(shape = RectangleShape)) {
//        val (
//            main_element,
//            top_left_emoji_1, top_left_emoji_2,
//            top_right_emoji_1, top_right_emoji_2,
//            bottom_right_emoji_1, bottom_right_emoji_2,
//            bottom_left_emoji_1, bottom_left_emoji_2
//        ) = createRefs()
//        val (
//            top_left_alpha_emoji_1, top_left_alpha_emoji_2, top_left_alpha_emoji_3, top_left_alpha_emoji_4,
//            top_right_alpha_emoji_1, top_right_alpha_emoji_2, top_right_alpha_emoji_3,
//            bottom_left_alpha_emoji_1, bottom_left_alpha_emoji_2,
//            bottom_right_alpha_emoji_1, bottom_right_alpha_emoji_2
//        ) = createRefs()
//
//        val fontSizeScale = 0.85f
//        val alpha = 0.2f
//
//        Box(
//            modifier = Modifier
//                .constrainAs(main_element) {
//                    start.linkTo(parent.start)
//                    top.linkTo(parent.top)
//                    end.linkTo(parent.end)
//                    bottom.linkTo(parent.bottom)
//                },
//            contentAlignment = Alignment.Center
//        ) {
//            Text(
//                text = sign,
//                fontSize = (126 * fontSizeScale).sp,
//                fontFamily = fontFamily
//            )
//        }
//
//        // top left visible emojis
//        Box(
//            modifier = Modifier
//                .constrainAs(top_left_emoji_2) {
//                    start.linkTo(anchor = top_left_emoji_1.start, margin = 24.dp)
//                    bottom.linkTo(anchor = top_left_emoji_1.bottom, margin = 26.dp)
//                }
//                .rotate(-32f),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(
//                text = sign,
//                fontSize = (19 * fontSizeScale).sp,
//                fontFamily = fontFamily
//            )
//        }
//
//        Box(
//            modifier = Modifier
//                .constrainAs(top_left_emoji_1) {
//                    end.linkTo(anchor = center_emoji.start, margin = 37.dp)
//                    bottom.linkTo(anchor = center_emoji.top)
//                }
//                .rotate(-32f),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(
//                text = sign,
//                fontSize = (37 * fontSizeScale).sp,
//                fontFamily = fontFamily
//            )
//        }
//
//        // top left alpha emojis
//        Box(
//            modifier = Modifier
//                .constrainAs(top_left_alpha_emoji_1) {
//                    end.linkTo(anchor = top_left_emoji_1.end, margin = 34.dp)
//                    bottom.linkTo(anchor = top_left_emoji_1.top, margin = 12.dp)
//                }
//                .rotate(17f)
//                .alpha(alpha),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(
//                text = sign,
//                fontSize = (27 * fontSizeScale).sp,
//                fontFamily = fontFamily
//            )
//        }
//
//        Box(
//            modifier = Modifier
//                .constrainAs(top_left_alpha_emoji_2) {
//                    start.linkTo(anchor = top_left_emoji_1.end, margin = 60.dp)
//                    bottom.linkTo(anchor = top_left_emoji_1.bottom, margin = 28.dp)
//                }
//                .rotate(17f)
//                .alpha(alpha),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(
//                text = sign,
//                fontSize = (31 * fontSizeScale).sp,
//                fontFamily = fontFamily
//            )
//        }
//
//        Box(
//            modifier = Modifier
//                .constrainAs(top_left_alpha_emoji_3) {
//                    start.linkTo(anchor = top_left_emoji_1.end, margin = 14.dp)
//                    top.linkTo(anchor = top_left_emoji_1.bottom, margin = 10.dp)
//                }
//                .rotate(-17f)
//                .alpha(alpha),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(
//                text = sign,
//                fontSize = (20 * fontSizeScale).sp,
//                fontFamily = fontFamily
//            )
//        }
//
//        Box(
//            modifier = Modifier
//                .constrainAs(top_left_alpha_emoji_4) {
//                    end.linkTo(anchor = top_left_emoji_1.start, margin = 12.dp)
//                    top.linkTo(anchor = top_left_emoji_1.bottom, margin = 35.dp)
//                }
//                .rotate(-5f)
//                .alpha(alpha),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(
//                text = sign,
//                fontSize = (33 * fontSizeScale).sp,
//                fontFamily = fontFamily
//            )
//        }
//
//        // top right visible emojis
//        Box(
//            modifier = Modifier
//                .constrainAs(top_right_emoji_2) {
//                    start.linkTo(anchor = top_right_emoji_1.start, margin = 26.dp)
//                    top.linkTo(anchor = top_right_emoji_1.top, margin = 28.dp)
//                },
//            contentAlignment = Alignment.Center
//        ) {
//            Text(
//                text = sign,
//                fontSize = (32 * fontSizeScale).sp,
//                fontFamily = fontFamily
//            )
//        }
//
//        Box(
//            modifier = Modifier
//                .constrainAs(top_right_emoji_1) {
//                    start.linkTo(anchor = center_emoji.end, margin = 20.dp)
//                    bottom.linkTo(anchor = center_emoji.top)
//                }
//                .rotate(16f),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(
//                text = sign,
//                fontSize = (44 * fontSizeScale).sp,
//                fontFamily = fontFamily
//            )
//        }
//
//        // top right alpha emojis
//        Box(
//            modifier = Modifier
//                .constrainAs(top_right_alpha_emoji_1) {
//                    end.linkTo(anchor = top_right_emoji_1.start, margin = 18.dp)
//                    top.linkTo(anchor = top_right_emoji_1.top, margin = 28.dp)
//                }
//                .rotate(18f)
//                .alpha(alpha),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(
//                text = sign,
//                fontSize = (24 * fontSizeScale).sp,
//                fontFamily = fontFamily
//            )
//        }
//
//        Box(
//            modifier = Modifier
//                .constrainAs(top_right_alpha_emoji_2) {
//                    start.linkTo(anchor = top_right_emoji_1.end, margin = 26.dp)
//                    top.linkTo(anchor = top_right_emoji_1.top, margin = 20.dp)
//                }
//                .rotate(17f)
//                .alpha(alpha),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(
//                text = sign,
//                fontSize = (35 * fontSizeScale).sp,
//                fontFamily = fontFamily
//            )
//        }
//
//        Box(
//            modifier = Modifier
//                .constrainAs(top_right_alpha_emoji_3) {
//                    start.linkTo(anchor = top_right_emoji_1.start, margin = 18.dp)
//                    top.linkTo(anchor = top_right_emoji_1.bottom, margin = 38.dp)
//                }
//                .rotate(-18f)
//                .alpha(alpha),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(
//                text = sign,
//                fontSize = (20 * fontSizeScale).sp,
//                fontFamily = fontFamily
//            )
//        }
//
//        // bottom right visible emojis
//        Box(
//            modifier = Modifier
//                .constrainAs(bottom_right_emoji_2) {
//                    start.linkTo(anchor = bottom_right_emoji_1.start, margin = 30.dp)
//                    top.linkTo(anchor = bottom_right_emoji_1.top, margin = 0.dp)
//                }
//                .rotate(16f),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(
//                text = sign,
//                fontSize = (19 * fontSizeScale).sp,
//                fontFamily = fontFamily
//            )
//        }
//
//        Box(
//            modifier = Modifier
//                .constrainAs(bottom_right_emoji_1) {
//                    start.linkTo(anchor = center_emoji.end, margin = 20.dp)
//                    top.linkTo(anchor = center_emoji.bottom, margin = 4.dp)
//                }
//                .rotate(16f),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(
//                text = sign,
//                fontSize = (37 * fontSizeScale).sp,
//                fontFamily = fontFamily
//            )
//        }
//
//        // bottom right alpha emojis
//        Box(
//            modifier = Modifier
//                .constrainAs(bottom_right_alpha_emoji_1) {
//                    start.linkTo(anchor = bottom_right_emoji_1.end, margin = 20.dp)
//                    bottom.linkTo(anchor = bottom_right_emoji_1.top, margin = 30.dp)
//                }
//                .rotate(16f)
//                .alpha(alpha),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(
//                text = sign,
//                fontSize = (31 * fontSizeScale).sp,
//                fontFamily = fontFamily
//            )
//        }
//
//        Box(
//            modifier = Modifier
//                .constrainAs(bottom_right_alpha_emoji_2) {
//                    top.linkTo(anchor = bottom_right_emoji_1.top, margin = 15.dp)
//                    end.linkTo(anchor = bottom_right_emoji_1.start, margin = 36.dp)
//                }
//                .rotate(-18f)
//                .alpha(alpha),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(
//                text = sign,
//                fontSize = (24 * fontSizeScale).sp,
//                fontFamily = fontFamily
//            )
//        }
//
//        // bottom left visible emojis
//        Box(
//            modifier = Modifier
//                .constrainAs(bottom_left_emoji_2) {
//                    start.linkTo(anchor = bottom_left_emoji_1.start, margin = 34.dp)
//                    bottom.linkTo(anchor = bottom_left_emoji_1.bottom, margin = 8.dp)
//                }
//                .rotate(39f),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(
//                text = sign,
//                fontSize = (33 * fontSizeScale).sp,
//                fontFamily = fontFamily
//            )
//        }
//
//        Box(
//            modifier = Modifier
//                .constrainAs(bottom_left_emoji_1) {
//                    end.linkTo(anchor = center_emoji.start, margin = 38.dp)
//                    top.linkTo(anchor = center_emoji.bottom)
//                }
//                .rotate(16f),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(
//                text = sign,
//                fontSize = (44 * fontSizeScale).sp,
//                fontFamily = fontFamily
//            )
//        }
//
//        // bottom left alpha emojis
//        Box(
//            modifier = Modifier
//                .constrainAs(bottom_left_alpha_emoji_1) {
//                    start.linkTo(anchor = bottom_left_emoji_1.end, margin = 1.dp)
//                    bottom.linkTo(anchor = bottom_left_emoji_1.top, margin = 22.dp)
//                }
//                .rotate(-17f)
//                .alpha(alpha),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(
//                text = sign,
//                fontSize = (19 * fontSizeScale).sp,
//                fontFamily = fontFamily
//            )
//        }
//
//        Box(
//            modifier = Modifier
//                .constrainAs(bottom_left_alpha_emoji_2) {
//                    start.linkTo(anchor = bottom_left_emoji_1.end, margin = 63.dp)
//                    top.linkTo(anchor = bottom_left_emoji_1.top, margin = 38.dp)
//                }
//                .rotate(17f)
//                .alpha(alpha),
//            contentAlignment = Alignment.Center
//        ) {
//            Text(
//                text = sign,
//                fontSize = (33 * fontSizeScale).sp,
//                fontFamily = fontFamily
//            )
//        }
//    }
//}

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
