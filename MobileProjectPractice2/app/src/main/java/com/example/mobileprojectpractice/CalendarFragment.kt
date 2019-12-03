package com.example.mobileprojectpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.mobileprojectpractice.databinding.FragmentCalendarBinding


class CalendarFragment : Fragment() {
    private lateinit var binding: FragmentCalendarBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentCalendarBinding>(inflater, R.layout.fragment_calendar,container,false)
        val calendar: CalendarView = binding.calendarViewMain
        val dateButton: Button = binding.buttonTest
        val textTest: TextView = binding.eventHeader
        dateButton.setOnClickListener{getDate()}
        calendar.setOnDateChangeListener { view, year, month, dayOfMonth ->
            val Date = (month + 1).toString() + "-" + dayOfMonth + "-" + year
            textTest.text = Date
        }
        return binding.root
    }
    fun getDate(){
        val calender: CalendarView = binding.calendarViewMain
    }
}
