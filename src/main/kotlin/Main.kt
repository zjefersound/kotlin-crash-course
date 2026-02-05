fun main() {
    val x = 52
    val age: Int = 99
    val weight: Double = 214.58
    val isLearning: Boolean = true


    // Redefinable variables
    var name : String = "Jeferson"


    println(name)
    name = "Jef"
    println(name)


    val a = 4
    val b = 2

    // Results will be the same as the type of the variables
    println(a + b)

    println(a / b)

    // If there is a float or double in the middle, it will result in a double
    var c = 9.4
    println(a + c)
    println(c / b)

    println("Operations:")
    println("sum: "+a+" + " + b +" = " + (a + b))
    println("subtraction: "+a+" - " + b +" = " + (a - b))
    println("multiplication: "+a+" * " + b +" = " + (a * b))
    println("division: "+a+" / " + b +" = " + (a / b))
    println("mod: "+a+" % " + b +" = " + (a % b))

    // Increment
    c++
    c--
    c+=1
    c-=-1
    println(c)

    // comparison
    println(c.toInt() == 11)
    println(c.toString() == "11")
    println(c.toString() == "11.4")
    println(c.toString() != "11")
    println(c.toInt() > 11)
    println(c.toInt() < 11)

    println("Concat")
    println("c = $c")

    // logical operations

    println("logical operators:")
    val isCEven = c % 2 == 0.toDouble()
    println(isCEven)

    val isAEven = a % 2 == 0
    println(isAEven)

    val isBothEven = isAEven && isCEven
    println(isBothEven)

    val isOneEven = isAEven || isCEven
    println("isOneEven: $isOneEven")

    // priority of logical operators (like math)
    // 1. &&
    // 2. ||

    var logical = true && false || true

    println("logical = $logical")

    logical = logical && false
    println("logical = $logical")

    // Input:

    println("Input your username:")
    var username = readln()
    println(username)

}