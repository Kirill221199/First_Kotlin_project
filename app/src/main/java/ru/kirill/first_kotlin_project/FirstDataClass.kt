package ru.kirill.first_kotlin_project

import android.util.Log

data class FirstDataClass(val name: String, val surname: String) {

    val age: Int = 22
}

object Cycles {

    fun testIf(x: Int, y: Int): String {
        val result = if (x == y) {
            "variables are equal"
        } else {
            "variables are not equal"
        }
        return result
    }

    /**
     * Enter the day of the week as a number from 1 to 7
     */
    fun testWhen(input: Int): String {
        val result = when (input) {
            1 -> "Monday"
            2 -> "Tuesday"
            3 -> "Wednesday"
            4 -> "Thursday"
            5 -> "Friday"
            6 -> "Saturday"
            7 -> "Sunday"
            else -> "Invalid number"
        }
        return result
    }

    fun testFor() {
        for (i in 1..5) {
            Log.d("myLogs", "$i testFor")
        }

    }

    fun testForeach() {
        val list = listOf(1, 2, 3, 4, 5)

        for (one in list) {
            Log.d("myLogs", "$one first variant testForeach")
        }

        Log.d("myLogs", "-----------------------------------------")

        list.forEach {
            Log.d("myLogs", "$it second variant testForeach")
        }

        Log.d("myLogs", "-----------------------------------------")

        list.forEach { one: Int ->
            Log.d("myLogs", "$one third variant testForeach")
        }

    }

    fun testRepeat(textRepeat: String) {
        repeat(5) {
            Log.d("myLogs", "$it $textRepeat testRepeat")
        }

    }

    fun testWhile() {
        var counter = 5;
        while (counter-- > 0) {
            Log.d("myLogs", "$counter testWhile")
        }
    }

    fun testDoWhile() {
        var counter = 5;
        do {
            Log.d("myLogs", "$counter testDoWhile")
        } while (counter-- > 0)
    }

}
