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

    // Null safety:
    // - Did not exist with java, however it's pretty similar to JS
    // - Crazy stuff over here LOL
    // Nullable + increment + module
    var weight = readln().toIntOrNull()?.inc()?.rem(2)?.equals(0)
    print(weight)

}