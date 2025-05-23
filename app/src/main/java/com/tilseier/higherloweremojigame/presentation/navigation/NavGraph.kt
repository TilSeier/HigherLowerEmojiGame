package com.tilseier.higherloweremojigame.presentation.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.DialogProperties
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.dialog
import androidx.navigation.navArgument
import com.google.accompanist.navigation.material.BottomSheetNavigator
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.google.accompanist.navigation.material.ModalBottomSheetLayout
import com.tilseier.higherloweremojigame.R
import com.tilseier.higherloweremojigame.common.Constants
import com.tilseier.higherloweremojigame.common.Difficulty
import com.tilseier.higherloweremojigame.common.Game
import com.tilseier.higherloweremojigame.presentation.GameViewModel
import com.tilseier.higherloweremojigame.presentation.screen.game.GameScreen
import com.tilseier.higherloweremojigame.presentation.screen.gameover.GameOverScreen
import com.tilseier.higherloweremojigame.presentation.screen.games_menu.GamesMenuScreen
import com.tilseier.higherloweremojigame.presentation.screen.menu.HomeScreen
import com.tilseier.higherloweremojigame.presentation.screen.splash.SplashScreen
import com.tilseier.higherloweremojigame.ui.theme.DialogBackground
import com.tilseier.higherloweremojigame.ui.theme.DialogBorder

@OptIn(ExperimentalMaterialNavigationApi::class)
@Composable
fun NavGraph(
    bottomSheetNavigator: BottomSheetNavigator,
    navController: NavHostController,
    viewModel: GameViewModel,
) {
    ModalBottomSheetLayout(bottomSheetNavigator = bottomSheetNavigator) {
        NavHost(
            navController = navController,
            startDestination = Screen.Splash.route
        ) {
            composable(route = Screen.Splash.route) {
                SplashScreen(navController = navController)
            }
            composable(route = Screen.GamesMenu.route) {
                GamesMenuScreen(navController = navController, viewModel = viewModel)
            }
            composable(route = Screen.EmojiDifficultiesMenu.route) {
                HomeScreen(navController = navController, viewModel = viewModel)
            }
            composable(
                route = Screen.Game.route,
                arguments = listOf(
                    navArgument(Constants.ARGUMENT_KEY_CATEGORY) {
                        type = NavType.StringType
                        defaultValue = Game.INVENTION_GAME.name
                    },
                    navArgument(Constants.ARGUMENT_KEY_DIFFICULTY) {
                        type = NavType.StringType
                        defaultValue = Difficulty.EASY.name
                    },
                )
            ) { backStackEntry ->
                val arguments = backStackEntry.arguments ?: return@composable
                val category = arguments.getString(Constants.ARGUMENT_KEY_CATEGORY) ?: return@composable
                val difficulty =
                    arguments.getString(Constants.ARGUMENT_KEY_DIFFICULTY) ?: return@composable

                GameScreen(
                    category = category,
                    difficulty = difficulty,
                    navController = navController,
                    viewModel = viewModel
                )
            }
            composable(route = Screen.GameOver.route) {
                GameOverScreen(navController = navController, viewModel = viewModel)
            }
            dialog(
                route = Screen.ExitDialog.route,
                dialogProperties = DialogProperties(
                    dismissOnBackPress = true,
                    dismissOnClickOutside = true,
                )
            ) {
                Box(modifier = Modifier.width(280.dp)) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .clip(RoundedCornerShape(10.dp))
                            .background(DialogBorder)
                            .padding(bottom = 3.dp)
                            .clip(RoundedCornerShape(10.dp))
                            .background(DialogBackground),
                    ) {
                        Column {
                            Column(
                                modifier = Modifier.padding(16.dp),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = stringResource(id = R.string.text_dialog_exit_title),
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    textAlign = TextAlign.Center,
                                    color = Color.Black
                                )
                                Text(
                                    text = stringResource(id = R.string.text_dialog_exit_description),
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Normal,
                                    textAlign = TextAlign.Center,
                                    color = Color.Black
                                )
                            }
                            Divider(color = DialogBorder)
                            Row(modifier = Modifier.height(IntrinsicSize.Min)) {
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .clickable { navController.popBackStack() }
                                        .padding(horizontal = 16.dp, vertical = 8.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = stringResource(id = R.string.button_cancel),
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Bold,
                                        color = Color.Black
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .fillMaxHeight()
                                        .width(1.dp)
                                        .background(DialogBorder),
                                )
                                Box(
                                    modifier = Modifier
                                        .weight(1f)
                                        .clickable {
                                            navController.popBackStack(
                                                route = Screen.GamesMenu.route,
                                                inclusive = false
                                            )
                                        }
                                        .padding(horizontal = 16.dp, vertical = 8.dp),
                                    contentAlignment = Alignment.Center
                                ) {
                                    Text(
                                        text = stringResource(id = R.string.button_ok),
                                        fontSize = 16.sp,
                                        fontWeight = FontWeight.Normal,
                                        color = Color.Black
                                    )
                                }
                            }
                        }
                    }
                }
            }

            // use bottomSheet here if needed
            // bottomSheet(route = Screen.BrowserModal.route) {
            //     LazyColumn(modifier = Modifier.fillMaxSize()) {
            //
            //     }
            // }
        }
    }
}
