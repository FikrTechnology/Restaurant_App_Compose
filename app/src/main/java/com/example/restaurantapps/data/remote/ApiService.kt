package com.example.restaurantapps.data.remote

import com.example.restaurantapps.domain.model.RestaurantResponse
import retrofit2.http.GET

interface ApiService {
    @GET("list")
    suspend fun getRestaurantList(): RestaurantResponse
}