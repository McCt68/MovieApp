package com.klondike.movies.screens.homeScreen

import com.klondike.movies.data.api.model.ApiMovie

data class HomeScreenState(
	val movies: List<ApiMovie> = emptyList(),
	// val refresh: Boolean = false,
	val isLoading: Boolean = false
)
