package com.example.getphraseapp.UI_Objects.Screens


import android.app.Activity
import android.content.Intent
import android.util.Patterns
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import checkIfEmailExists
import com.example.getphraseapp.MainActivity
import com.example.getphraseapp.Navigation.BottomNavItem
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.auth
import kotlinx.coroutines.delay


//@Composable
//fun RegisterScreen(navController: NavController){
//    val email = remember {
//        mutableStateOf("")
//    }
//    val password = remember {
//        mutableStateOf("")
//    }
//
//    val auth = Firebase.auth
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(
//                MaterialTheme.colorScheme.primary
//            ),
//        horizontalAlignment = Alignment.CenterHorizontally,
//        verticalArrangement = Arrangement.Center
//    ) {
//
//        Text(
//            modifier = Modifier.padding(bottom = 16.dp),
//            text = "Регистрация",
//            fontSize = 36.sp,
//            color = Color.White
//        )
//
//        TextField(
//            modifier = Modifier.clip(RoundedCornerShape(30.dp)),
//            value = email.value,
//            onValueChange = {
//                email.value = it
//            },
//            label = { Text("Логин", color = MaterialTheme.colorScheme.onSecondary) },
//            colors = TextFieldDefaults.colors(
//                focusedIndicatorColor = Color.Transparent,
//                unfocusedIndicatorColor = Color.Transparent,
//                disabledIndicatorColor = Color.Transparent,
//                unfocusedContainerColor = MaterialTheme.colorScheme.secondary,
//                focusedContainerColor = MaterialTheme.colorScheme.secondary,
//                cursorColor = MaterialTheme.colorScheme.onSecondary,
//                focusedTextColor = MaterialTheme.colorScheme.onSecondary,
//                unfocusedTextColor = MaterialTheme.colorScheme.onSecondary,
//                disabledTextColor = MaterialTheme.colorScheme.onSecondary
//            ),
//        )
//
//        Spacer(modifier = Modifier.height(10.dp))
//
//        TextField(
//            modifier = Modifier.clip(RoundedCornerShape(30.dp)),
//            value = password.value,
//            onValueChange = {
//                password.value = it
//            },
//            label = { Text("Пароль", color = MaterialTheme.colorScheme.onSecondary) },
//            colors = TextFieldDefaults.colors(
//                focusedIndicatorColor = Color.Transparent,
//                unfocusedIndicatorColor = Color.Transparent,
//                disabledIndicatorColor = Color.Transparent,
//                unfocusedContainerColor = MaterialTheme.colorScheme.secondary,
//                focusedContainerColor = MaterialTheme.colorScheme.secondary,
//                cursorColor = MaterialTheme.colorScheme.onSecondary,
//                focusedTextColor = MaterialTheme.colorScheme.onSecondary,
//                unfocusedTextColor = MaterialTheme.colorScheme.onSecondary,
//                disabledTextColor = MaterialTheme.colorScheme.onSecondary
//            ),
//        )
//
//        Spacer(modifier = Modifier.height(10.dp))
//
//        Text(
//            text = "Есть аккаунт? Войдите",
//            Modifier.clickable {
//                navController.navigate("loginScreen")
//            },
//            color = MaterialTheme.colorScheme.onPrimary
//        )
//
//        Spacer(modifier = Modifier.height(10.dp))
//
//        Button(onClick = {
//            signUp(auth, email.value, password.value, navController)
//        },
//            colors = ButtonDefaults.buttonColors(
//                containerColor = MaterialTheme.colorScheme.onPrimary ,
//                contentColor = Color.White
//            )
//        ){
//            Text(text = "Зарегистрироваться", fontWeight = FontWeight.Bold)
//        }
//    }
//}

//fun signUp(auth: FirebaseAuth, email: String, password: String, navController: NavController){
//    auth.createUserWithEmailAndPassword(email, password)
//        .addOnCompleteListener{
//            if (it.isSuccessful){
//                navController.navigate("loginScreen") {
//                    popUpTo(0)
//                }
//            } else {
//
//            }
//        }
//}

fun String.isValidEmail(): Boolean {
    return this.isNotBlank() && Patterns.EMAIL_ADDRESS.matcher(this).matches()
}


@Composable
fun RegisterScreen(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var isLoading by remember { mutableStateOf(false) }
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
            text = "Регситрация",
            fontSize = 36.sp,
            color = MaterialTheme.colorScheme.onPrimary
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
            text = "Есть аккаунт? Войдите",
            Modifier.clickable {
                navController.navigate("loginScreen")
            },
            color = MaterialTheme.colorScheme.onPrimary
        )

        Spacer(modifier = Modifier.height(10.dp))

        Button(
            onClick = {
                if (email.isValidEmail() && password.length >= 6) {
                    println("DEBUG: Trying to login with $email")
                    signUp(email, password, onSuccess = {
                        navController.navigate("verify_email")
                    }, onError = { error ->
                        errorMessage = error
                    })
                } else {
                    errorMessage = "Некорректные данные"
                }
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.onPrimary ,
                contentColor = Color.White
            )
        ) {
            Text("Зарегистрироваться")
        }

        if (errorMessage.isNotEmpty()) {
            Text(text = errorMessage, color = Color.Red)
        }
    }
}

