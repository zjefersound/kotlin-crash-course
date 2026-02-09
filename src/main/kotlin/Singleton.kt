import java.time.LocalDate

fun main () {
    print("Date: ${DateUtil.formatDate(LocalDate.now())}")
}

object DateUtil {
    fun formatDate(date: LocalDate): String {
        return date.toString()
    }
}