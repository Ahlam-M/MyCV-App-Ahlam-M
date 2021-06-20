/*
 * TypingTerminalEffect.kt
 *
 * Created on 13 Apr 2021
 * for "MyCV-Ahlam M"
 * Copyright (c) 2021. All rights reserved.
 *
 * by developer Ahlam Mhmd
 * Github : Ahlam-M
 */

package com.ahlam.mycv.utilities

import android.os.CountDownTimer
import android.util.Log
import android.widget.TextView

/**
 * This class was created to add typing effect to texts.
 */
interface TypingTerminalEffect {


        /* This method is responsible for showing a string adding to text view
        * with effect of terminal typing  */
        fun startTyping(txt: TextView, string: String) {

            var c = 0

            //start at part 0.015 of second
            //interval set to 0.015 to increase speed of process
            object : CountDownTimer((150 * (string.length)).toLong(), 150) {
                override fun onTick(secondsUntilDone: Long) {

                    //remove cursor (_)
                    try{
                        txt.text = txt.text.substring(0, txt.text.length - 1)

                    } catch (e: Exception) {
                        e.printStackTrace()
                    }

                    //add char to text
                    if(string[c] == '#'){
                        //add > before each newline
                        //txt.text = txt.text.toString().replaceFirst("#", "\n> ")
                        txt.append("\n> ")

                    } else {
                        //add letter

                        txt.append("${string[c]}")
                    }

                    //next letter
                    c++

                    //re-append cursor
                    txt.append("_")
                }

                override fun onFinish(){
                    //start cursor anim (blinking)
                    cursorAnim(txt)

                    //invoke callback
                    this@TypingTerminalEffect.onTypingDone()

                    //cancel timer
                    this.cancel()
                }
            }.start()
        }

        fun cursorAnim(txt: TextView) {

            object : CountDownTimer((500 * 10000).toLong(), 500) {

                override fun onTick(secondsUntilDone: Long) {
                    /* Hide & Show cursor effect */
                    if(txt.text.last() == '_')
                        txt.text = txt.text.toString().removeSuffix("_")
                    else
                        txt.append("_")
                }

                override fun onFinish(){
                    //cancel timer
                    this.cancel()
                }
            }.start()
        }


    //on typing done callback
    fun onTypingDone(){}
}


