package com.example.sastaspotify.data

data class firebaseDataFile(
    val image:String,
    val name:String,
    val url:String=""
)
{
    val img:String
    get() = image
    val SingerName:String
    get() = name
    val Song:String
    get()=url
}


val Alka = listOf(
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2Faaye%20ho%20meri%20zindagi%20image.jpg?alt=media&token=8587c1f3-273c-400b-b15b-7a9fe8d9ede4",
        name = "Aaye Ho Meri Zindgi Mein",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2FAaye%20Ho%20Meri%20Zindagi%20Mein.mp3?alt=media&token=8c0c8276-0e27-4365-938d-9e12e41cc781"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2Fagar%20tum%20saath%20ho%20image.jpg?alt=media&token=5579c271-26e8-4d72-b80e-ef23b8b7d066",
        name = "Agar Tum Sath Ho",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2FAgar%20Tum%20Saath%20Ho_192(PagalWorld.com.se).mp3?alt=media&token=09c02088-0dc4-42e6-9305-00e69bef9df7"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2Faisi%20deewangi%20image.jpg?alt=media&token=ccf9c90e-4e98-44ce-803f-a3d66d83b258",
        name = "Aisi Deewangi",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2FAisi%20Deewangi.mp3?alt=media&token=d9fdc6ff-5458-4bf5-90b3-050905c821ce"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2Faye%20mere%20humsafar%20image.jpg?alt=media&token=03c5990d-cfbe-46f5-85e8-48de434334fc",
        name = "Aye Mere Humsafar",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2FAye%20Mere%20Humsafar.mp3?alt=media&token=c92166b7-c0ba-401b-b1c5-0a311854819b"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2Fbaazigar%20O%20baazigar%20image.jpg?alt=media&token=a0e77edd-491d-4119-93b3-24b2f334fe9d",
        name = "Baazigar O Baazigar",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2FBaazigar%20O%20Baazigar.mp3?alt=media&token=c9d68b32-b149-451f-a02a-bc103215bd20"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2Fbindiya%20chamke%20image.jpg?alt=media&token=59bdbe4d-a0b3-4a40-a520-f80ee48c2d6f",
        name = "Bindiya Chmke, Choodi Khanke",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2FBindiya%20Chamke%2C%20Choodi%20Khanke.mp3?alt=media&token=148488e6-0e4c-48fc-bb5c-8b5b925d0e58"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2Fbole%20chudiyan%20image.jpg?alt=media&token=b51fbe72-7124-47ff-ba5c-140c9a2cdb97",
        name = "Bole Chudiyan",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2FBole%20Chudiyan.mp3?alt=media&token=38c06769-7abf-43d4-9920-7a2d336a90b9"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2Fchand%20chhupa%20badal%20mein.jpg?alt=media&token=53893c13-65d8-4409-ad20-e4a03981bc0c",
        name = "Chand Chhupa Badal Meni",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2FChand%20Chhupa%20Badal%20Mein%20-%20Hum%20Dil%20De%20Chuke%20Sanam%20128%20Kbps.mp3?alt=media&token=e5e472cb-aa7c-40a1-b935-5fef4ec7ab10"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2Fchura%20ke%20dil%20mera.jpg?alt=media&token=b27c583f-ea69-4b49-96d5-b6f8608de3a8",
        name = "Chura Ke Dil Mera",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2FChura%20Ke%20Dil%20Mera%20-%20Main%20Khiladi%20Tu%20Anari%20128%20Kbps.mp3?alt=media&token=f667ae67-e96b-48f8-be99-c2985d70aeaa"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2FDil%20ne%20yeh%20kaha%20hani%20dil.jpg?alt=media&token=714705db-bf1f-45eb-95cd-b113f367cbda",
        name = "Dil Ne Yeh Kaha Hani Dil",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2FDil%20ne%20yeh%20kaha%20hani%20dil.jpg?alt=media&token=714705db-bf1f-45eb-95cd-b113f367cbda"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2FGhazab%20Ka%20Hai%20Din.mp3?alt=media&token=03ac3023-00b2-4767-8d9c-17ae438bb4b2",
        name = "Ghazab Ka Hai Din",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2FGhazab%20Ka%20Hai%20Din.mp3?alt=media&token=03ac3023-00b2-4767-8d9c-17ae438bb4b2"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2Fkuch%20kuch%20hota%20hai%20image.jpg?alt=media&token=f3a3630d-39b5-48a2-ade3-0f916a45eac8",
        name = "Kuch Kuch Hota Hai",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2FKuch%20Kuch%20Hota%20Hai%20-%20Kuch%20Kuch%20Hota%20Hai%20128%20Kbps.mp3?alt=media&token=3179d846-7436-4cde-9a16-d520e036b463"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2Fladki%20badi%20anjaani%20hai%20image.jpg?alt=media&token=0f521ba8-ce16-415f-ad62-4206ffd73300",
        name = "Ladki Badi Anhaani Hai",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2FLadki%20Badi%20Anjaani%20Hai.mp3?alt=media&token=c1476975-e23a-4d42-8452-79f450712c0f"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2Fodhni%20image.jpg?alt=media&token=5a4ba175-5dd1-4077-bcdc-5d225e7c967c",
        name = "Odhni",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2FOdhni.mp3?alt=media&token=6d29bbc0-e287-4ad4-8ade-30c1305558a3"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2Fpehli%20pehli%20baar.jpg?alt=media&token=eff1e041-e097-4096-ab5d-30fc8755ca30",
        name = "Pehli Pehli Baar",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2FPehli%20Pehli%20Baar.mp3?alt=media&token=1a7414a3-1036-4424-aa0a-3c3b77c5c0ac"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2Fraja%20ko%20rani%20se%20image.jpg?alt=media&token=12aa1696-98d4-4c4a-87e4-309f0b1d27e8",
        name = "Raja Ko Rani Se",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2FRaja%20Ko%20Rani%20Se.mp3?alt=media&token=45eba5c5-f6b5-453b-aa5b-01bced85c53e"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2FTeri%20Chunariya%20dil%20legayi%20image.jpg?alt=media&token=b0f79555-f3ad-4e35-b7a1-23cc4bff6dc3",
        name = "Teri Chunariya Dil Legayi",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2FTeri%20Chunariya%20Dil%20Legayi.mp3?alt=media&token=2486f3e0-34f3-48be-b66c-7eddc2259320"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2Ftip%20tip%20barsa%20paani%20image.jpg?alt=media&token=46ca50fa-bc24-499c-8041-d328535f5aef",
        name = "Tip Tip Barsa Paani",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2FTip%20Tip%20Barsa%20Paani%20-%20Mohra%20320%20Kbps.mp3?alt=media&token=37be7a12-aed3-4c4c-bda4-b5b782cbc55a"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2Fwaada%20raha%20sanam%20image.jpg?alt=media&token=f920c97d-7217-4008-b802-f987e4f62421",
        name = "Waada Raha Sanam",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2FWaada%20Raha%20Sanam.mp3?alt=media&token=f2a7c562-7d6a-48c0-9c40-8faba3276e80"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2Fyeh%20Bandhan%20Toh%20image.jpg?alt=media&token=e568865b-e4b1-4f73-bafd-c379e0b0527f",
        name = "Yeh Bandhan Toh",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Alka%20Yagnik%2Fyeh%20bandhan%20toh.mp3?alt=media&token=de39e37e-39de-4445-aa1c-8bdbf022c253"
    )
)

