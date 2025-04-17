package com.example.getphraseapp.Data.Network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface SteamApiService{
    @GET("ISteamApps/GetAppList/v2")
    fun getGames(): Call<GamesResponse>
    @GET("ISteamApps/GetAppDetails/v2")
    fun getAppDetails(@Query("appids") appid: Int): Call<AppDetailsResponse>

}



typealias AppDetailsResponse = Map<String, AppDataWrapper>

data class AppDataWrapper(
    val success: Boolean,
    val data: AppData
)

data class AppData(
    val steam_appid: Int,
    val name: String,
    val header_image: String
)




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
