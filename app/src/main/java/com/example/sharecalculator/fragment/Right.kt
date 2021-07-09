package com.example.sharecalculator.fragment

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sharecalculator.R
import com.example.sharecalculator.viewmodel.RightViewModel


class Right : Fragment() {

    companion object {
        fun newInstance() = Right()
    }

    private lateinit var viewModel: RightViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.right_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(RightViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
