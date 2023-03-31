package com.paulo.network

sealed class ResultWrapper<out T> {
    data class Success<out T>(val data: T) : ResultWrapper<T>()
    data class Loading<out T>(val data: T? = null) : ResultWrapper<T>()
    data class Error<out T>(val error: Throwable) : ResultWrapper<T>()
    data class GenericError<out T>(val code: Int?, val message: String?) : ResultWrapper<T>()
    object NetworkError : ResultWrapper<Nothing>()
}