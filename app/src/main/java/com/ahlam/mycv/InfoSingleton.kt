/*
 * InfoSingleton.kt
 *
 * This file was created on 25 Mar 2021
 * for project "MyCV-Ahlam M"
 * Copyright (c) 2021. All rights reserved.
 *
 * by developer Ahlam Mhmd
 * Github : Ahlam-m
 */

package com.ahlam.mycv

import com.ahlam.mycv.model.EntityContactInfo
import com.ahlam.mycv.model.EntityEdu
import com.ahlam.mycv.model.EntityPersonInfo
import com.ahlam.mycv.utilities.FileManager
import org.json.JSONObject

/**
 * this class acts as viewModel role. It prepares the info to be displayed in the views.
 */

class InfoSingleton {

    companion object {//static members

        //get json file data
        val text: String = FileManager.getInfoFileData()

        //form json data
        val jsonAll: JSONObject = JSONObject(text)


        //objects
        val personal_info =  JsonParser.ofObject<EntityPersonInfo>(getStr(R.string.personal_info))
        val contact_info = JsonParser.ofObject<EntityContactInfo>(getStr(R.string.contact_info))
        val about_me = JsonParser.ofObject<String>(getStr(R.string.about_me))

        //arrays
        val work_experience = JsonParser.ofArray<EntityJob>(getStr(R.string.work_experience))
        val education = JsonParser.ofArray<EntityEdu>(getStr(R.string.education))


        val professional_skills = JsonParser.ofArray<String>(getStr(R.string.professional_skills))
        val languages = JsonParser.ofArray<String>(getStr(R.string.languages_I_speak))
        val techniques = JsonParser.ofArray<String>(getStr(R.string.techniques))
        val design_patterns = JsonParser.ofArray<String>(getStr(R.string.design_patterns))
        val tech_tools = JsonParser.ofArray<String>(getStr(R.string.tech_tools))
        val supporting_tools = JsonParser.ofArray<String>(getStr(R.string.supporting_tools))
        val IT_courses = JsonParser.ofArray<String>(getStr(R.string.IT_courses))
        val other_courses = JsonParser.ofArray<String>(getStr(R.string.other_courses))
        val personal_skills = JsonParser.ofArray<String>(getStr(R.string.personal_skills))
        val familiar_with_OSs = JsonParser.ofArray<String>(getStr(R.string.familiar_with_OSs))
        val methodologies = JsonParser.ofArray<String>(getStr(R.string.methodologies))
        val hobbies = JsonParser.ofArray<String>(getStr(R.string.hobbies))
        val other_skills = JsonParser.ofArray<String>(getStr(R.string.other_skills))
    }
}