fun main() {
    val a = 4
    var c = 9.4

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
}