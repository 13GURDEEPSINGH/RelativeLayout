package com.gurdeep.relativelayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
      var htv :TextView ?=null
      var tvd :TextView ?=null
      var tvm :TextView ?=null
      var mitv:TextView ?=null
      var ptv :TextView ?=null
      var a=1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        htv = findViewById(R.id.htv)
        tvd = findViewById(R.id.tvd)
        tvm = findViewById(R.id.tvm)
        mitv = findViewById(R.id.mitv)
        ptv = findViewById(R.id.ptv)

        tvd?.setOnClickListener {
            a = a / 2
            htv?.setText(a.toString())
        }
        ptv?.setOnClickListener{
            a  = a + 2
            ptv?.setText(a.toString())
        }

        tvm?.setOnClickListener {
            a = a * 2
            htv?.setText(a.toString())
        }

        mitv?.setOnClickListener {
            a = a - 2
            htv?.setText(a.toString())
        }




    }
}