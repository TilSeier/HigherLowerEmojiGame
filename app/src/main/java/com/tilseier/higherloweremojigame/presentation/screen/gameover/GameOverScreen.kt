package com.tilseier.higherloweremojigame.presentation.screen.gameover

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.lifecycle.viewmodel.compose.viewModel
import com.tilseier.higherloweremojigame.presentation.screen.game.GameViewModel
import com.tilseier.higherloweremojigame.ui.theme.AppContentColor
import com.tilseier.higherloweremojigame.ui.theme.AppThemeColor

@Composable
fun GameOverScreen(navController: NavHostController, viewModel: GameViewModel) {
    Scaffold(
        contentColor = MaterialTheme.colors.AppContentColor,
        backgroundColor = MaterialTheme.colors.AppThemeColor,
        content = {
            GameOverContent(
                navController = navController,
                viewModel = viewModel
            )
        }
    )
}
