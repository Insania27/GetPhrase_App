package com.example.getphraseapp.UI_Objects.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.getphraseapp.R

@Composable
fun ProfileScreen(){
    Box(
        modifier = Modifier.fillMaxSize().background(color = Color.DarkGray)
    ) {
        Column(
            modifier = Modifier.padding(50.dp, 100.dp, 50.dp, 100.dp)
                .clip(RoundedCornerShape(15.dp))
                .background(color = Color(0xFF00fcb1))
                .width(300.dp)
                .height(500.dp)
        ) {
            Row(
                modifier = Modifier.height(50.dp).fillMaxWidth().background(color = Color(0xFF00fcb1)),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.Check,
                    contentDescription = "Иконка изученного",
                    modifier = Modifier.padding(10.dp).size(30.dp)
                )

                Text(
                    text = "Изучено",
                    modifier = Modifier.width(100.dp)
                )

                Spacer(modifier = Modifier.weight(1f))

                Icon(
                    imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Иконка стрелки",
                    modifier = Modifier.padding(end = 20.dp)
                )

            }

            HorizontalDivider(
                modifier = Modifier
                    .padding(horizontal = 15.dp)
                    .height(1.dp)
                    .fillMaxWidth(),
                thickness = 1.dp,
                color = Color.DarkGray
            )

            Row(
                modifier = Modifier.height(50.dp).fillMaxWidth().background(color = Color(0xFF00fcb1)),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_process),
                    contentDescription = "Иконка в процессе",
                    modifier = Modifier.height(50.dp).width(50.dp).padding(10.dp).size(30.dp),
                    colorFilter = ColorFilter.tint(
                        color = Color.Black
                    )
                )

                Text(
                    text = "В процессе",
                    modifier = Modifier.width(100.dp)
                )

                Spacer(modifier = Modifier.weight(1f))

                Icon(
                    imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                    contentDescription = "Иконка стрелки",
                    modifier = Modifier.padding(end = 20.dp)
                )
            }
        }
    }
}