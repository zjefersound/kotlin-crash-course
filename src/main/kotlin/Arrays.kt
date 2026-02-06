fun main() {
    val grades = intArrayOf(1,2,4,6,8)

    // Get values
    println(grades[0])
    println(grades[1])
    println(grades[2])

    // When the index doesnt exist
    try {
        println(grades[10])
    } catch (e: Exception) {
        println("this index doesnt exist")
    }
    println(grades.getOrNull(10))

    // Fallback
    println(grades.getOrElse(10, { 69 }))

    print("get grade by index")
//    val index = readln().toIntOrNull()
    val index = 2


    if (index != null && index in 0..grades.lastIndex) {
        println(grades[index])
    }

    var subjets = arrayOf("math", "english", "biology")
    println(subjets[0])
    subjets = subjets + "history" // adds to the array
    println(subjets[3])

    println(subjets.size)
    subjets+="arts"
    println(subjets.size)
    println(subjets[4])

    val immutableSubjects = arrayOf("math", "english", "biology")
    immutableSubjects[0] = "portuguese"
    println(immutableSubjects[0])

    try {
        immutableSubjects[3] = "arts"
        println(immutableSubjects[3])
    } catch (e: Exception) {
        println("cant create a new index")
    }

    // example of a familiar type of array/list with mutableListOf
    val students = mutableListOf("Marco", "Lel", "Ryan")
    students.add("Marcia")
    println(students)
    students.remove("Marco")
    println(students)

    
}