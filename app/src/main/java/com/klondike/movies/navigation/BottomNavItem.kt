package com.klondike.movies.navigation

import androidx.compose.ui.graphics.vector.ImageVector

// We pass this to BottomNavigationBar
// it represent information about a specific navigation item
data class BottomNavItem(
	val name: String,
	val route: String,
	val icon: ImageVector,
	val badgeCount: Int = 0
)