val Amit = listOf(
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FBadla.jpg?alt=media&token=236e171c-efbd-4a0f-8b1f-df95168b1b4c",
        name = "Badla",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FBadla%20-%20Blackmail%20-%20Divine%20320Kbps.mp3?alt=media&token=80857643-ee40-4629-9f6f-9ed19d610d40"

    ), firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FBadra%20bahaar.jpg?alt=media&token=c6dcae76-8805-4c7a-90cf-429c2179e71d",
        name = "Badra Bahaar",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FBadra%20Bahaar-%20Queen%20(PagalWorld.com).mp3?alt=media&token=20609da8-10ea-4dbf-a04b-ceb2b4a64c80"

    ), firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2Fchitta%20ve.jpg?alt=media&token=50de7452-8852-4698-b06e-eaab5ed9d1b4",
        name = "Chitta Ve",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FChitta%20Ve%20-%20Udta%20Punjab%20(Amit%20Trivedi)%20-%20320Kbps.mp3?alt=media&token=2fa248bc-b53f-4611-add4-aa6ce9344628"

    ), firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FGal%20mitthi%20mitthi.jpg?alt=media&token=789bc1f2-607f-4bb5-91dd-9c991c121b18",
        name = "Gal Mitthu Aisha",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FGal%20Mitthi%20Mitthi%20Aisha%20128%20Kbps.mp3?alt=media&token=671efc73-1268-4768-908f-5e66150acbde"

    ), firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FGubbare.jpg?alt=media&token=5f977bc7-4bd2-4012-906c-80415ce731c2",
        name = "Gubbare",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FGubbare.mp3?alt=media&token=25468bb8-cd32-4b2c-8b2b-3e071117b475"

    ), firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FIktara.jpg?alt=media&token=a53a81fc-2d9d-45a7-a070-3d3231bb0ca7",
        name = "Iktara",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FIktara.mp3?alt=media&token=e915276e-0bfd-4f6d-8fdf-5cba53a4a879"

    ), firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2Fjugni.jpg?alt=media&token=fa0246f0-d2fb-481f-b7ae-027149173f78",
        name = "Jugni",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FJugni%20-%20Queen%20(PagalWorld.com).mp3?alt=media&token=97a46967-370c-4d8e-8f75-ad594f96332d"

    ), firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2Flazy%20lad.jpg?alt=media&token=6543ee47-ccb6-4c57-8171-c8482c5c76ee",
        name = "Lazy Lad",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FLazy%20Lad.mp3?alt=media&token=34d6b838-0cb3-478b-b09c-a3e11a8e2fc6"

    ), firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2Flehrein.jpg?alt=media&token=7bbd51d6-7def-4a4d-9919-554ff9c7a79e",
        name = "Lehrein",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FLehrein%20(Aisha).mp3?alt=media&token=2ae9f74b-dbfb-4f2e-91ee-ae7375d1a5b3"

    ), firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FLove%20you%20zindagi.jpg?alt=media&token=6ab086a8-4e47-4e3d-aeaa-8ebef25a74fa",
        name = "Love You Zindgi",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FLove%20You%20Zindagi%20(Jasleen%20Kaur)%20320Kbps.mp3?alt=media&token=b91d90f3-4328-4be0-a538-4770c3d52300"

    ), firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FManja.jpg?alt=media&token=a5885d09-74e9-4bbc-a6c9-e3b15cfc163b",
        name = "Manja",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FManja.mp3?alt=media&token=d1d962ec-49d5-4a5b-8536-9fd05f09d596"

    ), firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2Fmanmarziyan.jpg?alt=media&token=65f64c5a-1bad-4b4a-9bc8-31ecb775a13c",
        name = "Manmarziyan",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FManmarziyan%20-%20Lootera%20128%20Kbps.mp3?alt=media&token=81f78988-67bb-4b2a-869b-d415dbbf1b66"

    ), firebaseDataFile(

        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2Fmeethi%20boliyaan.jpg?alt=media&token=6e979d7b-588e-46ac-a340-9f9389b9cf6d",
        name = "Meethi Boliyaan",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FMeethi%20Boliyaan%20KPC.mp3?alt=media&token=f83ba20d-d502-4e1e-a10b-16b750264b19"

    ), firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FMotorwada.jpg?alt=media&token=9a5706c1-f584-4d73-96dc-9be01c128108",
        name = "Motorwada",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FMotorwada-Amit-Trivedi-Tochi-Raina.mp3?alt=media&token=8a280e80-ba78-4cc6-92cd-b17d867eaaf8"

    ), firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FNaina%20da%20kya%20kasoor.jpg?alt=media&token=cccad3e5-726c-4627-9388-2ead39b7ba3c",
        name = "Naina Da Kya Kasoor",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FNaina-Da-Kya-Kasoor_192(PaglaSongs).mp3?alt=media&token=f94d7561-830d-40f3-95db-87acc5731959"

    ), firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FNayan%20tarse.jpg?alt=media&token=ba3eddb3-046c-499c-ac76-cab3cef172a7",
        name = "Nayan Tarse",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FNayan%20Tarse.mp3?alt=media&token=7c3feea6-513b-4359-89ed-4e85c5d83400"

    ), firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2Fpashmeena.jpg?alt=media&token=c03dd717-e6f7-478e-8051-4724881ed6a8",
        name = "Pashmeena",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FPashmeena%20-%20Fitoor%20320%20Kbps.mp3?alt=media&token=51f253dc-1f37-4697-8f94-c450d0933e6a"

    ), firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FSham.jpg?alt=media&token=b1dc9a55-e969-4b25-90c7-f45fc1c8c26b",
        name = "Sham",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FSham%20(Aisha).mp3?alt=media&token=9d5c932d-d21a-45f5-ab4e-6a0868392c90"

    ), firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FSuno%20aisha.jpg?alt=media&token=0252dc08-6067-497b-b606-0d17c2b35f1f",
        name = "Sono Aisha",
        "url= https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FSuno%20Aisha%20(Aisha).mp3?alt=media&token=e3643bb9-4469-4fa6-a69e-af9085606993"

    ), firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2Fzinda.jpg?alt=media&token=7a6a9ac9-d35b-4ef4-8aff-07a510baa5ae",
        name = "Zinda",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Amit%20Trivedi%2FZinda%20-%20Lootera%20128%20Kbps.mp3?alt=media&token=061d85ed-79dd-4fa6-a42e-54054f5167e5"

    )
)
val udit = listOf(
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FAaye%20ho%20meri%20zindagi%20me.jpg?alt=media&token=e9a7802d-6281-4ae2-8466-64e90241738e",
        name = "Aaye Ho Meri Zindagi Mein",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FAaye%20Ho%20Meri%20Zindagi%20Mein%20Male%20Raja%20Hindustani%20128%20Kbps.mp3?alt=media&token=cf9c4ab5-a1a0-4199-9fc0-24e9f43e7852"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FAisa%20desh%20hai%20mera.jpg?alt=media&token=b8239ead-39d5-4c58-8e90-b1bcd77eac0f",
        name = "Aisa Des Hai Mera",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FAisa%20Des%20Hai%20Mera.mp3?alt=media&token=d4a0893c-9985-4248-8b59-6698f1c5f075"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FAkele%20hum%20Akele%20tum.jpg?alt=media&token=7c082750-327e-4349-95ae-14c53ac05f4f",
        name = "Akele Hum Akele Tum",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FAkele%20Hum%20Akele%20Tum.mp3?alt=media&token=2c62fe9c-88a9-4c5e-afcf-350f8b23524b"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FBholi%20si%20surat.jpg?alt=media&token=189d2811-f8a4-48a2-a8f9-7fdb5aa199e0",
        name = "Bholi Si Surat",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FBholi%20Si%20Surat.mp3?alt=media&token=6f89ec6c-f2f9-4789-b5a3-98dd4c2e035d"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2Fbin%20tere%20sanam.jpg?alt=media&token=8fd33e2e-d665-4a09-8949-f8fedbd476e9",
        name = "Bin Tere Sanam",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FBin%20Tere%20Sanam.mp3?alt=media&token=fdc535d8-d234-41ae-b355-6edb0453d1c3"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2Fchaaha%20hai%20tuzhko.jpg?alt=media&token=0438d08f-2644-4b9b-9c4c-183dfe98a1ca",
        name = "Chaaha Hai Tujhko",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FChaaha%20Hai%20Tujhko%20-%20Mann%20128%20Kbps.mp3?alt=media&token=3b90f17b-9498-4c0d-a8e4-de52f8c5514c"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2Fdil%20ne%20ye%20kaha%20hai%20dil%20se.jpg?alt=media&token=87c5db65-648c-4ef7-bbd7-acbec6c45ca1",
        name = "Dil Ne Yeh Kaha Hani Dil Se",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FDil%20Ne%20Yeh%20Kaha%20Hain%20Dil%20Se%20-%20Dhadkan%20128%20Kbps.mp3?alt=media&token=7cc71d63-32be-454c-8f79-9fd8c14b5a8e"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2Fdil%20to%20pagal%20hai.jpg?alt=media&token=c460ea0d-1411-4fc8-83b1-47c9fa638f74",
        name = "Dil To Pagal Hai",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FDil%20To%20Pagal%20Hai%20-%20DTPH%201997.mp3?alt=media&token=0ffa999d-3943-4bd2-9d19-2085e0206098"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2Ffalak%20tak%20chal%20sath%20mere.jpg?alt=media&token=10e4d92c-6f8a-4f7d-b952-97bdb4eb4c00",
        name = "Falak Tak",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FFalak%20Tak%20-%20Tashan%20128%20Kbps.mp3?alt=media&token=67b9e8f8-73e4-4457-8450-82897394c3de"

    ),
    firebaseDataFile(

        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FJaadu%20teri%20nazar.jpg?alt=media&token=03fe7339-f287-42f0-9d87-d8eca84fb676",
        name = "Jaadu Teri Nazar",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FJadu%20Teri%20Nazar.mp3?alt=media&token=d9869c9b-e42e-4a5d-aaf2-5b9a777fa27a"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2Fmai%20yahaan%20hoon.jpg?alt=media&token=4f44d74f-a6c4-4d7b-999e-a79a4d373311",
        name = "Main Yahaan Hoon",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FMain%20Yahaan%20Hoon%20(Veer%20Zaara).mp3?alt=media&token=d791a0ba-84e0-4e00-a40e-91a93622687e"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2Fmela%20dilo%20ka%20aata%20hai.jpg?alt=media&token=31c231ba-5b93-46ae-9b73-e63be4e44268",
        name = "Mela Dilon Ka",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FMela%20Dilon%20Ka%20Theme%20Alka%20Yagnik%20128%20Kbps.mp3?alt=media&token=e1e330e3-70f3-4961-bf20-c5d957b59647"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FMusafir%20jaane%20wlae.jpg?alt=media&token=c260f74e-5203-4195-b74c-88377341a08c",
        name = "Musafir Jaane Wale",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FMusafir%20Jaane%20Wale%20128%20Kbps.mp3?alt=media&token=7c9dc49d-4639-44a5-8320-a2fd8c2eeecb"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FRab%20kare.jpg?alt=media&token=53366a85-0e0c-48ce-8edb-207d0ad6fb11",
        name = "Rab Kare Mujh Ko",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FRab%20Kare%20Mujh%20Ko.mp3?alt=media&token=7709cec2-25c4-4fa7-9626-db14e3abdc16"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FTaron%20ka%20chamakta%20gahna%20ho.jpg?alt=media&token=bd8e7f04-61a6-446f-8bf6-09e01db7d3b7",
        name = "Taron Ka Chamkata",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FTaron%20Ka%20Chamakta.mp3?alt=media&token=a2cd6d5e-29cf-4652-afee-6c67b60f77f0"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2Fteri%20ungli%20pakadke%20chala.jpg?alt=media&token=768617c2-788a-44dd-8ab1-f95b98a2f4af",
        name = "Teri Ungli Pakad Ke Chala",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FTeri%20Ungli%20Pakad%20Ke%20Chala%20-%20Laadla%20128%20Kbps.mp3?alt=media&token=b8862319-0a11-4a61-b51e-4066ab5094ea"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2Ftip%20tip%20barsa%20pani.jpg?alt=media&token=701f4d88-56cb-46d0-a069-b233cc51611e",
        name = "Tip Tip Barsa Paani",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FTip%20Tip%20Barsa%20Paani%20-%20Mohra%20128%20Kbps.mp3?alt=media&token=eec8fb22-e72c-4262-a6ab-5a4de0d45764"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FTu%20cheez%20badi%20hai%20mast%20mast.jpg?alt=media&token=0cd5dfe7-1b22-4e10-ad60-74aba4890237",
        name = "Tu Cheez Badi Hai Mast Mast",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FTu%20Cheez%20Badi%20Hain%20-%20Mohra.mp3?alt=media&token=7cd3762f-986d-460e-af51-ec431a4908ff"
    ),
    firebaseDataFile(

        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FTumse%20milna.jpg?alt=media&token=e0469186-9aed-47ce-b3aa-f8f603f7a054",
        name = "Tumse Milna",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Udit%20Narayan%2FTumse%20Milna%20-%20PagalSongs.com.mp3?alt=media&token=cf005c6e-bf02-40f4-b938-503e43d92067"

    )
)

