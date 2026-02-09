import kotlin.math.sqrt

fun main () {
    println("Enter the height of a rectangle")
    val h = readln().toFloatOrNull()
    println("Enter the width of a rectangle")
    val w = readln().toFloatOrNull()

    if (h == null || w == null) return

    val rect = Rectangle(w,h)

    println("Area of rectangle ${rect.calcArea()}")
    println("Perimeter of rectangle ${rect.calcPerimeter()}")

    val rect2 = Rectangle(
        width = rect.width*2,
        height = rect.height*2
    )
    println("Area of rectangle 2: ${rect2.calcArea()}")
    println("Perimeter of rectangle 2: ${rect2.calcPerimeter()}")
    println("Diagonal of rectangle 2: ${rect2.diagonal}")

    println(rect == rect2) // comparison by reference, not value, as in JS

    val sqr1 = Square(3f)
    val sqr2 = Square(3f)

    println(sqr1 == sqr2) // data class comparison by structure

    println(rect)
    println(sqr1)

    val sqr3 = sqr1.copy()
    sqr3.size = 4f
    println(sqr3)

    sumAreas(sqr1, sqr2, sqr3, rect, rect2)
    printShapes(sqr1, rect2)
}

class Rectangle (val width: Float, val height: Float): Shape() {
    val diagonal = sqrt(height * height + width * width)
    override val area =  width * height
    override val perimeter = 2 * height + 2 * width

    fun calcArea() : Float {
        return width * height
    }

    fun calcPerimeter(): Float {
        return 2 * height + 2 * width
    }
}

data class Square(var size: Float) : Shape() {
    override val area = size*size
    override val perimeter = size*4
}

// Used to set contracts between functions and classes
// In this scenario using an interface is the ideal, because we don't have
// inner states or shared methods
interface Shape2 {
    val area: Float
    val perimeter: Float
}


// We cannot create instances of abstract classes, only instances of children of abs classes
abstract class Shape() {
    // The difference between interfaces and abs classes is that we can have states (attributes/vars) and methods
    // inside the abs class. This is how inheritance works in Kotlin
    abstract val area: Float
    abstract val perimeter: Float
}

// Open classes can be abstract or be instanced
open class Circle(): Shape2 {
    open val radius: Float = 0f
    override val area: Float = 0f
    override val perimeter: Float = 0f
}

fun sumAreas(vararg shapes: Shape) : Float {
    val sum = shapes.map { it.area }.reduce { acc, area -> acc+area }
    println("Sum: $sum")
    return sum
}

fun printShapes(vararg shapes: Shape) {
    for (shape in shapes) {
        when (shape) {
            is Square -> {
                println("Square")
            }
            is Rectangle -> {
                println("Rectanguru")
            }
            else -> {
                println("Not found")
            }
        }
    }
}