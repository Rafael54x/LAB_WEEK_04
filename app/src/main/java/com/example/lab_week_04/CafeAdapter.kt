package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

// Titles needed for CafeFragment's TabLayoutMediator
val TABS_CAFE_TITLES = listOf(
    R.string.starbucks_title,
    R.string.janjijiwa_title,
    R.string.kopikenangan_title,
)

class CafeAdapter(fragmentActivity: FragmentActivity) :
    FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return TABS_CAFE_TITLES.size
    }

    override fun createFragment(position: Int): Fragment {
        // Simply return a new instance of the simplified CafeDetailFragment
        return CafeDetailFragment()
    }
}