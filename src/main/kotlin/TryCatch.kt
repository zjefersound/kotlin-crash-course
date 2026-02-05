fun main() {
    println("height in cm")
    val height = try {
        readln().toInt()
    } catch (e: NumberFormatException) {
        0
    }

    try {
        println("weight in kg")
        val weight = readln().toInt()

        val imc: Double = weight.toDouble() / (height.toDouble() / 100 * height.toDouble() / 100)

        println("IMC: $imc")
    } catch (e: Exception) {
        println("ERROR: ${e.message}")
    }
}