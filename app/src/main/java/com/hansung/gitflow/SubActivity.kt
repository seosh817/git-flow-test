package com.hansung.gitflow

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(Sub, "Sub First Commit")
        Log.d(Sub, "Sub Second Commit")
    }

    companion object{
        const val Sub = "Sub"
    }
}