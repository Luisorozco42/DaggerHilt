package com.example.practicasqlite.data

import androidx.annotation.WorkerThread
import com.example.practicasqlite.data.database.dao.CiudadDao
import com.example.practicasqlite.data.database.entities.CiudadEntity
import com.example.practicasqlite.domain.model.CiudadItem
import com.example.practicasqlite.domain.model.toDomain
import javax.inject.Inject

class CiudadRepository @Inject constructor (
    private val ciudadDao: CiudadDao
    ) {//Injectamos directamente del dao y preparaciin de la clase

    suspend fun getAllCitiesFromDB(): List<CiudadItem> {
        val response: List<CiudadEntity> = ciudadDao.getAllCity()
        return response.map { it.toDomain() } //Se utiliza el mapper para cambiar a la nueva data class
    }

    @WorkerThread
    suspend fun insertCity(ciudad:CiudadEntity){
        ciudadDao.insertCity(ciudad)
    }
}