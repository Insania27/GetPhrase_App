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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import checkIfEmailExists
import com.example.getphraseapp.Navigation.BottomNavItem
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth

//@Composable
//fun RegisterScreen(navController: NavController, auth: FirebaseAuth) {
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
//
//                checkIfEmailExists(email) { isValid ->
//                    if (isValid) {
//
//                        auth.createUserWithEmailAndPassword(email, password)
//                            .addOnCompleteListener { createTask ->
//                                if (createTask.isSuccessful) {
//                                    navController.navigate("mainScreen") {
//                                        popUpTo(0)
//                                    }
//                                } else {
//                                    error = createTask.exception?.message
//                                }
//                            }
//                    } else {
//                        error = "Почта не существует в интернете."
//                    }
//                }
//            },
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            Text("Регистрация")
//        }
//    }
//}


@Composable
fun RegisterScreen(navController: NavController){
    val email = remember {
        mutableStateOf("")
    }
    val password = remember {
        mutableStateOf("")
    }

    val auth = Firebase.auth

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.primary),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        TextField(
            modifier = Modifier.clip(RoundedCornerShape(30.dp)),
            value = email.value,
            onValueChange = {
                email.value = it
            },
            label = { Text("Логин", color = MaterialTheme.colorScheme.onSecondary) },
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                unfocusedContainerColor = MaterialTheme.colorScheme.secondary,
                focusedContainerColor = MaterialTheme.colorScheme.secondary,
                cursorColor = MaterialTheme.colorScheme.onSecondary,
                focusedTextColor = MaterialTheme.colorScheme.onSecondary,
                unfocusedTextColor = MaterialTheme.colorScheme.onSecondary
            )
        )

        Spacer(modifier = Modifier.height(10.dp))

        TextField(
            modifier = Modifier.clip(RoundedCornerShape(30.dp)),
            value = password.value,
            onValueChange = {
                password.value = it
            },
            label = { Text("Пароль", color = MaterialTheme.colorScheme.onSecondary) },
            colors = TextFieldDefaults.colors(
                focusedIndicatorColor = Color.Transparent,
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                unfocusedContainerColor = MaterialTheme.colorScheme.secondary,
                focusedContainerColor = MaterialTheme.colorScheme.secondary,
                cursorColor = MaterialTheme.colorScheme.onSecondary,
                focusedTextColor = MaterialTheme.colorScheme.onSecondary,
                unfocusedTextColor = MaterialTheme.colorScheme.onSecondary
            )
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "Есть аккаунт? Войдите",
            Modifier.clickable {
                navController.navigate("loginScreen")
            },
            color = Color(0xFF3982FF)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(onClick = {
            signUp(auth, email.value, password.value, navController)
        },
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.onPrimary,
                contentColor = Color.White
            )
        ){
            Text(text = "Зарегистрироваться", fontWeight = FontWeight.Bold)
        }
    }
}

fun signUp(auth: FirebaseAuth, email: String, password: String, navController: NavController){
    auth.createUserWithEmailAndPassword(email, password)
        .addOnCompleteListener{
            if (it.isSuccessful){
                navController.navigate("loginScreen") {
                    popUpTo(0)
                }
            } else {

            }
        }
}