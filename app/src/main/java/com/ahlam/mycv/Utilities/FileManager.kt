package com.ahlam.mycv.Utilities

import com.ahlam.mycv.MyApplication

class FileManager {

    companion object {

        fun getInfoFileData() : String {
            return MyApplication.globalContext.assets.open("info.json")
                .bufferedReader().use { it.readText() }
        }
    }
}