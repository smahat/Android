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
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle = intent.extras;
        val input = bundle?.get("inputValue");
        // layout
        Toast.makeText(applicationContext,input.toString(),Toast.LENGTH_LONG).show()

        button2.setOnClickListener()
        {
           intent = Intent(this, MainActivity::class.java)
           startActivity(intent);
        }


     // here.. bundle = intent bundle.extras.
        //get value passed from intent.
        // on the show_text layout of secondActivuty.xml pass in value of string from
            //the intent.
        //
        //setListener on the button
        //{
        //  Intent (this, MainActivity::java)
        //}

    }
}
