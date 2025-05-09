
package com.example.getphraseapp.UI_Objects.Screens

import android.content.Context
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import coil.compose.AsyncImage
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.example.getphraseapp.Items.mySelectedGames
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase



class FavoritesViewModelFactory(
    private val context: Context,
    private val userId: String
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(FavoritesViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return FavoritesViewModel(context, userId) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
    }
}

@Composable
fun GamesScreen(navController: NavController) {
    val context = LocalContext.current

    val userId = Firebase.auth.currentUser?.uid ?: ""

    val favoritesViewModel: FavoritesViewModel = viewModel(
        modelClass = FavoritesViewModel::class.java,
        factory    = FavoritesViewModelFactory(context, userId)
    )


    LaunchedEffect(userId) {
        favoritesViewModel.loadFavorites()
    }

    LazyVerticalGrid(columns = GridCells.Fixed(2), modifier = Modifier.fillMaxSize()) {
        items(mySelectedGames) { game ->


            val isFav by remember(userId, favoritesViewModel.favorites) {
                derivedStateOf {
                    userId.isNotBlank() &&
                            favoritesViewModel.favorites.any { it.itemId == game.id }
                }
            }

            GameCard(
                title       = game.name,
                imageUrl    = game.image,
                isFavorite  = isFav,
                onFavoriteClick = {
                    if (userId.isNotBlank()) {
                        val item = FavoriteItem(
                            userId   = userId,
                            itemId   = game.id,
                            itemType = "game",
                            title    = game.name,
                            imageUrl = game.image,
                            route    = game.route
                        )
                        favoritesViewModel.toggleFavorite(item)
                    } else {

                        navController.navigate("loginScreen")
                    }
                },
                onClick     = { navController.navigate(game.route) }
            )
        }
    }
}



@Composable
fun GameCard(
    title: String,
    imageUrl: String,
    isFavorite: Boolean,
    onFavoriteClick: () -> Unit,
    onClick: () -> Unit,
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .aspectRatio(0.87f)
            .padding(8.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clickable(onClick = onClick)
        ) {
            Image(
                painter = rememberAsyncImagePainter(
                    ImageRequest.Builder(LocalContext.current)
                        .data(imageUrl)
                        .crossfade(true)
                        .build()
                ),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(Color.Transparent, Color.Black.copy(alpha = 0.5F)),
                            startY = 0.5f
                        )
                    )
            )

            Text(
                text = title,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier
                    .align(Alignment.BottomStart)
                    .padding(16.dp)
            )

            IconButton(
                onClick = onFavoriteClick,
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(8.dp)
            ) {
                Icon(
                    imageVector = if (isFavorite) Icons.Filled.Favorite else Icons.Outlined.FavoriteBorder,
                    contentDescription = if (isFavorite) "Удалить из избранного" else "Добавить в избранное",
                    tint = Color.Red
                )
            }
        }
    }
}
