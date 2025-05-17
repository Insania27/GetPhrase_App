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
fun InterstellarScreen() {
    val words = listOf(
        "Wormhole Coordinates - Координаты червоточины",
        "Endurance Station - Станция «Эндюрэнс»",
        "Docking Maneuver - Манёвр стыковки",
        "Launch Window - Окно запуска",
        "Gravity Anomaly - Аномалия гравитации",
        "Time Dilation - Замедление времени",
        "Quantum Data - Квантовые данные",
        "Tesseract Structure - Структура тессеракта",
        "Event Horizon - Горизонт событий",
        "Black Hole - Чёрная дыра",
        "Gargantua Orbit - Орбита Гаргантюа",
        "Cryosleep Chamber - Камера криосна",
        "Higgs Particle - Частица Хиггса",
        "Plan B Colony - Колония «План Б»",
        "Atmospheric Entry - Вход в атмосферу",
        "Mission Log - Журнал миссии",
        "Dust Storm - Песчаная буря",
        "Ice Cloud - Ледяное облако",
        "Surface Gravity - Сила тяжести на поверхности",
        "Pressure Fluctuation - Колебание давления",
        "Data Relay - Передача данных",
        "Solar Radiation - Солнечное излучение",
        "Endurance Crew - Экипаж «Эндерэнс»",
        "Supply Pod - Запасной контейнер",
        "Communication Delay - Задержка связи",
        "Resource Cache - Тайник с ресурсами",
        "Orbital Station - Орбитальная станция",
        "Launch Abort - Аварийное прекращение запуска",
        "Thruster Burn - Включение двигателей",
        "Mission Briefing - Краткий инструктаж",
        "Field Manual - Полевой справочник",
        "Isolation Protocol - Протокол изоляции",
        "Reentry Procedure - Процедура повторного входа",
        "Emergency Beacon - Аварийный маяк",
        "Supply Depot - Склад снабжения",
        "Data Capsule - Капсула данных",
        "Navigation Console - Консоль навигации",
        "Biofoam Release - Выпуск биопены",
        "Survival Kit - Набор для выживания",
        "Docking Port - Стыковочный порт",
        "Command Module - Командный модуль",
        "Landing Zone - Зона посадки",
        "Vessel Trajectory - Траектория корабля",
        "Mission Parameters - Параметры миссии",
        "Environmental Scan - Сканирование окружения",
        "Cryo Timer - Таймер криосна",
        "Power Core - Энергетическое ядро",
        "Heat Shield - Тепловой щит",
        "Signal Flare - Сигнальный факел",
        "Supply Manifest - Реестр грузов",
        "Gravity Well - Гравитационная яма",
        "Astro Navigator - Астронавигация",
        "Orbital Insertion - Выход на орбиту",
        "Fuel Reserve - Топливный запас",
        "Docking Sequence - Последовательность стыковки",
        "Vacuum Exposure - Воздействие вакуума",
        "Lunar Surface - Поверхность Луны",
        "Command Interface - Интерфейс управления",
        "Payload Bay - Отсек полезной нагрузки",
        "Seismic Activity - Сейсмическая активность",
        "Pressure Suit - Скафандр",
        "Communication Uplink - Передача сигналов",
        "Data Encryption - Шифрование данных",
        "Trajectory Plot - Построение траектории",
        "Resupply Mission - Миссия пополнения запасов",
        "Astrophysics Lab - Лаборатория астрофизики",
        "Deep Space - Глубокий космос"
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