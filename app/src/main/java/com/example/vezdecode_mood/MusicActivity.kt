package com.example.vezdecode_mood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MusicActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post_music)
    }

    fun onBack(view: View) {
        finish()
    }
}