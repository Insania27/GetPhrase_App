package com.example.getphraseapp.UI_Objects.Screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.getphraseapp.FavoritesScreen
import com.example.getphraseapp.Navigation.BottomNavItem
import com.example.getphraseapp.Navigation.BottomNavigationBar
import com.example.getphraseapp.UI_Objects.ScreensOfItems.Games.GodOfWarScreen
import com.example.getphraseapp.UI_Objects.ScreensOfItems.Games.HorzionScreen
import com.example.getphraseapp.UI_Objects.ScreensOfItems.Games.TLOU2Screen
import com.example.getphraseapp.UI_Objects.ScreensOfItems.Games.TheWitcherScreen
import com.example.getphraseapp.UI_Objects.ScreensOfItems.Movies.FightClubScreen
import com.example.getphraseapp.UI_Objects.ScreensOfItems.Movies.ForrestGumpScreen
import com.example.getphraseapp.UI_Objects.ScreensOfItems.Movies.InceptionScreen
import com.example.getphraseapp.UI_Objects.ScreensOfItems.Movies.InterstellarScreen
import com.example.getphraseapp.UI_Objects.ScreensOfItems.Movies.PulpFictionScreen
import com.example.getphraseapp.UI_Objects.ScreensOfItems.Movies.TheDepartedScreen
import com.example.getphraseapp.UI_Objects.ScreensOfItems.Series.BetterCallSaulScreen
import com.example.getphraseapp.UI_Objects.ScreensOfItems.Series.BreakingBadScreen
import com.example.getphraseapp.UI_Objects.ScreensOfItems.Series.StrangerThingsScreen
import com.example.getphraseapp.UI_Objects.ScreensOfItems.Series.TedLassoScreen
import com.example.getphraseapp.UI_Objects.ScreensOfItems.Series.TheBoysScreen
import com.example.getphraseapp.UI_Objects.ScreensOfItems.Series.TheOfficeScreen
import com.example.getphraseapp.UI_Objects.ScreensOfItems.Series.TheSopranosScreen
import com.example.getphraseapp.UI_Objects.ScreensOfItems.Series.YellowstoneScreen
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

            composable("inceptionRoute") { InceptionScreen() }
            composable("pulpFictionRoute") { PulpFictionScreen() }
            composable("interstellarRoute") { InterstellarScreen() }
            composable("forrestGumpRoute") { ForrestGumpScreen() }
            composable("theDepartedRoute") { TheDepartedScreen() }
            composable("fightClubRoute") { FightClubScreen() }

            composable("godOfWarRoute") { GodOfWarScreen() }
            composable("horizonRoute") { HorzionScreen() }
            composable("theWitcherRoute") { TheWitcherScreen() }
            composable("tlou2Route") { TLOU2Screen() }

            composable("betterCallSaulRoute") { BetterCallSaulScreen() }
            composable("breakingBadRoute") { BreakingBadScreen() }
            composable("strangerThingsRoute") { StrangerThingsScreen() }
            composable("tedLassoRoute") { TedLassoScreen() }
            composable("theBoysRoute") { TheBoysScreen() }
            composable("theOfficeRoute") { TheOfficeScreen() }
            composable("theSopranosRoute") { TheSopranosScreen() }
            composable("yellowStoneRoute") { YellowstoneScreen() }




        }
    }
}