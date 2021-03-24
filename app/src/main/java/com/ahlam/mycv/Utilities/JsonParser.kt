package com.ahlam.mycv

import org.json.JSONArray
import java.util.ArrayList

class JsonParser {

    companion object{

        /**
         * this function is responsible for getting string value from json file
         * @name -> json node name
         * @return -> string data
         */
        fun ofString(name : String) : String {
            return InfoSingleton.jsonAll.getString(name)
        }

        /**
         * this function is responsible for parsing JSONArray of type String
         * @name -> json node name
         * @return -> parsed array of strings
         */
        fun ofStrArray(name : String) : ArrayList<String> {
            //get specific json array from generated json data
            val array : JSONArray = InfoSingleton.jsonAll.getJSONArray(name)

            //generate array of strings
            val list : ArrayList<String> = ArrayList<String>()
            for(i in 0 until array.length()) {
                list.add(array.getString(i))
            }
            return list
        }

        /**
         * this function is responsible for parsing JSONArray of type EntityJob
         * @name -> json node name
         * @return -> parsed array of EntityJob
         */
        fun ofJobsArray(name : String) : ArrayList<EntityJob> {
            //get specific json array from generated json data
            val array : JSONArray = InfoSingleton.jsonAll.getJSONArray(name)

            //generate array of EntityJob
            val list : ArrayList<EntityJob> = ArrayList<EntityJob>()
            for(i in 0 until array.length()) {
                val parsed = EntityJob.parse(array.getJSONObject(i))
                list.add(parsed)
            }
            return list
        }
    }
}
