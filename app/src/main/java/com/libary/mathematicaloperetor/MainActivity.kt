package com.libary.mathematicaloperetor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.libary.maths.ArithmeticalUtilty

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val tot=ArithmeticalUtilty.add(3.1,2.1)
        Log.e("onCreate",tot.toString())
    }
}