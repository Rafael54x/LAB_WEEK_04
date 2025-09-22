package com.example.lab_week_04

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.util.Log

class CafeDetailFragment : Fragment() {

    private val TAG = "CafeDetailFragment"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "onCreateView CALLED")
        return inflater.inflate(R.layout.fragment_cafe_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated CALLED")
        val textView = view.findViewById<TextView>(R.id.content_description)
        if (textView == null) {
            Log.e(TAG, "TextView with ID R.id.content_description was NOT FOUND.")
        } else {
            Log.d(TAG, "TextView R.id.content_description FOUND. Setting text.")
            textView.text = "DEBUG TEXT FROM onViewCreated"
        }
    }

     override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart CALLED")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume CALLED")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "onDestroyView CALLED")
    }

     override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy CALLED")
    }
}