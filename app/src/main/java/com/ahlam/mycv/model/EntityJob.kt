/*
 * EntityJob.kt
 *
 * This file was created on 25 Mar 2021
 * for project "MyCV-Ahlam M"
 * Copyright (c) 2021. All rights reserved.
 *
 * by developer Ahlam Mhmd
 * Github : Ahlam-M
 */

package com.ahlam.mycv

import androidx.room.Entity
import org.json.JSONObject

@Entity
data class EntityJob(

    val id: Int,
    var title: String,
    var place: String,
    var employment_type: String,
    var duration: String,
    var description: String

) {

    companion object{
        fun parse(json : JSONObject) : EntityJob {

            return EntityJob(
                json.getInt("id"),
                json.getString("title"),
                json.getString("place"),
                json.getString("employment_type"),
                json.getString("duration"),
                json.getString("description")
            )
        }
    }
}

