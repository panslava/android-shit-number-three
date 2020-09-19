package com.example.vezdecode_mood

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_map)
    }

    fun MainOnClick(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun ITOnClick(view: View) {
        val intent = Intent(this, ITActivity::class.java)
        startActivity(intent)
    }

    fun AutoOnClick(view: View) {
        val intent = Intent(this, AutoActivity::class.java)
        startActivity(intent)
    }

    fun AutumnOnClick(view: View) {
        val intent = Intent(this, AutumnActivity::class.java)
        startActivity(intent)
    }

    fun ArtOnClick(view: View) {
        val intent = Intent(this, ArtActivity::class.java)
        startActivity(intent)
    }

    fun CarantineOnClick(view: View) {
        val intent = Intent(this, CarantineActivity::class.java)
        startActivity(intent)
    }

    fun GamesOnClick(view: View) {
        val intent = Intent(this, GamesActivity::class.java)
        startActivity(intent)
    }

    fun HumorOnClick(view: View) {
        val intent = Intent(this, HumorActivity::class.java)
        startActivity(intent)
    }

    fun MovieOnClick(view: View) {
        val intent = Intent(this, MovieActivity::class.java)
        startActivity(intent)
    }

    fun PhotoOnClick(view: View) {
        val intent = Intent(this, PhotoActivity::class.java)
        startActivity(intent)
    }

    fun WorkOnClick(view: View) {
        val intent = Intent(this, WorkActivity::class.java)
        startActivity(intent)
    }

    fun MusicOnClick(view: View) {
        val intent = Intent(this, MusicActivity::class.java)
        startActivity(intent)
    }
}