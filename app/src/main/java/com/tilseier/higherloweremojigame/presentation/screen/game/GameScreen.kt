package com.tilseier.higherloweremojigame.presentation.screen.game

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.tilseier.higherloweremojigame.ui.theme.AppContentColor
import com.tilseier.higherloweremojigame.ui.theme.AppThemeColor

@Composable
fun GameScreen(
    category: String,
    difficulty: String,
    navController: NavHostController,
    viewModel: GameViewModel
) {
    Scaffold(
        contentColor = MaterialTheme.colors.AppContentColor,
        backgroundColor = MaterialTheme.colors.AppThemeColor,
        content = {
            GameContent(
                navController = navController,
                viewModel = viewModel
            )
        }
    )
}
