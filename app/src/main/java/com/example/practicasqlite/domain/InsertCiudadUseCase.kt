package com.example.practicasqlite.domain

import com.example.practicasqlite.data.CiudadRepository
import com.example.practicasqlite.data.database.entities.toDatabase
import com.example.practicasqlite.domain.model.InsertCiudad
import javax.inject.Inject

class InsertCiudadUseCase @Inject constructor(
    private val repository: CiudadRepository
    ) {

    suspend fun insertCiudad(insertCiudad: InsertCiudad){
        repository.insertCity(insertCiudad.toDatabase())
    }
}