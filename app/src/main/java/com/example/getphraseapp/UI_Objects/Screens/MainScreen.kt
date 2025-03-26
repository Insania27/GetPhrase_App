package com.example.getphraseapp.UI_Objects.Screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.getphraseapp.FavoritesScreen
import com.example.getphraseapp.MenuScreen
import com.example.getphraseapp.Navigation.BottomNavItem
import com.example.getphraseapp.SearchScreen

@Composable
fun MainScreen(){
    val navController = rememberNavController()
    Scaffold(
        bottomBar = { BottomNavigationBar(navController) }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = BottomNavItem.Profile.route,
            Modifier.padding(innerPadding)
        ){
            composable (BottomNavItem.Menu.route) { MenuScreen() }
            composable (BottomNavItem.Search.route) { SearchScreen() }
            composable (BottomNavItem.Favorites.route) { FavoritesScreen() }
            composable (BottomNavItem.Profile.route) { ProfileScreen() }
        }
    }
}