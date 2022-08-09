package com.example.sastaspotify.data

sealed class DataState {
    class Success(val data:MutableList<firebaseDataFile>):DataState()
    class Failure(val message:String):DataState()
    object Loading:DataState()
    object Empty:DataState()
}