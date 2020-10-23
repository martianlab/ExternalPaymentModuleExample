package com.example.externalpaymentmodule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    override fun onStart() {
        super.onStart()

        button.setOnClickListener {
            setResult(RESULT_OK, Intent().apply {
                putExtra("result", "ok")
                putExtra("device", "ext device")
            })
            finish()
        }
    }


}