package com.example.getphraseapp.UI_Objects.Screens

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Delete
import androidx.room.Entity
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.PrimaryKey
import androidx.room.Query
import androidx.room.Room
import androidx.room.RoomDatabase
import coil.compose.AsyncImage
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.launch


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



@Entity(tableName = "favorites")
data class FavoriteItem(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val userId: String,
    val itemId: String,
    val itemType: String,
    val title: String,
    val imageUrl: String,
    val route: String

)


@Dao
interface FavoriteDao {

    @Query("SELECT * FROM favorites WHERE userId = :userId")
    suspend fun getFavorites(userId: String): List<FavoriteItem>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertFavorite(item: FavoriteItem)

    @Delete
    suspend fun deleteFavorite(item: FavoriteItem)

    @Query(
        "SELECT EXISTS(" +
                "SELECT 1 FROM favorites WHERE userId = :userId AND itemId = :itemId" +
                ")"
    )
    suspend fun isFavorite(userId: String, itemId: String): Boolean
}


@Database(
    entities = [FavoriteItem::class],
    version = 3,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun favoriteDao(): FavoriteDao

    companion object {
        @Volatile private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).fallbackToDestructiveMigration().build().also { INSTANCE = it }
            }
    }
}


object DatabaseProvider {
    private var db: AppDatabase? = null

    fun getDatabase(context: Context): AppDatabase {
        if (db == null) {
            db = Room.databaseBuilder(
                context.applicationContext,
                AppDatabase::class.java,
                "app_database"
            ).fallbackToDestructiveMigration().build()
        }
        return db!!
    }
}


class FavoritesViewModel(private val context: Context, private val userId: String) : ViewModel() {

    private val dao = DatabaseProvider.getDatabase(context).favoriteDao()

    val favorites = mutableStateListOf<FavoriteItem>()

    fun loadFavorites() {
        viewModelScope.launch {
            favorites.clear()
            favorites.addAll(dao.getFavorites(userId))
        }
    }

    fun toggleFavorite(item: FavoriteItem) {
        viewModelScope.launch {

            val existing = favorites.firstOrNull { it.itemId == item.itemId }
            if (existing != null) {
                dao.deleteFavorite(existing)
            } else {
                dao.insertFavorite(item)
            }
            loadFavorites()
        }
    }


    suspend fun isFavorite(itemId: String): Boolean {
        return dao.isFavorite(userId, itemId)
    }
}






@Composable
fun FavoritesScreen(navController: NavController) {
    val context = LocalContext.current
    val user = Firebase.auth.currentUser

    if (user == null) {

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    MaterialTheme.colorScheme.primary)
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Чтобы увидеть избранное, войдите в аккаунт", color = Color.White)
            Spacer(Modifier.height(8.dp))
            Button(onClick = { navController.navigate("loginScreen") },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xFF3982FF),
                    contentColor = Color.White
                )) {
                Text("Войти")
            }
        }
        return
    }

    val userId = user.uid
    val favoritesViewModel: FavoritesViewModel = viewModel(
        modelClass = FavoritesViewModel::class.java,
        factory = FavoritesViewModelFactory(context, userId)
    )

    LaunchedEffect(userId) {
        favoritesViewModel.loadFavorites()
    }

    val favorites = favoritesViewModel.favorites

    if (favorites.isEmpty()) {
        Box(
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.primary),
            contentAlignment = Alignment.Center) {
            Text("У вас ещё нет избранного", color = Color.White)
        }
    } else {
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .fillMaxSize()
                .background(
                    MaterialTheme.colorScheme.primary
                ),
            contentPadding = PaddingValues(8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            items(favorites) { fav ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(0.8f)
                        .padding(8.dp)
                        .clickable {
                            navController.navigate(fav.route)
                        },
                    shape = RoundedCornerShape(12.dp),
                    elevation = CardDefaults.cardElevation(4.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                Brush.verticalGradient(
                                    colors = listOf(Color.Transparent, Color.Black.copy(alpha = 0.5F)),
                                    startY = 0.5f
                                )
                            )
                    ) {
                        AsyncImage(
                            model = fav.imageUrl,
                            contentDescription = fav.title,
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

                        Box(
                            modifier = Modifier
                                .align(Alignment.BottomStart)
                                .padding(4.dp)

                        ) {
                            Text(
                                text = fav.title,
                                color = Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 20.sp,
                                modifier = Modifier
                                    .align(Alignment.BottomStart)
                                    .padding(10.dp)
                            )
                        }

                        IconButton(
                            onClick = { favoritesViewModel.toggleFavorite(fav) },
                            modifier = Modifier
                                .align(Alignment.TopEnd)
                                .padding(8.dp)
                        ) {

                                Icon(
                                    imageVector = Icons.Filled.Favorite,
                                    contentDescription = "Удалить из избранного",
                                    tint = Color.Red,
                                    modifier = Modifier.align(Alignment.Center)
                                )

                        }
                    }
                }
            }
        }
    }
}




