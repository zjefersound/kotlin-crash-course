import kotlin.time.measureTime
import kotlin.time.Duration

fun main() {
    val cachedFactorial = cached(::factorial)
    val executionTime: Duration = measureTime {
        println(cachedFactorial(10))
        println(cachedFactorial(10))
        println(cachedFactorial(10))
        println(cachedFactorial(10))
        println(cachedFactorial(11))
    }
    println("The code block took: ${executionTime.inWholeMilliseconds} ms")
}

fun factorial(n: Int): Long {
    Thread.sleep(1000)
    if (n<0) throw IllegalArgumentException("Number must be non-negative")
    if (n==1 || n==0) return 1
    return n * factorial(n - 1)
}

// Challenge
fun <A, R> cached(fn: (A) -> R): (A) -> R {
    // Typing with the params type A and return R
    val cache = mutableMapOf<A, R>()

    return { params: A ->
        // If the value exists in the cache, returns
        // Otherwise, run the function, get the result,
        // save in the cache then return the result
        cache[params] ?: run {
            val result = fn(params)
            cache[params] = result
            result
        }
    }
}

// My own version with the minimum help of types and lambda
fun <A, R> basicCached(fn: (A) -> R): (A) -> R {
    val cache = mutableMapOf<String, R>()

    return {params: A ->
        println("params: $params")
        println("cache: $cache")
        if (cache.containsKey(params.toString())) {
            cache.getValue(params.toString())
        } else {
            val result = fn(params)
            cache[params.toString()] = result
            result
        }
    }
}

