package com.example.getphraseapp.Navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.getphraseapp.UI_Objects.Screens.GamesScreen
import com.example.getphraseapp.UI_Objects.Screens.MenuScreen

sealed class BottomNavItem(val route: String, val icon: ImageVector, val title: String) {
    object Menu: BottomNavItem("menu", Icons.Default.Menu, "Меню")
    object Search: BottomNavItem("search", Icons.Default.Search, "Поиск")
    object Favorites: BottomNavItem("favorites", Icons.Default.Favorite, "Избранное")
    object Profile: BottomNavItem("profile", Icons.Default.AccountCircle, "Профиль")
}


sealed class Screen(val route: String) {
    object Menu : Screen("menu")
    object Games : Screen("games")
}

