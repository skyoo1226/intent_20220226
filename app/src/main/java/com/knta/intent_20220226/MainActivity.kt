package com.knta.intent_20220226

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.btnOther as btnOther1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnOther1.setOnClickListener {

            val myIntent = Intent(this,OtherActivity::class.java)
            startActivity(myIntent)


        }


        btnSend.setOnClickListener {

            val myIntent = Intent(this,ViewMessageActivity::class.java)
            myIntent.putExtra("메세지", )
        }
    }
}