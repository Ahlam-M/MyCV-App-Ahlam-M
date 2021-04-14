package com.ahlam.mycv.activities

import android.content.Intent
import android.os.Bundle
import android.view.View.VISIBLE
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.ahlam.mycv.InfoSingleton
import com.ahlam.mycv.R
import com.ahlam.mycv.utilities.TypingTerminalEffect


class IntroActivity : AppCompatActivity() , TypingTerminalEffect {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro)

        //hock views
        val txtTerminal = findViewById<TextView>(R.id.txt_intro)
        val btnNext = findViewById<Button>(R.id.btn_next)

        //button anim slide + show
        val slideLTR: Animation = AnimationUtils.loadAnimation(applicationContext, R.anim.slide_ltr)
        slideLTR.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(arg0: Animation) {}
            override fun onAnimationRepeat(arg0: Animation) {}
            override fun onAnimationEnd(arg0: Animation) {
                //on end show button next
                btnNext.visibility = VISIBLE
            }
        })

        //start showing the text
        val typing = object : TypingTerminalEffect{

            override fun onTypingDone() {
                super.onTypingDone()
                //show button next
                btnNext.startAnimation(slideLTR)
            }
        }
        //start typing
        typing.startTyping(txtTerminal, InfoSingleton.about_me)

        //go to cv
        btnNext.setOnClickListener {
            val intent = Intent(this@IntroActivity, MainActivity::class.java)
            startActivity(intent)
            this@IntroActivity.finish()
        }
    }
}


