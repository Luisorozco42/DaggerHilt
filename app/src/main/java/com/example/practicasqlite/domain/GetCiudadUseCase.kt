package com.example.practicasqlite.domain

import com.example.practicasqlite.data.CiudadRepository
import com.example.practicasqlite.domain.model.CiudadItem
import javax.inject.Inject

class GetCiudadUseCase @Inject constructor (private val repository: CiudadRepository) {

    suspend operator fun invoke(): List<CiudadItem>{
        return repository.getAllCitiesFromDB() //De esta manera se obtienen toda la info de la bd
    }
}