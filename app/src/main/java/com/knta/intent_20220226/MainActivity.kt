package com.knta.intent_20220226

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOther.setOnClickListener {

            val myIntent = Intent(this,OtherActivity::class.java)
            startActivity(myIntent)



        }
    }
}