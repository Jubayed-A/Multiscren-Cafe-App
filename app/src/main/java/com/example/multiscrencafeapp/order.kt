package com.example.multiscrencafeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_order.tvOrder

class order : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order)

        val ordersOfCustomer = intent.getStringExtra(MainActivity.KEY)

        tvOrder.text = "Order Placed : \n" + ordersOfCustomer.toString()

    }
}