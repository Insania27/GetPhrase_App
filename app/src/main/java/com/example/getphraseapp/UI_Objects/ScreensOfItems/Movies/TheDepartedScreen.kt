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
fun TheDepartedScreen() {
    val words = listOf(
        "Undercover Agent - Под прикрытием",
        "State Trooper - Штатный полицейский",
        "Internal Affairs - Внутренние расследования",
        "Wiretap Warrant - Ордер на прослушку",
        "Dead Drop - Тайник для передачи",
        "Criminal Informant - Осведомитель",
        "Surveillance Operation - Операция наблюдения",
        "Confession Tape - Запись признания",
        "Interrogation Room - Комната допроса",
        "Booking Room - Комната оформления",
        "Mugshot Photo - Фотография задержанного",
        "Criminal Record - Судимость",
        "Plea Bargain - Сделка со следствием",
        "False Identity - Лживая личность",
        "Fake ID - Поддельное удостоверение",
        "Chain of Command - Иерархия руководства",
        "Criminal Enterprise - Преступное предприятие",
        "Stakeout Location - Место слежки",
        "Drop Point - Точка передачи",
        "Surveillance Footage - Видеозапись наблюдения",
        "Booking Number - Номер задержания",
        "Perjury Offense - Лжесвидетельство",
        "Confidential File - Конфиденциальное досье",
        "Police Badge - Полицейский жетон",
        "Criminal Charges - Обвинения",
        "Grand Jury - Большое жюри",
        "Courtroom Gallery - Зрительный зал суда",
        "Plea Deal - Уступка обвиняемого",
        "Conviction Record - Запись о признании виновным",
        "Misdemeanor Charge - Обвинение в правонарушении",
        "Felony Count - Статья по тяжкому преступлению",
        "Undercover Operation - Операция под прикрытием",
        "Criminal Syndicate - Преступный синдикат",
        "FBI Informant - Осведомитель ФБР",
        "Lineup Identification - Опознание по ряду",
        "Surveillance Van - Фургон наблюдения",
        "Wiretap Room - Комната для прослушки",
        "Prison Cell - Тюремная камера",
        "Criminal Justice - Уголовное правосудие",
        "Interrogation Techniques - Методы допроса",
        "Fingerprint Evidence - Отпечатки пальцев",
        "Ballistics Report - Баллистический отчёт",
        "Criminal Profile - Профиль преступника",
        "Undercover Alias - Подпольное имя",
        "Evidence Locker - Арсенал улик",
        "Police Commissioner - Комиссар полиции",
        "Lieutenant’s Office - Кабинет лейтенанта",
        "Rat on the Inside - Крысa внутри",
        "Conviction Hearing - Заседание по вынесению приговора",
        "Suspect Sketch - Фоторобот подозреваемого",
        "Criminal Defense - Защита обвиняемого",
        "Witness Protection - Программа защиты свидетелей",
        "Crime Scene - Место преступления",
        "Parking Garage - Подземный гараж",
        "Boat Storage - Ангар для лодок",
        "Public Safety - Общественная безопасность",
        "License Plate - Номерной знак",
        "Cell Phone Tap - Прослушивание мобильного",
        "Traffic Stop - Остановка по нарушению",
        "Search Warrant - Ордер на обыск",
        "Evidence Bag - Пакет для улик",
        "Police Cruiser - Полицейский автомобиль",
        "Roll Call - Перекличка",
        "Shift Change - Смена дежурства"
    )


    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.primary)
        .padding(8.dp)
    ) { items(words) { pair ->
        Text(pair, color = MaterialTheme.colorScheme.onPrimary)
    } }
}