package com.klondike.movies.ui.screens.home

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
class HomeScreenViewModel @Inject constructor(private val repository: MoviesRepository): ViewModel() {

	var moviesState by mutableStateOf(HomeScreenState())
		private set

	// From here code I added to experiment with getting the data
	init {
		collectAllPopularMovies()
	}

	private fun collectAllPopularMovies(){
		viewModelScope.launch{
			repository.getAllPopularMovies().collect { collectedMovies ->
				moviesState = moviesState.copy(collectedMovies)

			}
		}
	}
}