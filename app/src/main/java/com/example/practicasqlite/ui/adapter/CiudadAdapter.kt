package com.example.practicasqlite.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.practicasqlite.R
import com.example.practicasqlite.domain.model.CiudadItem

class CiudadAdapter (var context: Context,
                     var listCity: List<CiudadItem>,
                     var vista: View): RecyclerView.Adapter<CiudadAdapter.MyHolder>() {
    inner class MyHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        var cId: TextView
        var cnombre: TextView
        var cPoblacion : TextView

        init {
            cId = itemView.findViewById(R.id.idC)
            cnombre = itemView.findViewById(R.id.tvNombre)
            cPoblacion = itemView.findViewById(R.id.tvPoblacion)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.ciudad_item, parent, false)
        return MyHolder(itemView)
    }

    override fun getItemCount(): Int {
        return listCity.size
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val city = listCity[position]
        holder.cId.text = city.id.toString()
        holder.cnombre.text = city.nombre
        holder.cPoblacion.text = city.poblacion.toString()
    }
}