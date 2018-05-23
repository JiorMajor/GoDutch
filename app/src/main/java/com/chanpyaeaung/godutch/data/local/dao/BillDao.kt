package com.chanpyaeaung.godutch.data.local.dao

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*
import com.chanpyaeaung.godutch.data.model.Bill

@Dao
interface BillDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(bill: Bill)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(bills: List<Bill>)

    @get:Query("SELECT * FROM bill")
    val all: LiveData<List<Bill>>

    @Query("SELECT * FROM bill")
    fun getAllBills(): LiveData<List<Bill>>

    @Query("SELECT * FROM bill where bid = :bid")
    fun findUserByBillId(bid: String)

    @Update
    fun updateBill(bill: Bill)

    @Update
    fun updateAll(bills: List<Bill>)

    @Delete
    fun deleteBill(bill: Bill)

    @Delete
    fun deleteAll(bills: List<Bill>)

    @Query("DELETE FROM bill") fun deleteAll()

}