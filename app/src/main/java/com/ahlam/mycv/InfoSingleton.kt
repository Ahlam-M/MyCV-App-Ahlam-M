package com.ahlam.mycv

import com.ahlam.mycv.Utilities.FileManager
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