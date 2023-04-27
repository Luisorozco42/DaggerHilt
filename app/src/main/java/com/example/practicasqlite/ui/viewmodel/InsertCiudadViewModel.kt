package com.example.practicasqlite.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.practicasqlite.domain.InsertCiudadUseCase
import com.example.practicasqlite.domain.model.CiudadItem
import com.example.practicasqlite.domain.model.InsertCiudad
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class InsertCiudadViewModel @Inject constructor(
    private val insertCiudadUseCase: InsertCiudadUseCase
): ViewModel() {

    fun insertCity(insertCiudad: InsertCiudad){
        viewModelScope.launch { insertCiudadUseCase.insertCiudad(insertCiudad) }
    }


}