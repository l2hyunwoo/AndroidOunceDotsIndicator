package com.example.viewpagerindicator

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.viewpagerindicator.fragment.FirstFragment
import com.example.viewpagerindicator.fragment.SecondFragment
import com.example.viewpagerindicator.fragment.ThirdFragment

class RegisterPagerAdapter(fm:FragmentManager) : FragmentPagerAdapter(fm,
        BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> FirstFragment()
            1 -> SecondFragment()
            else -> ThirdFragment()
        }
    }

    override fun getCount() =  3
}