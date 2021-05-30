package com.ahlam.mycv.activities

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.ahlam.mycv.InfoSingleton
import com.ahlam.mycv.R
import com.ahlam.mycv.fragments.*
import com.ahlam.mycv.utilities.setCustomActionbar
import com.ahlam.mycv.utilities.typeface
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        //set custom font
        typeface(this@MainActivity)

        //show custom actionbar
        setCustomActionbar(this@MainActivity, InfoSingleton.personal_info.name + " CV")

        //hock bttm nav bar
        val bottomNavigationView: BottomNavigationView = findViewById(R.id.nav_bttm)
        //set on item selected listener
        bottomNavigationView.setOnNavigationItemSelectedListener(
            onBottomNavigationItemSelectedListener
        )
        //select first fragment by default
        bottomNavigationView.selectedItemId = R.id.mi_work_exp
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_contact, menu)

        val dr : AnimationDrawable = resources.getDrawable(R.drawable.actionbar_contact_me) as AnimationDrawable
        val mi : MenuItem? = menu?.findItem(R.id.mi_contact_me)
        mi?.icon = dr
        window.decorView.post { dr.start() }

        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.mi_contact_me){

        }
        return super.onOptionsItemSelected(item)
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
                ft.replace(R.id.frame_main, TechsFragment.newInstance()).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.mi_edu -> {
                ft.replace(R.id.frame_main, EduCerFragment.newInstance()).commit()
                return@OnNavigationItemSelectedListener true
            }
            R.id.mi_personal -> {
                ft.replace(R.id.frame_main, PersonalInfoFragment.newInstance()).commit()
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }
}