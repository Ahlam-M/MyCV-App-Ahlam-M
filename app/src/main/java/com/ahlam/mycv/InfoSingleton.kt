/*
 * InfoSingleton.kt
 *
 * This file was created on 25 Mar 2021
 * for project "MyCV-Ahlam M"
 * Copyright (c) 2021. All rights reserved.
 *
 * by developer Ahlam Mhmd
 * Github : Ahlam-M
 */

package com.ahlam.mycv

import com.ahlam.mycv.utilities.FileManager
import org.json.JSONObject



class InfoSingleton {

    companion object {//static members

        //get json file data
        val text: String = FileManager.getInfoFileData()

        //create json
        val jsonAll: JSONObject = JSONObject(text)

        //todo create all data
    }
}