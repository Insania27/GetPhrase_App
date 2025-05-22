package com.example.getphraseapp.UI_Objects.ScreensOfItems.Series

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
fun TheSopranosScreen(){
    val words = listOf(
        "Bada Bing — Бада Бинг",
        "Tony’s Therapy Sessions — Сессии Тони с психотерапевтом",
        "Capo di Tutti Capi — Капо ди tutti капи",
        "Paulie Walnuts — Полли Валнатс (Полли «Грецкий орех»)",
        "Christopher’s Screenplay — Сценарий Кристофера",
        "Adriana’s Betrayal — Предательство Адрианы",
        "Silvio’s Impersonation — Пародии Силвио",
        "Vesuvio Restaurant — Ресторан «Везувио»",
        "«Gabagool» — «Габагул» (произношение capicola)",
        "New Jersey Mob — Мафия Нью-Джерси",
        "«Made Man» — «Посвящённый»",
        "Proshai, Livushka — «Прощай, милочка» (эпизод смерти Ливии)",
        "Pine Barrens — Сосновые пустоши (эпизод в лесу)",
        "Tony’s Ducks — Утки Тони",
        "Carmela’s Catholic Guilt — Католическая вина Кармелы",
        "«It’s Good to Be in Something from the Ground Floor» — «Хорошо быть у истоков чего-то»",
        "Richie Aprile’s Jacket — Куртка Ричи Априле",
        "Ralphie’s «Ho!» — «Хо!» Ральфи",
        "Janice’s Manipulations — Манипуляции Дженис",
        "«Remember When» — «Помнишь, когда…»",
        "Livia’s «Poor You» — «Бедняжка ты» Ливии",
        "Furio’s Crush — Влюблённость Фурио",
        "«Ooh, Madone!» — «О, Мадонна!»",
        "Artie Bucco’s Risotto — Ризотто Арти Букко",
        "Junior’s Trial — Суд над дядей Джуниором",
        "«This Thing of Ours» — «Наше дело»",
        "Satriale’s Pork Store — Мясная лавка «Сатриалс»",
        "Tony’s Panic Attacks — Панические атаки Тони",
        "«I Like the One That Says ‘Some Pulp’» — «Мне нравится «С мякотью»»",
        "Phil Leotardo’s Grudge — Обида Фила Леотардо",
        "«You Sopranos — You Go Too Far!» — «Вы, Сопрано, заходите слишком далеко!»",
        "Bobby’s Model Trains — Модели поездов Бобби",
        "«Heavy Set Guy, Satriale’s» — «Толстяк из «Сатриалс»»",
        "Gloria Trillo’s Obsession — Одержимость Глории Трилло",
        "«Don’t Stop Believing» — Финал с песней Journey",
        "Tony’s «Where’s the Gabagool?» — «Где габагул?»",
        "«Woke Up This Morning» — Саундтрек сериала",
        "Dr. Melfi’s Ethics — Этические дилеммы доктора Мелфи",
        "«The Russian» — «Русский» (эпизод в лесу)",
        "Johnny Sack’s Wedding — Свадьба Джонни Сэка",
        "«All Due Respect» — «При всём уважении»",
        "Tony’s «I Get It!» — «Я понял!»",
        "«College» Episode — Эпизод «Колледж»",
        "Carmine Lupertazzi — Кармайн Лупертацци",
        "«You’re at the Crossroads» — «Ты на перепутье»",
        "Vito’s Secret — Секрет Вито",
        "«The Test Dream» — «Тестовый сон»",
        "Tony’s Boat — Лодка Тони («Stugots»)",
        "«Commendatori!» — «Коммендатори!» (эпизод в Италии)",
        "«Pie-O-My» — Лошадь Тони («Пай-о-Май»)",
        "«The Sac» — «Мешок» (эпизод с пакетом денег)",
        "«Whitecaps» — «Белые гребни» (финал 4 сезона)",
        "«Members Only» Jacket — Куртка «Members Only»",
        "«Cleaver» Movie — Фильм «Кливер»",
        "«It’s a Retirement Community!» — «Это дом престарелых!»",
        "Tony’s «Whatever Happened There?» — «И что это было?»",
        "«No More Butchie!» — «Хватит, Батчи!»",
        "«The Blue Comet» — «Голубой комет» (модель поезда)",
        "«You Can’t Put Your Arms Around a Memory» — «Не обнимешь воспоминание»",
        "«I’m a Fat F*ck» — «Я жирный убл*док»",
        "«Always with the Scenarios!» — «Вечно ты сценарии придумываешь!»",
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