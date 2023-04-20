package com.example.practicasqlite.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.practicasqlite.domain.model.CiudadItem

@Entity("tblCiudad")
data class CiudadEntity(

    @PrimaryKey(autoGenerate = true)  @ColumnInfo("idC") val id : Int = 0, //Asi se crea una tabla con room
    @ColumnInfo("nombreCiudad") val nombre: String,
    @ColumnInfo("poblacion") val poblacion: Int = 0
)

fun CiudadItem.toDatabase() = CiudadEntity(nombre = nombre, poblacion = poblacion)
