package com.example.ivenglish.dbhelper

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import com.example.ivenglish.dbhelper.import.importAll
import com.example.ivenglish.model.Quiz


class DBHelper (context: Context):SQLiteOpenHelper(context,
    DATABASE_NAME, null,
    DATABASE_VER
){
    companion object {
        private val DATABASE_VER = 1
        private val DATABASE_NAME = "EDMTDB.db"

        //Table
        private val TABLE_NAME="Quiz"
        private val COL_ID="Id"
        private val COL_TRANSLATION="Translation"
        private val COL_VERB="Verb"
        private val COL_PRETERIT="Preterit"
        private val COL_PP="Pp"
    }
    override fun onCreate(db: SQLiteDatabase?) {
        val CREATE_TABLE_QUERY: String = ("CREATE TABLE $TABLE_NAME ( $COL_ID INTEGER PRIMARY KEY, $COL_TRANSLATION TEXT, $COL_VERB  TEXT, $COL_PRETERIT TEXT, $COL_PP TEXT)")
        db!!.execSQL(CREATE_TABLE_QUERY);
        importAll(this)
    }

    override fun onUpgrade(db: SQLiteDatabase?, p1: Int, p2: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS $TABLE_NAME")
        onCreate(db!!)
    }

    //CRUD
    val allQuiz:List<Quiz>
        get() {
            val listQuiz = ArrayList<Quiz>()
            val selectQuery = "SELECT * FROM $TABLE_NAME"
            val db: SQLiteDatabase = this.writableDatabase
            val cursor: Cursor = db.rawQuery(selectQuery, null)
            if(cursor.moveToFirst()){
                do{
                    val quiz = Quiz()
                    quiz.id = cursor.getInt(cursor.getColumnIndex(COL_ID))
                    quiz.translation = cursor.getString(cursor.getColumnIndex(COL_TRANSLATION))
                    quiz.verb = cursor.getString(cursor.getColumnIndex(COL_VERB))
                    quiz.preterit = cursor.getString(cursor.getColumnIndex(COL_PRETERIT))
                    quiz.pp = cursor.getString(cursor.getColumnIndex(COL_PP))

                    listQuiz.add(quiz)
                } while (cursor.moveToNext())
            }
            db.close()
            return listQuiz
        }

    fun addQuiz(quiz: Quiz) {
        val db = this.writableDatabase
        val values = ContentValues()
        values.put(COL_TRANSLATION, quiz.translation)
        values.put(COL_VERB, quiz.verb)
        values.put(COL_PRETERIT, quiz.preterit)
        values.put(COL_PP, quiz.pp)

        db.insert(TABLE_NAME, null, values)

        db.close()
    }

    fun addQuizs(quizs: ArrayList<Quiz>) {
        val db = this.writableDatabase
        db.beginTransaction()
        try {
            val values = ContentValues()
            for (quiz: Quiz in quizs){
                values.put(COL_TRANSLATION, quiz.translation)
                values.put(COL_VERB, quiz.verb)
                values.put(COL_PRETERIT, quiz.preterit)
                values.put(COL_PP, quiz.pp)
                db.insert(TABLE_NAME, null, values)
            }
            db.setTransactionSuccessful()
        } finally {
            db.endTransaction()
        }
        db.close()
    }

    fun updateQuiz(quiz: Quiz): Int {
        val db = this.writableDatabase
        val values = ContentValues()
        values.put(COL_ID,quiz.id)
        values.put(COL_TRANSLATION, quiz.translation)
        values.put(COL_VERB, quiz.verb)
        values.put(COL_PRETERIT, quiz.preterit)
        values.put(COL_PP, quiz.pp)

        return db.update(TABLE_NAME, values, "$COL_ID=?", arrayOf(quiz.id.toString()))
    }

    fun deleteQuiz(quiz: Quiz) {
        val db = this.writableDatabase

        db.delete(TABLE_NAME, "$COL_ID=?", arrayOf(quiz.id.toString()))
        db.close()
    }

    fun deleteAllQuiz() {
        val db = this.writableDatabase

        db.delete(TABLE_NAME, null, null)
        db.close()
    }

    //todo:https://www.youtube.com/watch?v=VuK0c3esUJE
}