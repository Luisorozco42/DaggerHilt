package com.example.practicasqlite.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.practicasqlite.domain.GetCiudadUseCase
import com.example.practicasqlite.domain.model.CiudadItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel //Esto genera el codigo por detras para poder preparar e injectar en un viewModel
class CiudadViewModel @Inject constructor( // Preparado
    private val getCiudadUseCase: GetCiudadUseCase // Se injecta el caso de uso
) : ViewModel() {

    val modeloCiudad = MutableLiveData<List<CiudadItem>>()
    val cargando = MutableLiveData<Boolean>()
    val ciudad = CiudadItem(0, "No hay datos", 0) //Datos para indicar que esta vacio

    fun onCreate() {
        viewModelScope.launch {
            cargando.postValue(true)
            var resultado = getCiudadUseCase()

            if(!resultado.isEmpty()){
                //Aun no se lista todo con recyclerView
                modeloCiudad.postValue(resultado)
                cargando.postValue(false)
            }else{
                //Se le asigna datos por defecto, mas que todo para indicar la falta de datos
                resultado = listOf(ciudad)
                modeloCiudad.postValue(resultado)
                cargando.postValue(false)
            }
        }
    }
}
