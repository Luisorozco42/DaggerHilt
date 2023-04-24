package com.example.practicasqlite.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.practicasqlite.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var bindingHome: FragmentHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        bindingHome = FragmentHomeBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return bindingHome.root
    }
}