package com.example.getphraseapp.Items


data class ItemsMovies(
    val id: String,
    val name: String,
    val image: String,
    val route: String,
)

val inceptionURL = "https://i.ebayimg.com/images/g/B8oAAOSw2fdg5A-h/s-l1200.jpg"
val pulpFictionURL = "https://sothebys-md.brightspotcdn.com/dims4/default/ef9b6e5/2147483647/strip/true/crop/1343x2000+0+0/resize/385x573!/quality/90/?url=http%3A%2F%2Fsothebys-brightspot.s3.amazonaws.com%2Fmedia-desk%2Ff0%2Ffb%2Fef66ae444b88b7a847a406f5dcb7%2Fl21304-2055-bxfw4-1.jpg"
val interstellarURL = "https://i5.walmartimages.com/asr/a8bdfc2e-70f3-48f5-b57c-03492465379c_1.ba5c3bf480e24c740d9396caf30748bf.jpeg"
val forrestGumpURL = "https://m.media-amazon.com/images/M/MV5BNDYwNzVjMTItZmU5YS00YjQ5LTljYjgtMjY2NDVmYWMyNWFmXkEyXkFqcGc@._V1_.jpg"
val theDepartedURL = "https://upload.wikimedia.org/wikipedia/en/5/50/Departed234.jpg"
val fightClubURL = "https://m.media-amazon.com/images/I/61sNuDFJlWL._AC_UF894,1000_QL80_.jpg"


val mySelectedMovies = listOf(
    ItemsMovies("inception","Начало", inceptionURL, "inceptionRoute"),
    ItemsMovies("pulpFiction","Криминальное чтиво", pulpFictionURL, "pulpFictionRoute"),
    ItemsMovies("interstellar","Интерестеллар", interstellarURL, "interstellarRoute"),
    ItemsMovies("forrestGump","Форрест Гамп", forrestGumpURL, "forrestGumpRoute"),
    ItemsMovies("theDeparted","Отступники", theDepartedURL, "theDepartedRoute"),
    ItemsMovies("fightClub","Бойцовский клуб", fightClubURL, "fightClubRoute"),
)