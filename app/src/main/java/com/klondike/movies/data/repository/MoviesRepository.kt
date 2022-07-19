package com.klondike.movies.data.repository

import com.klondike.movies.data.api.model.ApiMovie
import kotlinx.coroutines.flow.Flow

interface MoviesRepository {
    suspend fun getAllPopularMovies(): Flow<List<ApiMovie>>
    suspend fun getMovieById(id : Int) : ApiMovie
}