package com.example.androidintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
    }


    fun setupEvents() {

        dialBtn.setONClickListener{

            val myUri = Uri.parse("tel:01026816612")
            val myIntent=Intent(Intent.ACTION_DIAL, myUri)
            startActivity(myIntent)



        }



    }
}
