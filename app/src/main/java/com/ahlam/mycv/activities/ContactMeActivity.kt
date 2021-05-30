/*
 * ContactMeActivity.kt
 *
 * Created on 21 May 2021
 * for "MyCV-Ahlam M"
 * Copyright (c) 2021. All rights reserved.
 *
 * by developer Ahlam Mhmd
 * Github : Ahlam-M
 */

package com.ahlam.mycv.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import com.ahlam.mycv.InfoSingleton
import com.ahlam.mycv.R
import com.ahlam.mycv.getStr
import com.ahlam.mycv.utilities.setCustomActionbar
import com.ahlam.mycv.utilities.typeface

class ContactMeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_me)

        //set custom font
        typeface(this@ContactMeActivity)

        //show custom actionbar
        setCustomActionbar(this@ContactMeActivity, InfoSingleton.personal_info.name + " Info.")

        //* personal info *//
        val lblPersonalInfo : Array<String> = arrayOf(
            getStr(R.string.name),
            getStr(R.string.profession_title),
            getStr(R.string.dob),
            getStr(R.string.social_state),
            getStr(R.string.languages))

        val lblPersonalInfoval : Array<String> = arrayOf(
            InfoSingleton.personal_info.name,
            InfoSingleton.personal_info.profession_title,
            InfoSingleton.personal_info.dob,
            InfoSingleton.personal_info.social_state,
            InfoSingleton.personal_info.languages)

        for(i in 0..4){
            val v : View = View.inflate(this, R.layout.item_personal_info, null)
            //fill in data
            v.findViewById<TextView>(R.id.txt_label).text = lblPersonalInfo[i]
            v.findViewById<TextView>(R.id.txt_info).text = lblPersonalInfoval[i]

            //add it to personal section view
            findViewById<LinearLayout>(R.id.ll_per_info).addView(v)
        }

        //* contact info *//
        val lblContactInfo : Array<String> = arrayOf(
            getStr(R.string.phone),
            getStr(R.string.email),
            getStr(R.string.whatsapp),
            getStr(R.string.linkedin),
            getStr(R.string.github))

        val lblContactInfoval : Array<String> = arrayOf(
            InfoSingleton.contact_info.phone,
            InfoSingleton.contact_info.email,
            InfoSingleton.contact_info.whatsapp,
            InfoSingleton.contact_info.linkedin,
            InfoSingleton.contact_info.github)

        for(i in 0..4){
            val v : View = View.inflate(this, R.layout.item_personal_info, null)
            //fill in data
            v.findViewById<TextView>(R.id.txt_label).text = lblContactInfo[i]
            v.findViewById<TextView>(R.id.txt_info).text = lblContactInfoval[i]

            //add it to contact section view
            findViewById<LinearLayout>(R.id.ll_contact_info).addView(v)
        }
    }
}