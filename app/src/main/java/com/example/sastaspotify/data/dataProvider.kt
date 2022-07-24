package com.example.sastaspotify.data


import com.example.sastaspotify.R
import com.example.sastaspotify.data.model.SingerPlaylist


object dataProvider {
    val Singer= SingerPlaylist(
        id=1,
        name="Alka Yagnik",
        Image= R.drawable.alka_yagnik
    )
    val SingerList= listOf(
        Singer,
        SingerPlaylist(
            id=2,
            name="AR Rahman",
            Image=R.drawable.ar_rahman
        ), SingerPlaylist(
            id=3,
            name="Amit Trivedi",
            Image=R.drawable.amitt_trivedi
        ), SingerPlaylist(
            id=4,
            name="Arjit Singh",
            Image=R.drawable.arjit_singh
        ), SingerPlaylist(
            id=5,
            name="Asha Bhonsle",
            Image=R.drawable.asha_bhonsle
        ), SingerPlaylist(
            id=6,
            name="Badshah",
            Image=R.drawable.badshah
        ), SingerPlaylist(
            id=7,
            name="Honey Singh",
            Image=R.drawable.honey_singh
        ), SingerPlaylist(
            id=8,
            name="Kanika Kapoor",
            Image=R.drawable.kanika
        ), SingerPlaylist(
            id=9,
            name="Neha Kakkar",
            Image=R.drawable.neha_kakkar
        ), SingerPlaylist(
            id=10,
            name="Kumar Sanu",
            Image=R.drawable.kumar_sanu
        ), SingerPlaylist(
            id=11,
            name="Monali Thakur",
            Image=R.drawable.monali_thakur
        ), SingerPlaylist(
            id=12,
            name="Palak Muchhal",
            Image=R.drawable.palak_muchhal
        ), SingerPlaylist(
            id=13,
            name="Shreya Ghoshal",
            Image=R.drawable.shreya_ghoshal
        ), SingerPlaylist(
            id=14,
            name="Sonu Nigam",
            Image=R.drawable.sonu_nigam
        ), SingerPlaylist(
            id=15,
            name="Sonu Kakkar",
            Image=R.drawable.sonu
        ),
        SingerPlaylist(
            id=16,
            name="Tony kakkar",
            Image=R.drawable.tony_kakkar
        ),SingerPlaylist(
            id=17,
            name="Tulsi Kumar",
            Image=R.drawable.tulsi_kumar
        ), SingerPlaylist(
            id=18,
            name="Udit Narayan",
            Image=R.drawable.udit_narayan
        ), SingerPlaylist(
            id=19,
            name="Guru Randhawa",
            Image=R.drawable.guru_randhawa
        ),
    )
}