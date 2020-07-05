package com.example.runningapp.ui.viewmodels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.example.runningapp.repositories.MainRepository

class StatisticsViewModel @ViewModelInject constructor(
    private val mainRepository: MainRepository
) :ViewModel() {
}