package com.tilseier.higherloweremojigame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.tilseier.higherloweremojigame.data.local.ItemsLocalDataSource
import com.tilseier.higherloweremojigame.data.repository.ItemRepositoryImpl
import com.tilseier.higherloweremojigame.domain.use_case.get_items.GetItemsUseCase
import com.tilseier.higherloweremojigame.extantions.viewModelFactory
import com.tilseier.higherloweremojigame.presentation.navigation.NavGraph
import com.tilseier.higherloweremojigame.presentation.screen.game.GameViewModel
import com.tilseier.higherloweremojigame.ui.theme.HigherLowerEmojiGameTheme

class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController
    private lateinit var viewModel: GameViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HigherLowerEmojiGameTheme {
                navController = rememberNavController()
                viewModel = viewModel(factory = viewModelFactory {
                    GameViewModel(GetItemsUseCase(ItemRepositoryImpl(ItemsLocalDataSource())))
                })
                NavGraph(
                    navController = navController,
                    viewModel = viewModel
                )
            }
        }
    }
}
