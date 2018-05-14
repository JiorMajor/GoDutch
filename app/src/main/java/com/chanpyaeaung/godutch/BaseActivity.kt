package com.chanpyaeaung.godutch

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v4.app.Fragment
import android.support.v7.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
    }

    fun addFragment(fragId: Int, fragment: Fragment) {
        supportFragmentManager.beginTransaction().add(fragId, fragment, fragment.javaClass.simpleName).commit()
    }


}
