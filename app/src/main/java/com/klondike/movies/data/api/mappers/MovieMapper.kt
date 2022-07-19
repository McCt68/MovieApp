package com.klondike.movies.data.api.mappers

import com.klondike.movies.data.api.model.ApiMovie
import com.klondike.movies.data.api.model.GetOneMovieResponse

fun GetOneMovieResponse.toMovie(): ApiMovie =
    ApiMovie(id,
        adult,
        backdrop_path,
        null,
        original_language,
        original_title,
        overview,
        popularity,
        poster_path,
        release_date,
        title,
        video,
        vote_average,
        vote_count)