package com.chanpyaeaung.godutch.data.local

import android.arch.persistence.room.*
import android.content.Context
import com.chanpyaeaung.godutch.data.local.converter.DateConverter
import com.chanpyaeaung.godutch.data.local.dao.BillDao
import com.chanpyaeaung.godutch.data.local.dao.UserDao
import com.chanpyaeaung.godutch.data.model.Bill
import com.chanpyaeaung.godutch.data.model.User

@Database(entities = arrayOf(User::class, Bill::class), version = 1)
@TypeConverters(value = arrayOf(DateConverter::class))
abstract class GoDutchDatabase : RoomDatabase() {

    abstract fun billDao(): BillDao
    abstract fun userDao(): UserDao

    companion object {
        val DB_NAME: String = "GoDutchDatabase.db"
        var INSTANCE: GoDutchDatabase? = null
        fun buildDatabase(context: Context): GoDutchDatabase {
            if(INSTANCE == null) {
                synchronized(this) {
                    INSTANCE = Room.databaseBuilder(context.applicationContext, GoDutchDatabase::class.java, DB_NAME)
                            .build()
                }
            }
            return INSTANCE as GoDutchDatabase
        }
    }

    fun destroyInstance() {
        INSTANCE = null
    }
}