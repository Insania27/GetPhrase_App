package com.example.getphraseapp.UI_Objects.Screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.NestedScrollSource.Companion.SideEffect
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.getphraseapp.Navigation.BottomNavItem
import com.example.getphraseapp.Navigation.BottomNavigationBar
import com.example.getphraseapp.UI_Objects.ScreensOfItems.Games.AtomicHeartScreen
import com.example.getphraseapp.UI_Objects.ScreensOfItems.Games.GTA5Screen
import com.example.getphraseapp.UI_Objects.ScreensOfItems.Games.GodOfWarScreen
import com.example.getphraseapp.UI_Objects.ScreensOfItems.Games.HorizonScreen
import com.example.getphraseapp.UI_Objects.ScreensOfItems.Games.RDR2Screen
import com.example.getphraseapp.UI_Objects.ScreensOfItems.Games.TLOU2Screen
import com.example.getphraseapp.UI_Objects.ScreensOfItems.Games.TLOUScreen
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
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.google.firebase.auth.FirebaseAuth



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(){
    val navController = rememberNavController()
    val auth = FirebaseAuth.getInstance()
    var userChecked by remember { mutableStateOf(false) }



    LaunchedEffect(Unit) {
        auth.currentUser?.reload()
        userChecked = true
    }

    val startDestination = when {
        !userChecked -> "splash"
        auth.currentUser?.isEmailVerified == true -> BottomNavItem.Profile.route
        auth.currentUser != null -> "verify_email"
        else -> "loginScreen"
    }


    val statusBarColor = MaterialTheme.colorScheme.primary

    val systemUiController = rememberSystemUiController()
    SideEffect {
        systemUiController.setStatusBarColor(
            color = statusBarColor,
            darkIcons = false
        )
    }

    Scaffold(
        bottomBar = { BottomNavigationBar(navController) },
        topBar = {
            TopAppBar(
                title = {  },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = statusBarColor,
                    titleContentColor = statusBarColor
                ),
                modifier = Modifier.height(50.dp)
            )
        }

    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = startDestination,
            Modifier.padding(innerPadding)
        ){

            composable("verify_email") {
                if (auth.currentUser?.isEmailVerified == true) {
                    LaunchedEffect(Unit) {
                        navController.navigate(BottomNavItem.Profile.route)
                    }
                }
                VerifyEmailScreen(navController)
            }

            composable("splash") {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator()
                }
            }


            composable (BottomNavItem.Menu.route) { MenuScreen(navController) }
            composable (BottomNavItem.Profile.route) { ProfileScreen(navController) }
            composable (BottomNavItem.Favorites.route) { FavoritesScreen(navController) }
            composable ("gamesScreen") { GamesScreen(navController) }
            composable ("seriesScreen") { SeriesScreen(navController) }
            composable ("moviesScreen") { MoviesScreen(navController) }

            composable(BottomNavItem.Search.route) {
                val viewModel: AppsViewModel = viewModel()
                SearchScreen(navController = navController, viewModel = viewModel)
            }


            // Вход
            composable("loginScreen") { LoginScreen(navController) }
            composable("registerScreen") { RegisterScreen(navController) }

            // Выученное
            composable("learnedScreen") { LearnedScreen(navController) }

            // Фильмы
            composable("inceptionRoute") { InceptionScreen() }
            composable("pulpFictionRoute") { PulpFictionScreen() }
            composable("interstellarRoute") { InterstellarScreen() }
            composable("forrestGumpRoute") { ForrestGumpScreen() }
            composable("theDepartedRoute") { TheDepartedScreen() }
            composable("fightClubRoute") { FightClubScreen() }


            // Игры
            composable("godOfWarRoute") { GodOfWarScreen() }
            composable("horizonRoute") { HorizonScreen() }
            composable("theWitcherRoute") { TheWitcherScreen() }
            composable("tlou2Route") { TLOU2Screen() }
            composable("atomicHeartRoute") { AtomicHeartScreen() }
            composable("rdr2Route") { RDR2Screen() }
            composable("gta5Route") { GTA5Screen() }
            composable("tlouRoute") { TLOUScreen() }


            // Сериалы
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