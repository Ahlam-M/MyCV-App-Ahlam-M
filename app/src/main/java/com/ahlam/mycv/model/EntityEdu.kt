/*
 * EntityEdu.kt
 *
 * This file was created on 25 Mar 2021
 * for project "MyCV-Ahlam M"
 * Copyright (c) 2021. All rights reserved.
 *
 * by developer Ahlam Mhmd
 * Github : Ahlam-M
 */

package com.ahlam.mycv.model

import androidx.room.Entity
import org.json.JSONObject

@Entity
data class EntityEdu(

    var id: Int,
    var name: String,
    var type: String,
    var from: String

) {

    companion object {
        fun parse(json : JSONObject) : EntityEdu {
            return EntityEdu(
                json.getInt("id"),
                json.getString("name"),
                json.getString("type"),
                json.getString("from")
            )
        }
    }
}