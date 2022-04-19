package com.zybooks.quizapp

object Questions {

    const val name:String="name"
    const val score:String="score"

    fun getQuestion():ArrayList<OptionTypes>{
        var questionArray:ArrayList<OptionTypes> = arrayListOf()

        var question1 = OptionTypes(
            1,
            "Who was the first president of the United States?",

            "Thomas Jefferson",
            "Abraham Lincoln",
            "George Washington",
            "John Adams",
            3
        )
        var question2 = OptionTypes(
            2,
            "Chicago is a:",

            "state",
            "city",
            "country",
            "continent",
            2
        )
        var question3 = OptionTypes(
            3,
            "When was the war of 1812?",

            "1912",
            "1821",
            "1820",
            "1812",
            4
        )
        var question4 = OptionTypes(
            4,
            "Which is the correct spelling of Receive?",

            "Recieve",
            "Receive",
            "Receeve",
            "Receieve",
            2
        )

        var question5 = OptionTypes(
            5,
            "Which of the following is considered a fish?",

            "Starfish",
            "Jellyfish",
            "Clown fish",
            "Crayfish",
            3
        )

        questionArray.add(question1)
        questionArray.add(question2)
        questionArray.add(question3)
        questionArray.add(question4)
        questionArray.add(question5)
        return questionArray
    }
}