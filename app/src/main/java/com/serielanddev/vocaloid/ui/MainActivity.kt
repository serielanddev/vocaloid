package com.serielanddev.vocaloid.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.serielanddev.vocaloid.Vocaloid
import com.serielanddev.vocaloid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(root);
        }

        binding.btnInit.setOnClickListener {
            Vocaloid().init();
        }
    }
}