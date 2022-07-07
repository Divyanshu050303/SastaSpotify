package com.example.sastaspotify

import androidx.navigation.compose.rememberNavController
import android.os.Bundle
import android.view.animation.OvershootInterpolator
import android.window.SplashScreen
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.animation.Animatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight.Companion.Black
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.sastaspotify.ui.theme.SastaSpotifyTheme
import kotlinx.coroutines.delay
import java.time.format.TextStyle

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
            label={Text(text = item.title, fontSize = 11.sp)},
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



    }}




