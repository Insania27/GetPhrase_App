package com.example.getphraseapp.UI_Objects.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.getphraseapp.R
import com.google.firebase.auth.FirebaseAuth


@Composable
fun ProfileScreen(navController: NavController){

    val auth = FirebaseAuth.getInstance()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Color(0xFF1ABC9C),
                        Color.LightGray,
                    )
                )
            )
    ) {
        Column (
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(
                modifier = Modifier.padding(50.dp, 100.dp, 50.dp, 50.dp)
                    .clip(RoundedCornerShape(15.dp))
                    .background(color = Color(0xFF19A687))
                    .width(300.dp)
                    .height(350.dp)
            ) {

                RowOfMenu(
                    iconIcon = Icons.Default.Check,
                    text = "Изучено",
                    onClick = { navController.navigate("learnedScreen") }
                )

                Divider()

                RowOfMenu(
                    painterIcon = painterResource(id = R.drawable.ic_process),
                    text = "В процессе",
                    onClick = {  }
                )

            }

            Spacer(modifier = Modifier.height(40.dp).background(MaterialTheme.colorScheme.primary))

            Button(
                onClick = {
                    auth.signOut()
                    navController.navigate("loginScreen") {
                        popUpTo(0)
                    }
                },
                modifier = Modifier.width(215.dp).padding(horizontal = 20.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(0xffe60000),
                    contentColor = Color.White
                )
            ) {
                Text(text = "Выйти из аккаунта")
            }
        }



    }
}


@Composable
fun RowOfMenu(
    painterIcon: Painter? = null,
    iconIcon: ImageVector? = null,
    text: String,
    arrow: ImageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier.height(50.dp).fillMaxWidth()
            .background(color = Color(0xFF19A687))
            .clickable { onClick() },
        verticalAlignment = Alignment.CenterVertically,
    ) {
        if (painterIcon != null) {
            Image(
                painter = painterIcon,
                contentDescription = null,
                modifier = Modifier.height(50.dp).width(50.dp).padding(10.dp).size(30.dp),
                colorFilter = ColorFilter.tint(
                    color = MaterialTheme.colorScheme.onSecondary
                )
            )
        } else if (iconIcon != null) {
            Icon(
                imageVector = iconIcon,
                contentDescription = null,
                modifier = Modifier.padding(10.dp).size(30.dp),
                tint = MaterialTheme.colorScheme.onSecondary
            )
        }


        Text(
            text = text,
            modifier = Modifier.width(100.dp),
            color = MaterialTheme.colorScheme.onSecondary,
            fontWeight = FontWeight.Bold,
        )

        Spacer(modifier = Modifier.weight(1f).background(MaterialTheme.colorScheme.onSecondary))

        Icon(
            imageVector = arrow,
            contentDescription = "Иконка стрелки",
            modifier = Modifier.padding(end = 20.dp)
        )
    }
}


@Composable
fun Divider(){
    HorizontalDivider(
        modifier = Modifier
            .padding(horizontal = 15.dp)
            .height(1.dp)
            .fillMaxWidth(),
        thickness = 1.dp,
        color = MaterialTheme.colorScheme.onSecondary
    )
}