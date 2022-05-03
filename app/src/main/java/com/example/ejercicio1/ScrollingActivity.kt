package com.example.ejercicio1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.ejercicio1.databinding.ActivityScrollingBinding
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ScrollingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingBinding

override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)

     findViewById<FloatingActionButton>(R.id.btfloat).setOnClickListener{
         if (findViewById<BottomAppBar>(R.id.btbar).fabAlignmentMode==BottomAppBar.FAB_ALIGNMENT_MODE_CENTER){
             findViewById<BottomAppBar>(R.id.btbar).fabAlignmentMode=BottomAppBar.FAB_ALIGNMENT_MODE_END

             } else{
             findViewById<BottomAppBar>(R.id.btbar).fabAlignmentMode=BottomAppBar.FAB_ALIGNMENT_MODE_CENTER

         }
     }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}