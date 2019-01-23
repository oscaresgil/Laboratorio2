package com.example.oscar.laboratorio1.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.oscar.laboratorio1.R
import android.widget.Toast
import android.widget.AdapterView.OnItemClickListener
import com.example.oscar.laboratorio1.MyApplication
import kotlinx.android.synthetic.main.activity_menu.*


class ActivityMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val context = applicationContext as MyApplication


        menu_list.onItemClickListener = OnItemClickListener { parent, view, position, id ->
            val item = menu_list.getItemAtPosition(position) as String

            context.myOrder.add(item) // Logic
            Toast.makeText(baseContext, "Se agregó $item", Toast.LENGTH_LONG).show()
        }

    }

    fun buttonHome(view: View) { finish() }
}
