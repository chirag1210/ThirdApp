package com.chirag.thirdapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var mTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        mTextView = findViewById(R.id.textView2)

        var firstname: String = intent.getStringExtra("FirstName")

        mTextView.text = "Welcome $firstname, This is Second activity"
    }
}
