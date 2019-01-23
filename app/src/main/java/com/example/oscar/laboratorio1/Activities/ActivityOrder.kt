package com.example.oscar.laboratorio1.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.oscar.laboratorio1.MyApplication
import com.example.oscar.laboratorio1.R
import kotlinx.android.synthetic.main.activity_order.*

class ActivityOrder : AppCompatActivity() {

    private lateinit var context: MyApplication

    lateinit var itemsAdapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

//        Contexto que guarda mi objeto "myOrder"
        context = applicationContext as MyApplication

//        Adaptador de la lista
        itemsAdapter = ArrayAdapter<String>(this, R.layout.order_list_item, context.myOrder.menuOrder)

        order_list.adapter = itemsAdapter

//        Callback hacia OnItemLongClickListener
        order_list.onItemLongClickListener = AdapterView.OnItemLongClickListener { parent, view, position, id ->
            context.myOrder.del(position) // Logica

//            Este método notifica al ListView que el Adapter cambió para actualizar la lista
            itemsAdapter.notifyDataSetChanged()
            Toast.makeText(baseContext, "Se eliminó un item", Toast.LENGTH_LONG).show()
            true
        }

    }

    /*
    * Sobreescrible */
    fun buttonClear(view: View) {
        Intent(this, MainActivity::class.java)
        context.myOrder.clear() // Logica
        itemsAdapter.notifyDataSetChanged()
        Toast.makeText(baseContext, "Se limpió la órden.", Toast.LENGTH_LONG).show()
    }

    fun buttonDone(view: View) {
        context.myOrder.done() //Logica
        itemsAdapter.notifyDataSetChanged()
        Toast.makeText(baseContext, "Se realizó el pedido con éxito.", Toast.LENGTH_LONG).show()
    }

    fun buttonHome(view: View) { finish() }

}