val Arijit = listOf(
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2Fae%20dil%20hai%20mushkil.jpg?alt=media&token=497be5b4-9b9f-48db-843c-52e472314398",
        name = "Ae dil hai mushkil",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FAe_Dil_Hai_Mushkil_Title_Song_320_Kbps.mp3?alt=media&token=00d3efb3-bcfe-4b2d-a2a1-3a90a651475a"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FAgar%20tum%20sath%20ho.jpg?alt=media&token=f4ff108f-ec96-427e-930a-202d2eaee311",
        name = "Agar Tum Sath Ho",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FAgar%20Tum%20Saath%20Ho%20Tamasha%20128%20Kbps.mp3?alt=media&token=0b8b4dc8-5981-4eff-b4b2-36a0dfbd03bd"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FBekhayali.jpg?alt=media&token=f48cc19f-96f9-4da2-9257-f6939036d18f",
        name = "Bekhayali",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FBekhayali%20-%20Kabir%20Singh%20128%20Kbps.mp3?alt=media&token=33493416-e8ca-4b49-8e7e-b7be1e1cd777"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FChanna%20mereya.jpg?alt=media&token=80415e4a-2c75-4a48-a91f-bdd77abe95e7",
        name = "Channa Mereya",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FChanna_Mereya%20(Ae_Dil_Hai_Mushkil)_320_Kbps.mp3?alt=media&token=e83751e1-de1c-4984-9c43-5bb4dde95337"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FFitoor.jpg?alt=media&token=a6e4991d-49d4-453c-a990-cf8964840875",
        name = "Fitoor",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FFitoor(PagalWorld.com.se).mp3?alt=media&token=26edfb11-b9e7-4087-aa06-6b9e4c8ebb91"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FGalti%20se%20mistake.jpg?alt=media&token=bb54b5b0-bb39-4098-b189-3c0928e48b3f",
        name = "Galti se mistake",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FGalti%20Se%20Mistake%20(Jagga%20Jasoos)%20320%20Kbps.mp3?alt=media&token=14413563-1797-4b05-86f0-77141169ef3d"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FGhungroo%20-%20War.mp3?alt=media&token=c1f4edd8-a19c-4f89-91f8-eb99c7d38a85",
        name = "Ghungroo",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FGhungroo%20-%20War.mp3?alt=media&token=c1f4edd8-a19c-4f89-91f8-eb99c7d38a85"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FHundard.jpg?alt=media&token=47b805cd-cdcb-4882-98e5-0371af7a36e2",
        name = "Humdard",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FHumdard.mp3?alt=media&token=9465b8c9-2fa4-4931-982a-8e3aa6dd8651"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FItni%20si%20baat%20hai.jpg?alt=media&token=62a84dee-c9a8-4b99-8f23-23dded0fe708",
        name = "Itni si baat hai",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FItni%20Si%20Baat%20Hain.mp3?alt=media&token=b5790f97-73bc-436e-8730-2303cf7e1f83"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FKesariya.jpg?alt=media&token=8fa5b3e2-1bf7-4a18-a8b0-8fd7d2b93564",
        name = "Kesariya",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FKesariya%20-%20Brahmastra%20128%20Kbps.mp3?alt=media&token=acd67ffa-afa1-4506-839c-d602804c6619"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FNashe%20si%20chad%20gayi.jpg?alt=media&token=720086be-f1bf-474d-a543-2045fcc9142d",
        name = "Nashe si chad gayi",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FNashe%20Si%20Chadh%20Gayi%20-%20Arijit%20Singh%20-%20320Kbps.mp3?alt=media&token=b5d62ec3-9702-4dcf-9bad-85cd7586cb2d"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FPachtaoge.jpg?alt=media&token=416be7e8-c1b7-4ea9-89b4-01309b6a9776",
        name = "Pachtaoge",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FPachtaoge%20-%20Arijit%20Singh.mp3?alt=media&token=600eaa7d-9560-494c-8aee-e25eb01670c3"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FPal.jpg?alt=media&token=35f57efe-275b-4660-a285-2dc9cce65409",
        name = "Pal",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FPal%20-%20Jalebi%20-%20Arijit%20Singh.mp3?alt=media&token=872dedcb-f1f8-486b-bee8-e6a310a51e5f"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FRaabta.jpg?alt=media&token=ae62630f-f8eb-40dc-8d70-d4ab02ec04c4",
        name = "Raabta",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FRaabta.mp3?alt=media&token=51aa2072-00ea-4273-ada7-cec891e11729"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FShaayad.jpg?alt=media&token=3a61f704-811a-4d3b-bbc3-5c772278fb9c",
        name = "Shayad",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FShayad%20-%20Love%20Aaj%20Kal.mp3?alt=media&token=37ef76c4-1824-4784-8a9e-1daa50c3e15c"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2Fsoch%20na%20sake.jpg?alt=media&token=32433cf2-b4fb-4d8a-80ef-fe8b2fca547d",
        name = "Soch na sake",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FSoch%20Na%20Sake%20-%20Airlift%20128%20Kbps.mp3?alt=media&token=708b3295-05a5-4fc6-bb53-dd1f77137aa9"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2Ftera%20yaar%20hoon%20mai.jpg?alt=media&token=bdb2641d-2335-4ef6-ab43-3f83cbd3cd38",
        name = "Tera yaar hoon main",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FTera%20Yaar%20Hoon%20Main%20(Sonu%20Ke%20Titu%20Ki%20Sweety)%20128%20Kbps.mp3?alt=media&token=71a064a5-b0ae-4c54-83c9-bbb065b9cae1"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FTujhe%20kitna%20chahne%20lage%20hum.jpg?alt=media&token=1aa127fb-3f75-4d67-bcb0-d65ae43545b6",
        name = "Tuzhe kitna chahne lage hum",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FTujhe%20Kitna%20Chahne%20Lage%20-%20Kabir%20Singh.mp3?alt=media&token=f0683f9e-60bc-4ac1-be8a-d8e4f99e4911"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FTum%20hi%20ho.jpg?alt=media&token=bbf293d7-7ff1-4add-98c5-80b4558e6599",
        name = "Tum hi ho",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FTum%20Hi%20Ho%20-%20Aashiqui%202%20(Arijit%20Singh)%20320Kbps.mp3?alt=media&token=e4ba7518-ff0c-4340-af58-efb7098dbd23"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FTumse%20bhi%20zyada.jpg?alt=media&token=30ffa9b4-9624-42ab-8755-a0c0500fc76a",
        name = "Tumse bhi zyada",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Arijit%20Singh%2FTumse%20Bhi%20Zyada(PagalWorld.com.se).mp3?alt=media&token=b474ceaf-3507-4fd8-b255-c98ec6915cce"
    ),
)
val kishor = listOf(
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FApni%20To%20Jaise%20Taise%20-%20Laawaris%20(1981)%20320%20Kbps.mp3?alt=media&token=c214d1cb-c8bb-45bf-b4d2-69bbfcdb5e6f",
        name = "Apni to jaise taise",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FApni%20To%20Jaise%20Taise%20-%20Laawaris%20(1981)%20320%20Kbps.mp3?alt=media&token=c214d1cb-c8bb-45bf-b4d2-69bbfcdb5e6f"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2Fare%20deewano%20muzhe%20pehchano.jfif?alt=media&token=3aaf9682-5d04-4921-8fbf-85038ec081a8",
        name = "Are Diwano Mujhe Pehchano",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FAre%20Diwano%20Mujhe%20Pehchano%20(From%20-Don-).mp3?alt=media&token=26a7dab7-9578-4083-a7e0-824f73792a35"


    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FBachna%20ae%20haseeno.jfif?alt=media&token=a68ff39f-5947-4f60-a7f0-8bb25c3a409c",
        name = "Bachna Ae Haseeno",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FBachna%20Ae%20Haseeno.mp3?alt=media&token=6c57849e-abac-4c40-acca-fda793b8e597"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FChala%20jata%20hu.jfif?alt=media&token=4ab69542-94a2-43bc-b5ae-e3f721af28df",
        name = "Chala Jata hoon",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FChala%20Jata%20Hoon%20-%20Mere%20Jeevan%20Saathi%20128%20Kbps.mp3?alt=media&token=c1131bda-7c45-46ce-a3a8-e6097b5f11ac"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2Fde%20de%20pyar%20de.jfif?alt=media&token=73d33b73-79dc-4772-bccd-8d778e59d78d",
        name = "De de pyar de",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FDe%20De%20Pyar%20De%20-%20Sharaabi%20128%20Kbps.mp3?alt=media&token=c13ead09-7c32-4bf5-aff2-780fea22ca66"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2Fdekha%20ek%20khaab.jfif?alt=media&token=d2f3a2a9-1dda-4edb-b93a-ca8858538a72",
        name = "Dekha ek Khwab To",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FDekha%20Ek%20Khwab%20To.mp3?alt=media&token=8939ad1c-96c4-4e85-b6af-c70fcd673172"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2Fek%20ajnabee%20haseena%20se.jfif?alt=media&token=4bd93bf2-7a38-485f-9475-e5bf37d063d4",
        name = "Ek Ajnabee Haseena se",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FEk%20Ajnabee%20Haseena%20Se.mp3?alt=media&token=416714eb-28ba-4f30-88c1-f7e3f28f8554"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2Fgore%20rang%20pe%20na%20itna%20gumaan%20kar.jfif?alt=media&token=8863acf5-5c9d-4a53-8faa-94de79e753ad",
        name = "Gore Rang pe nae itna",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FGore%20Rang%20Pe%20Na%20Itna.mp3?alt=media&token=f41f7d5c-5ff7-4104-a80d-99be89adeb9d"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2Finteha%20ho%20gayi.mp3?alt=media&token=97ffec9e-4e7e-41fd-b85d-6c826f3bd642",
        name = "Intaha ho gayi ",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FIntaha%20ho%20gayi%20song%20download.jfif?alt=media&token=0e4c22e8-9ceb-4308-ab6f-b1af57b32096"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FJanu%20Meri%20Jaan%20-%20Shaan.mp3?alt=media&token=cc9a33d9-0250-445c-8859-efdb9367f717",
        name = "Janu meri jaan",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FJanu%20Meri%20Jaan%20-%20Shaan.mp3?alt=media&token=cc9a33d9-0250-445c-8859-efdb9367f717"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FJiska%20muzhe%20tha%20intezaar.jfif?alt=media&token=adc7fc4e-5ae6-4494-963a-f9664ff74f43",
        name = "Jiska Muzhe tha intezaar",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FJiska%20muzhe%20tha.mp3?alt=media&token=275c131b-c498-4b14-b6b9-af03b5099e16"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FKya%20yahi%20pyaar%20hai.jfif?alt=media&token=e0a52224-1341-4a66-9c13-931b845f81cd",
        name = "Kya yehi pyar hai",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FKya%20Yehi%20Pyar%20Hai.mp3?alt=media&token=dc6b74b9-fe37-4ad8-9d0e-7fc50fdea060"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FMere%20sapno%20ki%20rani%20kab%20aayegi%20tu.jfif?alt=media&token=0ec30c58-e4ed-46a2-9550-8155c0cb7d7c",
        name = "Mare sapno ki rani",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FMere%20Sapnon%20Ki%20Rani.mp3?alt=media&token=c85a8c9c-4f41-4cdf-81d5-b7314e1cc7d8"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2Fneele%20neele%20ambar%20pe.jfif?alt=media&token=c0ac93b1-be25-47f2-83ae-a0ed48d46882",
        name = "Neele Neele Ambar",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FNeele%20Neele%20Ambar.mp3?alt=media&token=749265a1-11db-4176-a6bf-4216aa844080"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FO%20meredil%20ke%20chain.jfif?alt=media&token=bdcb71f7-f1e8-4faa-bd7a-35fc3d9d8c56",
        name = "O mere dil ke chain",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FO%20Mere%20Dil%20Chain.mp3?alt=media&token=dca42981-7a1e-4b4b-9b1d-3be44507b743"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FRoop%20tera%20mastana.jfif?alt=media&token=db5506a8-1c81-41f5-8134-4a8c94e78445",
        name = "Roop tera Mastana",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FRoop%20Tera%20Mastana.mp3?alt=media&token=4257df24-330d-4113-9082-96f7d3b81da3"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FSaagar%20kinare%20dil%20ye%20pukaare.jfif?alt=media&token=304cd0c4-737c-45a8-b084-9f82665b3fc6",
        name = "Saagar kinare dil ye pukaare",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FSaagar%20kianre%20sil%20ye%20pukaare.mp3?alt=media&token=851dbc35-849d-47fb-9932-9d5dadade0cd"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FTere%20chere%20se%20nazar%20nahi.jfif?alt=media&token=c215cf45-039c-4c56-b8bb-b5f8e813b23b",
        name = "Tere Chehre se nazar",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FTere%20Chehre%20Se%20Nazar.mp3?alt=media&token=9d619842-d320-4011-b12e-1640eac054eb"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FTum%20aa%20gaye%20ho%20noor%20aa%20gaya%20hai.jfif?alt=media&token=bab964fd-380f-49e0-a63f-8e4aa59342aa",
        name = "Tum Aa gaye Ho noor aa Gaya",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FTum%20Aa%20Gaye%20Ho%20Noor%20Aa%20Gaya.mp3?alt=media&token=b02621c9-894c-455b-b7fc-103424ee4d95"
    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FWada%20karo%20nahi%20chodoge%20tum%20mera%20sath.jfif?alt=media&token=ddab0866-77ac-4b4f-ab78-257bd02c347a",
        name = "Wada Karo Nahin Chodogi",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Kishore%20Kumar%2FWada%20Karo%20Nahin%20Chodogi.mp3?alt=media&token=69db6e7f-4c6f-4c01-b04d-65fb13bcba80"
    ),
)
val asha = listOf(
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FAaj%20rapat%20jayen%20to.jfif?alt=media&token=28ac365d-3cd3-4cca-a2a5-a0d90f5b7bd3",
        name = "Aaj rapat jaayen to",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FAaj%20Rapat%20Jaayen%20To%20-%20Namak%20Halaal%20128%20Kbps.mp3?alt=media&token=6c4b4e8c-c224-4bce-b7c7-fdf39490ee45"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FAbhi%20na%20jao%20chhod%20kar.jfif?alt=media&token=03aba1b4-a102-4f53-bc7b-444f1d54cd0d",
        name = "Abhi na jao chhod",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FAbhi%20Na%20Jao%20Chhod%20Kar%20128%20Kbps.mp3?alt=media&token=dc9c7ad6-75ff-461d-b378-ece25453ab99"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2Fchoti%20si%20kahani%20se.jfif?alt=media&token=f08f36a9-ec84-45de-81de-53f727b8df5b",
        name = "Chhoti si kahani",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FChhoti%20Si%20Kahani%20Se%20-%20Asha%20Bhosle.mp3?alt=media&token=ac121d13-8e51-4f35-8a56-23eea48fbce2"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FChura%20liya%20hai%20jo%20tumne.jfif?alt=media&token=f4683555-faa0-4c07-a654-1c0cda0a1cb5",
        name = "Chura liya hai jo tumne",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FChura%20Liya%20Hai%20Tumne%20(Yaadon%20Ki%20Baraat)%20(PagalWorld.com).mp3?alt=media&token=268ad951-0fb1-4934-bd3a-96c49cab1c6c"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2Fdil%20cheez%20kya%20hai.jfif?alt=media&token=8047e7a5-3355-45f2-8b81-c3af988399a0",
        name = "Dil Cheez kya hai",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FDil%20Cheez%20Kya%20Hai%20-%20Umrao%20Jaan%20128%20Kbps.mp3?alt=media&token=8d1e0d83-0c0b-4388-8654-eb2c951a71d7"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2Fdiwana%20hua%20badal.jfif?alt=media&token=b36e35b4-42ca-4c6e-9fb8-edcbcaf5cc15",
        name = "Diwana hua badal",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FDiwana%20Hua%20Badal%20-%20Kashmir%20Ki%20Kali%20128%20Kbps.mp3?alt=media&token=8431e11e-949b-494e-89b8-14e7774f8bf7"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2Fdum%20maro%20dum.jfif?alt=media&token=baa9b6d2-49b8-4167-8f02-5f1e231d2c2c",
        name = "Dum maro dum",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FDum%20Maro%20Dum%20128%20Kbps.mp3?alt=media&token=a3831366-6d08-4e8d-bb84-61f239ddb130"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FGun%20guna%20rahe%20hai%20bhanvare.jfif?alt=media&token=a408ed4e-c2dc-4c45-bc59-4c8e66706f38",
        name = "Gun guna rae hai bhanvare",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FGun%20Guna%20Rahe%20Hai%20Bhanvare.mp3?alt=media&token=bcc2c047-f172-410a-9a1b-3b6a7bf53e03"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FKisi%20nazar%20ko%20tera.jfif?alt=media&token=5193668c-5fce-4f56-8a35-05d33812c9cd",
        name = "Kisi nazar ko tera intezar",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FKisi%20Nazar%20Ko%20Tera%20Intezar%20Aaj%20Bhi%20Hai.mp3?alt=media&token=01d04c6f-edfe-4563-a76a-f1cc2fbece48"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FKitaben%20bahut%20si.jfif?alt=media&token=42e58a59-0962-42b2-a6b1-9b654d5d30a7",
        name = "Kitabein bahut si",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FKitabein%20Bahut%20Si.mp3?alt=media&token=2bcdb9e5-f050-4e56-9126-ca8b3ea3e6ad"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2Fle%20gayi.jfif?alt=media&token=a53ef2a5-7b3f-491c-8ef7-3eecb4139a0e",
        name = "Le gayi",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FLe%20Gayi.mp3?alt=media&token=0af5eb35-8265-4f5c-a97a-a980d8c5ba3f"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FPiya%20Tu%20Ab%20To%20Aaja.mp3?alt=media&token=009ab378-609d-4c43-9850-f8ec26e0997f",
        name = "Piya tu ab to aaja",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FPiya%20Tu%20Ab%20To%20Aaja.mp3?alt=media&token=009ab378-609d-4c43-9850-f8ec26e0997f"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FPyaar%20ka%20dard%20hai.jfif?alt=media&token=3f99227b-2643-4e55-915f-32692af35058",
        name = "Pyaar ka dard hai",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FPyaar%20Ka%20Dard%20Hai%20-%20Dard.mp3?alt=media&token=6ef7e6e5-2388-4e25-a405-6fc625405df5"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FPyar%20humara%20amar%20rahega.jfif?alt=media&token=33e06c6f-e9fe-4d91-8027-3db26e89c9b3",
        name = "Pyar hamara amar rahega",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FPyar%20Hamara%20Amar%20Rahega%20-%20Muddat%20128%20Kbps.mp3?alt=media&token=687c5ac6-32c5-4b8c-be72-aed881e5ea67"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FRaat%20ke%20humsafar.jfif?alt=media&token=072db0f7-ccc6-46cb-a5fd-53066314896b",
        name = "Raat ke Humsafar",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2Fraat%20ke%20humsafar.mp3?alt=media&token=f1ede01e-9bc5-4455-a6af-a7bbc2ae67e5"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FRadha%20kaise%20na%20jale.jfif?alt=media&token=136fc753-2685-4b30-89ec-4f94c8f27cf9",
        name = "Radha kaise na jale",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FRadha%20Kaise%20Na%20Jale%20-%20Lagaan%20128%20Kbps.mp3?alt=media&token=01a7eb07-f081-49c4-a7a0-f1137293c357"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2Fuden%20jab%20jab%20zulfen%20teri.jfif?alt=media&token=22933b78-18c1-44d8-a2d4-bb7ba5d9b3e5",
        name = "Uden jab jab zulfen teri",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FUden%20Jab%20Jab%20Zulfen%20Teri.mp3?alt=media&token=61b0420e-3573-4132-94ff-24749db7bd0c"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FYeh%20Ladka%20Hai%20Allah.mp3?alt=media&token=442a63da-8104-4f64-a73a-4a3d5cdad595",
        name = "Yeh ladka hai allab",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FYeh%20Ladka%20Hai%20Allah.mp3?alt=media&token=442a63da-8104-4f64-a73a-4a3d5cdad595"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FYeh%20Raaten%20Yeh%20Mausam.mp3?alt=media&token=cd9e3f47-44e4-438c-965c-bbfb6875e269",
        name = "Yeh Raaten yeh mausam",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FYeh%20Raaten%20Yeh%20Mausam.mp3?alt=media&token=cd9e3f47-44e4-438c-965c-bbfb6875e269"

    ),
    firebaseDataFile(
        image = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FZara%20sa%20zhoom%20lu%20main.jfif?alt=media&token=98546ea7-ffd7-4c17-822e-2152a9646f30",
        name = "Zara sa zhoom lu main",
        url = "https://firebasestorage.googleapis.com/v0/b/sastaspotify-15dbe.appspot.com/o/Asha%20Bhosle%2FZara%20Sa%20Jhoom%20Loon%20Main.mp3?alt=media&token=1dc8f3a4-359d-4619-bffc-654ca6044e8c"

    ),
)
