/*
 * TypingTerminalEffect.kt
 *
 * This file was created on 10 Apr 2021
 * for project "MyCV-Ahlam M"
 * Copyright (c) 2021. All rights reserved.
 *
 * by developer Ahlam Mhmd
 * Github : Ahlam-M
 */

package com.ahlam.mycv.utilities

import android.os.CountDownTimer
import android.widget.TextView


class TypingTerminalEffect {

    companion object {

        fun startTyping(txt: TextView, string: String) {

            val chararray = string.toCharArray()
            var c = 0

            //start at part 0.02 of second
            //interval set to 0.02 to increase speed of motion
            object : CountDownTimer((200 * chararray.size).toLong(), 200) {
                override fun onTick(secondsUntilDone: Long) {

                    txt.text = txt.text.toString().removeSuffix("_")
                    txt.append(chararray[c++].toString())
                    txt.append("_")
                }
                override fun onFinish(){
                    cursorAnim(txt)
                    this.cancel()
                }
            }.start()
        }

        fun cursorAnim(txt: TextView) {
            object : CountDownTimer((500 * 10000).toLong(), 500) {
                override fun onTick(secondsUntilDone: Long) {

                    if(txt.text.last() == '_')
                        txt.text = txt.text.toString().removeSuffix("_")
                    else
                        txt.append("_")
                }
                override fun onFinish(){}
            }.start()
        }
    }
}


