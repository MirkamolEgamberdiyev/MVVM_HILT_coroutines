package com.mirkamol.mvvm_hilt_coroutines.repository

import com.mirkamol.mvvm_hilt_coroutines.data.remote.ApiService
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val apiService: ApiService
) {
    suspend fun getUsers() = apiService.getUsers()
}