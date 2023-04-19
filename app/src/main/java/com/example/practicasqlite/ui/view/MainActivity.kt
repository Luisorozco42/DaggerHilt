package com.example.practicasqlite.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.practicasqlite.databinding.ActivityMainBinding
import com.example.practicasqlite.ui.viewmodel.CiudadViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val ciudadViewModel: CiudadViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ciudadViewModel.onCreate()

        ciudadViewModel.modeloCiudad.observe(this) {
            binding.tvNombre.text = it.nombre
        }
    }
}