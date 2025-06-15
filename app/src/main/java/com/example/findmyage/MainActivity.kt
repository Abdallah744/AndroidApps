package com.example.findmyage

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.ComponentActivity
import kotlin.properties.Delegates

class MainActivity : ComponentActivity() {
    private var calculateMyAge = CalculateMyAge()
    private var vocabulary = Vocabulary()
    lateinit var textview: TextView
    lateinit var mYear: EditText
    lateinit var mMonth: EditText
    lateinit var mDay: EditText
    lateinit var click: Button
    // Removed initializations of year, month, day here

    var myYear by Delegates.notNull<Int>()
    var myMonth by Delegates.notNull<Int>()
    var myDay by Delegates.notNull<Int>()
    var myVocabulary by Delegates.notNull<String>()

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        mYear = findViewById(R.id.year)
        mMonth = findViewById(R.id.month)
        mDay = findViewById(R.id.day)
        textview = findViewById(R.id.myAge)
        click = findViewById(R.id.clacMyAge)

        click.setOnClickListener {
            // Get the text and convert to Int INSIDE the click listener
            val yearText = mYear.text.toString()
            val monthText = mMonth.text.toString()
            val dayText = mDay.text.toString()

            // It's also good practice to check if the input is empty or not a valid number
            if (yearText.isNotEmpty() && monthText.isNotEmpty() && dayText.isNotEmpty()) {
                try {
                    val year = yearText.toInt()
                    val month = monthText.toInt()
                    val day = dayText.toInt()
                    if ((month < 1 || month > 12) || (day < 1 || day > 31) || (year < 0 || year > 2023)){
                        textview.text = "Please enter valid numbers for year, month, and day."
                        return@setOnClickListener
                    }
                    else {
                        // Calculate the age using the CalculateMyAge class
                        myYear = calculateMyAge.getMyYear(year, month, day)
                        myMonth = calculateMyAge.getMyMonth(month, day)
                        myDay = calculateMyAge.getMyDay(day)
                        myVocabulary = vocabulary.getMyVocabulary(month, day)
                        textview.text =
                            "My Age is $myYear years $myMonth months and $myDay days, and $myVocabulary"
                    }
                } catch (_: NumberFormatException) {
                    // Handle the case where the input is not a valid number
                    textview.text = "Please enter valid numbers for year, month, and day."
                }
            } else {
                // Handle the case where one or more fields are empty
                textview.text = "Please fill in all fields."
            }
        }
    }
}