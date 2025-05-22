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
fun TheOfficeScreen(){
    val words = listOf(
        "Scranton Branch — Скрэнтонский филиал",
        "Dunder Mifflin Paper Company — Бумажная компания «Дандер Миффлин»",
        "Michael’s Dundie Awards — Награды «Данди» Майкла",
        "«That’s What She Said» — «Так она сказала»",
        "Conference Room Meetings — Совещания в переговорке",
        "Jim’s Pranks — Шутки Джима",
        "Dwight’s Beet Farm — Свекольная ферма Дуайта",
        "Bears, Beets, Battlestar Galactica — Медведи, свёкла, «Звёздный крейсер „Галактика»",
        "Pretzel Day — День крендельков",
        "Kevin’s Chili — Перечное чили Кевина",
        "Michael’s «Parkour» — «Паркур!» Майкла",
        "«The Fire» — Пожар в офисе",
        "Jim & Pam’s Romance — Роман Джима и Пэм",
        "«Identity Theft Is Not a Joke» — «Кража личных данных — не шутка»",
        "Dwight’s Stapler in Jell-O — Степлер Дуайта в желе",
        "«Boom, Roasted» — «Бум, поджарено»",
        "Michael’s Movie — Фильм Майкла («Уровень угрозы: Полночь»)",
        "«Dwight, You’re My Best Friend» — «Дуайт, ты мой лучший друг»",
        "Angela’s Cats — Кошки Анджелы",
        "Kevin’s Famous Chili Incident — Знаменитый инцидент с чили Кевина",
        "«The Dundies» — Церемония «Данди»",
        "Michael’s Declaration of Bankruptcy — «Объявляю себя банкротом!»",
        "Jim’s «PB&J» — Бутерброд с арахисовым маслом и джемом Джима",
        "«Pretend I’m Talking» — «Притворись, что я говорю»",
        "Dwight’s Survival Instincts — Инстинкты выживания Дуайта",
        "«Scott’s Tots» — «Скоттс Тотс» (эпизод с обещаниями)",
        "Toby’s HR Desk — Стол Тоби из отдела кадров",
        "Michael’s World’s Best Boss Mug — Кружка «Лучший босс на свете»",
        "«The Injury» — Травма (эпизод с грилем)",
        "Dwight’s Fake Fire Drill — Фальшивая учебная тревога Дуайта",
        "Kelly’s Drama — Драмы Келли",
        "Ryan’s «WUPHF» — «ВУФ» Райана",
        "Michael’s «NO! GOD! NO!» — «НЕТ! БОЖЕ! НЕТ!»",
        "«Did I Stutter?» — «Я заикаюсь?»",
        "Pam’s Art Show — Выставка картин Пэм",
        "Kevin’s Turtle — Черепаха Кевина",
        "«The Dinner Party» — Званый ужин (эпизод у Майкла)",
        "Michael’s Plasma TV — Плазменный телевизор Майкла",
        "Dwight’s Assistant to the Regional Manager — Помощник регионального менеджера",
        "«That’s a $200 Plasma Screen TV» — «Это плазма за 200 баксов»",
        "Jim’s «Asian Jim» Prank — Шутка «Азиат Джим»",
        "«Why Use Many Word When Few Do Trick?» — «Зачем много слов, если хватит и нескольких?»",
        "Michael’s Goodbye Song — Прощальная песня Майкла",
        "«The Lazy Scranton» — «Ленивый Скрэнтон» (рэп)",
        "Dwight’s Hay Place — Сеновал Дуайта",
        "«It’s Britney, Bitch» — «Это Бритни, сучка»",
        "Michael’s Golden Ticket Idea — Золотые билеты Майкла",
        "Pam’s Dunder Mifflin Infinity — «Дандер Миффлин Инфинити» Пэм",
        "Kevin’s M&Ms — M&M’s Кевина",
        "«The Dundie for Hottest in the Office» — «Данди» за сексуальность",
        "Michael’s «I Declare Bankruptcy!» — «Объявляю банкротство!»",
        "Jim’s «False Ceiling» — Фальшивый потолок Джима",
        "Dwight’s Recyclops — «Ресайклопс» Дуайта",
        "«The Michael Scott Paper Company» — «Бумажная компания Майкла Скотта»",
        "Phyllis’ Wedding — Свадьба Филлис",
        "«Secret Santa» — Тайный Санта (рождественский эпизод)",
        "Michael’s «Date Mike» — «Майк-Кавалер»",
        "Jim’s «New Job» — Новая работа Джима",
        "Dwight’s Battlestar Galactica Speech — Речь Дуайта о «Звёздном крейсере»",
        "«Creed’s Blog» — Блог Крида",
        "«Suck It!» — «Соси!» (реплика Дуайта)",
        "Michael’s «That’s What She Said» Overuse — Злоупотребление фразой «Так она сказала»",
        "«The Merger» — Слияние филиалов",
        "Jim’s «Bed Bug» Prank — Шутка с клопами",
        "Dwight’s Perfect Crime — Идеальное преступление Дуайта",
        "«The Carpet» — Ковёр (эпизод с запахом)",
        "Michael’s «Survivor Man» — «Человек-выживальщик»",
        "«Niagara» — Ниагара (свадьба Джима и Пэм)",
        "«Threat Level Midnight» — «Уровень угрозы: Полночь»",
        "Dwight’s Fire Safety Obsession — Одержимость Дуайта пожарной безопасностью",
        "«Goodbye, Michael» — «Прощай, Майкл»",
        "«Finale» — Финал сериала",


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