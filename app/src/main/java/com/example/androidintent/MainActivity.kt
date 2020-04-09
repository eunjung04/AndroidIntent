package com.example.androidintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    fun setupEvents() {
        dialBtn.setOnClickListener(){



            val inputPhoneNumber=PhoneBtn.text.toString()

            val myUri = Uri.parse("tel:01026816612")
            val myIntent=Intent(Intent.ACTION_DIAL, myUri)
            startActivity(myIntent)



        }

        callBtn.setOnClickListener(){


            val inputPhoneNumber=PhoneBtn.text.toString()

            val myUri = Uri.parse("tel:01026816612")
            val myIntent=Intent(Intent.ACTION_CALL, myUri)
            startActivity(myIntent)


        }
        smsBtn.setOnClickListener(){


            val inputPhoneNumber=PhoneBtn.text.toString()

            val myUri = Uri.parse("smsto${inputPhoneNumber}")
            val myIntent=Intent(Intent.ACTION_SENDTO, myUri)
            myIntent.putExtra("sms_body", "자동 입력 내용")
            startActivity(myIntent)

        }



    }
}
