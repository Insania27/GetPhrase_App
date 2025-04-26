package com.example.getphraseapp.UI_Objects.Screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.google.firebase.auth.FirebaseAuth

@Composable
fun LoginScreen(navController: NavController, auth: FirebaseAuth) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var error by remember { mutableStateOf<String?>(null) }

    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        verticalArrangement = Arrangement.Center
    ) {
        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("Email") },
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Пароль") },
            visualTransformation = PasswordVisualTransformation(),
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        error?.let {
            Text(text = it, color = MaterialTheme.colorScheme.error)
        }
        Button(
            onClick = {
                auth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener { task ->
                        if (task.isSuccessful) {
                            navController.navigate("mainScreen") {
                                popUpTo(0)
                            }
                        } else {
                            error = when {
                                task.exception?.message?.contains("The email address is badly formatted") == true -> "Неверный формат email."
                                task.exception?.message?.contains("There is no user record corresponding to this identifier") == true -> "Пользователь с таким email не найден."
                                task.exception?.message?.contains("The password is invalid") == true -> "Неверный пароль."
                                else -> "Не удалось войти. Попробуйте снова."
                            }
                        }
                    }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Войти")
        }
        Spacer(modifier = Modifier.height(8.dp))
        TextButton(
            onClick = { navController.navigate("registerScreen") }
        ) {
            Text("Нет аккаунта? Зарегистрируйтесь")
        }
    }
}
