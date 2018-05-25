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

    //TODO: 4.1 Add an Onclick event showToast
    fun showToast(view: View){
        //TODO: 4.2 Show toast when button is clicked. Extract toast_message
            val mytoast: Toast = Toast.makeText(this,getString(R.string.toast_message),Toast.LENGTH_LONG)
            mytoast.show()
    }

    //TODO: 4.1 Add an Onclick event coutUp
    fun countUp(view: View){
        //TODO: 4.3 Increase the count in the text View when count button is clicked
        mCount++
        show_count.text = mCount.toString()

    }

}
