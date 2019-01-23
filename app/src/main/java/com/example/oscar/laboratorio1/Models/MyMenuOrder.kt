package com.example.oscar.laboratorio1.Models

class MyMenuOrder: MenuOrder {

    override val menuOrder: ArrayList<String> = arrayListOf()

    override fun clear() {
        menuOrder.clear()
    }

    override fun add(element: String) {
        menuOrder.add(element)
    }

    override fun del(elementIndex: Int) {
        menuOrder.removeAt(elementIndex)
    }

    override fun done() {
        clear()
    }

}