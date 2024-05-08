package com.theapplication.meeshoui.NavGraph
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.theapplication.meeshoui.MainActivity
import com.theapplication.meeshoui.Screens.BottomBar

@Composable
fun NavGraph() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination =Routes.BottomNav.routes ) {

        composable(Routes.Home.routes){
            MainActivity()
        }

        composable(Routes.BottomNav.routes){
            BottomBar()
        }
    }
}