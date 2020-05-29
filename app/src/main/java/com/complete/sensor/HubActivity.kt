package com.complete.sensor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class HubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hub)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
         menuInflater.inflate(R.menu.hubmenu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId)
        {
            R.id.menu_add_hub-> Toast.makeText(this,"Add is Clicked",Toast.LENGTH_LONG).show()
            else->  Toast.makeText(this,"Settings  is Clicked",Toast.LENGTH_LONG).show()
        }

        return super.onOptionsItemSelected(item)
    }
}
