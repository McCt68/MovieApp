package com.klondike.movies.screens.homeScreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.klondike.movies.data.api.MovieService
import com.klondike.movies.data.repository.MovieRepositoryImpl
import com.klondike.movies.data.repository.MoviesRepository

@Composable
fun HomeScreen(passedNavController: NavHostController) {
    Scaffold(
        content = { Content(passedNavController) })
}


@Composable
fun Content(
	passedNavController: NavHostController,
	viewModel: HomeScreenViewModel = hiltViewModel(),
) {
    Column() {
        Text(text = "Just testing")
        Button(onClick = { passedNavController.navigate("details_screen") }) {
            Text(text = "Navigate to other screen")
        }

        // Testing LazyColumn
//		val viewModel: HomeScreenViewModel = HomeScreenViewModel
//		val movies = viewModel.moviesState
//
//		LazyColumn(contentPadding = PaddingValues(16.dp)) {
//			items(movies) { movie ->
//				// recomposes when the state value change
//
//			}
//		}
    }
}

@Composable
fun FAB() {

}