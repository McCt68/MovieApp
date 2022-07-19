package com.klondike.movies.screens.detailsScreen

import com.klondike.movies.data.api.model.ApiMovie

data class DetailsScreenState(
    val movie: ApiMovie? = null,
    val isLoading: Boolean = true,
)