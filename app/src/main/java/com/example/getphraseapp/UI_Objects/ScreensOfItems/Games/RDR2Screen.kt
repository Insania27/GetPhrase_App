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
import androidx.compose.ui.unit.dp

@Composable
fun RDR2Screen(){
    val words = listOf(
        "«We’re thieves in a world that don’t want us no more.» — «Мы воры в мире, который больше не нуждается в нас.»",
        "«When the time comes, you gotta run and don’t look back.» — «Когда придёт время, беги и не оглядывайся.»",
        "«Loyalty is all that matters.» — «Верность — это всё, что имеет значение.»",
        "«You don’t get to live a bad life and have good things happen to you.» — «Нельзя прожить плохую жизнь и ждать, что с тобой случится что-то хорошее.»",
        "«Some trees flourish, others die. Some cattle grow strong, others are taken by wolves.» — «Одни деревья цветут, другие гибнут. Одни быки крепнут, других уносят волки.»",
        "«Revenge is a fool’s game.» — «Месть — игра глупцов.»",
        "«We each deserve to choose our own path.» — «Каждый заслуживает право выбрать свой путь.»",
        "«The world don’t stop for no one.» — «Мир ни для кого не останавливается.»",
        "«You can’t fight gravity.» — «С гравитацией не поспоришь.»",
        "«Men are born, and then they’re formed.» — «Люди рождаются, а потом формируются.»",
        "«There’s a good man within you, but he is wrestling with a giant.» — «В тебе есть добро, но оно борется с великаном.»",
        "«You can’t erase the past. It lingers.» — «Прошлое не стереть. Оно остаётся с тобой.»",
        "«We’re ghosts of the past, haunting the future.» — «Мы призраки прошлого, преследующие будущее.»",
        "«Courage and being scared is the same thing.» — «Храбрость и страх — одно и то же.»",
        "«You can’t change what’s done.» — «Нельзя изменить то, что уже сделано.»",
        "«The best thing about dreams is that they don’t come true.» — «Самое лучшее в мечтах — то, что они не сбываются.»",
        "«You don’t build a barn, dumbhead. What do you think this is, 1785?» — «Сарай не строят, глупец. Ты в каком веке живёшь?»",
        "«The time for talk has passed. The Lord’s work must be done.» — «Время разговоров прошло. Пора действовать.»",
        "«You can’t help who you love.» — «Не выбираешь, кого любить.»",
        "«The law can’t stop what’s coming.» — «Закон не остановит то, что грядёт.»",
        "«A storm is coming, and we must survive it.» — «Надвигается буря, и мы должны её пережить.»",
        "«You can’t outrun the past.» — «От прошлого не убежишь.»",
        "«People don’t forget. Nothing gets forgiven.» — «Люди не забывают. Ничто не прощается.»",
        "«You can’t reason with the unreasonable.» — «С неразумным не договоришься.»",
        "«We’re bad men, but we ain’t them.» — «Мы плохие, но не такие, как они.»",
        "«The price of freedom is high.» — «Свобода стоит дорого.»",
        "«You can’t fight change.» — «Нельзя бороться с переменами.»",
        "«The road to hell is paved with good intentions.» — «Благими намерениями вымощена дорога в ад.»",
        "«You can’t kill your way out of this.» — «Убийствами отсюда не выбраться.»",
        "«The only thing that matters is who’s left standing.» — «Важно только то, кто останется на ногах.»",
        "«You can’t escape who you are.» — «Не убежишь от самого себя.»",
        "«The West is dying, and we’re its last relics.» — «Дикий Запад умирает, а мы — его последние реликвии.»",
        "«You can’t buy loyalty, but you can earn it.» — «Верность не купишь, но можно заслужить.»",
        "«The world’s a harsh place, but there’s beauty in it.» — «Мир жесток, но в нём есть красота.»",
        "«You can’t live with violence and expect peace.» — «Нельзя жить в насилии и ждать покоя.»",
        "«The sins of the past haunt the present.» — «Грехи прошлого преследуют настоящее.»",
        "«You can’t save everyone, but you can try.» — «Не всех спасти, но можно попытаться.»",
        "«The hardest thing in this world is to live in it.» — «Самое сложное в этом мире — жить в нём.»",
        "«You can’t outrun your demons.» — «От своих демонов не убежишь.»",
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