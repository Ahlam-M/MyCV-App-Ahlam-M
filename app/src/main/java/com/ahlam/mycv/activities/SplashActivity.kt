package com.ahlam.mycv.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ahlam.mycv.*
import com.ahlam.mycv.model.EntityEdu

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        val j = JsonParser.ofArray<String>("Languages I Speak")


    }
}