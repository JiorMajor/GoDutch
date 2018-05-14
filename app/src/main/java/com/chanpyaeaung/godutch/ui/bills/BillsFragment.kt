package com.chanpyaeaung.godutch.ui.bills

import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.chanpyaeaung.godutch.R


class BillsFragment : Fragment() {

    companion object {
        fun newInstance() = BillsFragment()
    }

    private lateinit var viewModel: BillsViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.bills_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BillsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
