package com.example.sastaspotify
import android.media.AudioAttributes
import android.media.MediaPlayer
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.example.sastaspotify.data.firebaseDataFile


@Composable
fun Player (songDetail: firebaseDataFile, navController: NavController){
    val url =songDetail.Song

    val mediaPlayer = MediaPlayer().apply {
        setAudioAttributes(
            AudioAttributes.Builder()
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .build()
        )
        setDataSource(url)
        prepare()
        start()

    }

    Column(modifier = Modifier
        .padding(horizontal = 10.dp, vertical = 20.dp)
        .fillMaxWidth()) {
        Card(shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .width(400.dp)
                .height(350.dp)) {
            Image(painter = rememberAsyncImagePainter(songDetail.image), contentDescription =null, modifier = Modifier.fillMaxWidth() )

        }
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = songDetail.name, style = MaterialTheme.typography.h5, modifier = Modifier.padding(12.dp), color = Color.Black)
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
        val sliderPosition by remember { mutableStateOf(mediaPlayer.duration) }
        Slider(value = sliderPosition.toFloat(),
            onValueChange ={sliderPosition.times(mediaPlayer.duration) } ,

            colors =SliderDefaults.colors(thumbColor = Color.Red, activeTrackColor = Color.Black, inactiveTrackColor = Color.White ))
        Row (modifier = Modifier.fillMaxWidth()){
            Image(painter = painterResource(id = R.drawable.rewind), contentDescription =null , modifier = Modifier.padding(horizontal = 16.dp))
            Image(painter = painterResource(id = R.drawable.pernext), contentDescription =null, modifier = Modifier.padding(horizontal = 16.dp) )
            Image(painter = painterResource(id = if (mediaPlayer.isPlaying){R.drawable.pause} else{ R.drawable.play}),
                contentDescription =null ,
                modifier = Modifier.padding(horizontal = 16.dp)
                    .clickable(onClick = {
                        if(mediaPlayer.isPlaying){
                            mediaPlayer.pause()
                        }else {
                            mediaPlayer.start()
                        }
                    }))
            Image(painter = painterResource(id = R.drawable.next), contentDescription =null, modifier = Modifier.padding(horizontal = 16.dp) )
            Image(painter = painterResource(id = R.drawable.fastforward), contentDescription =null , modifier = Modifier.padding(horizontal = 16.dp))
        }
    }
}
