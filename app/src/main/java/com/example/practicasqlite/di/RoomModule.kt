package com.example.practicasqlite.di

import android.content.Context
import androidx.room.Room
import com.example.practicasqlite.data.database.CiudadRoomDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    const val CITY_DATABASE_NAME = "ciudad_database"

    @Singleton
    @Provides
    fun provideRoom(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, CiudadRoomDB::class.java, CITY_DATABASE_NAME).build()

    @Singleton
    @Provides
    fun provideCityDao(db:CiudadRoomDB) = db.cityDao()
}