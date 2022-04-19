package com.zybooks.quizapp

data class OptionTypes (
    var id:Int,
    var question:String,

    var option_one:String,
    var option_two:String,
    var option_three:String,
    var option_four:String,
    var correct_answer:Int
)