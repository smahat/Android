package com.rjt.userinput

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        button.setOnClickListener()
        {
            val inputValue: String = editText.text.toString()

            if (inputValue == null || inputValue.trim() == "") {
                Toast.makeText(
                    this,
                    "please input data, edit text cannot be blank",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                intent = Intent(this, SecondActivity::class.java);
                intent.putExtra("StringPut", inputValue)
                startActivity(intent)
            }
        }
    }
}
