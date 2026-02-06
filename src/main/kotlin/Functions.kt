fun main() {
    print("Enter your name: ")
    val name = readln()
    println("Name: $name")
    println("Reversed name: ${reversed(name)}")

    executeWithCallback(name, ::doSomething)
    println("isPalindrome: ${isPalindrome(name)}")

    println("Custom reversed: ${name.reversed2()}")

    val numb = readln().toInt()
    println("Custom Int reversed: $numb -> ${numb.reversed()}")
}

fun reversed(str: String): String {
    val reversedStr = buildString {
        for(i in str.lastIndex downTo 0) {
            append(str[i])
        }
    }
    return reversedStr
}

fun doSomething(name: String): Unit {
    println(name)
}

fun executeWithCallback(name: String, callback: (String) -> Unit) {
    println("Calling $name")
    val revName = reversed(name)
    callback(revName)
}

fun isPalindrome(str: String): Boolean {
    return str.lowercase() == reversed(str).lowercase()
}

fun String.reversed2(): String {
    val reversedStr = buildString {
        // If we only use the pure "this" it would get the "this" from inside the buildString, which is different from reverser2
        for(i in this@reversed2.lastIndex downTo 0) {
            append(this@reversed2[i])
        }
    }
    return reversedStr
}

fun Int.reversed(): Int {
    val str = this.toString()
    return Integer.valueOf(str.reversed2())
}