package com.example.sastaspotify.data


import com.example.sastaspotify.R


data class DataProvider(val name: String ,val Image:Int,val array: List<firebaseDataFile>) {
    val singerName:String
    get()=name
    val singerImage:Int
    get()=Image
    val booList:List<firebaseDataFile>
        get() = array

}

    val SingerList= listOf(
        DataProvider(
            name="Alka Yagnik",
            Image= R.drawable.alka_yagnik,
            array = Alka
        ),

        DataProvider(
            name="AR Rahman",
            Image=R.drawable.ar_rahman,
            array = Alka
        ),
        DataProvider(
            name="Amit Trivedi",
            Image=R.drawable.amitt_trivedi,
            array = Amit
        ),
        DataProvider(
            name="Arjit Singh",
            Image=R.drawable.arjit_singh,
            array = Arijit
        ),
        DataProvider(
            name="Asha Bhonsle",
            Image=R.drawable.asha_bhonsle,
            array = asha
        ),
        DataProvider(
            name="Badshah",
            Image=R.drawable.badshah,
            Arijit
        ),
        DataProvider(
            name="Honey Singh",
            Image=R.drawable.honey_singh,
            array = asha
        ),
        DataProvider(
            name="Kanika Kapoor",
            Image=R.drawable.kanika,
            array = kishor
        ),
        DataProvider(
            name="Neha Kakkar",
            Image=R.drawable.neha_kakkar,
            asha
        ),
        DataProvider(
            name="Kumar Sanu",
            Image=R.drawable.kumar_sanu,
            asha
        ),
        DataProvider(
            name="Monali Thakur",
            Image=R.drawable.monali_thakur,
            udit
        ),
        DataProvider(
            name="Palak Muchhal",
            Image=R.drawable.palak_muchhal,
            udit
        ),
        DataProvider(
            name="Shreya Ghoshal",
            Image=R.drawable.shreya_ghoshal,
            array = udit
        ),
        DataProvider(
            name="Sonu Nigam",
            Image=R.drawable.sonu_nigam,
            udit
        ),
        DataProvider(
            name="Sonu Kakkar",
            Image=R.drawable.sonu,
            udit
        ),
        DataProvider(
            name="Tony kakkar",
            Image=R.drawable.tony_kakkar,
            Alka
        ),
        DataProvider(
            name="Tulsi Kumar",
            Image=R.drawable.tulsi_kumar,
            kishor
        ),
        DataProvider(
            name="Udit Narayan",
            Image=R.drawable.udit_narayan,
            udit
        ),
        DataProvider(
            name="Guru Randhawa",
            Image=R.drawable.guru_randhawa,
            udit
        )
    )
val popularAlbums= listOf(
    DataProvider(
    name = "Hit Hindi",
    Image = R.drawable.hindi
        ,
        udit),
    DataProvider(
        name = "Hit Punjabi",
        Image = R.drawable.punjabi,
        udit),
    DataProvider(
        name = "Top Global",
        Image = R.drawable.topglobal,
        udit),
    DataProvider(
        name = "Hit Tamil",
        Image = R.drawable.tamil,
        udit),
    DataProvider(
        name = "Hit Telugu",
        Image = R.drawable.telugu,
        udit),
    DataProvider(
        name = "Viral Global",
        Image = R.drawable.viralglobal,
        udit),
    DataProvider(
        name = "Top India",
        Image = R.drawable.top50india,
        udit)
)
val MoodAlbums= listOf(
    DataProvider(
    name = "Mood Booster",
    Image = R.drawable. myself,
        udit),
    DataProvider(
        name = "Feeling'Good",
        Image = R.drawable.feelingood,
        udit),
    DataProvider(
        name = "Dark & Stromy",
        Image = R.drawable.dark,
        udit),
    DataProvider(
        name = "Feel Good Piano",
        Image = R.drawable.feelgoodpiano,
        udit),
    DataProvider(
        name = "Feelin'MySelf",
        Image = R.drawable.myself,
        udit),
    DataProvider(
        name = "You & me",
        Image = R.drawable.youandme,
        udit),
    DataProvider(
        name = "Calm Before Storm",
        Image = R.drawable.calmdeforestrome,
        udit)
)