fun signUp(
    email: String,
    password: String,
    onSuccess: () -> Unit,
    onError: (String) -> Unit
) {
    val auth = Firebase.auth

    auth.createUserWithEmailAndPassword(email, password)
        .addOnCompleteListener { task ->
            if (task.isSuccessful) {
                auth.currentUser?.sendEmailVerification()
                    ?.addOnSuccessListener {
                        onSuccess()
                    }
                    ?.addOnFailureListener { e ->
                        onError("Ошибка отправки письма: ${e.message}")
                    }
            } else {
                onError("Ошибка регистрации: ${task.exception?.message}")
            }
        }
}




@Composable
fun VerifyEmailScreen(navController: NavController) {
    val auth = FirebaseAuth.getInstance()
    var showResend by remember { mutableStateOf(false) }
    var isVerified by remember { mutableStateOf(false) }


    LaunchedEffect(Unit) {
        while (!isVerified) {
            auth.currentUser?.reload()
            isVerified = auth.currentUser?.isEmailVerified ?: false
            if (isVerified) {
                navController.navigate(BottomNavItem.Profile.route) {
                    popUpTo(navController.graph.startDestinationId)
                    launchSingleTop = true
                }
                break
            }
            delay(3000)
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.primary),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (!isVerified) {
            CircularProgressIndicator(color = Color.White)
            Spacer(modifier = Modifier.height(24.dp))
            Text("Проверьте вашу почту и подтвердите email", color = Color.White)

            Spacer(modifier = Modifier.height(32.dp))

            if (showResend) {
                Button(onClick = {
                    auth.currentUser?.sendEmailVerification()
                    showResend = false
                }) {
                    Text("Отправить письмо повторно")
                }
            } else {
                Button(
                    onClick = { navController.navigate("loginScreen") },
                    colors = ButtonDefaults.buttonColors(
                    containerColor = MaterialTheme.colorScheme.onPrimary ,
                    contentColor = Color.White
                )) {
                    Text("Вернуться", fontWeight = FontWeight.Bold)
                }
            }
        } else {
            Text("Email успешно подтвержден!", color = Color.Green)
        }
    }
}



@Composable
fun EmailVerifiedScreen() {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            imageVector = Icons.Default.Check,
            contentDescription = "Verified",
            tint = Color.Green,
            modifier = Modifier.size(64.dp))

                    Spacer(modifier = Modifier.height(24.dp))

                    Text(
                    text = "Email успешно подтвержден!",
            style = MaterialTheme.typography.headlineMedium)

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {
                context.startActivity(Intent(context, MainActivity::class.java))
                (context as Activity).finish()
            }
        ) {
            Text("Перейти в приложение")
        }
    }
}