package com.hansung.gitflow

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class CActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(C, "C First Commit")
        Log.d(C, "C Second Commit")
        Log.d(C, "C Third Commit")

    }

    companion object{
        const val C = "C"
    }
}