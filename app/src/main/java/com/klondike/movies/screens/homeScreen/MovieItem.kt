package com.klondike.movies.screens.homeScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.klondike.movies.data.api.model.ApiMovie

@Composable
fun MovieItem(movie: ApiMovie, modifier: Modifier = Modifier) {
	Card(modifier = Modifier.padding(8.dp)) {
		Column {
			Text(text = movie.title)
			Divider()
			Text(text = movie.overview)
			
		}


	}

}