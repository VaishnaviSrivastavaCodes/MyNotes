package com.example.mynotes.model

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 1)
    abstract class Database : RoomDatabase(){
        abstract fun userDao(): UserDao
    }
