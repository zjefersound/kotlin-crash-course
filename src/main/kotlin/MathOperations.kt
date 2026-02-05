fun main() {
    println("math operations")

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

}