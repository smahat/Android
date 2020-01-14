package com.rjt.playaround
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener()
        {
            val  inputValue = editText.text.toString();
            if(inputValue == null|| inputValue.trim()=="")
            {
                Toast.makeText(this, "The String can't be blank", Toast.LENGTH_LONG).show()
            }
            else {
                intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("Input", inputValue);
                startActivity(intent)
            }

            }
        }
    }

