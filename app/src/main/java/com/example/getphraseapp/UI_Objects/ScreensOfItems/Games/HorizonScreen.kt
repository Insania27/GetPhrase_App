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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Preview(showBackground = true)
@Composable
fun HorizonScreen(){
    val words = listOf(
        "Tallneck - Высокошея",
        "Focus Lens - Линза фокуса",
        "Metal Flower - Металлический цветок",
        "Cauldron Facility - Установка «Котёл»",
        "Resource Cache - Ресурсный тайник",
        "Supply Cache - Снабженческий тайник",
        "Ancient Vessel - Древний корабль",
        "Sunken Harbor - Затонувшая гавань",
        "Overgrown Ruins - Заросшие руины",
        "Shattered Coastline - Разбитая береговая линия",
        "Electrified Water - Электрифицированная вода",
        "Poison Dart - Ядовитый дротик",
        "Distress Signal - Сигнал бедствия",
        "Listening Device - Слушающее устройство",
        "Surplus Parts - Излишки деталей",
        "Storm Damage - Повреждения от шторма",
        "Emergency Broadcast - Аварийная трансляция",
        "Data Fragment - Фрагмент данных",
        "Memory Shard - Осколок памяти",
        "Skill Upgrade - Улучшение навыка",
        "Weapon Slot - Слот для оружия",
        "Reload Time - Время перезарядки",
        "Health Booster - Усилитель здоровья",
        "Energy Cell - Энергетическая ячейка",
        "Armor Plating - Бронированная пластина",
        "Prototype Core - Прототип ядра",
        "Field Medic - Полевой медик",
        "Signal Relay - Релейный передатчик",
        "Hazardous Zone - Опасная зона",
        "Navigation Map - Карта навигации",
        "Trail Marker - Маркер маршрута",
        "Environmental Toxicity - Экологическая токсичность",
        "Resource Extraction - Добыча ресурсов",
        "Salvage Operation - Операция по спасению",
        "Community Settlement - Поселение общины",
        "Hunter’s Bow - Лук охотника",
        "Tripcaster Trap - Ловушка траекткастера",
        "Charge Shot - Заряженный выстрел",
        "Blast Sling - Огневая рогатка",
        "Fire Arrow - Огненная стрела",
        "Shock Bomb - Электрошоковая бомба",
        "Elemental Burst - Стихийный взрыв",
        "Precision Strike - Точный удар",
        "Critical Hit - Критический удар",
        "Stealth Kill - Стелс‑убийство",
        "Override Control - Управление захватом",
        "Machine Heart - Сердце машины",
        "Hidden Cache - Скрытый тайник",
        "Energy Cascade - Энергетический каскад",
        "Magnetic Field - Магнитное поле",
        "Radioactive Spill - Радиоактивный разлив",
        "Radio Signal - Радиосигнал",
        "Power Core - Ядро питания",
        "Supply Depot - Склад снабжения",
        "Restoration Zone - Зона восстановления",
        "Echo Locator - Эхо-локатор",
        "Divergence Point - Точка расхождения",
        "Communication Tower - Башня связи",
        "Trading Post - Торговый пункт"
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