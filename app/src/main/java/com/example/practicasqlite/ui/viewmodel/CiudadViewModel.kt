package com.example.practicasqlite.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.practicasqlite.domain.GetCiudadUseCase
import com.example.practicasqlite.domain.model.CiudadItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CiudadViewModel @Inject constructor(
    private val getCiudadUseCase: GetCiudadUseCase
) : ViewModel() {

    val modeloCiudad = MutableLiveData<CiudadItem>()
    val cargando = MutableLiveData<Boolean>()
    val ciudad = CiudadItem(1, "Managua", 9000)

    fun onCreate() {
        viewModelScope.launch {
            cargando.postValue(true)
            val resultado = getCiudadUseCase()

            if(!resultado.isEmpty()){
                modeloCiudad.postValue(resultado[0])
                cargando.postValue(false)
            }else{
                modeloCiudad.postValue(ciudad)
                cargando.postValue(false)
            }
        }
    }
}
