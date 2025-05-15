package com.example.getphraseapp.UI_Objects.ScreensOfItems.Movies

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
fun PulpFictionScreen() {
    val words = listOf(
        "Big Kahuna Burger - Бургер «Большая Кахуна»",
        "Royale with Cheese - Рояль с сыром",
        "Five-Dollar Shake - Пятьдолларовый молочный коктейль",
        "Jackrabbit Slim’s - Дже́йкрэббит Слим’с",
        "Pumpkin’s Diner - Кафе «Тыква»",
        "Red Apple Cigarettes - Сигареты «Красное яблоко»",
        "Gold Watch - Золотые часы",
        "Briefcase Mystery - Загадочный чемодан",
        "Dance Contest - Танцевальный конкурс",
        "Route 66 - Шоссе 66",
        "French Quarter - Французский квартал",
        "Foot Massage - Массаж стоп",
        "House Special - Фирменное блюдо",
        "Double Cheeseburger - Двойной чизбургер",
        "Milkshake Flavor - Вкус молочного коктейля",
        "Car Rental - Аренда автомобиля",
        "Speed Limit - Ограничение скорости",
        "Parking Garage - Парковочный гараж",
        "License Plate - Номерной знак",
        "Gas Station - Автозаправка",
        "Road Trip - Поездка по дорогам",
        "Brief Encounter - Краткая встреча",
        "Table for Two - Столик на двоих",
        "Dinner Date - Романтический ужин",
        "Neon Sign - Неоновая вывеска",
        "Synthesizer Solo - Соло на синтезаторе",
        "Soundtrack Album - Саундтрек-альбом",
        "Cigarette Pack - Упаковка сигарет",
        "Matchstick Box - Коробок спичек",
        "Flaming Lighter - Зажигалка с пламенем",
        "Leather Jacket - Кожаная куртка",
        "Retro Sunglasses - Ретро‑очки",
        "Vinyl Record - Виниловая пластинка",
        "Smoking Gun - Дымящееся оружие",
        "Bullet Shell - Семя кассеты",
        "Crime Scene - Место преступления",
        "Police Radio - Полицейская рация",
        "Badge Number - Номер значка",
        "Emergency Call - Аварийный вызов",
        "Back Alley - Задний дворик",
        "Urban Landscape - Городской пейзаж",
        "Graffiti Wall - Стена с граффити",
        "Sidewalk Café - Уличное кафе",
        "City Lights - Городские огни",
        "Late Night Show - Позднее шоу",
        "Radio DJ - Радио‑диджей",
        "Payphone Booth - Телефонная будка",
        "Hotel Lobby - Лобби отеля",
        "Room Service - Обслуживание номеров",
        "Motel Sign - Указатель мотеля",
        "Check‑in Desk - Стойка регистрации",
        "Lobby Music - Фоновая музыка в лобби",
        "Hidden Weapon - Скрытое оружие",
        "Secret Code - Секретный код",
        "Emergency Exit - Аварийный выход",
        "Surveillance Camera - Камера наблюдения",
        "Microphone Stand - Стойка для микрофона"
    )


    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.primary)
        .padding(8.dp)
    ) { items(words) { pair ->
        Text(pair, color = MaterialTheme.colorScheme.onPrimary)
    } }
}