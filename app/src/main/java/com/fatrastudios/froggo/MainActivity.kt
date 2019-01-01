package com.fatrastudios.froggo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

     //set up for button click
    val myBtn = findViewById<Button>(R.id.buttonweather)

        //once the button is clicked
    myBtn.setOnClickListener {
        Toast.makeText(this, "Button was clicked", Toast.LENGTH_LONG).show()
        
    }
    }


	}
