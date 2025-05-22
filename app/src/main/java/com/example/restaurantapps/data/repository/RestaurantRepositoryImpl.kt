package com.example.restaurantapps.data.repository

import com.example.restaurantapps.data.remote.ApiClient
import com.example.restaurantapps.domain.model.Restaurant
import com.example.restaurantapps.domain.repository.RestaurantRepository

class RestaurantRepositoryImpl : RestaurantRepository {
    override suspend fun fetchRestaurantList(): List<Restaurant> {
        return ApiClient.apiService.getRestaurantList().restaurants
    }
}