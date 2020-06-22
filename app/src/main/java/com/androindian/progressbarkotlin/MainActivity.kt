package com.androindian.progressbarkotlin

import android.app.ProgressDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progress.setOnClickListener {
            var progressDialog=ProgressDialog(this@MainActivity)
            progressDialog.setTitle("Hi Hello")
            progressDialog.setMessage("Good Morning")
            progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER)
            progressDialog.show()
        }

        hori.setOnClickListener {
            var progressDialog=ProgressDialog(this@MainActivity)
            progressDialog.setTitle("Hi Hello")
            progressDialog.setMessage("Good Morning")
            progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL)

            progressDialog.show()
        }
    }
}
