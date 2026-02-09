fun main() {
    println("Distance: ${travelTo(Country.ARGENTINA)}")
    println("BR STATE: ${State.SANTA_CATARINA.code}")
}

enum class Country {
    BRAZIL, EQUATOR, UNITED_STATES, ARGENTINA, VENEZUELA, CANADA
}

fun travelTo(country: Country): Int {
    return when (country) {
        Country.BRAZIL -> 1
        Country.EQUATOR -> 2
        Country.VENEZUELA -> 7
        Country.UNITED_STATES -> 15
        Country.CANADA -> 17
        Country.ARGENTINA -> 1
        else -> 0
    }
}


enum class State(val code: String) {
    SAO_PAULO("SP"),
    SANTA_CATARINA("SC"),
    RIO_DE_JANEIRO("RJ")
}