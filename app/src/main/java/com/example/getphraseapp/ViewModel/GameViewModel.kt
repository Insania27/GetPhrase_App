package com.example.getphraseapp.ViewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.getphraseapp.Data.Network.App
import com.example.getphraseapp.Data.Network.AppDetailsResponse
import com.example.getphraseapp.Data.Network.GamesResponse
import com.example.getphraseapp.Data.Network.RetrofitClient
import com.example.getphraseapp.Data.Network.SteamApiService
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GameViewModel(private val steamApiService: SteamApiService) : ViewModel() {
    private val _games = MutableLiveData<List<App>>()
    val games: LiveData<List<App>> = _games

    fun fetchAssassinGame() {
        steamApiService.getAppDetails(2400).enqueue(object : Callback<AppDetailsResponse> {
            override fun onResponse(
                call: Call<AppDetailsResponse>,
                response: Response<AppDetailsResponse>
            ) {
                if (response.isSuccessful) {
                    val appDetailsWrapper = response.body()?.get("2400")
                    if (appDetailsWrapper != null && appDetailsWrapper.success) {
                        val appData = appDetailsWrapper.data
                        val assassinApp = App(
                            appid = appData.steam_appid,
                            name = appData.name,
                            route = "gameDetail/${appData.steam_appid}",
                            isMovie = false,
                            imageUrl = appData.header_image
                        )
                        _games.value = listOf(assassinApp)
                    }
                } else {
                    _games.value = emptyList()
                }
            }

            override fun onFailure(call: Call<AppDetailsResponse>, t: Throwable) {
                _games.value = emptyList()
            }
        })
    }

}

