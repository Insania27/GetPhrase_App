package com.example.getphraseapp.UI_Objects.ScreensOfItems.Series

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
fun YellowstoneScreen(){
    val words = listOf(
        "Yellowstone Dutton Ranch — Ранчо Даттонов «Йеллоустон»",
        "John Dutton’s Code — Кодекс Джона Даттона",
        "«This is Yellowstone. They kill kings here.» — «Это Йеллоустон. Здесь убивают королей.»",
        "Livestock Agent — Агент по охране скота",
        "Rip Wheeler’s Loyalty — Преданность Рипа Уилера",
        "Branding — Клеймение (знак лояльности)",
        "Beth Dutton’s War — Война Бет Даттон",
        "Broken Rock Indian Reservation — Индейская резервация Брокен-Рок",
        "Jamie’s Ambition — Амбиции Джейми",
        "Market Equities — Корпорация «Маркет Эквитис»",
        "Train Station — Поездная станция (место расправ)",
        "«The Cowboy Way» — «Путь ковбоя»",
        "Paradise Valley — Долина Парадайз",
        "Bunkhouse — Барак (жильё ковбоев)",
        "Kayce’s Conflict — Внутренний конфликт Кейси",
        "Governor’s Seat — Кресло губернатора",
        "Monica’s Struggle — Борьба Моники",
        "«You’re the trailer park. I’m the tornado.» — «Ты трейлерный парк. Я — торнадо.» (Бет)",
        "Summer Higgins’ Protest — Протесты Саммер Хиггинс",
        "Dan Jenkins’ Schemes — Интриги Дэна Дженкинса",
        "«The Brand» — Клеймо (символ преданности)",
        "Jimmy’s Redemption — Искупление Джимми",
        "4-6-0 — Цифры (код мести)",
        "«I’ll See You in Hell» — «Увидимся в аду»",
        "Bison vs. Cattle — Бизоны против скота",
        "Thomas Rainwater’s Revenge — Месть Томаса Рейнуотера",
        "Corporate Land Grab — Корпоративный захват земель",
        "«You don’t negotiate with cancer.» — «С раком не договариваются.» (Джон)",
        "Teeter’s Arrival — Появление Титер",
        "Walker’s Guitar — Гитара Уокера",
        "«Y’all are the Indians now.» — «Теперь вы индейцы.»",
        "Lynelle Perry’s Politics — Политика Линнелл Перри",
        "Beck Brothers — Братья Бек",
        "Ranch vs. World — Ранчо против всего мира",
        "«The Great Battle» — «Великая битва»",
        "Roarke’s Greed — Жадность Руарка",
        "Garrett Randall’s Return — Возвращение Гаррета Рэндалла",
        "«The Dutton Curse» — «Проклятие Даттонов»",
        "Tate’s Trauma — Травма Тейта",
        "«This Land Is My Legacy» — «Эта земля — моё наследие»",
        "Yellowstone Brand — Бренд «Йеллоустон»",
        "John’s «No Compromise» — «Никаких компромиссов» Джона",
        "Beth’s «Burn It All» — «Сжечь всё» Бет",
        "«Cowboys and Indians» — «Ковбои и индейцы»",
        "«The End of Us» — «Конец нас»",
        "Ranch Hand Loyalty — Верность ковбоев",
        "«You Cross Me, You Die» — «Перейдёшь мне дорогу — умрёшь»",
        "Land Developers — Застройщики",
        "«The Yellowstone Way» — «Метод Йеллоустона»",
        "Rodeo Danger — Опасности родео",
        "«The King of Nothing» — «Король ничего»",
        "Family Feuds — Семейные распри",
        "«Blood on the Land» — «Кровь на земле»",
        "«Legacy Over Everything» — «Наследие важнее всего»",
        "«The Last Stand» — «Последний рубеж»",
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