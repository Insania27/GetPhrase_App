package com.example.getphraseapp.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.getphraseapp.Data.Network.RetrofitInstance
import com.example.getphraseapp.Data.Network.ShowPreview
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch


class PreviewViewModel : ViewModel() {

    private val _shows = MutableStateFlow<List<ShowPreview>>(emptyList())
    val shows: StateFlow<List<ShowPreview>> = _shows

    private val ids = listOf(1, 2, 3, 4, 5)

    init {
        fetchShowPreviews()
    }

    private fun fetchShowPreviews() {
        viewModelScope.launch {
            val previews = ids.mapNotNull { id ->
                try {
                    val show = RetrofitInstance.api.getShowById(id)
                    ShowPreview(id = show.id, name = show.name, imageUrl = show.image.medium)
                } catch (e: Exception) {
                    null
                }
            }
            _shows.value = previews
        }
    }
}