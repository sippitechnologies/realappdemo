package com.complete.sensor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class hubactivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hubactivity)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.hubmenu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       if (item.itemId==R.id.menu_add_icon)
       {
           Toast.makeText(this," You Clicked Add ",Toast.LENGTH_LONG).show()
       }
        if(item.itemId==R.id.menu_settings_icon){
            Toast.makeText(this,"You Clicked Settings",Toast.LENGTH_LONG).show()
        }
        return super.onOptionsItemSelected(item)
    }
}
