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
fun FightClubScreen(){
    val words = listOf(
        "support group - группа поддержки",
        "fight club - бойцовский клуб",
        "paper street house - дом на Бумажной улице",
        "soap factory - мыловарня",
        "chemical properties - химические свойства",
        "credit card debt - задолженность по кредитной карте",
        "dental plan - план стоматологического обслуживания",
        "auto insurance - автостраховка",
        "airplane bathroom - туалет самолёта",
        "bar fight - драка в баре",
        "project mayhem - проект «Хаос»",
        "membership rules - правила членства",
        "single‑serving friends - одноразовые друзья",
        "homeless shelter - приют для бездомных",
        "sabotage plan - план саботажа",
        "exploding head syndrome - синдром взрывающейся головы",
        "chemical burn - химический ожог",
        "soap bar - брусок мыла",
        "empty room - пустая комната",
        "broken mirror - разбитое зеркало",
        "rented apartment - арендованная квартира",
        "street address - уличный адрес",
        "confidential file - конфиденциальный файл",
        "security breach - нарушение безопасности",
        "author’s identity - личность автора",
        "hidden basement - скрытый подвал",
        "emergency exit - аварийный выход",
        "nightstand drawer - ящик прикроватной тумбочки",
        "parking voucher - парковочный талон",
        "hotel lobby - холл отеля",
        "rental agreement - договор аренды",
        "cigarette ashtray - пепельница для сигарет",
        "coffee stain - пятно от кофе",
        "movie theater - кинотеатр",
        "credit line - кредитная линия",
        "support meeting - встреча поддержки",
        "anonymous participant - анонимный участник",
        "emotional breakdown - эмоциональный срыв",
        "late payment fee - штраф за просрочку",
        "urban apartment - городская квартира",
        "office building - офисное здание",
        "grotesque sculpture - гротескная скульптура",
        "random encounter - случайная встреча",
        "masked identity - скрытая личность",
        "public restroom - общественный туалет",
        "voting ballot - избирательный бюллетень",
        "broken record - заевшая пластинка",
        "night vision goggles - очки ночного видения",
        "state of mind - состояние духа",
        "unanswered call - пропущенный звонок",
        "burn notice - уведомление об отзыве",
        "worn‑out jacket - изношенная куртка",
        "faded photograph - выцветшая фотография",
        "expired membership - просроченное членство",
        "paper trail - бумажный след",
        "daily routine - ежедневная рутина",
        "safety helmet - защитный шлем",
        "jury duty - общественные работы присяжным",
        "rental car - арендованный автомобиль",
        "detached garage - отдельный гараж",
        "station wagon - универсал",
        "mismatched socks - разнобой носков"
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