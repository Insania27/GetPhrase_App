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
fun StrangerThingsScreen(){
    val words = listOf(
        "Upside Down — Перевёрнутый мир",
        "Demogorgon — Демогоргон",
        "Eleven — Одиннадцать",
        "Hawkins Lab — Лаборатория Хокинса",
        "Will the Wise — Уилл Мудрый",
        "Mind Flayer — Умный убийца",
        "Vecna — Векна",
        "Party — Команда (Дружина)",
        "Eggo Waffles — Вафли Eggo",
        "Lights Communication — Световая связь",
        "Sensory Deprivation Tank — Сенсорная камера",
        "Byers’ Christmas Lights — Рождественские гирлянды Байерсов",
        "Starcourt Mall — Торговый центр «Старкорт»",
        "Steve’s Bat — Бита Стива",
        "Barb’s Disappearance — Исчезновение Барб",
        "Russian Base — Русская база",
        "Billy’s Camaro — Камаро Билли",
        "Jonathan’s Camera — Фотоаппарат Джонатана",
        "Joyce’s Wall — Стена Джойс",
        "Hopper’s Cabin — Хижина Хоппера",
        "Demodogs — Демопсы",
        "Gate to Upside Down — Портал в Перевёрнутый мир",
        "Mike’s Castle Byers — Замок Уилла от Майка",
        "Dart — Дарт (Демопёс)",
        "Suzy, Do You Copy? — Сьюзи, ты меня слышишь?",
        "Neverending Story — Бесконечная история",
        "Snow Ball — Снежный бал",
        "Psychic Powers — Псионические способности",
        "Pineapple Pizza — Пицца с ананасом",
        "Surfer Boy Pizza — Пицца «Сёрфер Бой»",
        "Eddie’s Guitar Solo — Гитара Эдди",
        "Chrissy’s Curse — Проклятие Крисси",
        "Vecna’s Clock — Часы Векны",
        "Max’s Running Up That Hill — «Беги к холмам» Макс",
        "Robin’s Scoops Ahoy — «Скупс Ахой» Робин",
        "Nina Project — Проект «Нина»",
        "Papa — Папа (доктор Бреннер)",
        "Creel House — Дом Крилов",
        "Salt Bath — Солевая ванна",
        "Steve’s Babysitting — Нянька Стив",
        "Lucas’ Wrist Rocket — Рогатка Лукаса",
        "Dustin’s Cereal — Хлопья Дастина",
        "«Friends Don’t Lie» — «Друзья не врут»",
        "«Mouth Breather» — «Ротозей»",
        "«Run, Coward, Run!» — «Беги, глупышка, беги!»",
        "«It’s Not Your Fault, Will» — «Это не твоя вина, Уилл»",
        "«The World Is Turning Upside Down» — «Мир переворачивается»",
        "«We’re All Screwed» — «Нам всем крышка»",
        "«Bitchin’» — «Обалденно»",
        "«This Is Music!» — «Вот это музыка!»",
        "«You’re My Superhero» — «Ты мой супергерой»",
        "«I’m Still Here» — «Я всё ещё здесь»",
        "«Every Breath You Take» — «Каждый твой вздох»",
        "«We Can Be Heroes» — «Мы можем быть героями»",
        "«Screw Your Curse» — «К чёрту твоё проклятие»",
        "«The First Shadow» — «Первая тень»",
        "«The Hellfire Club» — «Клуб «Адское Пламя»",
        "«Hawkins AV Club» — «Клуб аудио-визуалов Хокинса»",
        "«Scoops Troop» — «Команда Скупс»",
        "«Trick or Treat, Freak!» — «Сладость или гадость, урод!»",
        "«Starcourt Battle» — «Битва в Старкорте»",
        "«The Mind Lair» — «Логово Ума»",
        "«Vecna’s Victims» — «Жертвы Векны»",
        "«The Piggyback Plan» — «План «На спине»",
        "«Silo Escape» — «Побег из силоса»",
        "«The Nina Simulation» — «Симуляция Нины»",
        "«The Final Showdown» — «Последняя схватка»",
        "«Eleven’s Nosebleed» — «Кровь из носа Одиннадцать»",
        "«The Byers Move» — «Переезд Байерсов»",
        "«The Upside Down Creep» — «Ползучесть Перевёрнутого мира»",
        "«The Red Storm» — «Красная буря»",
        "«The Monster Hunting» — «Охота на монстра»",
        "«The Truth About Brenner» — «Правда о Бреннере»",
        "«The Power of Friendship» — «Сила дружбы»",
        "«The Ghost of Hawkins» — «Призрак Хокинса»",
        "«The Battle for Hawkins» — «Битва за Хокинс»",
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