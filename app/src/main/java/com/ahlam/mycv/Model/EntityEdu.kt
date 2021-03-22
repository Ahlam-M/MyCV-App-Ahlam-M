package com.ahlam.mycv

import androidx.room.Entity

@Entity
data class EntityEdu(

    val id: Int,
    var name: String,
    var type: String,
    var from: String
)