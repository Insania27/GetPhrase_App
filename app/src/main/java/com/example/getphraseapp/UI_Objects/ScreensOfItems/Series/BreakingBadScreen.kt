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
fun BreakingBadScreen(){
    val words = listOf(
        "Heisenberg — Хайзенберг",
        "Blue Sky — Голубое небо",
        "RV Meth Lab — Передвижная лаборатория мета",
        "Los Pollos Hermanos — Лос Поллос Эрманос",
        "Tread Lightly — Иди осторожно",
        "Say My Name — Назови моё имя",
        "Flynn’s Breakfast — Завтрак Флинна",
        "SchraderBrau — Пиво Шрейдера",
        "Gray Matter — Грей Мэттер",
        "Crystal Ship — Кристальный корабль",
        "Gus Fring’s Demise — Гибель Гаса Фринга",
        "Pink Teddy Bear — Розовый плюшевый мишка",
        "Dead Eyed Cousins — Кузены с мёртвым взглядом",
        "Pizza on the Roof — Пицца на крыше",
        "Magnets Scam — Афера с магнитами",
        "Ricin Cigarette — Сигарета с рицином",
        "Tight Tight Tight! — Круто, круто, круто!",
        "Empire Business — Имперские дела",
        "Walt’s Hat — Шляпа Уолта",
        "Jesse’s Confession — Признание Джесси",
        "Jane’s Overdose — Передозировка Джейн",
        "Fly in the Lab — Муха в лаборатории",
        "Pollos Hermanos Fryer — Фритюрница «Лос Поллос»",
        "Box Cutter — Канцелярский нож",
        "Tuco’s Hideout — Убежище Туко",
        "Lily of the Valley — Ландыш",
        "Hazard Pay — Опасные деньги",
        "Crawl Space — Подпол",
        "Face Off — Схватка",
        "Dead Freight — Мёртвый груз",
        "Gliding Over All — Паря над всем",
        "Ozymandias — Озимандия",
        "Felina — Филена",
        "W.W. — У.У.",
        "Cap’n Cook — Кэпн Кук",
        "Badger’s Star Trek — Стартрек Баджер",
        "Skinny Pete’s Piano — Пианино Скинни Пита",
        "Vacuum Cleaner Guy — Человек с пылесосом",
        "Saul’s Caddy — Кадиллак Сола",
        "Walt’s Fugue State — Состояние бегства Уолта",
        "Jesse’s «Yeah Science!» — «Да, наука!» Джесси",
        "Gale’s Coffee — Кофе Гейла",
        "Mike’s «Half Measures» — «Полумеры» Майка",
        "Hank’s Mineral Collection — Коллекция минералов Хэнка",
        "Marie’s Purple — Фиолетовый цвет Мари",
        "Skyler’s «I F*cked Ted» — «Я трахалась с Тедом» Скайлер",
        "Walt Jr.’s Cereal — Хлопья Уолта-младшего",
        "Los Cuates de Sinaloa — Куатес де Синалоа",
        "Vamonos Pest — «Вамонос Пест»",
        "Lydia’s Stevia — Стевия Лидии",
        "Todd’s Infatuation — Увлечение Тодда",
        "Jack’s Gang — Банда Джека",
        "«I Am the Danger!» — «Я — опасность!»",
        "«We’re Done When I Say We’re Done» — «Закончим, когда я скажу»",
        "«No Half Measures» — «Никаких полумер»",
        "«A Man Provides» — «Мужчина обеспечивает»",
        "«Tread Lightly» — «Ступай осторожно»",
        "«I Did It For Me» — «Я сделал это для себя»",
        "«You’re Goddamn Right» — «Чёрт возьми, точно»",
        "«Stay Out of My Territory» — «Не лезь на мою территорию»",
        "«Someone Has to Protect This Family» — «Кто-то должен защищать семью»",
        "«The One Who Knocks» — «Тот, кто стучится»",
        "«Chemistry Is the Study of Change» — «Химия — наука о переменах»",
        "«Better Safe Than Sorry» — «Лучше перестраховаться»",
        "«This Is Not Meth» — «Это не мет»",
        "«Wire» — Провод (код операции)",
        "«The Empire Is Falling» — «Империя рушится»",
        "«Full Measure» — Полная мера",
        "«Rabid Dog» — Бешеная собака",
        "«To’hajiilee» — Тохаджиилли",
        "«Granite State» — Гранитный штат",
        "«Breaking Bad» — Поворот к худшему",
        "«The Cost of Doing Business» — Цена бизнеса",
        "«Crystal Blue Persuasion» — Искушение голубым кристаллом",
        "«Meth Damon» — Мет Дэймон (прозвище Тодда)",
        "«The Cousins» — Кузены",
        "«Gus’s Revenge» — Месть Гаса",
        "«Walt’s Lie» — Ложь Уолта",
        "«Jesse’s Redemption» — Искупление Джесси",
        "«Hank’s Downfall» — Падение Хэнка",
        "«The Whites’ House» — Дом Уайтов",
        "«Car Wash Money» — Деньги с автомойки",
        "«The Superlab» — Суперлаборатория",
        "«The Desert Shootout» — Перестрелка в пустыне",
        "«The Lily of the Valley Plan» — План с ландышем",
        "«Walt’s Final Confession» — Последнее признание Уолта",
        "«Jesse’s Box» — Коробка Джесси",
        "«The Crawl Space Laugh» — Смех в подполе",
        "«The Money Barrel» — Бочка с деньгами",
        "«The Heisenberg Hat» — Шляпа Гейзенберга",
        "«Goodbye, Lydia» — Прощай, Лидия",
        "«The Machine Gun Trunk» — Пулемёт в багажнике",
        "«The «Felina» Finale» — Финал «Филени»",
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