package com.klondike.movies.screens.detailsScreen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.klondike.movies.data.repository.MoviesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(
    private val repository: MoviesRepository,
) : ViewModel() {

    var moviesState by mutableStateOf(DetailsScreenState())
        private set


    fun getMovieById(id : Int) {
        viewModelScope.launch {
            val selectedMovie = repository.getMovieById(id)
            moviesState = moviesState.copy(movie = selectedMovie, isLoading = false)
        }
    }

}