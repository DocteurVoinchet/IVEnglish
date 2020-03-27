package com.example.ivenglish

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ivenglish.dbhelper.DBHelper
import com.example.ivenglish.model.Score

class HistoricActivity : AppCompatActivity() {
    var list = ArrayList<Score>()
    internal lateinit var db: DBHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_historic)

        db = DBHelper(this)
    }
}
