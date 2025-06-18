package com.example.findmyage

import kotlin.properties.Delegates

class CalculateMyAge {
    private var cDate = CurrentDate()
    var myYear by Delegates.notNull<Int>()
    var myMonth by Delegates.notNull<Int>()
    var myDay by Delegates.notNull<Int>()
    var cDay by Delegates.notNull<Int>()
    var cMonth by Delegates.notNull<Int>()
    var cYear by Delegates.notNull<Int>()
    constructor(){
        myYear = 0
        myMonth = 0
        myDay = 0
    }
    fun getMyYear(year : Int,month : Int,day : Int): Int {
        cYear = cDate.getCurrentYear()
        cMonth = cDate.getCurrentMonth()
        cDay = cDate.getCurrentDay()
        myYear = if (cMonth < month) {
            cYear - year - 1
        } else {
            cYear - year
        }
        return myYear
    }
    fun getMyMonth(month : Int,day : Int): Int {
        cMonth = cDate.getCurrentMonth()
        myMonth = if (month > cMonth && cDay > day){
            12 - (month - cMonth)
        } else if (cDay < day && cMonth > month){
            cMonth - (month + 1)
        } else{
            cMonth - month
        }
        return myMonth
    }
    fun getMyDay(day : Int): Int {
        cDay = cDate.getCurrentDay()
        myDay = if (day > cDay){
            30 - (day - cDay)
        } else{
            cDay - day
        }
        return myDay
    }
}
