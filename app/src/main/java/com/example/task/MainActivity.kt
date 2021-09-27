package com.example.task

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var personname:EditText
    lateinit var personlocation:EditText
    lateinit var personnumber:EditText
    lateinit var buttonTo:Button
    lateinit var buttonTv:Button
    lateinit var buttonAc: Button
    lateinit var textView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        personname=findViewById(R.id.PersonName)
        personnumber=findViewById(R.id.personNumber)
        personlocation=findViewById(R.id.PersonLocation)
        buttonTo=findViewById(R.id.buttonTo)
        buttonTv=findViewById(R.id.buttonTv)
        buttonAc=findViewById(R.id.buttonAC)
        textView=findViewById(R.id.textView)
        val info= listOf(personname.text,personlocation.text,personnumber.text)

        buttonTv.setOnClickListener(){
            textView.text ="${info[0]},${info[1]},${info[2]}"
        }

        buttonTo.setOnClickListener(){
            Toast.makeText(applicationContext,"${info[0]},${info[1]},${info[2]}",Toast.LENGTH_LONG).show()
        }

        buttonAc.setOnClickListener(){
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("number","${info[0]},${info[1]},${info[2]}")
            startActivity(intent)
        }

    }
}