package com.klondike.movies.ui.screens.details

import com.klondike.movies.data.api.model.ApiMovie

data class DetailsScreenState(
    val movie: ApiMovie? = null,
    val isLoading: Boolean = true,
)