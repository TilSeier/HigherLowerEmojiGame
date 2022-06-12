package com.tilseier.higherloweremojigame.presentation.screen.menu

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.tilseier.higherloweremojigame.presentation.screen.game.GameViewModel
import com.tilseier.higherloweremojigame.ui.theme.Background

@Composable
fun HomeScreen(navController: NavHostController, viewModel: GameViewModel) {
    Scaffold(
        backgroundColor = Background,
        content = {
            MenuContent(
                navController = navController,
                viewModel = viewModel
            )
        }
    )
}
