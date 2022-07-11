package com.klondike.movies.data.repository

import com.klondike.movies.data.api.MovieService
import com.klondike.movies.data.api.model.ApiMovie
import com.klondike.movies.data.api.model.GetAllMoviesResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(private val service: MovieService) :
    MoviesRepository {
    override suspend fun getAllPopularMovies(): Flow<List<ApiMovie>> = flow {
        val movies = service.getAllPopularMovies().results
        emit(movies)
    }
}