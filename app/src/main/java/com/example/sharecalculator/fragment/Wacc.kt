package com.example.sharecalculator.fragment

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sharecalculator.R
import com.example.sharecalculator.viewmodel.WaccViewModel


class Wacc : Fragment() {

    companion object {
        fun newInstance() = Wacc()
    }

    private lateinit var viewModel: WaccViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.wacc_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(WaccViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
