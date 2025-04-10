package com.example.getphraseapp.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.getphraseapp.Data.Network.SteamApiService


class GameViewModelFactory(
    private val steamApiService: SteamApiService
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(GameViewModel::class.java)) {
            return GameViewModel(steamApiService) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}

