package com.example.getphraseapp.Data.Network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {
    @GET("shows/{id}")
    suspend fun getShowById(@Path("id") id: Int): ShowDetail
}

data class ShowDetail(
    val id: Int,
    val name: String,
    val image: ImageUrls
)

data class ImageUrls(
    val medium: String,
    val original: String
)

data class ShowPreview(
    val id: Int,
    var name: String = "",
    var imageUrl: String = ""
)