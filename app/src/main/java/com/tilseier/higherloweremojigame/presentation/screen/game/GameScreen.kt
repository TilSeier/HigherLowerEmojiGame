package com.tilseier.higherloweremojigame.presentation.screen.game

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.lifecycle.viewmodel.compose.viewModel
import com.tilseier.higherloweremojigame.ui.theme.AppContentColor
import com.tilseier.higherloweremojigame.ui.theme.AppThemeColor

@Composable
fun GameScreen(
    category: String,
    navController: NavHostController,
    viewModel: GameViewModel = viewModel()
) {
    // TODO observe game items
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
