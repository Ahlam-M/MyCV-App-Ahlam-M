package com.ahlam.mycv.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView
import com.ahlam.mycv.InfoSingleton
import com.ahlam.mycv.R
import com.ahlam.mycv.utilities.TypingTerminalEffect


class IntroActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        //start showing the text
        TypingTerminalEffect.startTyping(
            findViewById<TextView>(R.id.txt_intro),
            InfoSingleton.about_me)
    }

}