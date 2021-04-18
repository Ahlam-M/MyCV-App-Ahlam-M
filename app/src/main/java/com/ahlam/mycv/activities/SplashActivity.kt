/*
 * SplashActivity.kt
 *
 * This file was created on 06 Apr 2021
 * for project "MyCV-Ahlam M"
 * Copyright (c) 2021. All rights reserved.
 *
 * by developer Ahlam Mhmd
 * Github : Ahlam-M
 */

package com.ahlam.mycv.activities

import android.content.Intent
import android.graphics.Picture
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.ahlam.mycv.*
import java.util.*
import kotlin.concurrent.schedule


class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        //set values to the views
        findViewById<TextView>(R.id.txt_name).text = InfoSingleton.personal_info.name
        findViewById<TextView>(R.id.txt_profession_title).text = InfoSingleton.personal_info.profession_title


        Timer().schedule(3000){

            //got to intro activity  //TODO FIX to IntoActivity
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            this@SplashActivity.finish()
        }

    }
}