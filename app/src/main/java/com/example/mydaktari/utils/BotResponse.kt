package com.example.mydaktari.utils



import java.sql.Date
import java.sql.Timestamp
import java.text.SimpleDateFormat
import java.util.Locale

object BotResponse {

    fun basicResponses(_message: String): String {

        val random = (0..2).random()
        val message = _message.lowercase(Locale.ROOT)


        return when {

            //Good evening/ morning
            message.contains("morning") && message.contains("evening") -> {
                val r = (0..100).random()
                val result = if (r == 100) "morning" else "evening"

                "Good $result too...How are you feeling?"
            }
            //Good Hi/ Hey
            message.contains("Hi") && message.contains("Hey") -> {
                val r = (0..1).random()
                val result = if (r == 0) "Hi" else "Hey"

                " $result too...How are you feeling?"
            }

            //yes/ no
            message.contains("yes") && message.contains("no") -> {
                val r = (0..1).random()
                val result = if (r == 0) "Okay!" else "Fine!"

                "$result ...I would like you to book an appointment we continue from there?"
            }

            //smoke/ alcohol
            message.contains("smoke") && message.contains("alcohol") -> {
                val r = (0..1).random()
                val result = if (r == 0) "Okay!" else "Fine!"

                "$result ...I would like you to book an appointment we continue from there?"
            }
            //Hello
            message.contains("hello") -> {
                when (random) {
                    0 -> "Hello there! How are you feeling?"
                    else -> "That's great!! I would like you to book an appointment we talk more.....thank you for choosing us." }
            }

            //feeling
            message.contains("feeling") -> {
                when (random) {
                    0 -> "Do you take Alcohol?"
                    1 -> "Do you Smoke?"
                    else -> "That's great!! I would like you to book an appointment we talk more.....thank you for choosing us." }
            }

            //Afternoon
            message.contains("afternoon") -> {
                when (random) {
                    0 -> "Good afternoon too! How are you feeling?"
                    else -> "That's great!! I would like you to book an appointment we talk more.....thank you for choosing us." }
            }

            //How are you?
            message.contains("how are you") -> {
                when (random) {
                    0 -> "I'm doing fine, how are you feeling?"
                    else -> "That's great!! I would like you to book an appointment we talk more.....thank you for choosing us."
                }
            }



            //When the programme doesn't understand...
            else -> {
                when (random) {
                    0 -> "That's great!! I would like you to book an appointment we talk more.....thank you for choosing us."
                    1 -> "That's great!! I would like you to book an appointment we talk more.....thank you for choosing us."
                    else -> "That's great!! I would like you to book an appointment we talk more.....thank you for choosing us."
                }
            }
        }
    }
}