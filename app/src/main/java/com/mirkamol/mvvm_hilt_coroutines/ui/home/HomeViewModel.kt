package com.mirkamol.mvvm_hilt_coroutines.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mirkamol.mvvm_hilt_coroutines.model.User
import com.mirkamol.mvvm_hilt_coroutines.repository.MainRepository
import com.mirkamol.mvvm_hilt_coroutines.utils.UiStateList
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repository: MainRepository
) : ViewModel() {
    private val _getUsersState = MutableStateFlow<UiStateList<User>>(UiStateList.EMPTY)
    val getUserState = _getUsersState

    fun getUsers() = viewModelScope.launch {
        _getUsersState.value = UiStateList.LOADING
        try {
            val response = repository.getUsers()
            _getUsersState.value = UiStateList.SUCCESS(response)
        } catch (e: Exception) {
            _getUsersState.value = UiStateList.ERROR(e.localizedMessage ?: "No Connection")
        }
    }
}