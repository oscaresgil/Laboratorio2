package com.example.oscar.laboratorio1.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import com.example.oscar.laboratorio1.R


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun buttonMenu(view: View) { startActivity(Intent(this, ActivityMenu::class.java)) }
    fun buttonOrder(view: View) { startActivity(Intent(this, ActivityOrder::class.java)) }
}

