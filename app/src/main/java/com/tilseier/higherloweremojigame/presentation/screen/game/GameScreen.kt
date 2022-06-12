package com.tilseier.higherloweremojigame.presentation.screen.game

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun GameScreen(
    category: String,
    difficulty: String,
    navController: NavHostController,
    viewModel: GameViewModel
) {
    Scaffold(
        content = {
            GameContent(
                navController = navController,
                viewModel = viewModel
            )
        }
    )
}
