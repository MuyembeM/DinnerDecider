package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var arr:ArrayList<String> = arrayListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese" )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addFood(view: View){
        var tView:TextView = findViewById<TextView>(R.id.textView)
        var eText:EditText = findViewById<EditText>(R.id.editText)
        var food = eText.text

        arr.add(food.toString())

        Toast.makeText(this, "$food added to menu!", Toast.LENGTH_SHORT).show()
        eText.text.clear()
    }

    fun decide(view:View){
        var tView:TextView = findViewById<TextView>(R.id.textView)

        val rnd = (0 until (arr.size - 1)).random()
        tView.text = arr[rnd]
    }
}