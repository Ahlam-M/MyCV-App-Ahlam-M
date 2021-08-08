/*
 * SplashActivity.kt
 *
 * This file was created on 06 Apr 2021
 * for project "MyCV-Ahlam M"
 * Copyright (c) 2021. All rights reserved.
 *
 * by developer Ahlam Mhmd
 * Github : Ahlam-m
 */

package com.ahlam.mycv.activities

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.ahlam.mycv.*
import com.ahlam.mycv.utilities.typeface
import java.util.*
import kotlin.concurrent.schedule


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //set custom font
        typeface(this@SplashActivity)

        //set values to the views
        findViewById<TextView>(R.id.txt_name).text = InfoSingleton.personal_info.name
        findViewById<TextView>(R.id.txt_profession_title).text = InfoSingleton.personal_info.profession_title


        Timer().schedule(3000){
            //go to intro activity
            val intent = Intent(this@SplashActivity, IntroActivity::class.java)
            startActivity(intent)
            this@SplashActivity.finish()
        }
    }
}