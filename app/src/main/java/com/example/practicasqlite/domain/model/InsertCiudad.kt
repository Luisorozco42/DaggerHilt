package com.example.practicasqlite.domain.model

import com.example.practicasqlite.data.database.entities.CiudadEntity

data class InsertCiudad(
    val nombre: String,
    val poblacion: Int
)