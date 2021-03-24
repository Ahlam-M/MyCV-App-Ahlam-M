package com.ahlam.mycv

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context
import android.content.res.AssetManager


class MyApplication : Application() {

    companion object {
        //static members
        @SuppressLint("StaticFieldLeak")
        lateinit var globalContext: Context
    }

    override fun onCreate() {
        super.onCreate()
        globalContext = this.applicationContext
    }

}