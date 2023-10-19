package com.example.actionbar

import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuInflater

import android.view.MenuItem
import android.view.View

import android.widget.EditText

import android.widget.Toast
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    lateinit var email:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        email=findViewById(R.id.email)
        registerForContextMenu(email)
    }


    //to show custom component on our app
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater:MenuInflater=menuInflater
        inflater.inflate(R.menu.action_bar,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.actionBar ->{
                Toast.makeText(this,"Menu search selectionné !",Toast.LENGTH_SHORT).show()
                return true
            }R.id.Favorite ->{
                Toast.makeText(this,"Menu favorite selectionné !",Toast.LENGTH_SHORT).show()
                return true
            }R.id.Share ->{
                Toast.makeText(this,"Menu share selectionné !",Toast.LENGTH_SHORT).show()
                return true
            }R.id.Whatsapp ->{
                Toast.makeText(this,"Menu Whatsapp selectionné !",Toast.LENGTH_SHORT).show()
                return true
            }R.id.Instagram ->{
                Toast.makeText(this,"Menu Instagram selectionné !",Toast.LENGTH_SHORT).show()
                return true
            }else ->super.onOptionsItemSelected(item)

        }

    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        val inflater:MenuInflater=menuInflater
        inflater.inflate(R.menu.context_menu,menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {

        return when (item.itemId){
            R.id.search ->{
                Toast.makeText(applicationContext,"Search is selected",Toast.LENGTH_LONG).show()
                email.setText("Search")
                true
            }R.id.ch1 ->{
                Toast.makeText(applicationContext,"Ch1 is selected",Toast.LENGTH_SHORT).show()
                email.setText("Ch1")
                true
            }else->super.onContextItemSelected(item)
        }
    }
}

