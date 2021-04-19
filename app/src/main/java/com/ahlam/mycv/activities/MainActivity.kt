package com.ahlam.mycv.activities

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.ahlam.mycv.InfoSingleton
import com.ahlam.mycv.R
import com.ahlam.mycv.fragments.TasksFragment
import com.ahlam.mycv.fragments.WorkExpFragment
import com.ahlam.mycv.utilities.setCustomActionbar
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    lateinit var fragment: Fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //show custom actionbar
        setCustomActionbar(this@MainActivity, InfoSingleton.personal_info.name + " CV")

        //hock bttm nav bar
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.nav_bttm)
        //set on item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(onBottomNavigationItemSelectedListener)
        //select first fragment by default
        bottomNavigationView.selectedItemId = R.id.mi_work_exp

    }

    private val onBottomNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->

        val ft: FragmentTransaction = supportFragmentManager.beginTransaction()

        when (item.itemId) {
            R.id.mi_work_exp -> {
                ft.replace(R.id.frame_main, WorkExpFragment.newInstance()).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.mi_tasks -> {
                ft.replace(R.id.frame_main, TasksFragment.newInstance()).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.mi_techniques -> {
                //TODO ft.replace(R.id.frame_main, fragment.newInstance()).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.mi_edu -> {
                //TODO ft.replace(R.id.frame_main, fragment.newInstance()).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.mi_personal -> {
                //TODO ft.replace(R.id.frame_main, fragment.newInstance()).commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }


}