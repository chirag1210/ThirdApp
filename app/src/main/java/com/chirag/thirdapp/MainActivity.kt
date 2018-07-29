package com.chirag.thirdapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(),View.OnClickListener {

    private lateinit var mBtnNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mBtnNext = findViewById(R.id.button)

        mBtnNext.setOnClickListener(this)
    }
    override fun onClick(view: View?) {

        when(view?.id){
            R.id.button ->{
                val intent = Intent(this@MainActivity,SecondActivity::class.java)
                intent.putExtra("FirstName","Chirag")
                startActivity(intent)
            }
        }
    }
}
