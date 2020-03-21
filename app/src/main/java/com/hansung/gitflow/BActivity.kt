package com.hansung.gitflow

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class BActivity :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(B, "B first commit")
        Log.d(B, "B second commit")
        Log.d(B, "B third commit")

    }

    companion object{
        const val B = "B"
    }
}