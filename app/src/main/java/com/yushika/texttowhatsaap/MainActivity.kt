package com.yushika.texttowhatsaap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.yushika.texttowhatsapp.TextToWhatsApp

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val wp= TextToWhatsApp("919098029683",this)
        wp.sentMsg()
    }
}