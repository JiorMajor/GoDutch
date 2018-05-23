package com.chanpyaeaung.godutch.data.local.dao

import android.arch.persistence.room.*
import com.chanpyaeaung.godutch.data.model.User
import javax.sql.DataSource

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(user: User)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(users: List<User>)

    @get:Query("SELECT * FROM user")
    val all: List<User>

    @Query("SELECT * FROM user")
    fun getAllUsers(): List<User>

    @Query("SELECT * FROM user where mobileNumber = :mobile")
    fun findUserByMobileNumber(mobile: String)

    @Query("SELECT * FROM user where email = :email")
    fun findUserByEmail(email: String)

    @Query("SELECT * FROM user where userName = :userName")
    fun findUserByUserName(userName: String)

    @Update
    fun updateUser(user: User)

    @Update
    fun updateAll(users: List<User>)

    @Delete
    fun deleteUser(user: User)

    @Delete fun deleteAll(users: List<User>)

    @Query("DELETE FROM user") fun deleteAll()
}