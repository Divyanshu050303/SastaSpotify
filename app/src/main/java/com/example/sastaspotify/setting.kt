package com.example.sastaspotify

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Setting(modifier: Modifier = Modifier){
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 10.dp, vertical = 10.dp)
    ) {
        val paddingModifier=Modifier.padding(10.dp);
        Text("Settings", modifier = paddingModifier, style = MaterialTheme.typography.h4)

        Card(
            border = BorderStroke(2.dp, Color.Red),
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .size(70.dp)) {
            Row(modifier = Modifier.padding(horizontal = 4.dp, vertical = 11.dp)) {
                Icon(painter = painterResource(id = R.drawable.person), contentDescription = null, modifier = Modifier.padding(vertical = 6.dp))
                Text(text = "Profile", modifier = paddingModifier)
            }
        }
        Card(
            border = BorderStroke(2.dp, Color.Red),
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .size(70.dp)) {
            Row(modifier = Modifier.padding(horizontal = 4.dp, vertical = 11.dp)) {
                Icon(painter = painterResource(id = R.drawable.language), contentDescription = null, modifier = Modifier.padding(vertical = 6.dp))
                Text(text = "Language", modifier = paddingModifier)
            }
        }
        Card(
            border = BorderStroke(2.dp, Color.Red),
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .size(70.dp)) {
            Row(modifier = Modifier.padding(horizontal = 4.dp, vertical = 11.dp)) {
                Icon(painter = painterResource(id = R.drawable.about), contentDescription = null, modifier = Modifier.padding(vertical = 6.dp))
                Text(text = "About", modifier = paddingModifier)
            }
        }
    }
}