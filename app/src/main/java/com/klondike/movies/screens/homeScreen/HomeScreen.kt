package com.klondike.movies.screens.homeScreen

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.klondike.movies.navigation.BottomNavItem

@Composable
fun HomeScreen(passedNavController: NavHostController) {
	Scaffold(
		content = { Content(passedNavController) },
		bottomBar = { BottomNavigationBar(
			// creating a list of our 3 BottomNavItem items -
			// Where each item has values for name, route, icon
			items = listOf(
				BottomNavItem(
					name = "Home",
					route = "home_screen",
					icon = Icons.Default.Home // specify the graphics for the icon
				),
				BottomNavItem(
					name = "Details",
					route = "details_screen/{movieId}",
					icon = Icons.Default.Notifications,
					badgeCount = 52 // could change this to likes or something else
				),
				BottomNavItem(
					name = "Settings",
					route = "settings_screen",
					icon = Icons.Default.Settings
				)
			),
			navController = passedNavController, // right controller ?
			onItemClick = {passedNavController.navigate(it.route)}
		)}
	)
}


@Composable
fun Content(
	passedNavController: NavHostController,
	viewModel: HomeScreenViewModel = hiltViewModel()
) {

	Column(Modifier.fillMaxSize()) {
//		Text(text = "Just testing")
//		Button(onClick = { passedNavController.navigate("details_screen") }) {
//			Text(text = "Navigate to other screen")
//		}

		var state = viewModel.moviesState

		LazyColumn(
			modifier = Modifier
				.fillMaxHeight(0.8f),
			contentPadding = PaddingValues(16.dp)
		) {
			items(state.movies.size) { index ->
				var movie = state.movies[index]
				MovieItem(movie = movie){
					passedNavController.navigate("details_screen/${movie.id}")
					Log.d("onClick", "Content: I was clicked")
				}

			}
		}
	}
}

@Composable
fun FAB() {

}

// Testing implementation of bottom Navigation
@Composable
fun BottomNavigationBar(
	items: List<BottomNavItem>,
	navController: NavController,
	modifier: Modifier = Modifier,
	onItemClick: (BottomNavItem) -> Unit
) {

	// Only state can trigger recomposition in compose -
	// so we make a state here we can use to trigger recomposition, when the state changes
	val backStackEntry = navController.currentBackStackEntryAsState()

	BottomNavigation(
		modifier = modifier,
		backgroundColor = Color.DarkGray,
		elevation = 5.dp
	) {
		items.forEach { item ->

			// figure out which route is selected ??, and set it to the val selected
			val selected = item.route == backStackEntry.value?.destination?.route

			BottomNavigationItem(
				// Check if the current destination is the same as the selected route -
				// if it is it will be displayed as selected, and else not
				selected = selected,
				onClick = { onItemClick(item) },
				selectedContentColor = Color.Green,
				unselectedContentColor = Color.Gray,
				// Define how a specific  item looks like
				icon = {
					Column(horizontalAlignment = Alignment.CenterHorizontally) {
						// Only using this if we have a badgeCount
						// Might be some errors here cant find Function BadgeBox
						if (item.badgeCount > 0) {
							BadgedBox(badge = {
								Text(
									text = item.badgeCount.toString(),
									color = Color.Red)
							}) {
								Icon(
									imageVector = item.icon,
									contentDescription = item.name
								)
							}
							// This is just for showing a normal icon, with out any badgecount ( more simple)
						} else {
							Icon(
								imageVector = item.icon,
								contentDescription = item.name
							)
						}
						// Show the Icon text only for the selected icon
						if (selected) {
							Text(
								text = item.name,
								textAlign = TextAlign.Center,
								fontSize = 10.sp
							)
						}
					}
				}
			)
		}
	}
}