package com.example.sastaspotify
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.sastaspotify.ui.theme.SastaSpotifyTheme
import kotlinx.coroutines.launch

@ExperimentalMaterialApi
@Composable
fun qualityBottomSheet() {
    val bottomSheetScaffoldState= rememberBottomSheetScaffoldState(
        bottomSheetState = BottomSheetState(BottomSheetValue.Collapsed)
    )
    val coroutineScope= rememberCoroutineScope()
    BottomSheetScaffold(scaffoldState = bottomSheetScaffoldState,
        sheetContent =
        {

            val list= listOf("Auto", "Hd", "Medium", "Low");
            val selectedItem:MutableState<String> = rememberSaveable{mutableStateOf(list[0])}
            Box(Modifier.fillMaxWidth().height(310.dp)) {
                Column(Modifier.padding(horizontal = 15.dp, vertical = 12.dp)) {
                    Text(text = "Quality", style = MaterialTheme.typography.h4)
                    Text(text = selectedItem.value, fontWeight = FontWeight.Bold)
                    Spacer(modifier = Modifier.height(5.dp))
                    RadioGroup(list, selectedItem)
                }
            }
        }, sheetPeekHeight = 0.dp) {
        Card(
            border = BorderStroke(2.dp, Color.Red),
            modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()
                .size(70.dp)
                .clickable(onClick = {
                    coroutineScope.launch {
                        if (bottomSheetScaffoldState.bottomSheetState.isCollapsed) {
                            bottomSheetScaffoldState.bottomSheetState.expand()
                        } else {
                            bottomSheetScaffoldState.bottomSheetState.collapse()
                        }
                    }
                })) {
            Row(modifier = Modifier.padding(horizontal = 4.dp, vertical = 11.dp)) {
                Icon(painter = painterResource(id = R.drawable.audio), contentDescription = null, modifier = Modifier.padding(vertical = 6.dp))
                Text(text = "Audio Quality", modifier = Modifier.padding(14.dp))
            }
        }
        logOut()

    }
}
@Composable
fun RadioGroup(list:List<String> = emptyList(),selectedItem:MutableState<String> = mutableStateOf("")){
    Column() {
        list.forEach{
            Row{
                RadioButton(selected = it==selectedItem.value, onClick = {selectedItem.value=it})
                Text(text = it ,Modifier.padding(vertical = 12.dp))
            }
        }
    }
}
@OptIn(ExperimentalMaterialApi::class)
@Preview
@Composable
fun pre(){
    SastaSpotifyTheme {
        qualityBottomSheet()
    }
}