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
fun TLOUScreen(){
    val words = listOf(
        "«Endure and survive.» — «Терпи и выживай.»",
        "«Everyone I have cared for has either died or left me.» — «Все, кого я любил, либо умерли, либо бросили меня.»",
        "«You have no idea what loss is.» — «Ты не представляешь, что такое потеря.»",
        "«It’s called luck, and it is gonna run out.» — «Это называется везением, и оно закончится.»",
        "«After all we’ve been through. Everything that I’ve done. It can’t be for nothing.» — «После всего, через что мы прошли. Всего, что я сделал. Это не может быть напрасно.»",
        "«Things happen, and we move on.» — «Что-то происходит, и мы идём дальше.»",
        "«I’m not her, Joel.» — «Я не она, Джоэл.»",
        "«You keep finding something to fight for.» — «Ты продолжаешь находить то, за что стоит бороться.»",
        "«The world is a dangerous place, Ellie.» — «Мир опасен, Элли.»",
        "«We don’t have to do this. We can go back.» — «Нам не обязательно это делать. Мы можем вернуться.»",
        "«I’m scared of ending up alone.» — «Я боюсь остаться одной.»",
        "«This is your story. It’ll be over soon.» — «Это твоя история. Скоро всё закончится.»",
        "«Why are people so cruel?» — «Почему люди такие жестокие?»",
        "«I’m still waiting for my turn.» — «Я всё жду своей очереди.»",
        "«You’re right. You’re not my daughter.» — «Ты права. Ты не моя дочь.»",
        "«Swear to me. Swear to me that everything you said is true.» — «Поклянись мне. Поклянись, что всё, что ты сказал, — правда.»",
        "«We’re shitty people, Joel. It’s been that way for a long time.» — «Мы ужасные люди, Джоэл. И такими были всегда.»",
        "«The fireflies were supposed to save us.» — «Светлячки должны были нас спасти.»",
        "«Maybe in a couple of years, we’ll look back and…» — «Может, через пару лет мы оглянемся и…»",
        "«You’re treading on some mighty thin ice.» — «Ты ходишь по очень тонкому льду.»",
        "«I can’t imagine how you feel, but I’d do the same.» — «Не представляю, что ты чувствуешь, но я бы поступил так же.»",
        "«It’s not the end of the world… but you can see it from here.» — «Это ещё не конец света… но его уже видно.»",
        "«You’re not gonna turn, are you?» — «Ты же не превратишься, да?»",
        "«I saved you.» — «Я спас тебя.»",
        "«What are you so afraid of?» — «Чего ты так боишься?»",
        "«I’m not leaving you.» — «Я не брошу тебя.»",
        "«The ones who are still alive are the ones who are still fighting.» — «Те, кто ещё жив, — это те, кто продолжает бороться.»",
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