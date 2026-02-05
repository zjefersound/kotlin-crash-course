fun main() {
    print("Enter your username: ")
    var name = readln()

    print("Enter your age: ")
    var age = readln().toIntOrNull()

    // !! forces a value to be truthy1, similar to JS/TS
    val isAgeEven = age!! % 2 == 0
    println(age)

    if (age == null) {
        println("Age is not valid")
        return
    }

    println("$name's age is $age. Is over 18 ? ${age > 18}")

    print("email: ")
    var email = readln() ?: (name + "@gmail.com")

    println(email)
}