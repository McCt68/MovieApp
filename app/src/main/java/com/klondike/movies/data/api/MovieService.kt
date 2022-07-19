package com.klondike.movies.data.api

import com.klondike.movies.data.api.model.GetAllMoviesResponse
import com.klondike.movies.data.api.model.GetOneMovieResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {

    @GET("${ApiConstants.MOVIE_ENDPOINT}/popular")
    suspend fun getAllPopularMovies(): GetAllMoviesResponse

    @GET("${ApiConstants.MOVIE_ENDPOINT}/{id}")
    suspend fun getMovieById(@Query(value = "id") id: Int): GetOneMovieResponse


}