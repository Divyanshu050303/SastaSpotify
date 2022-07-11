package com.example.sastaspotify
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@ExperimentalMaterialApi
@Composable
fun qualityBottomSheet(){
    val bottomSheetScaffoldState= rememberBottomSheetScaffoldState(
        bottomSheetState = BottomSheetState(BottomSheetValue.Collapsed)
    )
    val coroutineScope= rememberCoroutineScope()
    BottomSheetScaffold(scaffoldState = bottomSheetScaffoldState,
        sheetContent =
        {

            val list= listOf("Auto", "Hd", "Medium", "Low");
            val selectedItem:MutableState<String> = rememberSaveable{ mutableStateOf(list[0])}
            Column(Modifier.padding(horizontal = 15.dp, vertical = 12.dp)) {
                Text(text = "Quality"  , style = MaterialTheme.typography.h4)
                Text(text = selectedItem.value, fontWeight = FontWeight.Bold)
                Spacer(modifier = Modifier.height(24.dp))
                RadioGroup(list, selectedItem)

            }
        }, sheetPeekHeight = 0.dp) {
        Button(onClick = {
            coroutineScope.launch {
                if(bottomSheetScaffoldState.bottomSheetState.isCollapsed){
                    bottomSheetScaffoldState.bottomSheetState.expand()
                }else{
                    bottomSheetScaffoldState.bottomSheetState.collapse()
                }
            }
        },Modifier.size(width = 200.dp, height = 50.dp))
        {
            Row {
                Icon(Icons.Default.Menu, contentDescription = null)
                Text(text = "Click Me")
            }
        }
    }
}
@Composable
fun RadioGroup(list:List<String> = emptyList(),selectedItem:MutableState<String> = mutableStateOf("")){
    Column() {
        list.forEach{
            Row{
                RadioButton(selected = it==selectedItem.value, onClick = {selectedItem.value=it})
                Text(text = it,Modifier.padding(vertical = 14.dp) )
            }
        }
    }
}
