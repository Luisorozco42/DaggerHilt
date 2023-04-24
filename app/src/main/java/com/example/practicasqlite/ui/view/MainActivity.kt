package com.example.practicasqlite.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import com.example.practicasqlite.R
import com.example.practicasqlite.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint //Gracias a esto dagger Hilt se encarga de crear todo el codigo por detras, y prepara la clase para poder injectar a otras
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = findViewById(R.id.bottom_nav)
        navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        navView.setupWithNavController(navController)
    }
}