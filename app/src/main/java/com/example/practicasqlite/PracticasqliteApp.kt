package com.example.practicasqlite

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp //Esto construye por detras todo lo que tiene que ver con dagger hilt, en otras palabras asi de facil se puede usar Hilt
class PracticasqliteApp: Application() //Esta wea extiende directamente de la app

//postdata: para poder injectar ambas clases tienen que estar preparadas