package com.example.restaurantapps.presentation.view

import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.example.restaurantapps.presentation.viewmodel.RestaurantViewModel
import com.example.restaurantapps.ui.component.RestaurantInformation
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
                        colors = CardDefaults.cardColors(Color.White),
                        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
                    ) {
                        Column(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            AsyncImage(
                                model = "https://restaurant-api.dicoding.dev/images/medium/${restaurant.pictureId}",
                                contentDescription = "Restaurant Image",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(150.dp),
                                contentScale = ContentScale.Crop
                            )
                            Column(
                                modifier = Modifier
                                    .padding(8.dp)
                                    .fillMaxWidth(),
                                verticalArrangement = Arrangement.spacedBy(4.dp)
                            ) {
                                Text(text = restaurant.name, style = MaterialTheme.typography.titleMedium)
                                RestaurantInformation(
                                    imageVector = Icons.Default.LocationOn,
                                    contentDescription = "Location Icon",
                                    tint = Color.Red,
                                    name = restaurant.city
                                )
                                RestaurantInformation(
                                    imageVector = Icons.Default.Star,
                                    contentDescription = "Rating Icon",
                                    tint = Color.Yellow,
                                    name = restaurant.rating.toString()
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}