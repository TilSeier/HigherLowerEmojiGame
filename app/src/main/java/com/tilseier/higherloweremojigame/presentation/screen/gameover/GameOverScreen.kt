package com.tilseier.higherloweremojigame.presentation.screen.gameover

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun GameOverScreen(score: Int, navController: NavHostController, viewModel: GameOverViewModel = viewModel()) {
    Text(text = "GameOverScreen")
}
