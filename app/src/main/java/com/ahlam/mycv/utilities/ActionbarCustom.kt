/*
 * ActionbarCustom.kt
 *
 * Created on 15 Apr 2021
 * for "MyCV-Ahlam M"
 * Copyright (c) 2021. All rights reserved.
 *
 * by developer Ahlam Mhmd
 * Github : Ahlam-M
 */

package com.ahlam.mycv.utilities

import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import com.ahlam.mycv.R


/* this function is used to show custom actionbar in @activity */
fun setCustomActionbar(activity: AppCompatActivity, title: String){
    //allow custom view
    activity.supportActionBar?.displayOptions = ActionBar.DISPLAY_SHOW_CUSTOM

    //get view
    var tv : TextView = activity.layoutInflater.inflate(R.layout.actionbar_text, null) as TextView
    //set text
    tv.text = title
    //set params
    tv.layoutParams = ActionBar.LayoutParams(
        ViewGroup.LayoutParams.MATCH_PARENT,
        ViewGroup.LayoutParams.MATCH_PARENT
    )

    //set custom font
    FontUtil.typefaceTer(tv)

    //display
    activity.supportActionBar?.customView = tv
}