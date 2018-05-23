package com.chanpyaeaung.godutch.data.model

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import java.util.*

@Entity(tableName = "bill")
data class Bill(
        @PrimaryKey(autoGenerate = true)
        val bid: Int = 0,
        var toPay: Double,
        var toGet: Double,
        var totalBalance: Double,
        var particiapants: List<User>,
        var createdAt: Date)