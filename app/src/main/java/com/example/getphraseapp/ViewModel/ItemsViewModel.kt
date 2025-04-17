package com.example.getphraseapp.ViewModel

import androidx.compose.runtime.mutableStateListOf
import com.example.getphraseapp.Items.mySelectedGames
import com.example.getphraseapp.Items.mySelectedMovies
import com.example.getphraseapp.Items.mySelectedSeries

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.getphraseapp.Data.Network.App
import com.example.getphraseapp.Items.mySelectedGames
import com.example.getphraseapp.Items.mySelectedMovies
import com.example.getphraseapp.Items.mySelectedSeries


import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import com.example.getphraseapp.Items.*

class AppsViewModel : ViewModel() {
    private val _allApps = mutableStateListOf<App>()
    val allApps: List<App> get() = _allApps

    private val _searchResults = mutableStateListOf<App>()
    val searchResults: List<App> get() = _searchResults

    private val _searchQuery = mutableStateOf("")
    val searchQuery: String get() = _searchQuery.value

    fun updateSearchQuery(query: String) {
        _searchQuery.value = query
        search(query)
    }

    private fun search(query: String) {
        _searchResults.clear()
        if (query.isNotBlank()) {
            _searchResults.addAll(
                _allApps.filter { app ->
                    app.name.contains(query, ignoreCase = true)
                }
            )
        }
    }

    init {
        loadAllContent()
    }

    private fun loadAllContent() {
        val games = mySelectedGames.map {
            App(appid = null, name = it.name, route = "gamesScreen",
                isMovie = false, imageUrl = it.image)
        }

        val movies = mySelectedMovies.map {
            App(appid = null, name = it.name, route = "moviesScreen",
                isMovie = true, imageUrl = it.image)
        }

        val series = mySelectedSeries.map {
            App(appid = null, name = it.name, route = "seriesScreen",
                isMovie = true, imageUrl = it.image)
        }

        _allApps.addAll(games + movies + series)
    }
}