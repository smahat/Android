package com.rjt.playaround

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_main.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle:Bundle? = intent.extras
        var id = bundle?.get("Input");
        var x = id.toString();
        textView4.setText(x).toString()

        button2.setOnClickListener(){
            intent = Intent(this,MainActivity::class.java)

            startActivity(intent)
        }
    }
}
