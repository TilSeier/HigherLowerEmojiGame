package com.tilseier.higherloweremojigame.presentation.screen.gameover

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.tilseier.higherloweremojigame.data.local.FactsLocalDataSource
import com.tilseier.higherloweremojigame.data.repository.FactsRepositoryImpl
import com.tilseier.higherloweremojigame.domain.use_case.get_items.GetFactsUseCase
import com.tilseier.higherloweremojigame.extantions.viewModelFactory
import com.tilseier.higherloweremojigame.presentation.screen.game.GameViewModel

@Composable
fun GameOverScreen(navController: NavHostController, viewModel: GameViewModel) {
    val gameOverViewModel: GameOverViewModel = viewModel(factory = viewModelFactory {
        GameOverViewModel(GetFactsUseCase(FactsRepositoryImpl(FactsLocalDataSource())))
    })
    Scaffold(
        content = { paddingValues ->
            Box(modifier = Modifier.padding(paddingValues)) {
                GameOverContent(
                    navController = navController,
                    viewModel = viewModel,
                    gameOverViewModel = gameOverViewModel
                )
            }
        }
    )
}
