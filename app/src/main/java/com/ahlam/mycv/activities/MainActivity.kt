package com.ahlam.mycv.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ahlam.mycv.InfoSingleton
import com.ahlam.mycv.R
import com.ahlam.mycv.utilities.setCustomActionbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //show custom actionbar
        setCustomActionbar(this@MainActivity, InfoSingleton.personal_info.name + " CV")

        //supportFragmentManager.findFragmentById()
    }
}