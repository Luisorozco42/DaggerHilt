package com.example.practicasqlite.domain.model

import com.example.practicasqlite.data.database.entities.CiudadEntity

data class CiudadItem(
    val id: Int,
    val nombre: String,
    val poblacion: Int
)
fun CiudadEntity.toDomain() = CiudadItem(id, nombre, poblacion) //Esto es un mapper, se usa para mapear distintas data class con datos similares
//mapper cambia el diseño de la clase para adaptarse a otra