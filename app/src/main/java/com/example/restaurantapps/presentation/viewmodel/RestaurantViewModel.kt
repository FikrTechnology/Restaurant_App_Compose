package com.example.restaurantapps.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.restaurantapps.data.repository.RestaurantRepositoryImpl
import com.example.restaurantapps.domain.model.Restaurant
import com.example.restaurantapps.domain.repository.RestaurantRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class RestaurantViewModel(
    private val repository: RestaurantRepository
) : ViewModel() {

    private val _restaurantList = MutableStateFlow<List<Restaurant>>(emptyList())
    val restaurant: StateFlow<List<Restaurant>> = _restaurantList

    init {
        getRestaurantList()
    }

    private fun getRestaurantList() {
        viewModelScope.launch {
            try {
                val response = repository.fetchRestaurantList()
                _restaurantList.value = response
            } catch (e: Exception) {
                // Handle the error
                e.printStackTrace()
            }
        }
    }
}