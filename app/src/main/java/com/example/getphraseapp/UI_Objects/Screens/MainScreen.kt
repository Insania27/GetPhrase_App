package com.example.getphraseapp.UI_Objects.Screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.getphraseapp.FavoritesScreen
import com.example.getphraseapp.Items.mySelectedGames
import com.example.getphraseapp.Navigation.BottomNavItem
import com.example.getphraseapp.Navigation.BottomNavigationBar
import com.example.getphraseapp.Navigation.Screen
import com.example.getphraseapp.SearchScreen
import com.example.getphraseapp.ViewModel.AppsViewModel

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
            composable (BottomNavItem.Menu.route) { MenuScreen(navController) }
            composable (BottomNavItem.Favorites.route) { FavoritesScreen() }
            composable (BottomNavItem.Profile.route) { ProfileScreen() }
            composable ("gamesScreen") { GamesScreen(navController) }
            composable ("seriesScreen") { SeriesScreen(navController) }
            composable ("moviesScreen") { MoviesScreen(navController) }

            composable(BottomNavItem.Search.route) {
                val viewModel: AppsViewModel = viewModel()
                SearchScreen(navController = navController, viewModel = viewModel)
            }




        }
    }
}