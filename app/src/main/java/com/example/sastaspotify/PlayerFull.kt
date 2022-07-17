package com.example.sastaspotify
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sastaspotify.ui.theme.SastaSpotifyTheme

@Composable
fun Player(){
    Column(modifier = Modifier
        .padding(horizontal = 10.dp, vertical = 20.dp)
        .fillMaxWidth()) {
        Card(shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .size(400.dp)) {
            Image(painter = painterResource(id = R.drawable.img), contentDescription =null, modifier = Modifier.fillMaxWidth() )

        }
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = "Song name", style = MaterialTheme.typography.h5, modifier = Modifier.padding(12.dp), color = Color.Black)
        Text(text = "Singer name", style = MaterialTheme.typography.h6, modifier = Modifier.padding(12.dp), color = Color.Black)
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Image(painter = painterResource(id = R.drawable.fav)
                , contentDescription = "Favorite"
                , modifier = Modifier.padding(horizontal = 25.dp))
            Image(painter = painterResource(id = R.drawable.share), contentDescription ="Share" , modifier = Modifier.padding(horizontal = 25.dp))
            Image(painter = painterResource(id = R.drawable.download), contentDescription = "Download", modifier = Modifier.padding(horizontal = 25.dp))
            Image(painter = painterResource(id = R.drawable.playlist), contentDescription = "Add to playlist",modifier = Modifier.padding(horizontal = 14.dp) )
        }
        var sliderPosition by remember { mutableStateOf(0f) }
        Slider(value =sliderPosition,
            onValueChange ={sliderPosition=it} ,
            valueRange = 0f..100f,
            colors =SliderDefaults.colors(thumbColor = Color.Red, activeTrackColor = Color.Black, inactiveTrackColor = Color.White ))
        Row (modifier = Modifier.fillMaxWidth()){
            Image(painter = painterResource(id = R.drawable.rewind), contentDescription =null , modifier = Modifier.padding(horizontal = 16.dp))
            Image(painter = painterResource(id = R.drawable.pernext), contentDescription =null, modifier = Modifier.padding(horizontal = 16.dp) )
            Image(painter = painterResource(id = R.drawable.play), contentDescription =null , modifier = Modifier.padding(horizontal = 16.dp))
            Image(painter = painterResource(id = R.drawable.next), contentDescription =null, modifier = Modifier.padding(horizontal = 16.dp) )
            Image(painter = painterResource(id = R.drawable.fastforward), contentDescription =null , modifier = Modifier.padding(horizontal = 16.dp))
        }
    }
}
@Preview
@Composable
fun player(){
    SastaSpotifyTheme {
        Player()
    }
}