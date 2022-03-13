package com.tilseier.higherloweremojigame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.tilseier.higherloweremojigame.presentation.navigation.NavGraph
import com.tilseier.higherloweremojigame.ui.theme.HigherLowerEmojiGameTheme

class MainActivity : ComponentActivity() {
    private lateinit var navController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HigherLowerEmojiGameTheme {
                navController = rememberNavController()
                NavGraph(navController = navController)
            }
        }
    }
}
