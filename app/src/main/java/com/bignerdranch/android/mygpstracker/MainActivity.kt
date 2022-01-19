package com.bignerdranch.android.mygpstracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var time : TextView
    private lateinit var labels: TextView
    private lateinit var LatLongAlt: TextView
    private lateinit var velocity: TextView
    private lateinit var velocityVal: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        time = findViewById<TextView>(R.id.time)
        labels = findViewById<TextView>(R.id.LatLongAlt)
        LatLongAlt = findViewById<TextView>(R.id.LatLongAltValue)
        velocity = findViewById<TextView>(R.id.velocity)
        velocityVal = findViewById<TextView>(R.id.velocityValue)
        val button = findViewById<Button>(R.id.mapButton)
        button.setOnClickListener { view ->
            val myIntent = Intent(view.context, MapActivity::class.java)
            startActivityForResult(myIntent, 0)
        }
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onStop() {
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}