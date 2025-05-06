package com.example.getphraseapp.UI_Objects.Screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.getphraseapp.Navigation.BottomNavItem
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import com.google.firebase.auth.ktx.auth

//@Composable
//fun LoginScreen(navController: NavController, auth: FirebaseAuth) {
//    var email by remember { mutableStateOf("") }
//    var password by remember { mutableStateOf("") }
//    var error by remember { mutableStateOf<String?>(null) }
//
//    Column(
//        modifier = Modifier.fillMaxSize().padding(16.dp),
//        verticalArrangement = Arrangement.Center
//    ) {
//        TextField(
//            value = email,
//            onValueChange = { email = it },
//            label = { Text("Email") },
//            modifier = Modifier.fillMaxWidth()
//        )
//        Spacer(modifier = Modifier.height(8.dp))
//        TextField(
//            value = password,
//            onValueChange = { password = it },
//            label = { Text("Пароль") },
//            visualTransformation = PasswordVisualTransformation(),
//            modifier = Modifier.fillMaxWidth()
//        )
//        Spacer(modifier = Modifier.height(8.dp))
//        error?.let {
//            Text(text = it, color = MaterialTheme.colorScheme.error)
//        }
//        Button(
//            onClick = {
//                auth.signInWithEmailAndPassword(email, password)
//                    .addOnCompleteListener { task ->
//                        if (task.isSuccessful) {
//                            navController.navigate("mainScreen") {
//                                popUpTo(0)
//                            }
//                        } else {
//                            error = when {
//                                task.exception?.message?.contains("The email address is badly formatted") == true -> "Неверный формат email."
//                                task.exception?.message?.contains("There is no user record corresponding to this identifier") == true -> "Пользователь с таким email не найден."
//                                task.exception?.message?.contains("The password is invalid") == true -> "Неверный пароль."
//                                else -> "Не удалось войти. Попробуйте снова."
//                            }
//                        }
//                    }
//            },
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            Text("Войти")
//        }
//        Spacer(modifier = Modifier.height(8.dp))
//        TextButton(
//            onClick = { navController.navigate("registerScreen") }
//        ) {
//            Text("Нет аккаунта? Зарегистрируйтесь")
//        }
//    }
//}


@Composable
fun LoginScreen(navController: NavController){
    val email = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }

    val auth = Firebase.auth

    val errorMessage = remember { mutableStateOf<String?>(null) }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        TextField(
            modifier = Modifier.clip(RoundedCornerShape(30.dp)),
            value = email.value,
            onValueChange = {
                email.value = it
            },
            label = { Text("Логин") },
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            )
        )

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            modifier = Modifier.clip(RoundedCornerShape(30.dp)),
            value = password.value,
            onValueChange = {
                password.value = it
            },
            label = { Text("Пароль") },
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent
            )
        )

        errorMessage.value?.let { message ->
            Text(
                text = message,
                color = MaterialTheme.colorScheme.error,
                modifier = Modifier
                    .padding(top = 4.dp)
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Нет аккаунта? Зарегистрируйтесь",
            Modifier.clickable {
                navController.navigate("registerScreen")
        },
            color = Color(0xFF3982FF)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            signIn(auth, email.value, password.value, errorMessage, navController)
        },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Black,
                contentColor = Color.White
            )
        ){
            Text(text = "Войти")
        }
    }
}

fun signIn(
    auth: FirebaseAuth,
    email: String,
    password: String,
    errorMessage: MutableState<String?>,
    navController: NavController
){
    if (email.isBlank() || password.isBlank()) {
        errorMessage.value = "Заполните все поля"
        return
    }

    auth.signInWithEmailAndPassword(email, password)
        .addOnCompleteListener{
            if (it.isSuccessful){
                navController.navigate(BottomNavItem.Profile.route) {
                    popUpTo(0)
                }
            } else {
                errorMessage.value = when {
                    it.exception?.message?.contains("The email address is badly formatted") == true ||
                    it.exception?.message?.contains("The supplied auth credential is incorrect, malformed or has expired") == true ->
                        "Неверные логин или пароль"
                    else -> "Ошибка входа. Попробуйте снова"
                }
            }
        }
}