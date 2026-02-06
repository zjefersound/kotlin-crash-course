fun main() {
    // well-known while loop
    var count = 0
    while (count < 5) {
        count++
        println(count)
    }

    val students = mutableListOf<String>("John", "Peter", "Mary")

    // similar to JS
    for (student in students) {
        println(student)
    }

    for(i in 1..5) {
        println(i)
    }

    for (i in 10 downTo  1) {
        println(i)
    }

    val name = "Jeferson"

    val reversedName = buildString {
        for(i in name.lastIndex downTo 0) {
            append(name[i])
        }
    }
    println(reversedName)
}