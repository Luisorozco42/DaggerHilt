package com.example.practicasqlite.data.database

import androidx.room.Database
import com.example.practicasqlite.data.database.dao.CiudadDao
import com.example.practicasqlite.data.database.entities.CiudadEntity
import androidx.room.RoomDatabase

@Database(entities = [CiudadEntity::class], version = 1, exportSchema = false)
abstract class CiudadRoomDB : RoomDatabase(){
    abstract fun cityDao(): CiudadDao
}