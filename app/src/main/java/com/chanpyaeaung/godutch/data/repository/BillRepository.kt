package com.chanpyaeaung.godutch.data.repository

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import com.chanpyaeaung.godutch.data.local.dao.BillDao
import com.chanpyaeaung.godutch.data.model.Bill
import com.chanpyaeaung.godutch.data.model.User
import com.chanpyaeaung.godutch.data.network.WebService
import java.util.concurrent.Executor
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BillRepository {
    val webService: WebService
    val billDao: BillDao
    val executor: Executor

    @Inject
    constructor(webService: WebService, billDao: BillDao, executor: Executor) {
        this.webService = webService
        this.billDao = billDao
        this.executor = executor
    }

    fun getBills(): LiveData<List<Bill>> {
        return billDao.getAllBills()
    }
}