package com.example.multiscrencafeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.btnOrder
import kotlinx.android.synthetic.main.activity_main.edT1
import kotlinx.android.synthetic.main.activity_main.edT2
import kotlinx.android.synthetic.main.activity_main.edT3
import kotlinx.android.synthetic.main.activity_main.edT4


class MainActivity : AppCompatActivity() {

    companion object {
        const val KEY = "com.example.multiscrencafeapp"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnOrder.setOnClickListener {
            // Variable for store user order
            val orderPlace = edT1.text.toString() + "\n" + edT2.text.toString() + "\n" +
                    edT3.text.toString() + "\n" + edT4.text.toString()

            intent = Intent(this, order::class.java)
            intent.putExtra(KEY, orderPlace)
            startActivity(intent)
        }

    }
}