package com.example.practicasqlite.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.practicasqlite.databinding.FragmentShowBinding
import com.example.practicasqlite.domain.model.CiudadItem
import com.example.practicasqlite.ui.adapter.CiudadAdapter
import com.example.practicasqlite.ui.viewmodel.CiudadViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ShowFragment : Fragment() {

    private lateinit var bindingShow: FragmentShowBinding
    private val ciudadViewModel: CiudadViewModel by viewModels()
    private lateinit var recyclerView: RecyclerView

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
            setAdapter(it)
        }
        return bindingShow.root
    }

    fun setAdapter(lista: List<CiudadItem>){//
        recyclerView = bindingShow.rvCiudad
        recyclerView.layoutManager = LinearLayoutManager(requireActivity())
        recyclerView.adapter = CiudadAdapter(requireActivity(), lista)
    }
}