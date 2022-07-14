package com.klondike.movies.screens.homeScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(passedNavController: NavHostController) {
	Scaffold(
		content = { Content(passedNavController) })
}


@Composable
fun Content(
	passedNavController: NavHostController,
	viewModel: HomeScreenViewModel = hiltViewModel()
) {

	Column(Modifier.fillMaxSize()) {
		Text(text = "Just testing")
		Button(onClick = { passedNavController.navigate("details_screen") }) {
			Text(text = "Navigate to other screen")
		}


		var state = viewModel.moviesState

		LazyColumn(
			modifier = Modifier
				.fillMaxHeight(0.8f),
			contentPadding = PaddingValues(16.dp)
		) {
			items(state.movies.size) { index ->
				var movie = state.movies[index]
				MovieItem(movie = movie)

			}
		}
	}
}

@Composable
fun FAB() {

}