package com.example.fragmentsapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.fragmentsapp.fragments.CategoryFragment
import com.example.fragmentsapp.fragments.HomeFragment
import com.example.fragmentsapp.fragments.MessageFragment
import com.example.fragmentsapp.fragments.OptionFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavBar: BottomNavigationView
    private var MainActivityTag = "MENU_ITEM"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavBar = findViewById(R.id.bottomNavMenu)
        val homeFragment = HomeFragment()
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, homeFragment).commit()

        bottomNavBar.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.homeMenu -> {
                    Log.i(MainActivityTag, "Home seleccionado")
                    val homeFragment = HomeFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, homeFragment).commit()
                }
                R.id.categoryMenu -> {
                    Log.i(MainActivityTag, "Category seleccionado")
                    val categoryFragment = CategoryFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, categoryFragment).commit()
                }
                R.id.optionMenu -> {
                    Log.i(MainActivityTag, "Option seleccionado")
                    val optionFragment = OptionFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, optionFragment).commit()
                }
                R.id.messaggeMenu -> {
                    Log.i(MainActivityTag, "Message seleccionado")
                    val messageFragment = MessageFragment()
                    supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer, messageFragment).commit()
                }
            }
            true
        }
    }
}