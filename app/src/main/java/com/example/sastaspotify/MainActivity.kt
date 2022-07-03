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
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.sastaspotify.ui.theme.SastaSpotifyTheme
import kotlinx.coroutines.delay
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SastaSpotifyTheme {
                // A surface container using the 'background' color from the theme
//                Surface(modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background) {
//                Navigation()
                sastaSpotity()
                }
                }
            }
        }


@Composable
fun sastaSpotity(){
    SastaSpotifyTheme {
        Scaffold(bottomBar = { BottonNavigation() }
        )
        {
//            Navigation()
            HomeScreen()
        }
    }
}
@Composable
fun SearchBar(modifier: Modifier = Modifier)
{
    TextField(
        value="",
        onValueChange = {},
        leadingIcon = {
            Icon(imageVector = Icons.Default.Search, contentDescription = null)
        },
        colors=TextFieldDefaults.textFieldColors(
            backgroundColor = MaterialTheme.colors.surface
        ),
        placeholder = {
            Text(text = "Search")
        },

        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
            .heightIn(min = 52.dp),
        shape = RoundedCornerShape(8.dp),

    )
}
@Composable
private fun BottonNavigation(
    modifier: Modifier =Modifier
){
    BottomNavigation(modifier = modifier,
    backgroundColor = MaterialTheme.colors.primaryVariant) {
        BottomNavigationItem(icon = {
                                    Icon(imageVector = Icons.Default.Home, contentDescription = "Home")
        }, selected =true , onClick = { })
        BottomNavigationItem(
            icon = {
                Icon(imageVector = Icons.Filled.Favorite, contentDescription = null)
            }, selected = false, onClick = {}
        )
        BottomNavigationItem(
            icon = {
                Icon(painter = painterResource(R.drawable.queue), contentDescription = null)
            }, selected = false, onClick = {}
        )
        BottomNavigationItem(
            icon = {
                Icon(painter = painterResource(R.drawable.dowmload1), contentDescription = null)
            }, selected = false, onClick = {}
        )

        BottomNavigationItem(
            icon = {
                Icon(imageVector = Icons.Default.Settings, contentDescription = null)
            }, selected = false, onClick = {}
        )
    }

}
@Composable
fun AlignYourBodyRow(
    modifier: Modifier = Modifier
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = modifier
    ) {
        items(alignYourBodyData) { item ->
            AlignYourBodyElement(
                drawable = item.drawable,
                text = item.text)
        }
    }
}
@Composable
fun AlignYourBodyElement(
    @DrawableRes drawable: Int,
    @StringRes text: Int,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Image(
            painter = painterResource(drawable),
            contentDescription =null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(88.dp)
                .clip(CircleShape)
        )
        Text(
            text= stringResource(text),
            style = MaterialTheme.typography.h6,
            modifier = Modifier.paddingFromBaseline(
                top=24.dp, bottom = 8.dp
            )
        )

    }
}

private val alignYourBodyData= listOf(
    R.drawable.alka_yagnik to R.string.Alka_yagnik,
    R.drawable.ar_rahman to R.string.AR_Rahman,
    R.drawable.amitt_trivedi to R.string.Amit_Trivedi,
    R.drawable.arjit_singh to R.string.Arjit_Singh,
    R.drawable.asha_bhonsle to R.string.Asha_Bhonsle,
    R.drawable.badshah to R.string.Badshah,
    R.drawable.dhvani_bhanushani to R.string.Dhvani_Bhanushani,
    R.drawable.guru_randhawa to R.string.Guru_Randhawa,
    R.drawable.honey_singh to R.string.Honey_Singh,
    R.drawable.kanika to R.string.Kanika,
    R.drawable.neha_kakkar to R.string.Neha_Kakkar,
    R.drawable.kumar_sanu to R.string.Kumar_Sanu,
    R.drawable.monali_thakur to R.string.Monali_Thakur,
    R.drawable.palak_muchhal to R.string.Palak_Muchhal,
    R.drawable.shreya_ghoshal to R.string.Sherya_Ghoshal,
    R.drawable.sonu_nigam to R.string.Sonu_Nigam,
    R.drawable.sonu to R.string.Sonu,
    R.drawable.tony_kakkar to R.string.Tony_kakkar,
    R.drawable.udit_narayan to R.string.Udit_Narayan,

).map { DrawableStringPair(it.first, it.second) }
private data class DrawableStringPair(
    @DrawableRes val drawable:Int,
    @StringRes val text:Int
)
@Composable
fun Navigation(){
    val navController=rememberNavController()
    NavHost(navController = navController,
        startDestination = "splash_screen") {
        composable("splash_screen"){
            SplashScreen(navController = navController)
        }
        composable("home"){
            home()
        }

        composable("fav"){
            Favorite()
        }

        composable("down"){
            download()
                    }

        composable("setting"){
             playlists()
        }
        composable("playlist"){
            Setting()
        }



    }}
@Composable
fun SplashScreen(navController: NavController){
    val scale=remember{ androidx.compose.animation.core.Animatable(0f) }
    LaunchedEffect(key1 = true ){
        scale.animateTo(
            targetValue = 0.3f, animationSpec = tween(
                durationMillis = 500,
                easing = {
                    OvershootInterpolator(2f).getInterpolation(it)
                }
            )
        )
        delay(3000L)
        navController.navigate("main_screen")
    }
    Box(contentAlignment = Alignment.Center,
    modifier = Modifier.fillMaxSize()){
        Image(painter = painterResource(R.drawable.spla), contentDescription = "Logo",
        modifier = Modifier.scale(scale.value))
    }
}
@Composable
fun HomeScreen(modifier: Modifier =Modifier){
    Column(modifier
        .verticalScroll(rememberScrollState())
        .padding(vertical = 16.dp)) {
        SearchBar()
        AlignYourBodyRow()

    }
}
@Preview
@Composable
fun BottomNavigationPreview(){
    SastaSpotifyTheme {
        BottonNavigation(Modifier.padding(top=24.dp))

    }
}
@Preview
@Composable
fun SearchBarPreview(){
    SastaSpotifyTheme {
        SearchBar(Modifier.padding(4.dp))
    }
}
@Preview
@Composable
fun AlignYourElementPreview(){
    SastaSpotifyTheme{
        AlignYourBodyRow(

        modifier = Modifier.padding(8.dp)
    )
    }
}
