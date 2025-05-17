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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ForrestGumpScreen(){
    val words = listOf(
        "Shrimp Boat - Лодка для ловли креветок",
        "Shrimp Company - Компания по выращиванию креветок",
        "Ping‑Pong Paddle - Ракетка для пинг‑понга",
        "Ping‑Pong Table - Стол для пинг‑понга",
        "Army Base - Военная база",
        "Lieutenant Dan - Лейтенант Дэн",
        "Vietnam War - Вьетнамская война",
        "Bus Stop Bench - Скамья автобусной остановки",
        "Box of Chocolates - Коробка шоколадных конфет",
        "Running Shoes - Беговые кроссовки",
        "Green Lawn - Зелёный газон",
        "Water Fountain - Фонтан",
        "Hospital Ward - Палата больницы",
        "Jenny’s House - Дом Дженни",
        "Football Helmet - Футбольный шлем",
        "High School Gym - Спортивный зал школы",
        "Parade Float - Парадный платформер",
        "Veterans’ Reunion - Встреча ветеранов",
        "Bus Ticket - Билет на автобус",
        "Photo Album - Фотоальбом",
        "Long Run - Долгий пробег",
        "Running Route - Маршрут для бега",
        "Thank You Letter - Благодарственное письмо",
        "College Diploma - Диплом колледжа",
        "Peace Rally - Митинг за мир",
        "News Reporter - Репортер",
        "Magazine Interview - Интервью для журнала",
        "Forest Clearing - Поляна в лесу",
        "Rainstorm - Ливень",
        "Drug Rehab Center - Реабилитационный центр для наркозависимых",
        "Buffalo Ranch - Ранчо с бизонами",
        "Fire Academy - Пожарная академия",
        "Spotlight Moment - Момент в центре внимания",
        "Newspaper Article - Статья в газете",
        "Cross‑Country Run - Кросс по стране",
        "Private Plane - Частный самолёт",
        "Historic Landmark - Историческая достопримечательность",
        "School Bus - Школьный автобус",
        "Coastline View - Вид на побережье",
        "Veteran’s Medal - Медаль ветерана",
        "Childhood Friend - Друг детства",
        "Wedding Invitation - Свадебное приглашение",
        "Family Reunion - Семейная встреча",
        "Mountain Trail - Горная тропа",
        "Small Town - Маленький город",
        "Breakfast Table - Завтрак за столом",
        "Photo Session - Фотосессия",
        "Bus Driver - Водитель автобуса",
        "Life Lesson - Урок жизни",
        "Weather Forecast - Прогноз погоды",
        "Letter of Recommendation - Рекомендательное письмо",
        "Speed Record - Рекорд скорости",
        "Marathon Route - Маршрут марафона",
        "Public Library - Общественная библиотека",
        "Field Hospital - Полевой госпиталь",
        "Rolling Hills - Холмистые равнины",
        "Coastal Highway - Прибрежное шоссе",
        "Carpenter’s Shop - Мастерская плотника",
        "Office Cubicle - Офисная кабинка"
    )


    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(
            Brush.verticalGradient(
                colors = listOf(
                    Color(0xFF1ABC9C),
                    Color.LightGray,
                )
            )
        )
        .padding(8.dp)
    ) { items(words) { pair ->
        Text(pair, color = MaterialTheme.colorScheme.onPrimary)
    } }
}