package com.hansung.gitflow

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class SubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    companion object{
        const val Sub = "Sub"
    }
}