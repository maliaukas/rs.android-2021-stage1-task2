package subtask1

import java.time.DateTimeException
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {
    fun toTextDay(day: String, month: String, year: String): String {
        val date: LocalDate
        try {
            date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
        } catch (e: DateTimeException) {
            return "Такого дня не существует"
        }

        return date.format(
            DateTimeFormatter.ofPattern("dd MMMM, EEEE")
                .withLocale(Locale.forLanguageTag("ru-RU"))
        )
    }
}
