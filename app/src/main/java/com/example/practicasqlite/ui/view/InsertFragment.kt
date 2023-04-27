package com.example.practicasqlite.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.viewModels
import com.example.practicasqlite.databinding.FragmentInsertBinding
import com.example.practicasqlite.domain.model.CiudadItem
import com.example.practicasqlite.domain.model.InsertCiudad
import com.example.practicasqlite.ui.viewmodel.InsertCiudadViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class InsertFragment : Fragment() {

    private lateinit var bindingInsert: FragmentInsertBinding
    private val insertCiudadViewModel: InsertCiudadViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        bindingInsert = FragmentInsertBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        bindingInsert = FragmentInsertBinding.inflate(layoutInflater)
        val add: Button = bindingInsert.btnAdd
        add.setOnClickListener{
            insertCiudadViewModel.insertCity(insertarCity())
            limpiarCasillas()
        }
        return bindingInsert.root
    }

    private fun limpiarCasillas() {
        val nombre = bindingInsert.etName
        val poblacion = bindingInsert.etPopulation
        nombre.setText("")
        poblacion.setText("")
    }

    private fun insertarCity(): InsertCiudad {
        return InsertCiudad(
            bindingInsert.etName.text.toString(),
            bindingInsert.etPopulation.text.toString().toInt()
        )
    }
}