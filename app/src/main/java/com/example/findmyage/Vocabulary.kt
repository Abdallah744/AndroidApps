package com.example.findmyage

class Vocabulary {
    constructor(){
       var myVocabulary = "My Vocabulary is Pieces"
    }
    fun getMyVocabulary(month: Int, day: Int): String {
        var myVocabulary = "My Vocabulary is Pieces"
        var myMonth : Int = month
        var myDay : Int = day
        if ((myMonth == 12 && myDay in 22..31)  || (  myMonth == 1 && myDay in 1..19)){
            myVocabulary = "My Vocabulary Capricorn"
        }
        else if ((myMonth == 1 && myDay in 20..18) || ( myMonth == 2 && myDay in 1..18)){
            myVocabulary = "My Vocabulary Aquarius"
        }
        else if ((myMonth == 2 && myDay in 19..29 ) || ( myMonth == 3  && myDay in 1..20)){
            myVocabulary = "My Vocabulary Pisces"
        }
        else if ((myMonth == 3 && myDay in 21..31) || (myMonth == 4 && myDay in 1..19)){
            myVocabulary = "My Vocabulary Aries"
        }
        else if ((myMonth == 4 && myDay in 20..30) || (myMonth == 5 && myDay in 1..20)){
            myVocabulary = "My Vocabulary Taurus"
        }
        else if ((myMonth == 5 && myDay in 21..31) || (myMonth == 6 && myDay in 1..21)){
            myVocabulary = "My Vocabulary Gemini"
        }
        else if ((myMonth == 6 && myDay in 22..30) || (myMonth == 7 && myDay in 1..22)){
            myVocabulary = "My Vocabulary Cancer"
        }
        else if ((myMonth == 7 && myDay in 23..30) || (myMonth == 8 && myDay in 1..22)){
            myVocabulary = "My Vocabulary Leo"
        }
        else if ((myMonth == 8 && myDay in 23..31) || (myMonth == 9 && myDay in 1..22)){
            myVocabulary = "My Vocabulary Virgo"
        }
        else if ((myMonth == 9 && myDay in 23..31) || (myMonth == 10 && myDay in 1..23)){
            myVocabulary = "My Vocabulary Libra"
        }
        else if ((myMonth == 10 && myDay in 24..30) && (myMonth == 11 && myDay in 1..22)){
            myVocabulary = "My Vocabulary Scorpio"
        }
        else if ((myMonth == 11 && myDay in 23..30) || (myMonth == 12 && myDay in 1..21)){
            myVocabulary = "My Vocabulary Sagittarius"
        }
        return myVocabulary
    }
}