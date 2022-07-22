package com.klondike.movies.screens.detailsScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController

@Composable
fun DetailsScreen(
	passedNavController: NavHostController,

	// I need to pass the DetailsViewModel to this class to be able
	passedViewModel: DetailsViewModel = hiltViewModel(),
	// Not sure this works since the argument passed needs to be of type string ?
	// movieIdIntTest: Int, // Do I need to set this from HomeScreen ?

	movieId: String? // trying to pass arguments as string - Maybe should be nullable ?
) {

	// I need to pass the movie Id of the specific movie argument we want to pass ?
	// val movieArgumentToPass = movieId?.let { passedViewModel.getMovieById(it.toInt()) }

	movieId?.toInt()?.run {
		passedViewModel.getMovieById(this) }

	// I would need a way to call getOneMovieById from the repository / viewModel
	// val anotherWayToPassArguments = passedViewModel.getMovieById(movieIdIntTest)

	Box(
		modifier = Modifier.fillMaxSize(),
		contentAlignment = Alignment.Center
	) {
		Text(text = "Details screen")
	}
}