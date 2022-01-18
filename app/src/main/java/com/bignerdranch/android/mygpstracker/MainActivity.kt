package com.bignerdranch.android.mygpstracker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val time = findViewById<TextView>(R.id.time)
        val labels = findViewById<TextView>(R.id.LatLongAlt)
        val velocity = findViewById<TextView>(R.id.velocity)
        val velocityVal = findViewById<TextView>(R.id.velocityValue)
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