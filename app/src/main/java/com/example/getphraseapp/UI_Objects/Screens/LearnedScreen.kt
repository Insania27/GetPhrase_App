package com.example.getphraseapp.UI_Objects.Screens

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.outlined.FavoriteBorder
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
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.launch


class LearnedViewModelFactory(
    private val context: Context,
    private val userId: String
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(LearnedViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return LearnedViewModel(context, userId) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
    }
}


@Entity(tableName = "learned")
data class LearnedItem(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val userId: String,
    val itemId: String,
    val itemType: String,
    val title: String,
    val imageUrl: String,
    val route: String

)


@Dao
interface LearnedDao {

    @Query("SELECT * FROM learned WHERE userId = :userId")
    suspend fun getLearned(userId: String): List<LearnedItem>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertLearned(item: LearnedItem)

    @Delete
    suspend fun deleteLearned(item: LearnedItem)

    @Query(
        "SELECT EXISTS(" +
                "SELECT 1 FROM learned WHERE userId = :userId AND itemId = :itemId" +
                ")"
    )
    suspend fun isLearned(userId: String, itemId: String): Boolean
}


@Database(
    entities = [LearnedItem::class],
    version = 3,
    exportSchema = false
)
abstract class AppLearnedDatabase : RoomDatabase() {
    abstract fun learnedDao(): LearnedDao

    companion object {
        @Volatile private var INSTANCE: AppLearnedDatabase? = null

        fun getLearnedInstance(context: Context): AppLearnedDatabase =
            INSTANCE ?: synchronized(this) {
                INSTANCE ?: Room.databaseBuilder(
                    context.applicationContext,
                    AppLearnedDatabase::class.java,
                    "app_learnedDatabase"
                ).fallbackToDestructiveMigration().build().also { INSTANCE = it }
            }
    }
}


object LearnedDatabaseProvider {
    private var db: AppLearnedDatabase? = null

    fun getLearnedDatabase(context: Context): AppLearnedDatabase {
        if (db == null) {
            db = Room.databaseBuilder(
                context.applicationContext,
                AppLearnedDatabase::class.java,
                "app_learnedDatabase"
            ).fallbackToDestructiveMigration().build()
        }
        return db!!
    }
}


class LearnedViewModel(private val context: Context, private val userId: String) : ViewModel() {

    private val dao = LearnedDatabaseProvider.getLearnedDatabase(context).learnedDao()

    val learned = mutableStateListOf<LearnedItem>()

    fun loadLearned() {
        viewModelScope.launch {
            learned.clear()
            learned.addAll(dao.getLearned(userId))
        }
    }

    fun toggleLearned(item: LearnedItem) {
        viewModelScope.launch {

            val existing = learned.firstOrNull { it.itemId == item.itemId }
            if (existing != null) {
                dao.deleteLearned(existing)
            } else {
                dao.insertLearned(item)
            }
            loadLearned()
        }
    }


    suspend fun isLearned(itemId: String): Boolean {
        return dao.isLearned(userId, itemId)
    }
}






@Composable
fun LearnedScreen(navController: NavController) {
    val context = LocalContext.current
    val user = Firebase.auth.currentUser

    if (user == null) {
        return
    }

    val userId = user.uid
    val learnedViewModel: LearnedViewModel = viewModel(
        modelClass = LearnedViewModel::class.java,
        factory = LearnedViewModelFactory(context, userId)
    )

    LaunchedEffect(userId) {
        learnedViewModel.loadLearned()
    }

    val learned = learnedViewModel.learned

    if (learned.isEmpty()) {
        Box(
            Modifier
                .fillMaxSize()
                .background(MaterialTheme.colorScheme.primary),
            contentAlignment = Alignment.Center) {
            Text("У вас ещё нет изученного", color = Color.White)
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
            items(learned) { lear ->
                Column {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .aspectRatio(0.8f)
                            .padding(top = 24.dp, bottom = 4.dp, start = 8.dp, end = 8.dp),
                        shape = RoundedCornerShape(8.dp),
                        elevation = CardDefaults.cardElevation(4.dp),
                        onClick = { navController.navigate(lear.route) }
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(
                                    Brush.verticalGradient(
                                        colors = listOf(
                                            Color.Transparent,
                                            Color.Black.copy(alpha = 0.5F)
                                        ),
                                        startY = 0.5f
                                    )
                                )
                        ) {
                            AsyncImage(
                                model = lear.imageUrl,
                                contentDescription = lear.title,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier.fillMaxSize()
                            )

                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(
                                        Brush.verticalGradient(
                                            colors = listOf(
                                                Color.Transparent,
                                                Color.Black.copy(alpha = 0.5F)
                                            ),
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
                                    text = lear.title,
                                    color = Color.White,
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 20.sp
                                )
                            }


                        }
                    }
                    Button(
                        onClick = { learnedViewModel.toggleLearned(lear) },
                        modifier = Modifier
                            .padding(horizontal = 8.dp)
                            .fillMaxWidth(),
                        shape = RoundedCornerShape(8.dp),
                        colors = ButtonDefaults.buttonColors(
                            containerColor = MaterialTheme.colorScheme.onPrimary,
                            contentColor = Color.White
                        )
                    ) {
                        Text(text = "Изучено", color = Color.White)
                    }

                    }
                }
            }
        }
    }





@Composable
fun LearnedCard(
    title: String,
    imageUrl: String,
    isLearned: Boolean,
    onLearnedClick: () -> Unit,
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

//            Button(
//                onClick = onLearnedClick,
//                modifier = Modifier
//                    .align(Alignment.BottomStart)
//                    .padding(8.dp)
//            ) {
//                Icon(imageVector = Icons.Default.Add, contentDescription = null)
//            }
        }
    }
}

