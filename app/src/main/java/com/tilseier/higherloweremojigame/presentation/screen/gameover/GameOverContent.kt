package com.tilseier.higherloweremojigame.presentation.screen.gameover

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.tilseier.higherloweremojigame.presentation.navigation.Screen
import com.tilseier.higherloweremojigame.presentation.screen.game.GameViewModel
import com.tilseier.higherloweremojigame.ui.theme.HigherLowerEmojiGameTheme

@Composable
fun GameOverContent(
    navController: NavHostController,
    viewModel: GameViewModel
) {
    Column {
        Text(text = "NEW GAME", modifier = Modifier.clickable {
            viewModel.newGame()
            navController.navigate(Screen.Game.route) {
                popUpTo(Screen.Menu.route)
            }
        })
        Text(text = "CONTINUE GAME", modifier = Modifier.clickable {
            viewModel.continueGame()
            navController.navigate(Screen.Game.route) {
                popUpTo(Screen.Menu.route)
            }
        })
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
