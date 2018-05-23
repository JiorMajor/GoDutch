package com.chanpyaeaung.godutch.ui.bills

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.ViewModel;
import com.chanpyaeaung.godutch.data.model.Bill

class BillsViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    private var billList: LiveData<List<Bill>>? = null
    private var userId: String? = null

    //get bill list based on login user id
    fun init(userId: String) {
        if (this.billList != null) {
            // ViewModel is created per Fragment so
            // we know the userId won't change
            return
        }
    }

    fun getBillList(): LiveData<List<Bill>>? {
        return this.billList
    }

}
