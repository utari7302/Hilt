package com.example.hilt

import android.util.Log
import javax.inject.Inject


const val TAG = "TECHLOGIX"

interface UserRepository{
    fun saveUser(email: String,password: String)
}

class SQLRepository @Inject constructor(): UserRepository {

    override fun saveUser(email: String, password: String){
        Log.d(TAG,"User save in sql")
    }
}

class FirebaseRepository: UserRepository{
    override fun saveUser(email: String, password: String){
        Log.d(TAG,"User save in firebase")
    }
}