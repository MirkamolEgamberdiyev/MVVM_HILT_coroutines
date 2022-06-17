package com.mirkamol.mvvm_hilt_coroutines.data.remote

import com.mirkamol.mvvm_hilt_coroutines.model.User
import retrofit2.http.GET

interface ApiService {

    @GET("user")
    suspend fun getUsers():List<User>
}