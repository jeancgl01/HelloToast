package com.mtw.juancarlos.hellotoast

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var mCount:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showToast(view: View){
            val mytoast: Toast = Toast.makeText(this,getString(R.string.toast_message),Toast.LENGTH_LONG)
            mytoast.show()
    }

    fun countUp(view: View){
        mCount++
        show_count.text = mCount.toString()

    }

}
