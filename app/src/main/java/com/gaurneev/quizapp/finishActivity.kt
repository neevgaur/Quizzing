package com.gaurneev.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class finishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val tvname:TextView = findViewById(R.id.tvName)
        val tvScore:TextView = findViewById(R.id.tvScore)
        val btnFinish: Button = findViewById(R.id.btnFinish)

        tvname.text = intent.getStringExtra(constants.USER_NAME)

        val totalQuestion = intent.getIntExtra(constants.TOTAL_QUESTION,0)
        val score = intent.getIntExtra(constants.CORRECT_ANSWERS,0)

        tvScore.text = "Your score is $score out of $totalQuestion"
        btnFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}