package com.theapplication.meeshoui.NavGraph

sealed class Routes(val routes: String){
    object Home:Routes("Home")
    object BottomNav:Routes("BottomNav")
    object NewHome:Routes("NewHome")
    object Graph:Routes("Graph")
    object Cart:Routes("Cart")
    object Category:Routes("Category")

}