package com.example.sharecalculator.fragment

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sharecalculator.viewmodel.BonusViewModel
import com.example.sharecalculator.R


class Bonus : Fragment() {

    companion object {
        fun newInstance() = Bonus()
    }

    private lateinit var viewModel: BonusViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.bonus_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BonusViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
