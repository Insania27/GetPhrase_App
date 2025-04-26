package com.example.getphraseapp.UI_Objects.Screens


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import checkIfEmailExists
import com.google.firebase.auth.FirebaseAuth

@Composable
fun RegisterScreen(navController: NavController, auth: FirebaseAuth) {
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

                checkIfEmailExists(email) { isValid ->
                    if (isValid) {

                        auth.createUserWithEmailAndPassword(email, password)
                            .addOnCompleteListener { createTask ->
                                if (createTask.isSuccessful) {
                                    navController.navigate("mainScreen") {
                                        popUpTo(0)
                                    }
                                } else {
                                    error = createTask.exception?.message
                                }
                            }
                    } else {
                        error = "Почта не существует в интернете."
                    }
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Регистрация")
        }
    }
}
