package com.abh16am.whatsappsupport

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.abh16am.whatsappsupport.fragment.page1
import com.abh16am.whatsappsupport.fragment.page2
import com.abh16am.whatsappsupport.fragment.page3
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment=page1()
        val secondFragment=page2()
        val thirdFragment=page3()

        bottomNavigationView.selectedItemId = R.id.page_2
        setCurrentFragment(secondFragment)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.page_1->setCurrentFragment(firstFragment)
                R.id.page_2->setCurrentFragment(secondFragment)
                R.id.page_3->setCurrentFragment(thirdFragment)

            }
            true
    }
}

    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }
}