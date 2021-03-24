package com.ahlam.mycv.Utilities


import com.ahlam.mycv.InfoSingleton


class FileManager {
    companion object {

        fun getInfoFileData() : String {
            return InfoSingleton.context.assets.open("info.json")
                .bufferedReader().use { it.readText() }
        }
    }
}