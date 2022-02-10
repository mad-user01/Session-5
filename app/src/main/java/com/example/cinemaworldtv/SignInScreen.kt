package com.example.cinemaworldtv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import kotlinx.android.synthetic.main.activity_sign_in_screen.*

class SignInScreen : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_screen)
    }

    fun login(view: View) {
        val x = email12.getText().toString()
        val y = textView.getText().toString()
        if (x.isEmpty() or y.isEmpty()){
            val text = "Пустые поля!"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()
        }
        else{
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)}
    }
}