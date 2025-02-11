package com.example.smarthostelapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text  // ✅ Use material3 instead of material
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun AdminDashboardScreen(navController: NavHostController) {
    Text(text = "Admin Dashboard Screen")
}
