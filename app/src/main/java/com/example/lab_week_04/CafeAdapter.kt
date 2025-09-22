package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

val TABS_FIXED = listOf(
    R.string.starbucks_title,
    R.string.janjijiwa_title,
    R.string.kopikenangan_title,
)

class CafeAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return TABS_FIXED.size
    }

    override fun createFragment(position: Int): Fragment {
        // You can pass the position or some identifier to CafeDetailFragment
        // if you want each tab to show different content based on the cafe.
        // For example:
        // val fragment = CafeDetailFragment()
        // val args = Bundle()
        // args.putInt("position", position)
        // fragment.arguments = args
        // return fragment
        return CafeDetailFragment()
    }
}
