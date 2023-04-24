package com.example.practicasqlite.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.practicasqlite.databinding.FragmentShowBinding
import com.example.practicasqlite.ui.viewmodel.CiudadViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ShowFragment : Fragment() {

    private lateinit var bindingShow: FragmentShowBinding
    private val ciudadViewModel: CiudadViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        bindingShow = FragmentShowBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        ciudadViewModel.onCreate()

        ciudadViewModel.modeloCiudad.observe(viewLifecycleOwner){
            bindingShow.tvNombre.text = it.nombre
        }
        return bindingShow.root
    }
}