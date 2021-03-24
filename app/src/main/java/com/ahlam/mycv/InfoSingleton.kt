package com.ahlam.mycv

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import com.ahlam.mycv.Utilities.FileManager
import org.json.JSONObject


class InfoSingleton {

    companion object {//static members

        @SuppressLint("StaticFieldLeak")
        var context: Context = MyApplication.globalContext

        //get json file data
        val text: String = FileManager.getInfoFileData()

        //create json
        val jsonAll: JSONObject = JSONObject(text)

    }
}