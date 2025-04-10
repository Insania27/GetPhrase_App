package com.example.getphraseapp.UI_Objects.Screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items as gridItems
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.example.getphraseapp.Data.Network.App
import com.example.getphraseapp.Data.Network.RetrofitClient
import com.example.getphraseapp.Navigation.Screen
import com.example.getphraseapp.ViewModel.GameViewModel
import com.example.getphraseapp.ViewModel.GameViewModelFactory

@Composable
fun MenuScreen(navController: NavController) {
    val factory = remember { GameViewModelFactory(RetrofitClient.apiService) }
    val viewModel: GameViewModel = viewModel(factory = factory)

    val gamesState = viewModel.games.observeAsState()
    val games = gamesState.value ?: emptyList()

    LaunchedEffect(Unit) {
        viewModel.fetchGames()
    }

    val assassinCreed = App(
        appid = 3035570,
        name = "Assassin's Creed",
        route = "gamesScreen",
        isMovie = false,
        imageUrl = "https://cdn.akamai.steamstatic.com/steam/apps/3035570/header.jpg"
    )

    val combinedGames = games + assassinCreed

    val seriesForList = listOf(
        App(
            appid = 169,
            name = "Сериалы",
            route = "seriesScreen",
            isMovie = true,
            imageUrl = "http://static.tvmaze.com/uploads/images/original_untouched/0/2400.jpg"
        ),
        App(
            appid = null,
            name = "Фильмы",
            route = "moviesScreen",
            isMovie = true,
            imageUrl = "https://i.ebayimg.com/images/g/B8oAAOSw2fdg5A-h/s-l1200.jpg"
        )
    )

    Column(modifier = Modifier.fillMaxSize().background(Color.Black)) {

        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            items(combinedGames) { game ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(250.dp)
                        .padding(8.dp)
                        .clickable { navController.navigate("gamesScreen") },
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Black,
                        contentColor = Color.White
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        Text(
                            text = game.name,
                            modifier = Modifier.padding(bottom = 8.dp)
                        )

                        Image(
                            painter = rememberAsyncImagePainter(
                                ImageRequest.Builder(LocalContext.current)
                                    .data(game.finalImageUrl)
                                    .crossfade(true)
                                    .build()
                            ),
                            contentDescription = "Обложка ${game.name}",
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(RoundedCornerShape(20.dp)),
                            contentScale = ContentScale.Crop
                        )
                    }
                }
            }
        }


        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.fillMaxSize().background(color = Color.Black),
            contentPadding = PaddingValues(8.dp)
        ) {
            gridItems(seriesForList) { series ->
                val imageUrl = series.finalImageUrl

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(300.dp)
                        .padding(8.dp)
                        .clickable { navController.navigate(series.route) },
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Black,
                        contentColor = Color.White
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        Text(
                            text = series.name,
                            modifier = Modifier.padding(bottom = 8.dp)
                        )

                        Image(
                            painter = rememberAsyncImagePainter(
                                ImageRequest.Builder(LocalContext.current)
                                    .data(imageUrl)
                                    .crossfade(true)
                                    .build()
                            ),
                            contentDescription = "Обложка ${series.name}",
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(220.dp)
                                .clip(RoundedCornerShape(20.dp)),
                            contentScale = ContentScale.Crop
                        )
                    }
                }
            }
        }
    }
}
