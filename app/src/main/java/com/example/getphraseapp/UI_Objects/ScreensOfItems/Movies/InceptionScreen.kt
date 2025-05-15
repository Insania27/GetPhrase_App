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
fun InceptionScreen(){
    val words = listOf(
        "Dream Extractor - Устройство для извлечения снов",
        "Dream Sharing - Совместное переживание сновидений",
        "Subconscious Mind - Подсознание",
        "Dream Architect - Архитектор сновидений",
        "Extraction Team - Команда извлечения",
        "Corporate Saboteur - Корпоративный диверсант",
        "Portable Blender - Портативный блендер",
        "Sedative Cutter - Инструмент для наркоза",
        "Hotel Corridor - Коридор отеля",
        "Sublevel Nexus - Уровневый узел",
        "Limbo State - Состояние Лимба",
        "Memory Palace - Дворец памяти",
        "Kick Sequence - Последовательность пробуждений",
        "Downward Kick - Нисходящий толчок",
        "Upward Kick - Восходящий толчок",
        "Dream Layer - Слой сна",
        "Cobb’s Remains - Останки Кобба",
        "Cobol Engineering - Инженерия Коболя",
        "Safe House - Безопасное убежище",
        "Security Breach - Нарушение безопасности",
        "Extraction Point - Точка извлечения",
        "London Street - Лондонская улица",
        "Paris Café - Парижское кафе",
        "Nightclub Brawl - Драка в ночном клубе",
        "Snow Fortress - Снежная крепость",
        "Bank Vault - Банковский сейф",
        "Safe Combination - Код от сейфа",
        "Mind Heist - Похищение мыслей",
        "Conscious Choice - Сознательный выбор",
        "Inception Procedure - Процедура внедрения идеи",
        "Synthetic Sedative - Синтетическое седативное средство",
        "Dream Lab - Лаборатория сновидений",
        "Architect’s Blueprint - Чертёж архитектора",
        "Brushed Memory - Стертый фрагмент памяти",
        "Fischer’s Subconscious - Подсознание Фишера",
        "Recruitment Interview - Отборочное интервью",
        "Extraction Job - Задание на извлечение",
        "Mind Projection - Проекция сознания",
        "Conceptual Idea - Концептуальная идея",
        "Shared Dream - Общий сон",
        "Limbo Extraction - Извлечение из Лимба",
        "Reality Check - Проверка реальности",
        "Spinning Top - Вращающаяся юла",
        "Safe Indicator - Индикатор точности",
        "Loading Dock - Погрузочная платформа",
        "Cargo Lift - Грузовой лифт",
        "Street Market - Уличный рынок",
        "Freezing Point - Температура замерзания",
        "Hallway Fight - Дуэль в коридоре",
        "Inception Plan - План внедрения",
        "Dream Filter - Фильтр сновидений",
        "Subconscious Defense - Защита подсознания",
        "Tertiary Dream - Третичный уровень сна",
        "Secondary Dream - Вторичный уровень сна",
        "Primary Dream - Первый уровень сна",
        "Chemical Kick - Химический толчок",
        "Sedation Level - Уровень наркоза",
        "Extraction Cargo - Груз извлечения",
        "Mindmap Projection - Проекция ментальной карты",
        "Corporate Target - Корпоративная цель",
        "Businessman’s Briefcase - Портфель бизнесмена",
        "High Security - Повышенная охрана",
        "Boardroom Meeting - Заседание совета директоров"
    )


    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.primary)
        .padding(8.dp)
    ) { items(words) { pair ->
        Text(pair, color = MaterialTheme.colorScheme.onPrimary)
    } }
}