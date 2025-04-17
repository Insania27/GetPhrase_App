package com.example.getphraseapp.Items

data class ItemsSeries(
    val name: String,
    val image: String,
    val route: String,
)

val breakingBadURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT0af_n3mCP4xU13L16npq1L3u3VjFfVq5n1g&s"
val theSopranosURL = "https://m.media-amazon.com/images/I/71yz+cOKE8L._AC_UF894,1000_QL80_.jpg"
val strangerThingsURL = "https://m.media-amazon.com/images/I/719R4NbNjpL.jpg"
val yellowstoneURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQm9AtBvwx3EtJiSuiiWPaWYZnqiNX6gwjp-w&s"
val betterCallSaulURL = "https://www.femalefirst.co.uk/image-library/square/500/b/better-call-saul-season-3-key-art-poster.jpg"
val theOfficeURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ_u57u9--2gTO8MnvuL0R40JDryNLIEsbPZQ&s"
val tedLassoURL = "https://m.media-amazon.com/images/M/MV5BZmI3YWVhM2UtNDZjMC00YTIzLWI2NGUtZWIxODZkZjVmYTg1XkEyXkFqcGc@._V1_.jpg"
val theBoysURL = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdQknR4Uj_8f45Nnz_iyX0pmkYORI79jcuTw&s"

val mySelectedSeries = listOf(
    ItemsSeries("Во все тяжкие", breakingBadURL, "breakingBadRoute"),
    ItemsSeries("Сопрано", theSopranosURL, "theSopranosRoute"),
    ItemsSeries("Очень странные дела", strangerThingsURL, "strangerThingsRoute"),
    ItemsSeries("Йеллоустоун", yellowstoneURL, "yellowstoneROute"),
    ItemsSeries("Лучше звоните Солу", betterCallSaulURL, "betterCallSaulRoute"),
    ItemsSeries("Офис", theOfficeURL, "theOfficeRoute"),
    ItemsSeries("Тед Лассо", tedLassoURL, "tedLassoRoute"),
    ItemsSeries("Пацаны", theBoysURL, "theBoysRoute"),
)