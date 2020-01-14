package com.rjt.myapplication2



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log;
import android.widget.Toast;
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.second_activity.*

class SecondActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity)

        //what is bundle?

        val bundle:Bundle? = intent.extras

        val id = bundle?.get("id_value")
        val language = bundle?.get("language_value")
        Toast.makeText(applicationContext, id.toString()+ " " + language, Toast.LENGTH_LONG).show()
        button2.setOnClickListener()
        {
            intent = Intent(this, MainActivity :: class.java)
            startActivity(intent)
        }
    }


}