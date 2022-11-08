package com.technowave.secondreceiverbroadcast

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button?>(R.id.btnRegister).setOnClickListener {
            registerMyReceiver()
        }
        findViewById<Button?>(R.id.btnUnRegister).setOnClickListener {
            unregisterMyReceiver()
        }
    }
    private val myReceiver = MyReceiver()
    private fun registerMyReceiver() {
        val filter = IntentFilter(MY_CUSTOM_EVENT)
        val flag = ContextCompat.RECEIVER_EXPORTED
        //val flag = ContextCompat.RECEIVER_NOT_EXPORTED
        ContextCompat.registerReceiver(this, myReceiver, filter, flag)
    }

    private fun unregisterMyReceiver(){
        unregisterReceiver(myReceiver)
    }

    companion object{
        const val TAG = "MainActivityLog"
        const val MY_CUSTOM_EVENT = "com.technowave.broadcastexample.MY_CUSTOM_BROADCAST"
    }
}