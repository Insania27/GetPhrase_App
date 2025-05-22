package com.example.getphraseapp.Items

import androidx.compose.runtime.Composable

data class GamesItems(
    val id: String,
    val name: String,
    val image: String,
    val route: String,
)

val godOfWarURL = "https://upload.wikimedia.org/wikipedia/en/thumb/e/ee/God_of_War_Ragnar%C3%B6k_cover.jpg/250px-God_of_War_Ragnar%C3%B6k_cover.jpg"
val tlou2URL = "https://upload.wikimedia.org/wikipedia/en/4/4f/TLOU_P2_Box_Art_2.png"
val theWitcherURL = "https://assetsio.gnwcdn.com/unnamed-(1)_6w4PfVY.jpg?width=1200&height=1200&fit=crop&quality=100&format=png&enable=upscale&auto=webp"
val horizonURL = "https://preview.redd.it/1k57ixpugdi81.png?width=1024&format=png&auto=webp&s=a3be15f67247d9498cd591752c341a3b2ea30be4"
val atomicHeartURL = "https://infinity-area.com/medias/statics/gameapi/2025-01/game_67995766b4dbe.webp"
val gta5URL = "https://upload.wikimedia.org/wikipedia/ru/c/c8/GTAV_Official_Cover_Art.jpg"
val rdr2URL = "https://upload.wikimedia.org/wikipedia/ru/0/03/Red_Dead_Redemption_2_coverart.jpg"
val tlouURL = "https://upload.wikimedia.org/wikipedia/en/4/46/Video_Game_Cover_-_The_Last_of_Us.jpg"




val mySelectedGames = listOf(
    GamesItems("godOfWar", "God Of War: Ragnarok", godOfWarURL, "godOfWarRoute" ),
    GamesItems("tlou2", "The Last Of Us 2", tlou2URL, "tlou2Route" ),
    GamesItems("witcher3", "The Witcher 3", theWitcherURL, "theWitcherRoute" ),
    GamesItems("horizon", "Horizon: Forbidden West", horizonURL, "horizonRoute" ),
    GamesItems("atomicHeart", "Atomic Heart", atomicHeartURL, "atomicHeartRoute" ),
    GamesItems("gta5", "GTA 5", gta5URL, "gta5Route" ),
    GamesItems("rdr2", "Red Dead Redemption 2", rdr2URL, "rdr2Route" ),
    GamesItems("tlou", "The Last Of Us", tlouURL, "tlouRoute" ),

)