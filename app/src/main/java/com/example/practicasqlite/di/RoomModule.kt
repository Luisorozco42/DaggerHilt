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

@Module //Esto tiene que ser un modulo, este modulo funciona para dar a entender que las clases continuas se anotaran al grafo de injecciones
@InstallIn(SingletonComponent::class) //Se instala la clase del patron Sigleton para poder usarlo
object RoomModule {

    const val CITY_DATABASE_NAME = "ciudad_database" //nombre de la BD que es constante

    @Singleton //patron singleton
    @Provides //se prepara para proveer lo que esta debajo
    fun provideRoom(@ApplicationContext context: Context) =
        Room.databaseBuilder(context, CiudadRoomDB::class.java, CITY_DATABASE_NAME).build() //Se provee la creacion de la BD

    @Singleton
    @Provides
    fun provideCityDao(db:CiudadRoomDB) = db.cityDao()//De esta manera se prepara el dao o mejor dicho una interfaz
}