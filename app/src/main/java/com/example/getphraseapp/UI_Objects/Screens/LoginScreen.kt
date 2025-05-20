package com.example.getphraseapp.UI_Objects.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.getphraseapp.Navigation.BottomNavItem
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.auth.ktx.auth



@Composable
fun LoginScreen(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var errorMessage by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primary),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Text(
            modifier = Modifier.padding(bottom = 16.dp),
            text = "Вход",
            fontSize = 36.sp,
            color = Color.White
        )

        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Логин", color = MaterialTheme.colorScheme.onSecondary) },
            modifier = Modifier.clip(RoundedCornerShape(30.dp)),
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                unfocusedContainerColor = MaterialTheme.colorScheme.secondary,
                focusedContainerColor = MaterialTheme.colorScheme.secondary,
                cursorColor = MaterialTheme.colorScheme.onSecondary,
                focusedTextColor = MaterialTheme.colorScheme.onSecondary,
                unfocusedTextColor = MaterialTheme.colorScheme.onSecondary,
                disabledTextColor = MaterialTheme.colorScheme.onSecondary
            ),
        )

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Пароль", color = MaterialTheme.colorScheme.onSecondary) },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.clip(RoundedCornerShape(30.dp)),
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                unfocusedContainerColor = MaterialTheme.colorScheme.secondary,
                focusedContainerColor = MaterialTheme.colorScheme.secondary,
                cursorColor = MaterialTheme.colorScheme.onSecondary,
                focusedTextColor = MaterialTheme.colorScheme.onSecondary,
                unfocusedTextColor = MaterialTheme.colorScheme.onSecondary,
                disabledTextColor = MaterialTheme.colorScheme.onSecondary
            ),
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Нет аккаунта? Зарегистрируйтесь",
            Modifier.clickable {
                navController.navigate("registerScreen")
            },
            color = MaterialTheme.colorScheme.onPrimary
        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                if (email.isValidEmail() && password.isNotEmpty()) {
                    Firebase.auth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener { task ->
                            if (task.isSuccessful) {

                                task.result.user?.let { user ->
                                    if (user.isEmailVerified) {
                                        navController.navigate(BottomNavItem.Profile.route) {
                                            popUpTo(0)
                                        }
                                    } else {
                                        navController.navigate("verify_email") {
                                            popUpTo(0)
                                        }
                                        Firebase.auth.signOut()
                                    }
                                }
                            } else {
                                errorMessage = task.exception?.message ?: "Ошибка входа"
                            }
                        }
                } else {
                    errorMessage = "Некорректные данные"
                }
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.onPrimary ,
                contentColor = Color.White
            )
        ) {
            Text("Войти")
        }

        if (errorMessage.isNotEmpty()) {
            Text(text = errorMessage, color = Color.Red)
        }
    }
}

