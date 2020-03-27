package com.example.ivenglish.model

class Quiz {
    var id: Int = 0
    var translation: String? = null
    var verb: String? = null
    var preterit: String? = null
    var pp: String? = null

    constructor()

    constructor(translation: String, verb: String, preterit: String, pp: String) {
        this.translation = translation
        this.verb = verb
        this.preterit = preterit
        this.pp = pp
    }

    constructor(id: Int, translation: String, verb: String, preterit: String, pp: String) {
        this.id = id
        this.translation = translation
        this.verb = verb
        this.preterit = preterit
        this.pp = pp
    }

    fun isCorrect (verbTest: String, preteritTest: String, ppTest: String): Boolean {
        if (verbTest == this.verb && preteritTest == this.preterit && ppTest == this.pp)
            return true
        return false
    }

    override fun toString(): String {
        return this.translation + "//" + this.verb + "//" + this.preterit + "//" + this.pp
    }

}