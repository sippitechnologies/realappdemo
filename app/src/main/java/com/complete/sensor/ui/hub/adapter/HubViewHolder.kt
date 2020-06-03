package com.complete.sensor.ui.hub.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.complete.sensor.R
import com.complete.sensor.data.hub.Hub
import kotlinx.android.synthetic.main.testlabe.view.*


class HubViewHolder (view: View): RecyclerView.ViewHolder(view) {
    var title: TextView
    var phoneNumber: TextView
    var image: ImageView

    init {
title= view.findViewById(R.id.textView53)
        phoneNumber=view.findViewById(R.id.textView54)
        image=view.findViewById(R.id.imageView15)
    }
  fun  onBind(hub: Hub){
      title.text=hub.title
      phoneNumber.text=hub.phoneNumber
      image.setImageResource(hub.image)
  }
}