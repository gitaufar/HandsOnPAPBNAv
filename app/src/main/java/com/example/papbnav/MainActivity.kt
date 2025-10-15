package com.example.papbnav

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Text
import androidx.compose.material3.MaterialTheme
import androidx.navigation.compose.rememberNavController
import com.example.papbnav.ui.navigation.RootNavGraph
import com.example.papbnav.ui.theme.PAPBNavTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PAPBNavTheme {
                val navController = rememberNavController()
                RootNavGraph(navController = navController)
            }
        }
    }
}