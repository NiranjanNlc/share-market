package com.example.sharecalculator.fragment

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sharecalculator.viewmodel.AveragePriceViewModel
import com.example.sharecalculator.R


class AveragePrice : Fragment() {

    companion object {
        fun newInstance() = AveragePrice()
    }

    private lateinit var viewModel: AveragePriceViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.average_price_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(AveragePriceViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
