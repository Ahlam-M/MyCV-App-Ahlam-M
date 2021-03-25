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
        //val e = JsonParser.ofArray<EntityEdu>("Work Experience")
        //val s = JsonParser.ofArray<String>("Work Experience")

        for (i in 0 until j.size){
            println("v.size " + j[i])
        }

    }
}