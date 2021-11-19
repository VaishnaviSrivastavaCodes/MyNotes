package com.example.mynotes.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface UserDao{
@Insert(onConflict=OnConflictStrategy.IGNORE)
fun insertUser(vararg user: User)
}