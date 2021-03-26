package com.ahlam.mycv

import org.json.JSONObject

@Target(AnnotationTarget.CLASS)
annotation class JSON
inline fun <reified T> parse(j : JSONObject) : T{


    return T::class.java.newInstance()
   // when(v::class){
        //todo EntityJob -> v.

                //EntityPersonInfo::class -> T.parse(j)
    //}

}