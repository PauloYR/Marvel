package com.paulo.marvel

import androidx.lifecycle.ViewModel
import com.paulo.marvel.mock.MockRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val mockRepository: MockRepository
): ViewModel() {
    fun getLabel() = mockRepository.getLabel()
}