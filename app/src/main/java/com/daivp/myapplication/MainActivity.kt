package com.daivp.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AppCompatDelegate
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button1.setOnClickListener { }
        button2.setOnClickListener { }
        tv0.setOnClickListener { }
        tv1.setOnClickListener { }
        tv2.setOnClickListener { }
        tv3.setOnClickListener { }
        tv4.setOnClickListener { }
        rl1.setOnClickListener { }
        imageView3.setOnClickListener { }
        imageView4.setOnClickListener {  }
        imageView5.setOnClickListener {  }
        imageView6.setOnClickListener {  }
        imageView7.setOnClickListener {  }
//        tv5.setOnClickListener { }


    }
}
