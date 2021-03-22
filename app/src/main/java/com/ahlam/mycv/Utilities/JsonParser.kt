package com.ahlam.mycv


import com.beust.klaxon.Klaxon
import com.beust.klaxon.KlaxonJson

class JsonParser {

    /**
     * this function is responsible for parsing json.
     * @name -> json node name
     * @return -> parsed array of strings
     */
    fun ofStrArray(name : String) : List<String> {
        val list : List<String> = Klaxon().parseArray<String>(name) as List<String>
        return list
    }


    fun ofJobsArray() : List<EntityJob> {


        val list : List<EntityJob> = Klaxon().parseArray<EntityJob>(R.string.work_experience) as List<EntityJob>
        return list
    }


}