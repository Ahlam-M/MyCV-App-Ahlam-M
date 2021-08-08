/*
 * EduCerFragment.kt
 *
 * Created on 22 Apr 2021
 * for "MyCV-Ahlam M"
 * Copyright (c) 2021. All rights reserved.
 *
 * by developer Ahlam Mhmd
 * Github : Ahlam-m
 */

package com.ahlam.mycv.fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewStub
import android.widget.*
import androidx.core.view.children
import androidx.fragment.app.Fragment
import com.ahlam.mycv.InfoSingleton
import com.ahlam.mycv.R
import com.ahlam.mycv.ViewsUtils
import com.ahlam.mycv.getStr
import com.ahlam.mycv.utilities.typeface


class EduCerFragment : Fragment() {

    companion object {
        @JvmStatic
        fun newInstance() = EduCerFragment()
    }


    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.fragment_edu_cer, container, false)


        //hock widget
        val line = rootView.findViewById<LinearLayout>(R.id.ll)

        //index of the last view in line
        var lastindex = 0

        //education
        line.addView(ViewsUtils.getTitlev(getStr(R.string.education)), lastindex++)
        for(i in 0 until InfoSingleton.education.size){
            val v : View = View.inflate(context, R.layout.item_edu_cer, null)
            v.findViewById<TextView>(R.id.txt_edu).text =
                InfoSingleton.education[i].name + " - " + InfoSingleton.education[i].type + ", " + InfoSingleton.education[i].from
            line.addView(v, lastindex++)
        }

        //IT courses
        line.addView(ViewsUtils.getTitlev(getStr(R.string.IT_courses)), lastindex++)
        for (i in 0 until InfoSingleton.IT_courses.size){
            val v : View = View.inflate(context, R.layout.item_edu_cer, null)
            v.findViewById<TextView>(R.id.txt_edu).text = InfoSingleton.IT_courses[i]
            line.addView(v, lastindex++)
        }

        //other courses
        line.addView(ViewsUtils.getTitlev(getStr(R.string.other_courses)), lastindex++)
        for (i in 0 until InfoSingleton.other_courses.size){
            val v : View = View.inflate(context, R.layout.item_edu_cer, null)
            v.findViewById<TextView>(R.id.txt_edu).text = InfoSingleton.other_courses[i]
            line.addView(v,lastindex++)
        }

        //set custom font
        typeface(rootView)
        return rootView
    }
}

