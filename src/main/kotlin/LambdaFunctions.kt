fun main() {
    val text = "For R3al Br000"

    val lettersOnly = text.filter {
        it.isLetter()
    }

    println("Letters Only: $lettersOnly")

    val students = mutableListOf("Jonas", "Manuela", "Karina", "Lula", "Clovis", "Jackson", "Jorge")
    println(students)

    val studentsWithJ = students.filter {
        it.startsWith("J", ignoreCase = true)
    }

    println(studentsWithJ)

    val startsWithK: (String) -> Boolean = {
        it.startsWith("K")
    }
    val studentsWithK = students.filter(startsWithK)
    println(studentsWithK)

    val studentsWithL = students.filter {
        name -> name.startsWith("L", ignoreCase = true) // explicit lambda param name, instead of only using "it"
    }
    println(studentsWithL)

    val concatenatedNames = students.reduce {
        acc, string ->
        acc.plus(string)
    }

    println(concatenatedNames)

    val emailsWithName = students.map2 {
        "$it@email.com"
    }

    println(emailsWithName)

}

fun MutableList<String>.map2(predicate: (String) -> String): MutableList<Any> {
    val mappedList = mutableListOf<Any>()
    for (i in 0..this@map2.lastIndex) {
        val result = predicate(this@map2[i])
        mappedList.add(result)
    }
    return mappedList
}