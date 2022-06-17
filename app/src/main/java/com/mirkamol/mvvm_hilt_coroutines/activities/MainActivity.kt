package com.mirkamol.mvvm_hilt_coroutines.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mirkamol.mvvm_hilt_coroutines.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}