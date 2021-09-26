package com.neppplus.viewpager_20210926

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.viewpager_20210926.adapters.MainViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var mvpa : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mvpa = MainViewPagerAdapter( supportFragmentManager )
        mainViewPager.adapter = mvpa


//        탭레이아웃을  -> 뷰페이저와 연계
        mainTabLayout.setupWithViewPager( mainViewPager )


    }
}