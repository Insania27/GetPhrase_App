package com.example.getphraseapp.Navigation

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState

@Composable
fun BottomNavigationBar(navController: NavHostController){
    val items = listOf(
        BottomNavItem.Menu,
        BottomNavItem.Search,
        BottomNavItem.Favorites,
        BottomNavItem.Profile
    )
    NavigationBar (containerColor = Color(0xFF00fcb1)) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination?.route
        items.forEach{item ->
            NavigationBarItem(
                icon = { Icon(imageVector = item.icon, contentDescription = item.title) },
                label = { Text(item.title) },
                selected = currentDestination == item.route,
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color(0xFF919191),
                    unselectedIconColor = Color.DarkGray,
                    selectedTextColor = Color(0xFF919191),
                    unselectedTextColor = Color.DarkGray,
                    indicatorColor = Color.Transparent
                ),
                onClick = {
                    navController.navigate(item.route){
                        popUpTo(navController.graph.startDestinationId){
                            saveState = true
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                }
            )
        }
    }
}
