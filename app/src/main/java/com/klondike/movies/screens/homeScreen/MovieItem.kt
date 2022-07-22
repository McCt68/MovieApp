package com.klondike.movies.screens.homeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.klondike.movies.data.api.model.ApiMovie

const val IMAGE_PATH_PREFIX_DEFAULT: String = "https://image.tmdb.org/t/p/w300"


@Composable
fun MovieItem(
	movie: ApiMovie,
	modifier: Modifier = Modifier,
	onMovieClick: (ApiMovie) -> Unit
) {


	Card(
		modifier = Modifier
			.padding(8.dp)
			.height(160.dp)
			.clickable { onMovieClick.invoke(movie) }
	) {
		Column {
			Modifier
				.padding(16.dp)
				.fillMaxSize()

			Text(
				text = movie.title,
				style = MaterialTheme.typography.h6
			)
			Divider(thickness = 2.dp)
			Surface(
				modifier = Modifier
					.fillMaxWidth()
					.height(100.dp)
					.padding(8.dp),
				elevation = 4.dp
			) {
				Column(
					modifier = Modifier.fillMaxSize(),
					verticalArrangement = Arrangement.Top,
					horizontalAlignment = Alignment.Start
				) {
					Image(
						painter = rememberAsyncImagePainter(IMAGE_PATH_PREFIX_DEFAULT.plus(movie.poster_path)),
						contentDescription = null,
						contentScale = ContentScale.Crop,
						modifier = Modifier
//						.height(80.dp)
//						.width(80.dp)
							// .size(128.dp)
							.clip(CircleShape)
							.clip(RoundedCornerShape(50))


					)
				}

			}


			// test image modifiers
//			Image(
//				painter = rememberImagePainter(data = rememberAsyncImagePainter(IMAGE_PATH_PREFIX_DEFAULT.plus(movie.poster_path)),
//					builder = {
//						crossfade(true)
//						transformations(CircleCropTransformation())
//					}),
//				contentDescription = "Movie Poster"
//			)


//			Text(text = movie.overview)
//			Divider()

		}


	}

}