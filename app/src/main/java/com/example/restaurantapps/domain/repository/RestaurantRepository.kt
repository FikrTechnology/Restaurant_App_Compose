package com.example.restaurantapps.domain.repository

import com.example.restaurantapps.domain.model.Restaurant

interface RestaurantRepository {
    suspend fun fetchRestaurantList(): List<Restaurant>
}