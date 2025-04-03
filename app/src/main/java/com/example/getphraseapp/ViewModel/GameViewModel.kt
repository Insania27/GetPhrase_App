package com.example.getphraseapp.ViewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.getphraseapp.Data.Network.App
import com.example.getphraseapp.Data.Network.GamesResponse
import com.example.getphraseapp.Data.Network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class GameViewModel: ViewModel(){
    private val _gameList = MutableLiveData<List<App>>()
    val gameList: LiveData<List<App>> = _gameList

    fun fetchGames(){
        RetrofitClient.apiService.getGames().enqueue(object: Callback<GamesResponse> {
            override fun onResponse(call: Call<GamesResponse>, response: Response<GamesResponse>){
                if (response.isSuccessful) {
                    _gameList.postValue(response.body()?.applist?.apps?: emptyList())
                } else{
                    Log.e("GameViewModel", "API error: ${response.code()}")
                    _gameList.postValue(emptyList())
                }
            }

            override fun onFailure(call: Call<GamesResponse>, t: Throwable){
                Log.e("GameViewModel", "Error fetching games", t)
                _gameList.postValue(emptyList())
            }
        })
    }
}