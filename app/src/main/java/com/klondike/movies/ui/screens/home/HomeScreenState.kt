package com.klondike.movies.ui.screens.home

import com.klondike.movies.data.api.model.ApiMovie

data class HomeScreenState(
	val movies: List<ApiMovie> = emptyList(),
	val isLoading: Boolean = false
)
