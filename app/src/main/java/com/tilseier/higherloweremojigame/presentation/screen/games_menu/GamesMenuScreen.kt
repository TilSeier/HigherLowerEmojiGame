package com.tilseier.higherloweremojigame.presentation.screen.games_menu

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.tilseier.higherloweremojigame.presentation.GameViewModel
import com.tilseier.higherloweremojigame.ui.theme.Background

@Composable
fun GamesMenuScreen(navController: NavHostController, viewModel: GameViewModel) {
    Scaffold(
        backgroundColor = Background,
        content = { paddingValues ->
            Box(modifier = Modifier.padding(paddingValues)) {
                GamesMenuContent(
                    navController = navController,
                    viewModel = viewModel
                )
            }
        }
    )
}
