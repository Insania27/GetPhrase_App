package com.example.getphraseapp.UI_Objects.ScreensOfItems.Games

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun GodOfWarScreen(){

    val words = listOf(
        "Frost Giant - Ледяной гигант",
        "Dark Elf - Тёмный эльф",
        "Fire Troll - Огненный тролль",
        "River Pass - Речное ущелье",
        "Watchtower Ruins - Руины дозорной башни",
        "Mountain Peak - Горная вершина",
        "Temple Grounds - Территория храма",
        "Runic Crystal - Рунический кристалл",
        "World Serpent - Всемирный змей",
        "Dragon Scale - Чешуя дракона",
        "Valkyrie Wing - Крыло валькирии",
        "Guardian Shield - Щит защитника",
        "Wraith Form - Форма духа",
        "Chaos Flame - Пламя Хаоса",
        "Spartan Rage - Ярость спартанца",
        "Mist Veil - Завеса тумана",
        "Dwarven Steel - Дварфийская сталь",
        "Ancient Relic - Древняя реликвия",
        "Hidden Path - Скрытая тропа",
        "Sacred Grove - Священная роща",
        "Blighted Land - Осквернённая земля",
        "Sacrificial Altar - Жертвенный алтарь",
        "Lightning Strike - Удар молнии",
        "Thunder Clap - Раскат грома",
        "Frozen Lake - Замёрзшее озеро",
        "Ice Shard - Ледяная осколка",
        "Shadow Realm - Теневое царство",
        "Spirit Echo - Эхо духа",
        "Moonlit Shore - Лунный берег",
        "Sunken Ruins - Затонувшие руины",
        "Forgotten Vale - Забытая долина",
        "Elder Tree - Древний дуб",
        "Veiled Passage - Затенённый проход",
        "Misty Forest - Туманный лес",
        "Burning Plains - Горящие равнины",
        "Silent Cathedral - Безмолвный собор",
        "Emerald Grotto - Изумрудная пещера",
        "Shattered Keep - Разрушенная крепость",
        "Obsidian Blade - Обсидиановый клинок",
        "Molten Core - Расплавленное ядро",
        "Thunderous Roar - Громовой рев",
        "Eternal Flame - Вечное пламя",
        "Crimson Tide - Алая волна",
        "Frozen Wastes - Ледяная пустошь",
        "Iron Fortress - Железная крепость",
        "Silver Glaive - Серебряное копьё",
        "Golden Hall - Золотой зал",
        "Lost Sanctuary - Потерянное святилище",
        "Crumbling Bastion - Разрушающийся бастион",
        "Silent Watch - Бесшумное дозорство",
        "Twilight Grove - Сумеречная роща",
        "Echoing Halls - Зал звуковых эхо",
        "Vein of Ore - Руда жила",
        "Bloodied Battlefield - Окровавленное поле битвы",
        "Lone Wanderer - Одинокий странник",
        "Bound Spirit - Связанный дух",
        "Shimmering Veil - Мерцающая завеса",
        "Gilded Cage - Позолоченная клетка",
        "Cliffside Perch - Утёсная скалолазка",
        "Howling Winds - Воющий ветер"
    )


    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .background(MaterialTheme.colorScheme.primary)
        .padding(8.dp)
    ) { items(words) { pair ->
        Text(pair, color = MaterialTheme.colorScheme.onPrimary)
    } }

}



