
package com.example.getphraseapp.UI_Objects.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import com.example.getphraseapp.Items.mySelectedGames


@Composable
fun GamesScreen() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(8.dp)
    ){
        items(mySelectedGames){ game ->
            Card(
                modifier = Modifier.padding(8.dp).fillMaxWidth().aspectRatio(1f)
            ){
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = game.name)
                    AsyncImage(
                        model = game.image,
                        contentDescription = "Фото игры",
                        modifier = Modifier.size(150.dp)
                    )
                }
            }
        }

    }
}