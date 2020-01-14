package com.rjt.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log;
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
       val id = 10
    val language = "kotlin"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("lifecycle", "onCreate invoked")

        button.setOnClickListener()
        {
           intent = Intent(this,SecondActivity::class.java ); // SecondActivity:: class.java
            intent.putExtra("id_value", id)
            intent.putExtra("language_value", language)
            startActivity(intent)

        }

    }
}
