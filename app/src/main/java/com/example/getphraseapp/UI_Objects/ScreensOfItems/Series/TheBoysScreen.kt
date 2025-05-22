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
fun TheBoysScreen(){
    val words = listOf(
        "Homelander — Хоумлендер",
        "Billy Butcher — Билли Батчер",
        "The Seven — Семёрка",
        "Compound V — Компаунд V",
        "Starlight — Старлайт",
        "Queen Maeve — Королева Маэв",
        "The Deep — Глубокий",
        "A-Train — Э-Трейн",
        "Black Noir — Блэк Нуар",
        "Vought International — Корпорация «Вогт»",
        "Frenchie — Френчи",
        "Mother’s Milk — Мазерс Милк (Молочник)",
        "Hughie Campbell — Хьюи Кэмпбелл",
        "Supe Terror — Террор суперов",
        "Herogasm — Герогазм",
        "Lamplighter — Ламплайтер",
        "Stormfront — Штормфронт",
        "Translucent — Транслюцент",
        "Payback — Отряд «Расплата»",
        "«Diabolical» — «Дьявольский»",
        "«I Can Do Whatever I Want» — «Я могу всё, что захочу»",
        "«The Real Heroes Are Dead» — «Настоящие герои мертвы»",
        "«You’re the Real Hero» — «Ты настоящий герой»",
        "«F**king Diabolical» — «Жесть, как дьявольски»",
        "«I’ll Laser You!» — «Я тебя лазером!»",
        "«We’re Gods» — «Мы боги»",
        "«Girls Get It Done» — «Девчонки справятся»",
        "«Not a Team Player» — «Не командный игрок»",
        "«The Boys vs. The Seven» — «Пацаны против Семёрки»",
        "«Voughtland» — «Вогтленд»",
        "«Temp V» — «Временный V»",
        "«Supe Nazis» — «Суперы-нацисты»",
        "«Laser Baby» — «Лазерный младенец»",
        "«The Legend» — «Легенда» (информатор)",
        "«Capes Are the New Cops» — «Плащи — новые полицейские»",
        "«Supe Lives Matter» — «Жизни суперов важны»",
        "«The Bloody Doors Off» — «Срывать кровавые двери»",
        "«Butcher’s Revenge» — «Месть Батчера»",
        "«Mallory’s Team» — «Команда Маллори»",
        "«Red River Institute» — «Институт Ред-Ривер»",
        "«Sister Sage» — «Сестра Мудрость»",
        "«Tek Knight» — «Тек Найт»",
        "«Blue Hawk» — «Синий Ястреб»",
        "«The Truth About Soldier Boy» — «Правда о Солдате»",
        "«Crimson Countess» — «Багровая графиня»",
        "«Mindstorm» — «Мозговой шторм»",
        "«Headpopper» — «Взрыватель голов»",
        "«Supe Virus» — «Вирус для суперов»",
        "«Victoria Neuman’s Secret» — «Секрет Виктории Нойман»",
        "«The Boys’ Safehouse» — «Убежище Пацанов»",
        "«Vought Tower» — «Башня Вогт»",
        "«Fight in the Sky» — «Бой в небе»",
        "«Homelander’s Milk Obsession» — «Страсть Хоумлендера к молоку»",
        "«Starlight’s Glow» — «Свечение Старлайт»",
        "«A-Train’s Heart» — «Сердце Э-Трейна»",
        "«The Deep’s Gills» — «Жабры Глубокого»",
        "«Black Noir’s Mask» — «Маска Блэк Нуара»",
        "«Frenchie’s Weapons» — «Оружие Френчи»",
        "«Hughie’s Guilt» — «Чувство вины Хьюи»",
        "«Butcher’s «C*nt» Speech» — «Речь Батчера про «мр*зей»»",
        "«Ryan’s Powers» — «Способности Райана»",
        "«Grace’s Betrayal» — «Предательство Грейс»",
        "«Terror at Herogasm» — «Ужас на Герогазме»",
        "«The Boys’ Van» — «Фургон Пацанов»",
        "«Supe Fight Club» — «Бойцовский клуб суперов»",
        "«Termite’s Disaster» — «Катастрофа Термита»",
        "«The Whale Incident» — «Инцидент с китом»",
        "«Victoria’s Headpop» — «Взрывы голов от Виктории»",
        "«Homelander’s Mirror Scene» — «Сцена Хоумлендера у зеркала»",
        "«Stormfront’s Past» — «Прошлое Штормфронт»",
        "«Maeve’s Sacrifice» — «Жертва Маэв»",
        "«Butcher’s «I’ll Kill You»» — ««Я тебя убью» Батчера»",
        "«Hughie’s Rage» — «Ярость Хьюи»",
        "«The Truth About Compound V» — «Правда о Компаунде V»",
        "«Vought’s Propaganda» — «Пропаганда Вогт»",
        "«Church of the Collective» — «Церковь Коллектива»",
        "«The Female of the Species» — «Самка вида»",
        "«Butcher’s Final Plan» — «Последний план Батчера»",
        "«Homelander’s Public Meltdown» — «Публичный срыв Хоумлендера»",
        "«Starlight’s Rebellion» — «Бунт Старлайт»",
        "«The Boys’ Last Stand» — «Последний бой Пацанов»",
        "«Supe Detector» — «Детектор суперов»",
        "«Billy’s Revenge on Soldier Boy» — «Месть Батчера Солдату»",
        "«Ryan’s Choice» — «Выбор Райана»",
        "«The «Lamborghini» Scene» — «Сцена с «Ламборгини»»",
        "«Kimiko’s Dance» — «Танец Кимико»",
        "«Hughie’s Super Suit» — «Суперкостюм Хьюи»",
        "«Butcher’s «No More Lies»» — ««Хватит лжи» Батчера»",
        "«Homelander’s «I’m the Homelander»» — ««Я — Хоумлендер»»",
        "«The «Supe-Natural» Disaster» — ««Супер-естественная» катастрофа»",
        "«Vought’s Cover-Ups» — «Прикрытия Вогт»",
        "«The Boys’ «F*ck Supes»» — ««Нафиг суперов» Пацанов»",
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