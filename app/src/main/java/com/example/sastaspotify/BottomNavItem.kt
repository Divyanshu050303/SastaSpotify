package com.example.sastaspotify

import androidx.compose.material.icons.Icons

sealed class BottomNavItem(var title:String, var icon:Int,var screen_route:String ) {
    object Home:BottomNavItem("Home",R.drawable.home, "home")
    object Favorite:BottomNavItem("Favorite",R.drawable.favorite, "favorite")
    object Playlist:BottomNavItem("Playlist",R.drawable.queue, "playlist")
    object Download:BottomNavItem("Download",R.drawable.dowmload1, "download")
    object Setting:BottomNavItem("Setting",R.drawable.settings, "setting")
}