/*
 * TechsFragment.kt
 *
 * Created on 19 Apr 2021
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
import com.ahlam.mycv.R
import com.ahlam.mycv.utilities.typeface

class TechsFragment : Fragment() {

    companion object {
        @JvmStatic
        fun newInstance() = TechsFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val rootView = inflater.inflate(R.layout.fragment_techs, container, false)

        //set custom font
        typeface(rootView)

        return  rootView
    }
}