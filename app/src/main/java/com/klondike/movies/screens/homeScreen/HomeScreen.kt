package com.klondike.movies.screens.homeScreen

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(passedNavController: NavHostController) {
	Scaffold(
		content = { Content(passedNavController) })
}

@Composable
fun Content(passedNavController: NavHostController) {
	Column() {
		Text(text = "Just testing")
		Button(onClick = { passedNavController.navigate("details_screen") }) {
			Text(text = "Navigate to other screen")
		}
	}
}

@Composable
fun FAB() {

}