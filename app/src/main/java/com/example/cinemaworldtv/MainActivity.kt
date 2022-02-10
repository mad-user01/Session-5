package com.example.cinemaworldtv

import android.content.Intent
import android.os.Bundle
import android.text.method.MovementMethod
import android.view.View
import androidx.fragment.app.FragmentActivity

/**
 * Loads [MainFragment].
 */
class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun click(view: View) {
        val intent = Intent(this, MovieScreen::class.java)
        startActivity(intent)
    }

    fun c211211(view: View) {
        val intent = Intent(this, MovieScreen::class.java)
        startActivity(intent)
    }
}