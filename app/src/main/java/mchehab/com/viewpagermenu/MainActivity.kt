package mchehab.com.viewpagermenu

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager>(R.id.viewPager)
        val tabLayout = findViewById<TabLayout>(R.id.tabLayout)

        val listFragments = mutableListOf<Fragment>()
        listFragments.add(FirstFragment())
        listFragments.add(SecondFragment())
        listFragments.add(ThirdFragment())

        val listTitles = mutableListOf<String>()
        listTitles.add("First Fragment")
        listTitles.add("Second Fragment")
        listTitles.add("Third Fragment")

        val viewPagerAdater = ViewPagerAdapter(supportFragmentManager, listFragments, listTitles)
        viewPager.adapter = viewPagerAdater

        tabLayout.setupWithViewPager(viewPager)
    }
}
