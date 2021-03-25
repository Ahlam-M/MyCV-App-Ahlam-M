package com.ahlam.mycv


@Target(AnnotationTarget.VALUE_PARAMETER)
annotation class Json(val name: String)

fun toJson(v : Any){

    when(v::class){
        //todo EntityJob -> v.
    }
}