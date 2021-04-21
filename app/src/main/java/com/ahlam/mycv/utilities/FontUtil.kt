/*
 * FontUtil.kt
 *
 * Created on 20 Apr 2021
 * for "MyCV-Ahlam M"
 * Copyright (c) 2021. All rights reserved.
 *
 * by developer Ahlam Mhmd
 * Github : Ahlam-M
 */

package com.ahlam.mycv.utilities

import android.app.Activity
import android.content.Context
import android.graphics.Typeface

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.ahlam.mycv.MyApplication

//* enum for fonts types in this app *//
enum class MyFonts {
    DEFAULT, TERMINAL
}

//* fonts utils class *//
class FontUtil {

    companion object {
        //fonts
        private lateinit var FONT_DEFAULT: Typeface
        private lateinit var FONT_TERMINAL: Typeface

        //* initiate fonts in MyApplication *//
        fun init(){
            FONT_DEFAULT = Typeface.createFromAsset(MyApplication.globalContext.assets, "fonts/DINRegular.ttf")
            FONT_TERMINAL = Typeface.createFromAsset(MyApplication.globalContext.assets, "fonts/ayuthaya.ttf")
        }

        //* typeface textview font DEFAULT *//
        fun typefaceTxt(txtv: TextView) {
            this.setFont(txtv, MyFonts.DEFAULT)
        }
        fun typefaceTer(txtv: TextView) {
            this.setFont(txtv, MyFonts.TERMINAL)
        }


        //* set selected font for textview *//
        private fun setFont(txtv: TextView, font: MyFonts) {
            txtv.typeface = when(font){
                MyFonts.TERMINAL -> FONT_TERMINAL
                else -> Typeface.create(FONT_DEFAULT, Typeface.BOLD)
            }
        }

        //* typeface all textviews in a view *//
        fun typefaceAllTextViews(v: View, font: MyFonts) {
            try {
                if (v is ViewGroup) {
                    for (i in 0 until v.childCount) {
                        val child: View = v.getChildAt(i)
                        //recursively call this method
                        typefaceAllTextViews(child, font)
                    }
                } else if (v is TextView) {
                    //set custom font
                    this.setFont(v, font)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }
}
//* different overrides for the fun typeface() *//
fun typeface(activity: Activity){
    val rootView = activity.findViewById<View>(android.R.id.content).rootView
    FontUtil.typefaceAllTextViews(rootView, MyFonts.DEFAULT)
}
fun typeface(activity: Activity, font:MyFonts){
    val rootView = activity.findViewById<View>(android.R.id.content).rootView
    FontUtil.typefaceAllTextViews(rootView, font)
}
fun typeface(v: View){
    FontUtil.typefaceAllTextViews(v, MyFonts.DEFAULT)
}
fun typeface(context: Context){
    val rootView = (context as Activity).findViewById<View>(android.R.id.content).rootView
    //FontUtil.typefaceAllTextViews(rootView)
}