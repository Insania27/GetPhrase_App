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
fun TLOU2Screen(){
    val words = listOf(
        "Supply Locker - Снабженческий шкаф",
        "Upgrade Bench - Скамья улучшений",
        "Safe Room - Безопасная комната",
        "Listening Mode - Режим прослушивания",
        "Gas Mask - Противогаз",
        "Pressure Plate - Нажимная пластина",
        "Clicker Enemy - Кликер (враг)",
        "Infected Zone - Заражённая зона",
        "Collapsed Bridge - Обрушенный мост",
        "Abandoned Facility - Заброшенное сооружение",
        "Generator Room - Генераторная комната",
        "Water Filtration - Водоочистка",
        "Explosive Arrow - Взрывная стрела",
        "Silencer Attachment - Глушитель (насадка)",
        "Health Pack - Набор медикаментов",
        "Med Kit - Аптечка",
        "Rifle Scope - Прицел для винтовки",
        "Handgun Ammo - Патроны для пистолета",
        "Survival Knife - Выживательный нож",
        "Wooden Plank - Деревянная доска",
        "Metal Pipe - Металлическая труба",
        "Broken Elevator - Сломанный лифт",
        "Emergency Exit - Аварийный выход",
        "Security Gate - Защитные ворота",
        "Fire Escape - Пожарная лестница",
        "Apartment Complex - Жилой комплекс",
        "Shopping Mall - Торговый центр",
        "Blocked Passage - Заблокированный проход",
        "Shuttered Window - Заколоченное окно",
        "Overgrown Alley - Заросший переулок",
        "Park Entrance - Вход в парк",
        "Police Station - Полицейский участок",
        "Emergency Broadcast - Аварийная трансляция",
        "Roof Hatch - Люк на крыше",
        "Booby Trap - Ловушка",
        "Lone Survivor - Одинокий выживший",
        "Safe Passage - Безопасный маршрут",
        "Collapsed Building - Обрушенное здание",
        "Military Checkpoint - Военный блокпост",
        "Resistance Camp - Лагерь сопротивления",
        "Graffiti Wall - Стена с граффити",
        "Light Filter - Световой фильтр",
        "Rusted Door - Ржавая дверь",
        "Barricaded Room - Забаррикадированная комната",
        "Generator Switch - Переключатель генератора",
        "Battery Charger - Зарядное устройство",
        "Map Marker - Метка на карте",
        "Checkpoint Flag - Флаг контрольной точки",
        "Noise Maker - Шумовое устройство",
        "Flashlight Beam - Луч фонарика",
        "Communication Tower - Коммуникационная вышка",
        "Quiet Takedown - Бесшумное устранение",
        "Execution Strike - Удар добивания",
        "Stealth Attack - Стелс-атака",
        "Proximity Mine - Мина-ловушка",
        "Health Enhancement - Усиление здоровья",
        "Damage Booster - Усилитель урона",
        "Resource Scavenging - Сбор ресурсов",
        "Environmental Audio - Окружающий звук",
        "Smoke Bomb - Дымовая бомба"
    )


    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.primary)
        .padding(8.dp)
    ) { items(words) { pair ->
        Text(pair, color = MaterialTheme.colorScheme.onPrimary)
    } }
}