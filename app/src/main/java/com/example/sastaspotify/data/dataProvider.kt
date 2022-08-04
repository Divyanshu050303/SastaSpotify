package com.example.sastaspotify.data


import com.example.sastaspotify.R


data class DataProvider(val name: String ,val Image:Int) {
    val singerName:String
    get()=name
    val singerImage:Int
    get()=Image

}

    val SingerList= listOf(
        DataProvider(
            name="Alka Yagnik",
            Image= R.drawable.alka_yagnik),
        DataProvider(
            name="AR Rahman",
            Image=R.drawable.ar_rahman
        ),
        DataProvider(
            name="Amit Trivedi",
            Image=R.drawable.amitt_trivedi
        ),
        DataProvider(
            name="Arjit Singh",
            Image=R.drawable.arjit_singh
        ),
        DataProvider(
            name="Asha Bhonsle",
            Image=R.drawable.asha_bhonsle
        ),
        DataProvider(
            name="Badshah",
            Image=R.drawable.badshah
        ),
        DataProvider(
            name="Honey Singh",
            Image=R.drawable.honey_singh
        ),
        DataProvider(
            name="Kanika Kapoor",
            Image=R.drawable.kanika
        ),
        DataProvider(
            name="Neha Kakkar",
            Image=R.drawable.neha_kakkar
        ),
        DataProvider(
            name="Kumar Sanu",
            Image=R.drawable.kumar_sanu
        ),
        DataProvider(
            name="Monali Thakur",
            Image=R.drawable.monali_thakur
        ),
        DataProvider(
            name="Palak Muchhal",
            Image=R.drawable.palak_muchhal
        ),
        DataProvider(
            name="Shreya Ghoshal",
            Image=R.drawable.shreya_ghoshal
        ),
        DataProvider(
            name="Sonu Nigam",
            Image=R.drawable.sonu_nigam
        ),
        DataProvider(
            name="Sonu Kakkar",
            Image=R.drawable.sonu
        ),
        DataProvider(
            name="Tony kakkar",
            Image=R.drawable.tony_kakkar
        ),
        DataProvider(
            name="Tulsi Kumar",
            Image=R.drawable.tulsi_kumar
        ),
        DataProvider(
            name="Udit Narayan",
            Image=R.drawable.udit_narayan
        ),
        DataProvider(
            name="Guru Randhawa",
            Image=R.drawable.guru_randhawa
        )
    )
val popularAlbums= listOf(
    DataProvider(
    name = "Hit Hindi",
    Image = R.drawable.hindi),
    DataProvider(
        name = "Hit Punjabi",
        Image = R.drawable.punjabi),
    DataProvider(
        name = "Top Global",
        Image = R.drawable.topglobal),
    DataProvider(
        name = "Hit Tamil",
        Image = R.drawable.tamil),
    DataProvider(
        name = "Hit Telugu",
        Image = R.drawable.telugu),
    DataProvider(
        name = "Viral Global",
        Image = R.drawable.viralglobal),
    DataProvider(
        name = "Top India",
        Image = R.drawable.top50india)
)
val MoodAlbums= listOf(
    DataProvider(
    name = "Mood Booster",
    Image = R.drawable. myself),
    DataProvider(
        name = "Feeling'Good",
        Image = R.drawable.feelingood),
    DataProvider(
        name = "Dark & Stromy",
        Image = R.drawable.dark),
    DataProvider(
        name = "Feel Good Piano",
        Image = R.drawable.feelgoodpiano),
    DataProvider(
        name = "Feelin'MySelf",
        Image = R.drawable.myself),
    DataProvider(
        name = "You & me",
        Image = R.drawable.youandme),
    DataProvider(
        name = "Calm Before Storm",
        Image = R.drawable.calmdeforestrome)
)
