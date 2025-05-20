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


@Composable
fun AtomicHeartScreen(){

    val words = listOf(
        "Research Facility - Исследовательский комплекс",
        "Mechanical Assault - Механическое нападение",
        "Security Clearance - Уровень доступа",
        "Power Core - Электроядро",
        "Ammunition Cache - Тайник с боеприпасами",
        "Emergency Exit - Аварийная дверь",
        "Containment Breach - Нарушение изоляции",
        "Experimental Module - Экспериментальный модуль",
        "Medical Bay - Медицинский отсек",
        "Control Panel - Панель управления",
        "Robotic Companion - Робот-компаньон",
        "Infection Zone - Заражённая зона",
        "Production Line - Производственная линия",
        "Supply Depot - Склад снабжения",
        "Power Generator - Электростанция",
        "Observation Deck - Смотровая площадка",
        "Research Data - Исходные данные",
        "Lockdown Protocol - Протокол блокировки",
        "Security Drone - Охранный дрон",
        "Experimental Weapon - Экспериментальное оружие",
        "Thermal Vision - Тепловое зрение",
        "Radiation Leak - Утечка радиации",
        "Assembly Workshop - Цех сборки",
        "Concussion Blast - Ударная волна",
        "Mechanical Heart - Механическое сердце",
        "Prototype Armor - Прототип брони",
        "Surveillance Camera - Камера наблюдения",
        "Reactor Chamber - Реакторная камера",
        "Decontamination Zone - Зона дезактивации",
        "Nanite Infusion - Нанитная инфузия",
        "Combat Arena - Арена боя",
        "Hydraulic Press - Гидравлический пресс",
        "Digital Archive - Цифровой архив",
        "Emergency Broadcast - Аварийная трансляция",
        "Signal Jammer - Глушилка сигналов",
        "Navigation System - Навигационная система",
        "Energy Shield - Энергетический щит",
        "Critical Hit - Критический удар",
        "Manual Override - Ручное управление",
        "Pressure Valve - Предохранительный клапан",
        "Resource Extraction - Добыча ресурсов",
        "Mechanical Failure - Механическая неисправность",
        "Power Outage - Отключение питания",
        "Tactical Scanner - Тактический сканер",
        "Chemical Spill - Химический разлив",
        "Factory Floor - Заводской цех",
        "Industrial Complex - Промышленный комплекс",
        "Memory Fragment - Фрагмент памяти",
        "Transmission Signal - Передающий сигнал",
        "Robotic Limb - Роботизированная конечность",
        "Thermal Regulator - Терморегулятор",
        "Enemy Stronghold - Опорный пункт врага",
        "Skill Enhancement - Повышение навыков",
        "Workshop Terminal - Терминал мастерской",
        "Detonation Sequence - Последовательность подрыва",
        "Supply Chain - Цепочка поставок",
        "Lab Experiment - Лабораторный эксперимент",
        "Security Turret - Охранная турель",
        "Mechanical Servant - Механический слуга",
        "Emergency Response - Аварийное реагирование",
        "Code Fragment - Фрагмент кода",
        "Power Surge - Перегрузка мощности",
        "Robotic Core - Роботическое ядро",
        "Field Diagnosis - Полевое диагностирование",
        "Industrial Robot - Промышленный робот",
        "Prototype Test - Испытание прототипа",
        "Lab Assistant - Лаборант",
        "Machine Intelligence - Машинный интеллект",
        "Radiation Shield - Радиационный экран",
        "Control Center - Центр управления"
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