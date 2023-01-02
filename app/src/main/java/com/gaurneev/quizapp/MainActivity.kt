package com.gaurneev.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart : Button = findViewById(R.id.startButton)
        val etName : EditText = findViewById(R.id.etName)
        btnStart.setOnClickListener {
            if (etName.text.isEmpty()){
                Toast.makeText(this,"Please enter your name", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "All the best !!!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, QuizQuestionsActivity :: class.java)
                intent.putExtra(constants.USER_NAME, etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}