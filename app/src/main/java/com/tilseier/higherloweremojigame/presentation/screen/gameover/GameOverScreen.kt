package com.tilseier.higherloweremojigame.presentation.screen.gameover

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.lifecycle.viewmodel.compose.viewModel
import com.tilseier.higherloweremojigame.presentation.screen.game.GameViewModel

@Composable
fun GameOverScreen(score: Int, navController: NavHostController, viewModel: GameViewModel = viewModel()) {
    Text(text = "GameOverScreen")
}
