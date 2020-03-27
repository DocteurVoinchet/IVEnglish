package com.example.ivenglish

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import com.example.ivenglish.MainActivity
import com.example.ivenglish.dbhelper.DBHelper
import com.example.ivenglish.model.Quiz

class QuizActivity : AppCompatActivity() {
    var allList = ArrayList<Quiz>()
    var quizList = ArrayList<Quiz>()
    var numberOfGoodAnswers: Int = 0
    var actualQuiz: Int = 0
    var sizeOfQuiz: Int = 20
    internal lateinit var db:DBHelper

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        db = DBHelper(this)

        this.allList = ArrayList(db.allQuiz)

        for (x in 1..this.sizeOfQuiz){
            this.quizList.add(allList.random())
        }

        val cueTextView = findViewById<TextView>(R.id.cue)
        val scoreTextView = findViewById<TextView>(R.id.score)
        val turnTextView = findViewById<TextView>(R.id.turn)

        cueTextView.text = quizList[this.actualQuiz].translation
        scoreTextView.text = "Score : "  + this.numberOfGoodAnswers.toString() + " / " + this.actualQuiz.toString()
        turnTextView.text = "Turn "  + (this.actualQuiz + 1).toString() + " / " + this.sizeOfQuiz.toString()
    }

    @SuppressLint("SetTextI18n")
    fun onClickBtnNext(view: View){
        val cueTextView = findViewById<TextView>(R.id.cue)
        val scoreTextView = findViewById<TextView>(R.id.score)
        val turnTextView = findViewById<TextView>(R.id.turn)
        val infinitive: EditText = findViewById(R.id.infinitiveText)
        val preterit: EditText = findViewById(R.id.preteritText)
        val particle: EditText = findViewById(R.id.particleText)
        // Check if the answer is correct
        if (infinitive.text.toString().toLowerCase() == this.quizList[this.actualQuiz].verb
            && preterit.text.toString().toLowerCase() == this.quizList[this.actualQuiz].preterit
            && particle.text.toString().toLowerCase() == this.quizList[this.actualQuiz].pp) {
            this.numberOfGoodAnswers++
        }
        if (this.actualQuiz + 1 == this.sizeOfQuiz) {
            this.end()
        } else {
            // Next quiz
            this.actualQuiz++
            cueTextView.text = this.quizList[this.actualQuiz].translation
            scoreTextView.text = "Score : "  + this.numberOfGoodAnswers.toString() + " / " + this.actualQuiz.toString()
            turnTextView.text = "Turn "  + (this.actualQuiz + 1).toString() + " / " + this.sizeOfQuiz.toString()
            infinitive.setText("")
            preterit.setText("")
            particle.setText("")
        }
    }

    private fun end(){
        val intent = Intent ( this, EndQuiz::class.java)
        intent.putExtra("score", this.numberOfGoodAnswers)
        intent.putExtra("size", this.sizeOfQuiz)
        startActivity(intent)
    }
}
