package com.example.findmyage

import java.util.Calendar

data class CurrentDate(var cYear: Int, var cMonth: Int, var cDay: Int) {
    constructor() : this(
        cYear = Calendar.getInstance().get(Calendar.YEAR).toString().toInt(),
        cMonth =(Calendar.getInstance().get(Calendar.MONTH) + 1).toString().toInt(), // Calendar.MONTH is 0-indexed
        cDay = Calendar.getInstance().get(Calendar.DAY_OF_MONTH).toString().toInt()
    )
    fun getCurrentYear(): Int {
        return cYear
    }
    fun getCurrentMonth(): Int {
        return cMonth
    }
    fun getCurrentDay(): Int {
        return cDay
    }

}
