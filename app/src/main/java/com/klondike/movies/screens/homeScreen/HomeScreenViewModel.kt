package com.klondike.movies.screens.homeScreen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.klondike.movies.data.api.model.ApiMovie
import com.klondike.movies.data.repository.MoviesRepository
import com.klondike.movies.di.RepositoryModule
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
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
			repository.getAllPopularMovies()
		}
	}
}