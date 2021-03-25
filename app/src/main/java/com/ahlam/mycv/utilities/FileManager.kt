/*
 * FileManager.kt
 *
 * This file was created on 25 Mar 2021
 * for project "MyCV-Ahlam M"
 * Copyright (c) 2021. All rights reserved.
 *
 * by developer Ahlam Mhmd
 * Github : Ahlam-M
 */

package com.ahlam.mycv.utilities

import com.ahlam.mycv.MyApplication

class FileManager {

    companion object {

        fun getInfoFileData() : String {
            return MyApplication.globalContext.assets.open("info.json")
                .bufferedReader().use { it.readText() }
        }
    }
}