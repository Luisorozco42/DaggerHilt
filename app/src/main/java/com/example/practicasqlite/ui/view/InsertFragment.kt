package com.example.practicasqlite.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.practicasqlite.databinding.FragmentInsertBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class InsertFragment : Fragment() {

    private lateinit var bindingInsert: FragmentInsertBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        bindingInsert = FragmentInsertBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        return bindingInsert.root
    }
}