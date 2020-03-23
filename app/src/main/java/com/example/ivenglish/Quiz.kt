package com.example.ivenglish

import java.security.KeyStore

class Quiz(var translation: String, var verb: String, var preterit: String, var pp: String) {

    fun isCorrect (verbTest: String, preteritTest: String, ppTest: String): Boolean {
        if (verbTest == this.verb && preteritTest == this.preterit && ppTest == this.pp)
            return true
        return false
    }

}