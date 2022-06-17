package com.mirkamol.mvvm_hilt_coroutines.utils

sealed class UiStateObject<out T> {
    data class SUCCESS<out T>(val data: T) : UiStateObject<T>()
    data class ERROR(val message: String) : UiStateObject<Nothing>()
    object LOADING : UiStateObject<Nothing>()
    object EMPTY : UiStateObject<Nothing>()
}