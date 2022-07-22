package com.example.sastaspotify

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun SingerPhotoCard(name:String, icon:Int){
    Column() {
        Text(text = name, modifier = Modifier.padding(vertical = 10.dp, horizontal = 20.dp), style = MaterialTheme.typography.h4)
        Card(modifier = Modifier
            .padding(vertical = 20.dp, horizontal = 70.dp)
            .size(200.dp),
            backgroundColor = Color.Red) {
            Image(painterResource(id =icon), contentDescription = null, modifier = Modifier.fillMaxWidth())


        }
        Image(painter = painterResource(id = R.drawable.play), contentDescription = null , modifier = Modifier
            .padding(horizontal = 135.dp)
            .size(60.dp))
        playListView()
    }


}
@Composable
fun playListView(names:List<String> =List(50){"$it"}){

    LazyColumn(modifier = Modifier.padding(horizontal = 5.dp, vertical = 4.dp)) {
        items(items = names) { name ->
            Gretting(name = name)
        }

    }
}
@Composable
fun Gretting(name:String){
    Card(backgroundColor = Color.Yellow, modifier = Modifier
        .padding(vertical = 8.dp)
        .height(70.dp)){
        CardContent(name)
    }
}

@Composable
private fun CardContent(name:String){
    Row(modifier = Modifier.padding(horizontal = 8.dp)){
        Column(modifier= Modifier
            .padding(horizontal = 12.dp)
            .weight(1f)) {
            Row(modifier = Modifier.padding( vertical = 12.dp)) {
                Image(painter = painterResource(id = R.drawable.arjit_singh), contentDescription =null, modifier = Modifier.size(50.dp) )
                Text(text = "Song name", modifier = Modifier.padding(horizontal = 20.dp, vertical = 5.dp), style = MaterialTheme.typography.h5)
            }

        }
    }
}