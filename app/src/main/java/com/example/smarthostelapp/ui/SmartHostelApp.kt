package com.example.smarthostelapp.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.smarthostelapp.ui.screens.LoginScreen
import androidx.navigation.compose.composable


@Composable
fun SmartHostelApp() {
    val navController = rememberNavController() // Create NavController

    NavHost(navController = navController, startDestination = "welcomeScreen") {
        composable("welcomeScreen") { WelcomeScreen(navController) }
        composable("signupScreen") { SignupScreen() }
        composable("loginScreen") { LoginScreen(navController) }
    }
}
