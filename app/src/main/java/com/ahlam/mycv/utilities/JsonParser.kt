/*
 * JsonParser.kt
 *
 * This file was created on 25 Mar 2021
 * for project "MyCV-Ahlam M"
 * Copyright (c) 2021. All rights reserved.
 *
 * by developer Ahlam Mhmd
 * Github : Ahlam-M
 */

package com.ahlam.mycv

import com.ahlam.mycv.model.EntityContactInfo
import com.ahlam.mycv.model.EntityEdu
import com.ahlam.mycv.model.EntityPersonInfo
import org.json.JSONArray
import org.json.JSONObject
import java.util.ArrayList

class JsonParser {

    companion object{
        /**
         * this function is responsible for getting object value from json file
         * @name -> json node name
         * @return -> parsed object data of type T
         */
        inline fun <reified T> ofObject(name : String) : T {

            val obj = InfoSingleton.jsonAll.get(name)

            val parsed : T = when(T::class){
                //parse item according to type T
                EntityPersonInfo::class -> EntityPersonInfo.parse(obj as JSONObject) as T
                EntityContactInfo::class -> EntityContactInfo.parse(obj as JSONObject) as T
                String::class -> InfoSingleton.jsonAll.getString(obj as String) as T
                //else -> T::class.javaClass.getMethod("parse").invoke(InfoSingleton.jsonAll.getJSONObject(name)) as T
                else -> T::class.java.newInstance()
            }
            return parsed
        }

        /**
         * this function is responsible for parsing JSONArray of types EntityJob, EntityEdu, String
         * @name -> json node name
         * @return -> parsed ArrayList of type T
         */
        inline fun <reified T> ofArray(name : String) : ArrayList<T> {
            //get specific json array from generated json data
            val array : JSONArray = InfoSingleton.jsonAll.getJSONArray(name)

            //generate array of T type
            val list : ArrayList<T> = ArrayList()

            //parse json array items
            for(i in 0 until array.length()) {
                var parsed : T
                parsed = when(T::class){
                    //parse item according to type T
                    EntityJob::class -> EntityJob.parse(array.getJSONObject(i)) as T
                    EntityEdu::class -> EntityEdu.parse(array.getJSONObject(i)) as T
                    String::class -> array.getString(i) as T
                    else -> break
                }
                list.add(parsed)
            }
            return list
        }


        /**
         * this function is responsible for getting string value from json file
         * @name -> json node name
         * @return -> string data
         */
        @Deprecated("replaced with <T> ofObject<T>() for all types", ReplaceWith("<T> ofObject<T>()"))
        fun ofString(name : String) : String {
            return InfoSingleton.jsonAll.getString(name)
        }

        /**
         * this function is responsible for parsing JSONArray of type String
         * @name -> json node name
         * @return -> parsed array of strings
         */
        @Deprecated("replaced with <T> ofArray<T>() for all types")
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
        @Deprecated("replaced with <T> ofArray<T>() for all types")
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

        /**
         * this function is responsible for parsing JSONArray of type EntityEdu
         * @name -> json node name
         * @return -> parsed array of EntityEdu
         */
        @Deprecated("replaced with <T> ofArray<T>() for all types")
        fun ofEduArray(name : String) : ArrayList<EntityEdu> {
            //get specific json array from generated json data
            val array : JSONArray = InfoSingleton.jsonAll.getJSONArray(name)

            //generate array of EntityEdu
            val list : ArrayList<EntityEdu> = ArrayList<EntityEdu>()
            for(i in 0 until array.length()) {
                val parsed = EntityEdu.parse(array.getJSONObject(i))
                list.add(parsed)
            }
            return list
        }



    }
}








