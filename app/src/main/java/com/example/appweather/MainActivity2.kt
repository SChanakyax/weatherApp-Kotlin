package com.example.appweather

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun getData(view: View){
        val editText = findViewById<EditText>(R.id.etCityCode)
        val msg = editText.text.toString()

//val txtView = findViewById<TextView>(R.id).apply { text: msg }

        val intent = Intent(this@MainActivity2 , MainActivity::class.java)
        intent.putExtra("Message", msg)
        startActivity(intent)


    }
}