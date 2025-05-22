package com.example.restaurantapps

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.restaurantapps.presentation.view.HomeScreen
import com.example.restaurantapps.ui.theme.RestaurantAppsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RestaurantAppsTheme {
                HomeScreen()
            }
        }
    }
}