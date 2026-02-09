fun main() {
    val names = listOf("Jeferson", "Marcos", "Renan", "Rafael", "Erica", "Ricardo", "Barbara")
    println(filterAnything<String>(names, { name -> name.contains("a")}))
    println(makeHTTPRequest(true))
    println(makeHTTPRequest(false))

}

fun <T> filterAnything(list: List<T>, predicate: (param: T) -> Boolean): List<T> {
    val filteredList = ArrayList<T>()

    for (item in list) {
        if (predicate(item)) {
            filteredList.add(item)
        }
    }

    return filteredList
}

sealed interface Result<out D, out E> {
    data class Success<D>(val data: D): Result<D, Nothing>
    data class Error<E>(val error: E): Result<Nothing, E>
}

fun makeHTTPRequest(success: Boolean = true): Result<String, Int> {
    if(success) return Result.Success("Brabo")
    else return  Result.Error(500)
}