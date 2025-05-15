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
fun TheWitcherScreen(){
    val words = listOf(
        "Silver Sword - Серебряный меч",
        "Steel Sword - Стальной меч",
        "Monster Trophy - Трофей монстра",
        "Alchemy Table - Стол алхимии",
        "Potion Bottle - Флакон со зельем",
        "Bomb Crafting - Создание бомб",
        "Abandoned Village - Заброшенная деревня",
        "Bandit Camp - Лагерь бандитов",
        "Guard Tower - Сторожевая башня",
        "Notice Board - Доска объявлений",
        "Horse Saddle - Седло для лошади",
        "Horse Carcass - Тушка лошади",
        "Smuggler's Cove - Пещера контрабандистов",
        "Fisherman's Hut - Хижина рыбака",
        "Elder Blood - Старшая кровь",
        "Mutagen Receptacle - Контейнер для мутагена",
        "Elven Ruins - Эллинские руины",
        "Ancient Druid Circle - Древний друидский круг",
        "Foggy Marsh - Туманные болота",
        "Cursed Mire - Проклятое болото",
        "Treasure Chest - Сундук с сокровищами",
        "Hidden Treasure - Скрытое сокровище",
        "Herbalist's Garden - Сад травника",
        "Witcher's Mark - Знак ведьмака",
        "Haunted Cathedral - Одержимая собор",
        "Imperial Tomb - Имперская гробница",
        "Royal Guard - Королевская гвардия",
        "Royal Court - Королевский двор",
        "Tax Collector's Office - Контора сборщика налогов",
        "Merchant Caravan - Караван торговцев",
        "Alchemist’s Laboratory - Лаборатория алхимика",
        "Herbal Tea - Травяной чай",
        "Bread Crumbs - Хлебные крошки",
        "Iron Horseshoe - Железная подкова",
        "Leather Armor - Кожаная броня",
        "Plate Mail - Латы",
        "Crossbow Bolt - Болт для арбалета",
        "Torchlight Glow - Сияние факелов",
        "Moonlit Night - Лунная ночь",
        "Frost Coating - Ледяная корка",
        "Stormy Sky - Бурное небо",
        "Rolling Hills - Холмистые равнины",
        "Stone Bridge - Каменный мост",
        "Wooden Palisade - Деревянная палисада",
        "Stone Quarry - Каменный карьер",
        "Hidden Path - Скрытая тропа",
        "Mountain Pass - Горный перевал",
        "River Crossing - Переправа через реку",
        "Village Feast - Деревенский пир",
        "Hunters' Lodge - Охотничий домик",
        "Graveyard Mist - Туман над кладбищем",
        "Witch Hunt - Охота на ведьм",
        "Blood Moon - Кровавая луна",
        "Gold Ore - Золотая руда",
        "Emerald Necklace - Изумрудное ожерелье",
        "Sapphire Ring - Сапфировое кольцо",
        "Silver Chalice - Серебряная чаша",
        "Iron Gate - Железные ворота",
        "Wooden Drawbridge - Деревянный подъёмный мост",
        "Echoing Halls - Залы эха"
    )


    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.primary)
        .padding(8.dp)
    ) { items(words) { pair ->
        Text(pair, color = MaterialTheme.colorScheme.onPrimary)
    } }
}