package com.example.getphraseapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.getphraseapp.UI_Objects.Screens.EmailVerifiedScreen
import com.example.getphraseapp.UI_Objects.Screens.MainScreen
import com.example.getphraseapp.ui.theme.GetPhraseAppTheme
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        handleDeepLink(intent)
        enableEdgeToEdge()
        setContent {
            GetPhraseAppTheme(dynamicColor = false) {
                Firebase.auth.currentUser?.reload()
                MainScreen()
            }
        }
    }

    private fun handleDeepLink(intent: Intent?) {
        intent?.data?.let { uri ->
            if (uri.toString().contains("verify-email")) {
                Firebase.auth.applyActionCode(uri.getQueryParameter("oobCode")!!)
                    .addOnSuccessListener {
                        // Перенаправляем сразу на главный экран
                        startActivity(Intent(this, MainActivity::class.java).apply {
                            flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                        })
                    }
            }
        }
    }
}

class EmailVerifiedActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GetPhraseAppTheme {
                EmailVerifiedScreen()
            }
        }
    }
}














