package com.theapplication.meeshoui.Screens

import android.media.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Notifications
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.theapplication.meeshoui.NavGraph.Routes
import com.theapplication.meeshoui.R
import com.theapplication.meeshoui.ui.theme.bgwhite
import com.theapplication.meeshoui.ui.theme.lightPink


@Preview(showSystemUi = true)
@Composable
fun BottomBar() {

    val navController1 = rememberNavController()

    Scaffold(containerColor = bgwhite,
        bottomBar = { MyBottomBar(navController1) }
    ) { innerPadding ->

        NavHost(
            navController = navController1, startDestination = Routes.NewHome.routes,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = Routes.NewHome.routes) {
                NewHome()
            }
            composable(Routes.Graph.routes) {
                Graph()
            }
            composable(Routes.Cart.routes) {
                Cart()
            }
            composable(Routes.Category.routes) {
                Category()
            }

        }
    }
}


@Composable
fun MyBottomBar(navController1: NavHostController) {

    val backStackEntry = navController1.currentBackStackEntryAsState()

    data class BottomNavItem(
        val title: String,
        val route: String,
        val icon: ImageVector
    )

    val list = listOf(
        BottomNavItem(
            "Home",
            Routes.NewHome.routes,
            Icons.Rounded.Home
        ),
        BottomNavItem(
            "Search",
            Routes.Graph.routes, // Corrected route for Search destination
            Icons.Rounded.Favorite
        ),
        BottomNavItem(
            "AddThread",
            Routes.Cart.routes, // Corrected route for AddThread destination
            Icons.Rounded.ShoppingCart
        ),
        BottomNavItem(
            "Notification",
            Routes.Category.routes, // Corrected route for Notification destination
            Icons.Rounded.AccountCircle
        )
    )
    ElevatedCard(
        modifier = Modifier
            .shadow(
                32.dp,
                CircleShape, ambientColor = Color.Black,
                spotColor = Color.Black
            )
            .padding(bottom = 20.dp, start = 20.dp, end = 20.dp)
            .height(60.dp)
           ,
        shape = CircleShape,
        elevation = CardDefaults.cardElevation(
            10.dp
        )
    ) {
        BottomAppBar(
            containerColor = Color.White,
            tonalElevation = 10.dp
//            modifier = Modifier.padding(10.dp)
        ) {
            list.forEach {
               // val selected = it.route == backStackEntry?.value?.destination?.route

                val selected = it.route == backStackEntry?.value?.destination?.route

                val selectedColor = if (selected) Color.Green else Color.Red
                val unselectedColor = if (!selected) Color.Red else Color.Green
                NavigationBarItem(
                    modifier = Modifier
                        .background(color = Color.Transparent)
                        .clip(RoundedCornerShape(topStart = 5.dp, topEnd = 5.dp)),
                    selected = selected,
                    enabled = true,

                    onClick = {
                        navController1.navigate(it.route) {
                            popUpTo(navController1.graph.findStartDestination().id) {
                                saveState = true
                            }
                            launchSingleTop = true
                        }
                    },
                    alwaysShowLabel = false,
                    label ={false},
                    icon = {
                        Icon(
                            modifier = Modifier.size(27.dp),
                            imageVector = it.icon,
                            tint = if (selected) lightPink else Color.Gray,
                            contentDescription = it.title
                        )
                    }
                )
            }
        }
    }
}