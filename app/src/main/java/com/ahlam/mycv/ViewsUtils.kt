/*
 * ViewsUtils.kt
 *
 * Created on 06 May 2021
 * for "MyCV-Ahlam M"
 * Copyright (c) 2021. All rights reserved.
 *
 * by developer Ahlam Mhmd
 * Github : Ahlam-M
 */

package com.ahlam.mycv

import android.view.View
import android.widget.TextView

class ViewsUtils {

    companion object {

        fun getTitlev(str:String) : View {

            val title : View = View.inflate(MyApplication.globalContext, R.layout.tv_title, null)
            title.findViewById<TextView>(R.id.txt_title).text = str
            return title
        }
    }
}