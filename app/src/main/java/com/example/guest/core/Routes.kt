package com.example.guestapp.core
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.guest.ui.screens.Greeting
import com.example.guest.ui.screens.GuestListScreen
import com.example.guest.ui.screens.ProfileScreen


@Composable
fun Routes() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = "Greeting"
    ) {
        composable("GuestListScreen") {
            GuestListScreen(navController)
        }
        composable("ProfileScreen") {
            ProfileScreen(navController)
        }
        composable("Greeting") {
            Greeting(navController = navController)
        }
    }
}