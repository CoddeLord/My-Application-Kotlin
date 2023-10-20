package com.coddelord.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.R
import kotlinx.android.synthetic.main.activity_main.text1

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun degistir(view: View){
        text1.text = "I LOVE YOU"
    }
}