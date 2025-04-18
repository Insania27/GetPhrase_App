package com.example.getphraseapp.UI_Objects.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.getphraseapp.Items.mySelectedGames
import com.example.getphraseapp.Items.mySelectedMovies

@Composable
fun MoviesScreen(navController: NavController){
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier.fillMaxSize().background(color = Color.White),
        contentPadding = PaddingValues(8.dp)
    ){
        items(mySelectedMovies){ movie ->
            Card(
                modifier = Modifier.padding(6.dp).fillMaxWidth()
                    .aspectRatio(0.6f)
                    .clip(RoundedCornerShape(20.dp))
                    .clickable { navController.navigate(movie.route) },
                colors = CardDefaults.cardColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                )
            ){
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    AsyncImage(
                        model = movie.image,
                        contentDescription = "Фото фильма",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier.fillMaxWidth()
                            .aspectRatio(0.7f)
                            .clip(RoundedCornerShape(20.dp)),
                    )
                    Text(text = movie.name)
                }
            }
        }

    }
}