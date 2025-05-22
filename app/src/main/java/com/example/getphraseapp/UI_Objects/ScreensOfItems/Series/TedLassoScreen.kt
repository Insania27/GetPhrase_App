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
fun TedLassoScreen(){
    val words = listOf(
        "Believe — Верь",
        "Ted Lasso’s Mustache — Усы Теда Лассо",
        "AFC Richmond — ФК «Ричмонд»",
        "Biscuits with the Boss — Печенье для босса",
        "Roy Kent’s Grunts — Ворчание Роя Кента",
        "Diamond Dogs — Бриллиантовые псы",
        "Wonder Kid — Чудо-ребёнок (Джейми Тартт)",
        "Lasso Special — Печенье «Особое от Лассо»",
        "Nelson Road Stadium — Стадион «Нельсон Роуд»",
        "Rebecca’s Revenge — Месть Ребекки",
        "Sam’s Restaurant — Ресторан Сэма",
        "Keeley’s PR Agency — PR-агентство Килли",
        "Be Curious, Not Judgmental — Будь любопытным, не осуждай",
        "Trent Crimm’s Article — Статья Трента Кримма",
        "Richmond Till We Die — «Ричмонд» до гроба (клич болельщиков)",
        "Jamie Tartt’s Ego — Эго Джейми Тартта",
        "Practice Field Sign — Табло на поле (BELIEVE)",
        "Psychic — Ясновидящая (момент с Ребеккой)",
        "Football is Life! — Футбол — это жизнь!",
        "Beard After Hours — Ночь Биарда",
        "Christmas Episode — Рождественский эпизод",
        "False Nine — Ложная девятка",
        "Ted’s Panic Attacks — Панические атаки Теда",
        "Karaoke Night — Караоке-вечер",
        "Roy & Keeley’s Breakup — Расставание Роя и Килли",
        "Nate’s Betrayal — Предательство Нейта",
        "Thierry Zoreaux’s Helmet — Шлем Тири Зоро",
        "Dr. Sharon Fieldstone — Доктор Шэрон Филдстоун",
        "Phoebe’s School Project — Школьный проект Фиби",
        "Tartt’s Redemption — Искупление Тартта",
        "Dani Rojas’ Positivity — Оптимизм Дани Рохаса",
        "Higgin’s Spreadsheets — Таблицы Хиггинса",
        "Pub: Crown & Anchor — Паб «Корона и якорь»",
        "Bantr App — Приложение «Бантр»",
        "Rupert’s Manipulations — Манипуляции Руперта",
        "Stinky Pinky — Игра «Вонючий мизинчик»",
        "Sam’s Activism — Активность Сэма",
        "Team Promotion/Relegation — Выход/вылет команды",
        "Leslie’s Tea Kettle — Чайник Лесли",
        "Beard’s Wisdom — Мудрость Биарда",
        "Ted’s Mints — Мятные конфеты Теда",
        "Keeley’s «Wunderkind» — «Вундеркинд» Килли",
        "Jamie’s Dad Issues — Проблемы Джейми с отцом",
        "Ted’s «Barbecue Sauce» Speech — Речь Теда о соусе",
        "Phoebe’s Football Match — Футбольный матч Фиби",
        "Roy’s «He’s Here, He’s There» — «Он тут, он там» (клич о Рое)",
        "Rebecca’s «Let It Flow» — «Позволь этому течь» (песня Ребекки)",
        "Nate’s Grey Hair — Седой волос Нейта",
        "Ted’s «Rom-Communism» — «Ром-коммунизм» Теда",
        "«Futbol is Life!» — «Футбол — это жизнь!» (Дэни Рохас)",
        "«Be a Goldfish» — «Будь золотой рыбкой»",
        "«I appreciate you» — «Я ценю тебя»",
        "«Horticulture, Baby!» — «Садоводство, детка!»",
        "«It’s the Hope That Kills You» — «Надежда убивает»",
        "«Oi, wanker!» — «Эй, придурок!»",
        "«He’s a Working Man» — «Он трудяга» (о Рое)",
        "«The Lasso Way» — «Метод Лассо»",
        "«You Deserve Someone Who Makes You Feel Like You’ve Been Struck by Lightning» — «Ты заслуживаешь того, от кого будто током бьёт»",
        "«Fightin’ Round the World» — «Драки по всему миру» (песня Роя)",
        "«Smells Like Potential» — «Пахнет потенциалом»",
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