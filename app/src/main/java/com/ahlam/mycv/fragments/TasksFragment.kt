/*
 * TasksFragment.kt
 *
 * Created on 19 Apr 2021
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
import com.ahlam.mycv.InfoSingleton
import com.ahlam.mycv.MyApplication
import com.ahlam.mycv.R

/**
 * this class is used to display the professional skills.
 */
class TasksFragment : Fragment() {

    companion object {
        @JvmStatic
        fun newInstance() = TasksFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val rootView = inflater.inflate(R.layout.fragment_tasks, container, false)

        //hock widget
        val listViewTasks : ListView = rootView.findViewById(R.id.lv_tasks)
        //set adapter
        listViewTasks.adapter = TasksListAdapter()

        return rootView
    }
}


class TasksListAdapter : BaseAdapter() {

    private val inflater: LayoutInflater = MyApplication.globalContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    private val tasks: List<String> = InfoSingleton.professional_skills

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val rowView = inflater.inflate(R.layout.item_task, parent, false)

        //fill views with data
        rowView.findViewById<TextView>(R.id.txt_task).text = tasks[position]

        //disable clicks
        rowView.setOnClickListener(null)

        return rowView
    }

    override fun getCount(): Int {
        return tasks.size
    }

    override fun getItem(position: Int): Any {
        return tasks[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
}