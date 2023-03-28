package com.example.assignment_4_joseph_edward


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.assignment_4_joseph_edward.Fragments.APIFragment
import com.example.assignment_4_joseph_edward.Fragments.DisplayFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val apiFragment = APIFragment()
        val displayFragment = DisplayFragment()

        changeFragment(apiFragment)

        findViewById<BottomNavigationView>(R.id.bottom_nav).setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.ic_api -> {
                    changeFragment(apiFragment)
                    true
                }
                R.id.ic_display -> {
                    changeFragment(displayFragment)
                    true
                }
                else -> false
            }
        }
    }

    private fun changeFragment(fragment: Fragment){
        supportFragmentManager.beginTransaction().apply{
            replace(R.id.fragmentContainerView, fragment)
            commit()
        }
    }
}