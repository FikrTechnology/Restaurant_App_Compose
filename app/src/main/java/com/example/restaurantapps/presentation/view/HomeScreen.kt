package com.example.restaurantapps.presentation.view

import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.restaurantapps.presentation.viewmodel.RestaurantViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun HomeScreen(viewModel: RestaurantViewModel = koinViewModel()) {
    val restaurants by viewModel.restaurant.collectAsState()

    LazyColumn(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp)) {
        items(restaurants) { restaurant ->
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
            ) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(text = restaurant.name, style = MaterialTheme.typography.titleMedium)
                    Text(text = "City: ${restaurant.city}")
                    Text(text = "Rating: ${restaurant.rating}")
                    Text(text = restaurant.description, maxLines = 2)
                }
            }
        }
    }
}