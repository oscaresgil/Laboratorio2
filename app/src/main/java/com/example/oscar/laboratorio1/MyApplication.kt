package com.example.oscar.laboratorio1

import android.app.Application
import com.example.oscar.laboratorio1.Models.MyMenuOrder


internal class MyApplication : Application() {
    val myOrder = MyMenuOrder()
}