package com.klondike.movies.data.api

import com.klondike.movies.data.api.model.GetAllMoviesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieService {

    @GET("${ApiConstants.MOVIE_ENDPOINT}/popular")
    suspend fun getAllPopularMovies(): GetAllMoviesResponse

}