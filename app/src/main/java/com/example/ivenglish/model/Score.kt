package com.example.ivenglish.model

import android.icu.util.LocaleData
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class Score {
    var id: Int = 0
    var score: Int = -1
    var total: Int = 20
    var date: LocalDateTime = LocalDateTime.now()

    constructor()

    constructor(date: LocalDateTime) {
        this.date = date
    }

    companion object {
        fun stringToDate(dateText: String): LocalDateTime {
            return LocalDateTime.parse(dateText, DateTimeFormatter.BASIC_ISO_DATE)
        }
    }

    fun dateString(): String{
        return this.date.format(DateTimeFormatter.BASIC_ISO_DATE)
    }
}