import java.text.SimpleDateFormat
import java.util.Date

fun main() {
    // simple if and else
    val x = 120
    val isOdd = x % 2 == 1

    if (isOdd) {
        println("$x is odd")
    } else {
        println("$x is even")
    }


    var name = "Jeferson"

    if (name.length < 4) {
        println("$name is too short")
    } else if (name.length > 20) {
        println("$name is too long")
    } else {
        println("$name is normal")
    }

    // similar to ternary operator, but longer
    var howLongIsName = if (name.length < 4) {
        "too short"
    } else if (name.length > 20) {
        "too long"
    } else {
        "normal"
    }

    println(howLongIsName)

    name = "Ana"
    howLongIsName = when {
        name.length < 4 -> "too short"
        name.length in 30 .. 40 -> "ttooooo long"
        name.length > 20 -> "too long"
        name == "Ma" -> "Ma long"
        else -> "normal"
    }
    println("$name is $howLongIsName")


    val yearOrBirth = 1965
    val currentYear = SimpleDateFormat("yyyy").format(Date()).toInt()
    val generation = when(yearOrBirth) {
        in currentYear until Int.MAX_VALUE -> "Not born yet"
        currentYear -> "Cute cute"
        in 2025..2039 -> "Beta"
        in 2013..2024 -> "Alpha"
        in 1997..2012 -> "Gen Z"
        in 1981..1996 -> "Millennials"
        in 1965..1980 -> "Gen X"
        in 1946..1964 -> "Boomers"
        else -> "Farao"
    }
    println("$yearOrBirth is $generation")
}