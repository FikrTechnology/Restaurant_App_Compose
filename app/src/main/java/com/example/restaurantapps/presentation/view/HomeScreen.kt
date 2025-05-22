package com.example.restaurantapps.presentation.view

import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.restaurantapps.presentation.viewmodel.RestaurantViewModel
import org.koin.androidx.compose.koinViewModel

@Composable
fun HomeScreen(viewModel: RestaurantViewModel = koinViewModel()) {
    val restaurants by viewModel.restaurant.collectAsState()

    Scaffold(
        modifier = Modifier.safeDrawingPadding(),
        contentWindowInsets = WindowInsets(0, 0, 0, 0),
    ) {paddingValues ->

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier
                    .fillMaxSize(),
                contentPadding = PaddingValues(8.dp),
                verticalArrangement = Arrangement.spacedBy(8.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(restaurants) { restaurant ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                    ) {
                        Column(modifier = Modifier.padding(16.dp)) {
                            AsyncImage(
                                model = "https://restaurant-api.dicoding.dev/images/medium/${restaurant.pictureId}",
                                contentDescription = "Restaurant Image",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                contentScale = ContentScale.Crop
                            )
                            Text(text = restaurant.name, style = MaterialTheme.typography.titleMedium)
                            Text(text = "City: ${restaurant.city}")
                            Text(text = "Rating: ${restaurant.rating}")
                        }
                    }
                }
            }
        }
    }
}