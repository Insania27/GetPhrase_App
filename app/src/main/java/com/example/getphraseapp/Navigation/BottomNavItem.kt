package com.example.getphraseapp.Navigation

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomNavItem(val route: String, val icon: ImageVector, val title: String) {
    object Menu: BottomNavItem("home", Icons.Default.Menu, "Меню")
    object Search: BottomNavItem("search", Icons.Default.Search, "Поиск")
    object Favorites: BottomNavItem("favorites", Icons.Default.Favorite, "Избранное")
    object Profile: BottomNavItem("profile", Icons.Default.AccountCircle, "Профиль")
}