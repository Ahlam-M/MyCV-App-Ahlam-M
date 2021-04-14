package com.ahlam.mycv.activities

import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
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
            InfoSingleton.about_me
        )


        val slide_ltr: Animation = AnimationUtils.loadAnimation(
            applicationContext,
            R.anim.slide_ltr
        )
        findViewById<TextView>(R.id.btn_next).startAnimation(slide_ltr)
    }

}