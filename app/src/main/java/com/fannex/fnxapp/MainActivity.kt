package com.fannex.fnxapp

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fanex.fanexsdk.core.FannexSdk
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // FannexSdk.initFannex(context = this as Application)


        fnxIndex.sedDataFnxIndex("https://interactivepd.fnxapp.com/api/", "und", isActive = true)
    }
}
