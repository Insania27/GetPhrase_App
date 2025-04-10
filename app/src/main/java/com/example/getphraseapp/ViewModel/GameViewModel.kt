package com.example.getphraseapp.ViewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.getphraseapp.Data.Network.App
import com.example.getphraseapp.Data.Network.GamesResponse
import com.example.getphraseapp.Data.Network.RetrofitClient
import com.example.getphraseapp.Data.Network.SteamApiService
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GameViewModel(private val steamApiService: SteamApiService) : ViewModel() {
    private val _games = MutableLiveData<List<App>>(emptyList())
    val games: LiveData<List<App>> = _games

    fun fetchGames() {
        viewModelScope.launch {
            steamApiService.getGames().enqueue(object : Callback<GamesResponse> {
                override fun onResponse(call: Call<GamesResponse>, response: Response<GamesResponse>) {
                    if (response.isSuccessful) {
                        val gameList = response.body()?.applist?.apps ?: emptyList()
                        _games.value = gameList
                    } else {

                        _games.value = emptyList()
                    }
                }

                override fun onFailure(call: Call<GamesResponse>, t: Throwable) {

                    _games.value = emptyList()
                }
            })
        }
    }
}