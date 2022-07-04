package com.example.sastaspotify
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun home(){
        HomeScreen()
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
@Composable
fun SearchBar(modifier: Modifier = Modifier)
{
    TextField(
        value="",
        onValueChange = {},
        leadingIcon = {
            Icon(imageVector = Icons.Default.Search, contentDescription = null)
        },
        colors= TextFieldDefaults.textFieldColors(
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

private val alignYourBodyData= listOf(
    R.drawable.alka_yagnik to R.string.Alka_yagnik,
    R.drawable.ar_rahman to R.string.AR_Rahman,
    R.drawable.amitt_trivedi to R.string.Amit_Trivedi,
    R.drawable.arjit_singh to R.string.Arjit_Singh,
    R.drawable.asha_bhonsle to R.string.Asha_Bhonsle,
    R.drawable.badshah to R.string.Badshah,
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
    R.drawable.dhvani_bhanushani to R.string.Dhvani_Bhanushani,
    R.drawable.udit_narayan to R.string.Udit_Narayan,

    ).map { DrawableStringPair(it.first, it.second) }
private data class DrawableStringPair(
    @DrawableRes val drawable:Int,
    @StringRes val text:Int
)
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
