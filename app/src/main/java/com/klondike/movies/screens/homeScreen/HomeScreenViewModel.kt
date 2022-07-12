package com.klondike.movies.screens.homeScreen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.klondike.movies.data.repository.MoviesRepository
import com.klondike.movies.di.RepositoryModule
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeScreenViewModel @Inject constructor(private val repository: MoviesRepository): ViewModel() {

	var moviesState by mutableStateOf(HomeScreenState())
		private set
}