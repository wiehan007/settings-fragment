package com.example.prjfragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

private val Frag1 = BlankFragment1()
private val Frag2 = SecondFragment()


class MenuBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_bar)
        replaceFrag(Frag1)
        val bottomNav = findViewById<BottomNavigationView>(R.id.NavBar)
        bottomNav.setOnItemSelectedListener {
            when(it.itemId)
            {
                R.id.ic_settings->replaceFrag(Frag1)
            }
            true
        }

    }
    private fun replaceFrag(fragment: Fragment)
    {
        if (fragment!=null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.frameLayout, fragment)
            transaction.commit()
        }
    }
}