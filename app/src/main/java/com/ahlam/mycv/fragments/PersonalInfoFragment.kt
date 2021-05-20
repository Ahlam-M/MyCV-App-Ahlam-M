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

        typeface(rootView)
        return rootView
    }


}