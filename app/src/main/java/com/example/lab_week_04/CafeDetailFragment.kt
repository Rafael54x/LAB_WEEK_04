package com.example.lab_week_04

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class CafeDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cafe_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // You can add logic here to display different cafe details based on the tab position
        // For now, let's just display a placeholder text
        // val textView = view.findViewById<TextView>(R.id.cafe_detail_text)
        // arguments?.getInt("position")?.let { position ->
        //     textView.text = "Details for Cafe Tab: ${position + 1}"
        // }
    }
}
