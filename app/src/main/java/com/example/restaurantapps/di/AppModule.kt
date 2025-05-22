package com.example.restaurantapps.di

import com.example.restaurantapps.data.repository.RestaurantRepositoryImpl
import com.example.restaurantapps.domain.repository.RestaurantRepository
import com.example.restaurantapps.presentation.viewmodel.RestaurantViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single<RestaurantRepository> { RestaurantRepositoryImpl() }
    viewModel { RestaurantViewModel(get()) }
}