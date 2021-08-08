/*
 * EntityPersonInfo.kt
 *
 * This file was created on 25 Mar 2021
 * for project "MyCV-Ahlam M"
 * Copyright (c) 2021. All rights reserved.
 *
 * by developer Ahlam Mhmd
 * Github : Ahlam-m
 */

package com.ahlam.mycv.model

import androidx.room.Entity
import com.ahlam.mycv.MyApplication
import com.ahlam.mycv.R
import com.ahlam.mycv.getStr
import org.json.JSONObject

@Entity
data class EntityPersonInfo(

    var name: String,
    var profession_title: String,
    var dob: String,
    var social_state : String,
    var languages : String
) {

    companion object {
        fun parse(json : JSONObject) : EntityPersonInfo {
            return EntityPersonInfo(
                json.getString(getStr(R.string.name)),
                json.getString(getStr(R.string.profession_title)),
                json.getString(getStr(R.string.dob)),
                json.getString(getStr(R.string.social_state)),
                json.getString(getStr(R.string.languages))
            )
        }
    }
}
