package com.example.getphraseapp.Data.Network

import retrofit2.Call
import retrofit2.http.GET

interface SteamApiService{
    @GET("ISteamApps/GetAppList/v2")
    fun getGames(): Call<GamesResponse>
}

data class GamesResponse(val applist: AppList)

data class AppList(val apps: List<App>)

data class App(
    val appid: Int?,
    val name: String,
    val route: String,
    val isMovie: Boolean = false,
    val imageUrl: String = ""
) {
    val finalImageUrl: String
        get() = if (isMovie) imageUrl
        else "https://cdn.akamai.steamstatic.com/steam/apps/$appid/header.jpg"
}
