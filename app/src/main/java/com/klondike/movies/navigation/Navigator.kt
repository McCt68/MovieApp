package com.klondike.movies.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.klondike.movies.screens.detailsScreen.DetailsScreen
import com.klondike.movies.screens.homeScreen.HomeScreen
import com.klondike.movies.screens.settingsScreen.SettingsScreen


// Here I  build a navigation controller -
// to help navigate between different screens in my app

@Composable
fun MainNavigator() {

	// Used to remember the state of the navController
	val myNavController = rememberNavController()

	// specifying routes. It has a route start destination of type String -
	// and a route of type string for each screen it will navigate too
	// The function that is passed as startDestination takes a myNavController object as argument -
	//
	NavHost(navController = myNavController, startDestination = "home_screen"){

		composable(route = "home_screen"){
			HomeScreen(myNavController)
		}
		composable(route = "details_screen"){
			DetailsScreen()
		}
		composable("settings_screen") {
			SettingsScreen()
		}
	}
}