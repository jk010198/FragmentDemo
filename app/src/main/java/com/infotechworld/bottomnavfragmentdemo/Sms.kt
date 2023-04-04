package com.infotechworld.bottomnavfragmentdemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class Sms : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_sms, container, false)
        val tv = view.findViewById<TextView>(R.id.tvDataSms)
        val b = arguments?.getString("Name")

        tv.setText("d - ${b}")
        return view
    }
}