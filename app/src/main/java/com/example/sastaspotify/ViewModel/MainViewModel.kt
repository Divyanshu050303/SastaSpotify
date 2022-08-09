package com.example.sastaspotify.ViewModel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.sastaspotify.data.DataState
import com.example.sastaspotify.data.firebaseDataFile
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class MainViewModel : ViewModel() {
    val response:MutableState<DataState> = mutableStateOf(DataState.Empty)
    init {
        FetchDataFromDatabase()
    }
    private fun FetchDataFromDatabase(){
        val temList= mutableListOf<firebaseDataFile>()
        response.value=DataState.Loading
        FirebaseDatabase.getInstance().getReference("Alka Yagnik")
            .addListenerForSingleValueEvent(object :ValueEventListener{
                override fun onDataChange(snapshot: DataSnapshot){
                    for(DataSnap in snapshot.children){
                        val Song=DataSnap.getValue(firebaseDataFile::class.java)
                        if(Song!=null){
                            temList.add(Song)
                        }
                    }
                }

                override fun onCancelled(error: DatabaseError) {
                     response.value=DataState.Failure(error.message)
                }
            }
            )
    }
}