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
fun BetterCallSaulScreen(){
    val words = listOf(
        "Pro Bono Case — Дело на безвозмездной основе",
        "Mesa Verde Bank — Банк «Меса Верде»",
        "Bar Hearing — Судебное разбирательство по лицензии адвоката",
        "Sandpiper Case — Дело «Сэндпайпер»",
        "Conflict of Interest — Конфликт интересов",
        "Document Forgery — Подделка документов",
        "Disbarment — Лишение адвокатской лицензии",
        "Criminal Defense — Защита по уголовным делам",
        "Client Privilege — Адвокатская тайна",
        "Plea Deal — Сделка о признании вины",
        "Cartel Connection — Связи с картелем",
        "Money Laundering — Отмывание денег",
        "Drop Phone — Одноразовый телефон",
        "Dead Drops — Тайники для передачи информации",
        "Cicero Crew — Банда из Чикаго",
        "Wire Fraud — Мошенничество с использованием связи",
        "Ice Station Zebra — Ледовая станция «Зебра»",
        "Squat Cobbler — «Пирог с приседанием»",
        "The Disappearer — «Исчезновидец»",
        "Pollos Hermanos Front — Прикрытие через «Лос Поллос Эрманос»",
        "Cinnabon Omaha — Синнабон в Омахе",
        "HHM Law Firm — Юридическая фирма HHM",
        "Los Pollos Hermanos — «Лос Поллос Эрманос»",
        "The Car Wash — Автомойка",
        "Desert Meetup — Встречи в пустыне",
        "Parking Lot Booth — Будка на парковке",
        "Courtroom Drama — Судебные разбирательства",
        "Veterinary Clinic — Ветеринарная клиника",
        "JMM Office — Офис JMM",
        "«It’s Showtime!» — «Пора начинать шоу!»",
        "«Better Call Saul!» — «Лучше звоните Солу!»",
        "«S’all good, man!» — «Всё пучком, чувак!»",
        "Legal Shenanigans — Юридические махинации",
        "Brotherly Rivalry — Братское соперничество",
        "Burner Phone Empire — Сеть одноразовых телефонов",
        "Tuco’s Temper — Вспышки гнева Туко",
        "«Know Your Client» — «Знай своего клиента»",
        "Blue Meth Blueprint — Схема синего мета",
        "Rainy Night Scheme — Ночная афера под дождём",
        "Bingo Board — Доска с «бинго»",
        "Montage Scam — Монтаж аферы",
        "Davis & Main Mug — Кружка «Дэвис энд Мейн»",
        "Zafiro Añejo Bottle — Бутылка «Сафиро Аньехо»",
        "VHS Tape Evidence — Видеокассета-улика",
        "Coushatta Letters — Письма из Кушатты",
        "Piñata Store — Магазин пиньят",
        "Space Blanket — Термоодеяло",
        "Ice Cream Truck — Фургон с мороженым",
        "Ringtone Jingle — Джингл рекламы",
        "«I’m not a bad guy.» — «Я не плохой человек.»",
        "«The winner takes it all.» — «Победитель получает всё.»",
        "«You’re always down.» — «Ты вечно в пролёте.»",
        "«Legacy is everything.» — «Наследие — это всё.»",
        "«Lightning bolts shoot from my fingertips!» — «Молнии из пальцев!»",
        "Legal Loophole — Юридическая лазейка",
        "Evidence Tampering — Фальсификация доказательств",
        "Jury Manipulation — Манипуляция присяжными",
        "Blackmail Tape — Компромат на плёнке",
        "Squat Code — Код «приседаний»",
        "Sandpiper Settlement — Мировое соглашение по «Сэндпайпер»",
        "Kettleman Scam — Афера с Кеттлманами",
        "Salamanca Threat — Угроза от Саламанки",
        "Cartel Payoff — Выплаты картелю",
        "Bribe Envelope — Конверт с взяткой",
        "Safe House — Убежище",
        "Fake Identity — Поддельная личность",
        "Wexler-McGill Dynamic — Динамика Уэкслер-МакГилл",
        "Slippin’ Jimmy Reputation — Репутация «Джимми-Проныры»",
        "Courtroom Hustle — Судебная хитрость",
        "Legal Ethics Hearing — Разбирательство по этике",
        "Criminal Underworld — Преступный мир",
        "Alibi Fabrication — Создание алиби",
        "Secret Meeting — Тайная встреча",
        "Double Cross — Двойная игра",
        "Evidence Room — Комната с уликами",
        "Witness Intimidation — Запугивание свидетеля",
        "Jailhouse Deal — Сделка в тюрьме",
        "Paper Trail — Бумажный след",
        "Cover-Up Operation — Операция по сокрытию",
        "Backroom Deal — Закулисная сделка",
        "Legal Redemption — Юридическое искупление",
        "Moral Ambiguity — Моральная неоднозначность",
        "Power Play — Борьба за власть",
        "Downfall Arc — Путь к падению",
        "Surveillance Van — Фургон слежки",
        "Flashback Motif — Мотив воспоминаний",
        "Symbolic Cinnabon — Символика Синнабона",
        "Breaking Point — Точка невозврата"
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