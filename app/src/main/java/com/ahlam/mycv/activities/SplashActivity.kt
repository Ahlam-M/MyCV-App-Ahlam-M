package com.ahlam.mycv.activities

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.ahlam.mycv.*
import com.ahlam.mycv.model.EntityContactInfo
import com.ahlam.mycv.model.EntityPersonInfo

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        //val aboutme : String = JsonParser.ofString(getString(R.string.about_me))

        //val pinfo : String = JsonParser.ofString(getString(R.string.personal_info))

        Log.e("ff ", JsonParser.ofObject<EntityPersonInfo>(getString(R.string.personal_info)).toString())
        Log.e("ff ", JsonParser.ofObject<EntityContactInfo>(getString(R.string.contact_info)).toString())
    }
}