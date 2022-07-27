package com.example.sastaspotify

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun home(navController:NavController){
        HomeScreen(navController)
}
@Composable
fun HomeScreen(navController: NavController){
    Column(modifier=Modifier
        .verticalScroll(rememberScrollState())
        .padding(vertical = 16.dp)) {
        Column {
            SearchBar()
            AlignYourBodyRow(navController = navController)
            AlignYourBodyRowPlaylist(navController=navController)
            AlignYourBodyRowPlaylistMood(navController=navController)
        }
    }
}
@Composable
fun SearchBar(modifier: Modifier = Modifier)
{
    Column {
        TextField(
            value = "",
            onValueChange = {},
            leadingIcon = {
                Icon(imageVector = Icons.Default.Search, contentDescription = null)
            },
            colors = TextFieldDefaults.textFieldColors(
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
        Text("Popular Artists", style = MaterialTheme.typography.h4, color = Color.Black, modifier = modifier.padding(8.dp) )
    }
}
private val alignYourBodyData= listOf(
    R.drawable.alka_yagnik to R.string.Alka_yagnik,
    R.drawable.ar_rahman to R.string.AR_Rahman,
    R.drawable.amitt_trivedi to R.string.Amit_Trivedi,
    R.drawable.arjit_singh to R.string.Arjit_Singh,
    R.drawable.asha_bhonsle to R.string.Asha_Bhonsle,
    R.drawable.badshah to R.string.Badshah,
    R.drawable.honey_singh to R.string.Honey_Singh,
    R.drawable.kanika to R.string.Kanika_Kapoor,
    R.drawable.neha_kakkar to R.string.Neha_Kakkar,
    R.drawable.kumar_sanu to R.string.Kumar_Sanu,
    R.drawable.monali_thakur to R.string.Monali_Thakur,
    R.drawable.palak_muchhal to R.string.Palak_Muchhal,
    R.drawable.shreya_ghoshal to R.string.Sherya_Ghoshal,
    R.drawable.sonu_nigam to R.string.Sonu_Nigam,
    R.drawable.sonu to R.string.Sonu,
    R.drawable.tony_kakkar to R.string.Tony_kakkar,
    R.drawable.tulsi_kumar to R.string.Tulsi_Kumar,
    R.drawable.udit_narayan to R.string.Udit_Narayan,
    R.drawable.guru_randhawa to R.string.Guru_Randhawa,
    ).map { DrawableStringPair(it.first, it.second) }
private data class DrawableStringPair(
    @DrawableRes val drawable:Int,
    @StringRes val text:Int
)
@Composable
fun AlignYourBodyRow(
    modifier: Modifier = Modifier,
            navController: NavController
) {
    Column {
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(horizontal = 16.dp),
            modifier = modifier
        ) {
            items(alignYourBodyData) { item ->
                AlignYourBodyElement(
                    drawable = item.drawable,
                    text = item.text,
                    support(item.text),
                    Modifier.clickable (onClick = { navController.navigate(Screen.SingerPlaylist.toString())})
                )
            }
        }
        Text("Popular Albums", style = MaterialTheme.typography.h4, color = Color.Black, modifier = modifier.padding(8.dp))
    }
}
@Composable
fun AlignYourBodyElement(
    @DrawableRes drawable: Int,
    @StringRes text: Int,
    modifier1: Unit,
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier) {
        Image(
            painter = painterResource(drawable),
            contentDescription =null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(95.dp)
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
private val alignyourplaylistdata= listOf(
R.drawable.hindi to R.string.Top_hit_Hindi,
R.drawable.punjabi to R.string.Hit_punjabi,
R.drawable.topglobal to R.string.Top_50_global,
R.drawable.tamil to R.string.Hit_tamil,
R.drawable.telugu to R.string.Hit_talugu,
R.drawable.viralglobal to R.string.Viral_Global,
R.drawable.top50india to R.string.Top_50_India,
R.drawable.punjabi to R.string.Hit_punjabi,
).map { DrawableStringPairPlaylist(it.first, it.second) }
private data class DrawableStringPairPlaylist(
    @DrawableRes val drawable:Int,
    @StringRes val text:Int
)
@Composable
fun AlignYourBodyRowPlaylist(
    modifier: Modifier = Modifier, navController: NavController
) {
    Column {
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(horizontal = 16.dp),
            modifier = modifier
        ) {
            items(alignyourplaylistdata) { item ->
                AlignYourBodyElementPlaylist(
                    drawable = item.drawable,
                    text = item.text,
                    Modifier.clickable (onClick = { navController.navigate(Screen.SingerPlaylist.toString())})
                )
            }
        }
        Text("Mood", style = MaterialTheme.typography.h4, color = Color.Black, modifier = modifier.padding(8.dp))
    }
}
@Composable
fun AlignYourBodyElementPlaylist(
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
                .size(140.dp)
                .clip(RoundedCornerShape(7.dp))
        )
        Text(
            text= stringResource(text),
            style = MaterialTheme.typography.h6,
            modifier = Modifier.paddingFromBaseline(
                top=24.dp, bottom = 8.dp
            )
        )
    }
}private val alignyourplaylistMooddata= listOf(
R.drawable.mood to R.string.Mood_Booster,
R.drawable.feelingood to R.string.Feeling_Good,
R.drawable.dark to R.string.Dark_Stromy,
R.drawable.feelgoodpiano to R.string.feel_good,
R.drawable.myself to R.string.Myself,
R.drawable.youandme to R.string.youandme,
R.drawable.calmdeforestrome to R.string.calmBefore,

).map { DrawableStringPairPlaylistMood(it.first, it.second) }
private data class DrawableStringPairPlaylistMood(
    @DrawableRes val drawable:Int,
    @StringRes val text:Int
)
@Composable
fun AlignYourBodyRowPlaylistMood(
    modifier: Modifier = Modifier,navController: NavController
) {
    Column {
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            contentPadding = PaddingValues(horizontal = 16.dp),
            modifier = modifier
        ) {
            items(alignyourplaylistMooddata) { item ->
                AlignYourBodyElementPlaylistMood(
                    drawable = item.drawable,
                    text = item.text,
                    Modifier.clickable (onClick = { navController.navigate(Screen.SingerPlaylist.toString())})
                )
            }
        }
        Text("Popular Albums", style = MaterialTheme.typography.h4, color = Color.Black, modifier = modifier.padding(8.dp))
    }
}
@Composable
fun AlignYourBodyElementPlaylistMood(
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
                .size(140.dp)
                .clip(RoundedCornerShape(7.dp))
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

