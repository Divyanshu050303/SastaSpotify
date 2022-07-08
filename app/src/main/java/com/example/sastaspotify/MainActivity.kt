package com.example.sastaspotify

import androidx.navigation.compose.rememberNavController
import android.os.Bundle
import android.view.animation.OvershootInterpolator
import android.window.SplashScreen
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.sastaspotify.ui.theme.SastaSpotifyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SastaSpotifyTheme {
                        sastaSpotity()
                }
                }
            }
        }


@Composable
fun sastaSpotity(){
    val navController= rememberNavController()
    SastaSpotifyTheme {
        Scaffold(bottomBar = { BottonNavigation(navController = navController) }
        )
        {
            Navigation(navController=navController)
        }
    }
}

@Composable
private fun BottonNavigation(
     navController: NavController
){ val items= listOf(
    BottomNavItem.Home,
    BottomNavItem.Favorite,
    BottomNavItem.Playlist,
    BottomNavItem.Download,
    BottomNavItem.Setting
)

    BottomNavigation(
    backgroundColor = MaterialTheme.colors.primaryVariant) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute=navBackStackEntry?.destination?.route
        items.forEach{
            item -> BottomNavigationItem(
            icon ={ Icon(painterResource(id = item.icon), contentDescription = item.title)},
            label={Text(text = item.title, fontSize = 10.sp)},
            selectedContentColor = Color.Black,
            unselectedContentColor = Color.Black.copy(0.4f),
            alwaysShowLabel = true,
            selected = currentRoute==item.screen_route,
            onClick = {
                navController.navigate(item.screen_route){
                    navController.graph.startDestinationRoute?.let { screen_route ->popUpTo(screen_route){
                        saveState=true
                    } }
                    launchSingleTop=true
                    restoreState=true
                }
            }
            )
        }
    }

}


@Composable
fun Navigation(navController:NavHostController){

    NavHost(navController = navController,
        startDestination = BottomNavItem.Home.screen_route) {
        composable( "splashScreen"){
            SplashScreen(navController = navController)
        }
        composable(BottomNavItem.Home.screen_route){
            home()
        }

        composable(BottomNavItem.Favorite.screen_route){
            Favorite()
        }

        composable(BottomNavItem.Download.screen_route){
            download()
        }
        composable(BottomNavItem.Playlist.screen_route){
             playlists()
        }
        composable(BottomNavItem.Setting.screen_route){
            Setting()
        }
    }
}