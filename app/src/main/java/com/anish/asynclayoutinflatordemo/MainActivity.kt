package com.anish.asynclayoutinflatordemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ViewGroup
import androidx.asynclayoutinflater.view.AsyncLayoutInflater
import androidx.asynclayoutinflater.view.AsyncLayoutInflater.OnInflateFinishedListener
import com.anish.asynclayoutinflatordemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val content = findViewById<ViewGroup>(android.R.id.content)

        AsyncLayoutInflater(this).inflate(R.layout.activity_main, content) { view, _, _ ->

            binding = ActivityMainBinding.bind(view)
            setContentView(view)

        }
    }
}