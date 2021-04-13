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
abstract class TypingTerminalEffect {

    companion object {

        /* This method is responsible for showing a string adding to text view
        * with effect of terminal typing  */
        fun startTyping(txt: TextView, string: String) {
            val chararray = string.toCharArray()
            var c = 0
            var countAll = chararray.size

            //start at part 0.02 of second
            //interval set to 0.02 to increase speed of motion
            object : CountDownTimer((200 * countAll).toLong(), 200) {
                override fun onTick(secondsUntilDone: Long) {

                    //remove cursor (_)
                    txt.text = txt.text.toString().removeSuffix("_")

                    //add char to text
                    if(chararray[c] == '#'){
                        //add > before each newline
                        txt.text.toString().replace("#", "\n> ")
                        countAll += 2
                        c++
                    } else {
                        txt.append(chararray[c++].toString())
                    }

                    //re-append cursor
                    txt.append("_")
                }
                override fun onFinish(){
                    //start cursor anim
                    cursorAnim(txt)


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
    }

    abstract fun onDone()
}


