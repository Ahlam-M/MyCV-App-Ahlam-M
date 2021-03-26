/*
 * MyApplication.kt
 *
 * This file was created on 25 Mar 2021
 * for project "MyCV-Ahlam M"
 * Copyright (c) 2021. All rights reserved.
 *
 * by developer Ahlam Mhmd
 * Github : Ahlam-M
 */

package com.ahlam.mycv

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context


fun getStr(id : Int) : String {
    return MyApplication.globalContext.getString(id)
}

class MyApplication : Application() {

    companion object {
        @SuppressLint("StaticFieldLeak")
        lateinit var globalContext: Context
    }

    override fun onCreate() {
        super.onCreate()
        globalContext = this.applicationContext
    }
}
