package com.example.ejercicio1

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.example.ejercicio1.R.string.message_action_sucess
import com.example.ejercicio1.databinding.ActivityScrollingBinding
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar

class ScrollingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingBinding




override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)

     binding.btfloat.setOnClickListener{
         if (binding.btbar.fabAlignmentMode==BottomAppBar.FAB_ALIGNMENT_MODE_CENTER){
             binding.btbar.fabAlignmentMode=BottomAppBar.FAB_ALIGNMENT_MODE_END

             } else{
             binding.btbar.fabAlignmentMode=BottomAppBar.FAB_ALIGNMENT_MODE_CENTER

         }
     }
    binding.btbar.setNavigationOnClickListener{
        Snackbar.make( binding.root, message_action_sucess, Snackbar.LENGTH_LONG).setAnchorView(binding.btbar).show()

    }

    binding.contenido.btSkin!!.setOnClickListener{ binding.contenido.mcontenido!!.visibility=View.GONE }
      //  Toast.makeText(this, "los", Toast.LENGTH_LONG)


        binding.contenido.btcomprar!!.setOnClickListener {
        Snackbar.make(it, R.string.card_comprando, Snackbar.LENGTH_LONG)
            .setAnchorView(binding.btfloat)
            .setAction(R.string.card_to_go, {
            Toast.makeText(this, R.string.card_historial, Toast.LENGTH_SHORT).show()
        }).show()
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