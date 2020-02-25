package com.malakinfo.spalshscreen

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.transition.Fade.OUT
import androidx.core.os.postDelayed
import java.sql.Types.TIME

class Spalsh :Activity(){

    val TIME_OUT : Long = 4000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.spalsh)

        Handler().postDelayed(Runnable {
            kotlin.run{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()

           }
        }, (TIME-OUT).toLong())
    }
}