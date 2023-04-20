package com.example.practicasqlite.domain

import com.example.practicasqlite.data.CiudadRepository
import com.example.practicasqlite.data.database.entities.toDatabase
import com.example.practicasqlite.domain.model.CiudadItem
import javax.inject.Inject

class InsertCiudadUseCase @Inject constructor(private val repository: CiudadRepository) {

    suspend fun insertCiudad(ciudadItem: CiudadItem){
        repository.insertCity(ciudadItem.toDatabase())
    }
}