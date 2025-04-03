package com.example.getphraseapp.UI_Objects.Screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
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
import com.example.getphraseapp.ViewModel.GameViewModel

@Composable
fun MenuScreen(viewModel: GameViewModel = viewModel()) {
    val games by viewModel.gameList.observeAsState(emptyList())

    val mySelectedGames = listOf(
        App(570, "Dota 2"),
        App(730, "Counter-Strike: Global Offensive"),
        App(578080, "PUBG: BATTLEGROUNDS")
    )

    LazyColumn (
        modifier = Modifier.fillMaxSize().background(Color.Black)
    )
    {
        items(mySelectedGames) { game ->

            val imageUrl = "https://cdn.akamai.steamstatic.com/steam/apps/${game.appid}/header.jpg"

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(8.dp)
                    .clickable {  },
                colors = CardDefaults.cardColors(
                    containerColor = Color.DarkGray,
                    contentColor = Color.White
                )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .clickable {  }
                        .padding(16.dp)
                ) {
                    Text(
                        text = game.name,
                        modifier = Modifier.padding(bottom = 8.dp)
                    )

                    Log.d("ImageDebug", "Loading image: $imageUrl")


                    Image(
                        painter = rememberAsyncImagePainter(
                            ImageRequest.Builder(LocalContext.current)
                                .data("https://cdn.akamai.steamstatic.com/steam/apps/${game.appid}/header.jpg")
                                .crossfade(true)
                                .build()
                        ),
                        contentDescription = "Обложка ${game.name}",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(180.dp)
                            .clip(RoundedCornerShape(20.dp)),
                        contentScale = ContentScale.FillWidth
                    )

                }
            }
        }
    }


    LaunchedEffect(Unit) {
        viewModel.fetchGames()
    }
}