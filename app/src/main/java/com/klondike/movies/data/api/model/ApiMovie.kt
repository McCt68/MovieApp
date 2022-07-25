package com.klondike.movies.data.api.model

import com.google.gson.annotations.SerializedName


data class ApiMovie(
    val id: Int,
    val adult: Boolean,
    @SerializedName("backdrop_path")
    val backdropPath: String,
    @SerializedName("genre_ids")
    val genreIds: List<Int>?,
    @SerializedName("original_language")
    val originalLanguage: String,
    @SerializedName("original_title")
    val originalTitle: String,
    val overview: String,
    val popularity: Double,
    @SerializedName("poster_path")
    private val posterPath: String,
    @SerializedName("release_date")
    val releaseDate: String,
    val title: String,
    val video: Boolean,
    @SerializedName("vote_average")
    val voteAverage: Double,
    @SerializedName("vote_count")
    val voteCount: Int,
) {

    val image: String
        get() = IMAGE_PATH_PREFIX_DEFAULT.plus(posterPath)

    companion object {
        private const val IMAGE_PATH_PREFIX_DEFAULT: String = "https://image.tmdb.org/t/p/w300"
    }


}