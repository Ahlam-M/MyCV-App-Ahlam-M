/*
 * WorkExpFragment.kt
 *
 * Created on 15 Apr 2021
 * for "MyCV-Ahlam M"
 * Copyright (c) 2021. All rights reserved.
 *
 * by developer Ahlam Mhmd
 * Github : Ahlam-M
 */

package com.ahlam.mycv.fragments

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ListView
import android.widget.TextView
import com.ahlam.mycv.EntityJob
import com.ahlam.mycv.InfoSingleton
import com.ahlam.mycv.MyApplication.Companion.globalContext
import com.ahlam.mycv.R
import com.ahlam.mycv.utilities.typeface

/**
 * this class is used to display the work experiences.
 */
class WorkExpFragment : Fragment() {

    companion object {
        @JvmStatic
        fun newInstance() = WorkExpFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val rootView = inflater.inflate(R.layout.fragment_work_exp, container, false)

        //hock widget
        val listViewWork : ListView = rootView.findViewById(R.id.lv_work_expr)
        //set adapter
        listViewWork.adapter = JobsListAdapter()

        //set custom font
        typeface(rootView)
        return rootView
    }
}

class JobsListAdapter : BaseAdapter() {

    private val inflater: LayoutInflater = globalContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    private val jobsList: List<EntityJob> = InfoSingleton.work_experience

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val rowView = inflater.inflate(R.layout.item_job, parent, false)

        //fill views with data
        rowView.findViewById<TextView>(R.id.txt_profession_title).text = jobsList[position].title
        rowView.findViewById<TextView>(R.id.txt_place).text = jobsList[position].place
        rowView.findViewById<TextView>(R.id.txt_employment_type).text = jobsList[position].employment_type
        rowView.findViewById<TextView>(R.id.txt_duration).text = jobsList[position].duration
        rowView.findViewById<TextView>(R.id.txt_description).text = jobsList[position].description

        //disable clicks
        rowView.setOnClickListener(null)

        //set custom font
        typeface(rowView)

        return rowView
    }

    override fun getCount(): Int {
        return jobsList.size
    }

    override fun getItem(position: Int): Any {
        return jobsList[position]
    }

    override fun getItemId(position: Int): Long {
        return jobsList[position].id.toLong()
    }
}