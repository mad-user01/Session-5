package com.example.cinemaworldtv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentActivity

class MovieScreen : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_screen)
    }

    fun click(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}