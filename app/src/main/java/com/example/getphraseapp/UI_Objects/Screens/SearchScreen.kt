package com.example.getphraseapp.UI_Objects.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.example.getphraseapp.Data.Network.App
import com.example.getphraseapp.ViewModel.AppsViewModel


@Composable
fun SearchScreen(navController: NavController, viewModel: AppsViewModel) {
    val searchQuery = remember { mutableStateOf("") }

    val colors = listOf(Color(0xFF19B493), Color(0xFFDCDCDC))

    Column(modifier = Modifier
        .fillMaxSize()
        .background(
            Brush.verticalGradient(
                colors = listOf(
                    Color(0xFF1ABC9C),
                    Color.LightGray,
                )
            )
        )
    ) {
        TextField(
            value = searchQuery.value,
            onValueChange = {
                searchQuery.value = it
                viewModel.updateSearchQuery(it)
            },
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(0xFF1ABC9C))
                .padding(8.dp)
                .clip(RoundedCornerShape(30.dp)),
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                unfocusedContainerColor = Color(0xFF19A687),
                focusedContainerColor = Color(0xFF19A687),
                cursorColor = MaterialTheme.colorScheme.onSecondary
            ),

            placeholder = {
                Text(
                    text = "Поиск",
                    color = MaterialTheme.colorScheme.onSecondary
                )
            }
        )

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFF1ABC9C),
                            Color.LightGray,
                        )
                    )
                ),
            contentPadding = PaddingValues(8.dp)
        ) {
            items(viewModel.searchResults) { app ->
                Card(
                    modifier = Modifier
                        .padding(6.dp)
                        .fillMaxWidth()
                        .clip(RoundedCornerShape(16.dp)).background(Brush.verticalGradient(colors))
                        .height(100.dp)
                        .clickable { navController.navigate(app.route) },
                    colors = CardDefaults.cardColors(
                        containerColor = Color.Transparent,
                        contentColor = MaterialTheme.colorScheme.onPrimary
                    )
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        AsyncImage(
                            model = app.finalImageUrl,
                            contentDescription = "Обложка ${app.name}",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxHeight()
                                .aspectRatio(0.9f)
                                .clip(RoundedCornerShape(16.dp))
                        )

                        Spacer(modifier = Modifier.width(12.dp))

                        Text(text = app.name)
                    }
                }
            }
        }
    }
}
