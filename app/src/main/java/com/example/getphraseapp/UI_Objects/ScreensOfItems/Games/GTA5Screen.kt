package com.example.getphraseapp.UI_Objects.ScreensOfItems.Games

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun GTA5Screen(){

    val words = listOf(
        "«You forget a thousand things every day. How 'bout you make sure this is one of 'em?» — «Ты каждый день забываешь тысячу вещей. Пусть это будет одна из них.»",
        "«I’m like a vegan with a gun!» — «Я как веган с пушкой!»",
        "«You chose the wrong house, fool!» — «Ты не в тот дом зашёл, чудак!»",
        "«YOLO, motherfu**er!» — «Живёшь один раз, козел!»",
        "«Sometimes, I’d kick a chair just to watch it die.» — «Иногда я пинаю стул, чтобы посмотреть, как он умрёт.»",
        "«I’m a retired old gangster, you idiot!» — «Я старый гангстер на пенсии, идиот!»",
        "«You can’t spell «America» without «ERICA».» — «Не напишешь «Америка» без «Эрики».»",
        "«You see, the way my bank account is set up...» — «Понимаешь, у меня тут счёт в банке…»",
        "«Man, this shit’s weak!» — «Чувак, это полный отстой!»",
        "«I’m not psycho! I’m just entrepreneurial!» — «Я не псих! Я просто предприимчивый!»",
        "«You a Ballas now? You look like a purple turtle!» — «Ты теперь из «Баллас»? Выглядишь как фиолетовая черепаха!»",
        "«I’m scared of yoga!» — «Я боюсь йоги!»",
        "«Call 9-1-1! I’m dying of boredom!» — «Звоните 911! Я умираю от скуки!»",
        "«You ain’t gotta like it, but you gon’ respect it!» — «Тебе может не нравиться, но ты будешь это уважать!»",
        "«I’d rather be rich than stupid.» — «Лучше быть богатым, чем тупым.»",
        "«In this country, you gotta make the money first. Then when you get the money, you get the power.» — «В этой стране сначала делаешь деньги. Потом получаешь власть.»",
        "«Oh, I’m sorry, did I break your concentration?» — «Ой, прости, я тебя отвлёк?»",
        "«You don’t fuck a man’s vehicle!» — «Не трогай машину мужика!»",
        "«Man, this city’s a trip.» — «Чувак, этот город — полный бред.»",
        "«You’re like the world’s worst superhero!» — «Ты как самый ужасный супергерой на свете!»",
        "«You don’t get to be a criminal of my stature by worrying about the cops!» — «Не станешь криминальным авторитетом моего уровня, если боишься копов!»",
        "«The world’s f**ked, but at least I’m getting paid.» — «Миру конец, но мне хотя бы платят.»",
        "«You don’t bring a bicycle to a tank fight!» — «На танковый бой не берут велосипед!»",
        "«This ain’t a country club, pal!» — «Это не загородный клуб, приятель!»",
        "«I’m not drunk, I’m just... conducting an experiment.» — «Я не пьян, я просто... провожу эксперимент.»",


        )


    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(
            MaterialTheme.colorScheme.primary
        )
        .padding(8.dp)
    ) { items(words) { pair ->
        Text(pair, color = MaterialTheme.colorScheme.onSecondary)
    } }

}