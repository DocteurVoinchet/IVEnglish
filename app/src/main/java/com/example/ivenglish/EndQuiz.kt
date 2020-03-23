package com.example.ivenglish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class EndQuiz : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end_quiz)

        val intent: Intent? = intent

        var score: Int = 0
        var size: Int = 0

        if (intent != null) {
            if (this.intent.hasExtra("score")) {
                score = this.intent.getIntExtra("score", 0)
            }
            if (this.intent.hasExtra("size")) {
                size = this.intent.getIntExtra("size", 0)
            }
        }

        val scoreTextView = findViewById<TextView>(R.id.score)
        val sizeTextView = findViewById<TextView>(R.id.size)

        scoreTextView.text = score.toString()
        sizeTextView.text = size.toString()
    }

    fun onClickBtnHome(view: View) {
        val intent = Intent ( this, MainActivity::class.java)
        startActivity(intent)
    }
}
