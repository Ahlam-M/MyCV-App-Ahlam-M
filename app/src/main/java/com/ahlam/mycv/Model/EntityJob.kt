package com.ahlam.mycv

import androidx.room.Entity

@Entity
data class EntityJob(

    val id: Int,
    var title: String,
    var place: String,
    var employment_type: String,
    var duration: String,
    var description: String
)