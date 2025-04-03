package com.example.getphraseapp.Data.Network

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface KinoPoiskApiService{
    @GET("api/v2.2/films")
    fun getMovies(@Query("page") page: Int,
                  @Query("type") type: String = "movie"): Call<MovieResponse>
}

data class MovieResponse(val films: List<Movie>)

data class Movie(val id: Int, val name: String)