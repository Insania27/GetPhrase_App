package com.example.getphraseapp.Items

data class GamesItems(
    val id: String,
    val name: String,
    val image: String,
    val route: String,
)

val godOfWarURL = "https://upload.wikimedia.org/wikipedia/en/thumb/e/ee/God_of_War_Ragnar%C3%B6k_cover.jpg/250px-God_of_War_Ragnar%C3%B6k_cover.jpg"
val tlou2URL = "https://upload.wikimedia.org/wikipedia/en/4/4f/TLOU_P2_Box_Art_2.png"
val theWitcher = "https://assetsio.gnwcdn.com/unnamed-(1)_6w4PfVY.jpg?width=1200&height=1200&fit=crop&quality=100&format=png&enable=upscale&auto=webp"
val horizon = "https://preview.redd.it/1k57ixpugdi81.png?width=1024&format=png&auto=webp&s=a3be15f67247d9498cd591752c341a3b2ea30be4"

val mySelectedGames = listOf(
    GamesItems("godOfWar", "God Of War: Ragnarok", godOfWarURL, "godOfWarRoute" ),
    GamesItems("tlou2", "The Last Of Us 2", tlou2URL, "tlou2Route" ),
    GamesItems("witcher3", "The Witcher 3", theWitcher, "theWitcherRoute" ),
    GamesItems("horizon", "Horizon: Forbidden West", horizon, "horizonRoute" ),

)