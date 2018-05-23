package com.chanpyaeaung.godutch

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.chanpyaeaung.godutch.ui.bills.BillsFragment
import com.chanpyaeaung.godutch.ui.history.HistoryFragment
import com.chanpyaeaung.godutch.ui.profile.ProfileFragment
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : BaseActivity() {

//    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
//        when (item.itemId) {
//            R.id.navigation_bills -> {
//                addFragment(R.id.my_nav_host_fragment, BillsFragment())
//                return@OnNavigationItemSelectedListener true
//            }
//            R.id.navigation_history -> {
//                addFragment(R.id.my_nav_host_fragment, HistoryFragment())
//                return@OnNavigationItemSelectedListener true
//            }
//            R.id.navigation_profile -> {
//                addFragment(R.id.my_nav_host_fragment, ProfileFragment())
//                return@OnNavigationItemSelectedListener true
//            }
//        }
//        false
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.my_nav_host_fragment) as NavHostFragment
        findViewById<BottomNavigationView>(R.id.navigation)?.let { bottomNavView ->
            NavigationUI.setupWithNavController(bottomNavView, navHostFragment.navController)
        }

//        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
