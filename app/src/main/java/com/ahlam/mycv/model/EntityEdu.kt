package com.ahlam.mycv.model

import androidx.room.Entity
import org.json.JSONObject

@Entity
data class EntityEdu(

    val id: Int,
    var name: String,
    var type: String,
    var from: String

) {

    companion object {
        fun parse(json : JSONObject) : EntityEdu {
            JSONObject().t
            return EntityEdu(
                json.getInt("id"),
                json.getString("name"),
                json.getString("type"),
                json.getString("from")
            )
        }
    }
}