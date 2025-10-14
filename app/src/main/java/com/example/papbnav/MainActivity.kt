package com.example.papbnav

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import com.example.papbnav.ui.theme.PAPBNavTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAPBNavTheme {
                Text(
                    text = "Hello Compose Navigation",
                    style = MaterialTheme.typography.headlineSmall
                )
            }
        }
    }
}