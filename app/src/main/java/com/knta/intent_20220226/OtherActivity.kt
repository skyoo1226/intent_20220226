package com.knta.intent_20220226

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_other.*

class OtherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        btnRetun.setOnClickListener {

            val  myIntent: Intent = Intent(this,OtherActivity::class.java)
            // startActivity(myIntent)

            finish()
        }
    }
}