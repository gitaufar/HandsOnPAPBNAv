package com.example.papbnav.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.papbnav.ui.screens.SplashScreen

@Composable
fun RootNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Routes.SPLASH
    ) {
        // Splash tetap sama
        composable(Routes.SPLASH) {
            SplashScreen(
                onFinished = {
                    navController.navigate(Routes.MAIN_GRAPH) {
                        popUpTo(Routes.SPLASH) { inclusive = true }
                        launchSingleTop = true
                    }
                }
            )
        }

        // Langkah 3.1: Ganti navigation(...) dengan satu composable MAIN_GRAPH
        composable(Routes.MAIN_GRAPH) {
            MainScaffold() // Ini akan kamu buat di langkah 3.2
        }
    }
}