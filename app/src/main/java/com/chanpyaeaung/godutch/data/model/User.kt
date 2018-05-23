package com.chanpyaeaung.godutch.data.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

@Entity(tableName = "user")
data class User(
        @PrimaryKey(autoGenerate = true)
        val uid: Int = 0,
        var userName: String,
        var mobileNumber: String,
        var email: String)