package com.klondike.movies.data.api.model

data class GetAllMoviesResponse(
    val page: Int,
    val results: List<ApiMovie>,
    val total_pages: Int,
    val total_results: Int
)