package com.example.mynotes.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class User(
    @PrimaryKey
    val username: String,
    val name: String?,
    val email: String,
    val password: String

)
