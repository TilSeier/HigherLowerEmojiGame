package com.tilseier.higherloweremojigame.presentation.screen.game

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.tilseier.higherloweremojigame.presentation.GameViewModel
import com.tilseier.higherloweremojigame.ui.theme.Background

@Composable
fun GameScreen(
    category: String,
    difficulty: String,
    navController: NavHostController,
    viewModel: GameViewModel
) {
    Scaffold(
        containerColor = Background,
        content = { paddingValues ->
            Box(modifier = Modifier.padding(paddingValues)) {
                GameContent(
                    navController = navController,
                    viewModel = viewModel
                )
            }
        }
    )
}
