package com.example.ivenglish

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ivenglish.dbhelper.DBHelper
import com.example.ivenglish.model.Quiz

class MainActivity : AppCompatActivity() {
    internal lateinit var db:DBHelper
    internal var listQuiz: List<Quiz> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        db = DBHelper(this)
    }

    fun onClickBtnPlay(view: View) {
        val intent = Intent ( this, QuizActivity::class.java)
        startActivity(intent)
    }
}
