fun main() {
    print(factorial(20))
}

fun factorial(n: Int): Long {
    if (n<0) throw IllegalArgumentException("Number must be non-negative")
    if (n==1 || n==0) return 1
    return n * factorial(n - 1)
}

// Challenge
fun cached() {

}