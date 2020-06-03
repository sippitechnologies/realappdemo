package com.complete.sensor.ui.hub.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.complete.sensor.R
import com.complete.sensor.data.hub.Hub

class HubAdapter(val hubList:List<Hub>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       val view =  LayoutInflater.from(parent.context).inflate(R.layout.activity_recycler,parent,false)
        return HubViewHolder(view)
    }

    override fun getItemCount(): Int {
      return hubList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val hub = hubList.get(position)
        val hubViewHolder= holder as HubViewHolder
        hubViewHolder.onBind(hub)
    }
}
