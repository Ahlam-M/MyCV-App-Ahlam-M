/*
 * EntityContactInfo.kt
 *
 * This file was created on 26 Mar 2021
 * for project "MyCV-Ahlam M"
 * Copyright (c) 2021. All rights reserved.
 *
 * by developer Ahlam Mhmd
 * Github : Ahlam-m
 */

package com.ahlam.mycv.model
import androidx.room.Entity
import com.ahlam.mycv.R
import com.ahlam.mycv.getStr
import org.json.JSONObject

@Entity
data class EntityContactInfo(

    var phone: String,
    var email: String,
    var whatsapp: String,
    var linkedin : String,
    var github : String
) {

    companion object{
        fun parse(json : JSONObject) : EntityContactInfo {
            return EntityContactInfo(
                json.getString(getStr(R.string.phone)),
                json.getString(getStr(R.string.email)),
                json.getString(getStr(R.string.whatsapp)),
                json.getString(getStr(R.string.linkedin)),
                json.getString(getStr(R.string.github))
            )
        }
    }
}

