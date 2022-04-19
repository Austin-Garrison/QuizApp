package com.zybooks.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Result : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        window.decorView.systemUiVisibility= View.SYSTEM_UI_FLAG_FULLSCREEN
        val userName=intent.getStringExtra(Questions.name)
        val score=intent.getStringExtra(Questions.score)
        val totalQuestion=intent.getStringExtra("total size")

//        button.setOnClickListener {
//            startActivity(Intent(this,MainActivity::class.java))
//            finish()
//        }

    }
}