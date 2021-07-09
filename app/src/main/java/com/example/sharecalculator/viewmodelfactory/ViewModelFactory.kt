package com.example.luckyseven.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory (private val repository: Repo): ViewModelProvider.Factory
{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}