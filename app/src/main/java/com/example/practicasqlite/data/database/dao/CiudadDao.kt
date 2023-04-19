package com.example.practicasqlite.data.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.practicasqlite.data.database.entities.CiudadEntity

@Dao
interface CiudadDao {

    @Query("SELECT * FROM tblCiudad ORDER BY nombreCiudad DESC")
    suspend fun getAllCity(): List<CiudadEntity>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertCity(ciudad: CiudadEntity)

    @Update
    suspend fun updateCity(ciudad: CiudadEntity)

    @Delete
    suspend fun deleteCity(ciudad: CiudadEntity)
}