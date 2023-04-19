package com.example.practicasqlite.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("tblCiudad")
data class CiudadEntity(

    @PrimaryKey(autoGenerate = true)  @ColumnInfo("idC") val id : Int = 0,
    @ColumnInfo("nombreCiudad") val nombre: String,
    @ColumnInfo("poblacion") val poblacion: Int = 0
)
