/*
 * PersonalInfoFragment.kt
 *
 * Created on 16 May 2021
 * for "MyCV-Ahlam M"
 * Copyright (c) 2021. All rights reserved.
 *
 * by developer Ahlam Mhmd
 * Github : Ahlam-M
 */

package com.ahlam.mycv.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.ahlam.mycv.InfoSingleton
import com.ahlam.mycv.R
import com.ahlam.mycv.ViewsUtils
import com.ahlam.mycv.getStr
import com.ahlam.mycv.utilities.typeface


class PersonalInfoFragment : Fragment() {

    companion object {
        @JvmStatic
        fun newInstance() = PersonalInfoFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_personal_info, container, false)


        //personal skills
        val tvs : Array<TextView> = arrayOf(
            rootView.findViewById<TextView>(R.id.txt_discipline),
            rootView.findViewById<TextView>(R.id.txt_teamwork),
            rootView.findViewById<TextView>(R.id.txt_hardwork),
            rootView.findViewById<TextView>(R.id.txt_lead),
            rootView.findViewById<TextView>(R.id.txt_learn),
            rootView.findViewById<TextView>(R.id.txt_motivate))

        for(i in tvs.indices){
            tvs[i].text = InfoSingleton.personal_skills[i]
        }

        //hobbies
        val line1 = rootView.findViewById<LinearLayout>(R.id.ll_hobbies)
        for(i in 0 until InfoSingleton.hobbies.size){
            val v : View = View.inflate(context, R.layout.item_hobby, null)
            v.findViewById<TextView>(R.id.txt_edu).text = InfoSingleton.hobbies[i]
            line1.addView(v)
        }

        //other skills
        val line2 = rootView.findViewById<LinearLayout>(R.id.ll_skills)
        for(i in 0 until InfoSingleton.other_skills.size){
            val v : View = View.inflate(context, R.layout.item_skill, null)
            v.findViewById<TextView>(R.id.txt_edu).text = InfoSingleton.other_skills[i]
            line2.addView(v)
        }

        typeface(rootView)
        return rootView
    }
}