package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

//MainActivity is an instance of AppCompactActivity
class MainActivity : AppCompatActivity() {

    //onCreate = main() function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //Display UI. R = resources
        setContentView(R.layout.activity_main)
        //TODO : Continue your code here
        //val = value, var = variable
        //Linking code to UI
        val buttonShowName: Button = findViewById(R.id.buttonShowName)
        buttonShowName.setOnClickListener { showName() }
        Reset.setOnClickListener { resetName() }
    }

    private fun showName() {
        textViewName.setText("Hello Kah Hoe")
    }

    private fun resetName() {
        textViewName.setText("Hello World!")
    }
}

