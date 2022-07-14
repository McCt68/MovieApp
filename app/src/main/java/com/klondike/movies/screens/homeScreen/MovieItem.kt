package com.klondike.movies.screens.homeScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.klondike.movies.data.api.model.ApiMovie

const val  IMAGE_PATH_PREFIX_DEFAULT: String = "https://image.tmdb.org/t/p/w300"

@Composable
fun MovieItem(movie: ApiMovie, modifier: Modifier = Modifier) {


	Card(modifier = Modifier.padding(8.dp)) {
		Column {Modifier
			.height(48.dp)
			.width(80.dp)
			Text(text = movie.title)
			Divider()
			Image(
				// painter = rememberAsyncImagePainter(movie.poster_path),
				painter = rememberAsyncImagePainter(IMAGE_PATH_PREFIX_DEFAULT),
				contentDescription = null,
				modifier = Modifier.size(128.dp)
			)


//			Text(text = movie.overview)
//			Divider()
			
		}


	}

}