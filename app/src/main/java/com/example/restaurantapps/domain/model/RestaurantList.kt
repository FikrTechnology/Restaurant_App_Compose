package com.example.restaurantapps.domain.model

data class RestaurantResponse(
    val error: Boolean,
    val message: String,
    val count: Int,
    val restaurants: List<Restaurant>
)

data class Restaurant(
    val id: String,
    val name: String,
    val description: String,
    val pictureId: String,
    val city: String,
    val rating: Double
)