package com.example.cooklog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.cooklog.ui.home.HomeFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        // IMPORTANT: this must be called BEFORE super.onCreate
        setTheme(R.style.Theme_Cooklog)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, HomeFragment())
                .commit()
        }
    }
}
