package com.ahlam.mycv.Activities

import android.content.res.AssetManager
import android.os.Bundle
import android.util.JsonReader
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.ahlam.mycv.*
import com.ahlam.mycv.Utilities.FileManager

import org.json.JSONObject
import java.io.FileNotFoundException
import java.io.InputStream
import java.util.ArrayList
import java.util.logging.Level.parse
import javax.xml.parsers.DocumentBuilderFactory

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)



        Log.e("dddd ", JsonParser.ofString("About me"))

        val list : ArrayList<EntityJob> = JsonParser.ofJobsArray("Work Experience")
        for(i in 0 until list.size) {
            println(list[i].title)
        }



        try {
            //FileManager.getInfoFile("")
        } catch (e: FileNotFoundException){
            e.printStackTrace()
        }
    }
}