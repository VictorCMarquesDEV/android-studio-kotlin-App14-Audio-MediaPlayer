package com.example.app14

import android.media.MediaPlayer
import android.os.Bundle
import androidx.activity.ComponentActivity
import com.example.app14.databinding.ActivityMainBinding

// App14: Audio - MediaPlayer

class MainActivity : ComponentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val mediaPlayer = MediaPlayer.create(applicationContext, R.raw.marinersapartmentcomplex)

        binding.buttonTocar.setOnClickListener {
            mediaPlayer.start()
        }
        binding.buttonStop.setOnClickListener {
            mediaPlayer.stop()
        }
    }
}

