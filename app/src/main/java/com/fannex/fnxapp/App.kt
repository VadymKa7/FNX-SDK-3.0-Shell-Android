package com.fannex.fnxapp

import android.app.Application
import com.fanex.fanexsdk.core.FannexSdk

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        FannexSdk.initFannex(this)
    }
}