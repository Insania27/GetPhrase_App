package com.example.getphraseapp.UI_Objects.Screens

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
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


//@Composable
//fun ProfileScreen(navController: NavController){
//
//    val auth = FirebaseAuth.getInstance()
//
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(
//                MaterialTheme.colorScheme.primary
//            )
//    ) {
//        Column (
//            modifier = Modifier.fillMaxSize(),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Column(
//                modifier = Modifier.padding(50.dp, 100.dp, 50.dp, 50.dp)
//                    .clip(RoundedCornerShape(15.dp))
//                    .background(MaterialTheme.colorScheme.secondary)
//                    .width(300.dp)
//                    .height(350.dp)
//            ) {
//
//                RowOfMenu(
//                    iconIcon = Icons.Default.Check,
//                    text = "Изучено",
//                    onClick = { navController.navigate("learnedScreen") }
//                )
//
//                Divider()
//
//                RowOfMenu(
//                    painterIcon = painterResource(id = R.drawable.ic_process),
//                    text = "В процессе",
//                    onClick = {  }
//                )
//
//            }
//
//            Spacer(modifier = Modifier.height(40.dp).background(MaterialTheme.colorScheme.primary))
//
//            Button(
//                onClick = {
//                    auth.signOut()
//                    navController.navigate("loginScreen") {
//                        popUpTo(0)
//                    }
//                },
//                modifier = Modifier.width(215.dp).padding(horizontal = 20.dp),
//                colors = ButtonDefaults.buttonColors(
//                    containerColor = Color(0xffe60000),
//                    contentColor = Color.White
//                )
//            ) {
//                Text(text = "Выйти из аккаунта")
//            }
//        }
//
//
//
//    }
//}
//
//
//@Composable
//fun RowOfMenu(
//    painterIcon: Painter? = null,
//    iconIcon: ImageVector? = null,
//    text: String,
//    arrow: ImageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
//    onClick: () -> Unit
//) {
//    Row(
//        modifier = Modifier.height(50.dp).fillMaxWidth()
//            .background(MaterialTheme.colorScheme.secondary)
//            .clickable { onClick() },
//        verticalAlignment = Alignment.CenterVertically,
//    ) {
//        if (painterIcon != null) {
//            Image(
//                painter = painterIcon,
//                contentDescription = null,
//                modifier = Modifier.height(50.dp).width(50.dp).padding(10.dp).size(30.dp),
//                colorFilter = ColorFilter.tint(
//                    color = MaterialTheme.colorScheme.onPrimary
//                )
//            )
//        } else if (iconIcon != null) {
//            Icon(
//                imageVector = iconIcon,
//                contentDescription = null,
//                modifier = Modifier.padding(10.dp).size(30.dp),
//                tint = MaterialTheme.colorScheme.onPrimary
//            )
//        }
//
//
//        Text(
//            text = text,
//            modifier = Modifier.width(100.dp),
//            color = MaterialTheme.colorScheme.onSecondary,
//            fontWeight = FontWeight.Bold,
//        )
//
//        Spacer(modifier = Modifier.weight(1f).background(MaterialTheme.colorScheme.onSecondary))
//
//        Icon(
//            imageVector = arrow,
//            contentDescription = "Иконка стрелки",
//            modifier = Modifier.padding(end = 20.dp)
//        )
//    }
//}
//
//
//@Composable
//fun Divider(){
//    HorizontalDivider(
//        modifier = Modifier
//            .padding(horizontal = 15.dp)
//            .height(1.dp)
//            .fillMaxWidth(),
//        thickness = 1.dp,
//        color = MaterialTheme.colorScheme.onSecondary
//    )
//}



//@Composable
//fun ProfileScreen(navController: NavController) {
//    val auth = FirebaseAuth.getInstance()
//
//    Box(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(MaterialTheme.colorScheme.primary)
//    ) {
//        Column(
//            modifier = Modifier.fillMaxSize(),
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            // Добавим заголовок профиля
//            Text(
//                text = "Профиль",
//                style = MaterialTheme.typography.headlineMedium,
//                color = MaterialTheme.colorScheme.onPrimary,
//                modifier = Modifier.padding(vertical = 32.dp)
//            )
//
//            // Контейнер для пунктов меню
//            Column(
//                modifier = Modifier
//                    .padding(horizontal = 24.dp)
//                    .clip(RoundedCornerShape(16.dp))
//                    .background(MaterialTheme.colorScheme.secondary)
//                    .fillMaxWidth()
//            ) {
//                RowOfMenu(
//                    iconIcon = Icons.Default.Check,
//                    text = "Изучено",
//                    onClick = { navController.navigate("learnedScreen") }
//                )
//            }
//
//            // Кнопка выхода
//            Button(
//                onClick = {
//                    auth.signOut()
//                    navController.navigate("loginScreen") { popUpTo(0) }
//                },
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(32.dp),
//                colors = ButtonDefaults.buttonColors(
//                    containerColor = MaterialTheme.colorScheme.errorContainer,
//                    contentColor = MaterialTheme.colorScheme.onErrorContainer
//                ),
//                shape = RoundedCornerShape(12.dp)
//            ) {
//                Text(
//                    text = "Выйти из аккаунта",
//                    modifier = Modifier.padding(vertical = 8.dp),
//                    style = MaterialTheme.typography.bodyLarge
//                )
//            }
//        }
//    }
//}
//
//@Composable
//fun RowOfMenu(
//    painterIcon: Painter? = null,
//    iconIcon: ImageVector? = null,
//    text: String,
//    arrow: ImageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
//    onClick: () -> Unit
//) {
//    Row(
//        modifier = Modifier
//            .fillMaxWidth()
//            .height(64.dp)
//            .clickable { onClick() }
//            .padding(horizontal = 16.dp),
//        verticalAlignment = Alignment.CenterVertically,
//    ) {
//        // Иконка
//        Box(
//            modifier = Modifier
//                .size(40.dp)
//                .background(
//                    color = MaterialTheme.colorScheme.primary.copy(alpha = 0.1f),
//                    shape = RoundedCornerShape(8.dp)
//                )
//                .clip(RoundedCornerShape(8.dp)),
//            contentAlignment = Alignment.Center
//        ) {
//            if (painterIcon != null) {
//                Image(
//                    painter = painterIcon,
//                    contentDescription = null,
//                    colorFilter = ColorFilter.tint(MaterialTheme.colorScheme.primary),
//                    modifier = Modifier.size(24.dp)
//                )
//            } else if (iconIcon != null) {
//                Icon(
//                    imageVector = iconIcon,
//                    contentDescription = null,
//                    tint = MaterialTheme.colorScheme.primary,
//                    modifier = Modifier.size(24.dp)
//                )
//            }
//        }
//
//        // Текст
//        Text(
//            text = text,
//            style = MaterialTheme.typography.bodyLarge,
//            color = MaterialTheme.colorScheme.onSecondary,
//            modifier = Modifier
//                .weight(1f)
//                .padding(start = 16.dp)
//        )
//
//        // Стрелка
//        Icon(
//            imageVector = arrow,
//            contentDescription = "Стрелка",
//            tint = MaterialTheme.colorScheme.onSecondary.copy(alpha = 0.6f)
//        )
//    }
//}




@Composable
fun ProfileScreen(navController: NavController) {
    val auth = FirebaseAuth.getInstance()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primary)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Box(
                modifier = Modifier
                    .size(120.dp)
                    .background(
                        color = MaterialTheme.colorScheme.secondary,
                        shape = CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    imageVector = Icons.Default.AccountCircle,
                    contentDescription = "Аватар",
                    tint = MaterialTheme.colorScheme.onPrimary,
                    modifier = Modifier.size(100.dp)
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            Text(
                text = "Мой Профиль",
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.onPrimary
            )

            Spacer(modifier = Modifier.height(40.dp))

            // Карточка с действиями
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(20.dp))
                    .clickable { navController.navigate("learnedScreen") },
                color = MaterialTheme.colorScheme.secondary,
                shadowElevation = 8.dp
            ) {
                Row(
                    modifier = Modifier
                        .padding(24.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Check,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.onPrimary,
                        modifier = Modifier.size(32.dp)
                    )

                    Spacer(modifier = Modifier.width(16.dp))

                    Text(
                        text = "Изучено",
                        style = MaterialTheme.typography.titleLarge,
                        color = MaterialTheme.colorScheme.onSecondary
                    )

                    Spacer(Modifier.weight(1f))

                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.KeyboardArrowRight,
                        contentDescription = "Перейти",
                        tint = MaterialTheme.colorScheme.onSecondary.copy(alpha = 0.7f)
                    )
                }
            }

            Spacer(Modifier.weight(1f))

            // Кнопка выхода
            OutlinedButton(
                onClick = {
                    auth.signOut()
                    navController.navigate("loginScreen") { popUpTo(0) }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 32.dp),
                colors = ButtonDefaults.outlinedButtonColors(
                    contentColor = MaterialTheme.colorScheme.onPrimary
                ),
                border = BorderStroke(1.dp, MaterialTheme.colorScheme.onPrimary.copy(alpha = 0.3f)),
                shape = RoundedCornerShape(12.dp)
            ) {
                Icon(
                    painter = painterResource(R.drawable.ic_logout),
                    contentDescription = "Выход",
                    modifier = Modifier.size(20.dp)
                )

                Spacer(Modifier.width(12.dp))
                Text(
                    text = "Выйти",
                    style = MaterialTheme.typography.bodyLarge
                )
            }
        }
    }
}