package com.technowave.secondreceiverbroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import com.technowave.secondreceiverbroadcast.MainActivity.Companion.TAG

class MyReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        Log.d(TAG, "Event received from another app")
        Log.d(TAG, "Data ${intent?.getStringExtra("data")}")
    }
}