package com.complete.sensor.ui.hub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.complete.sensor.R
import com.complete.sensor.data.hub.Hub
import com.complete.sensor.ui.hub.adapter.HubAdapter
import kotlinx.android.synthetic.main.activity_recycler.*

class hubactivity : AppCompatActivity() {
val hubList= listOf<Hub>(Hub(R.drawable.house,"house","9877725489"),
    Hub(R.drawable.house,"house","9877725489"),
    Hub(R.drawable.house,"house","9877725489"),
    Hub(R.drawable.house,"house","9877725489"),
    Hub(R.drawable.house,"house","9877725489"),
    Hub(R.drawable.house,"house","9877725489"),
    Hub(R.drawable.house,"house","9877725489"),
    Hub(R.drawable.house,"house","9877725489"))
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hubactivity)
        val hubAdapter= HubAdapter(hubList)
        recyclertry.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclertry.adapter=hubAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.hubmenu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       if (item.itemId== R.id.menu_add_icon)
       {
           Toast.makeText(this," You Clicked Add ",Toast.LENGTH_LONG).show()
       }
        if(item.itemId== R.id.menu_settings_icon){
            Toast.makeText(this,"You Clicked Settings",Toast.LENGTH_LONG).show()
        }
        return super.onOptionsItemSelected(item)
    }
}
