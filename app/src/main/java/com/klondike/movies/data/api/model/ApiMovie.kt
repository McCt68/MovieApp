package com.klondike.movies.data.api.model

// const val  IMAGE_PATH_PREFIX_DEFAULT: String = "https://image.tmdb.org/t/p/w300"

data class ApiMovie(
    val id: Int,
    val adult: Boolean,
    val backdrop_path: String,
    val genre_ids: List<Int>?,
    val original_language: String,
    val original_title: String,
    val overview: String, // show this
    val popularity: Double,
    val poster_path: String,
    val release_date: String,
    val title: String, // show this
    val video: Boolean,
    val vote_average: Double,
    val vote_count: Int
)