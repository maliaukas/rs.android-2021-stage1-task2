package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        when (blockB) {
            String::class -> {
                val result = StringBuilder("")
                blockA.forEach {
                    if ((it as? String) != null) {
                        result.append(it)
                    }
                }
                return result.toString()
            }

            Int::class -> {
                var result = 0
                blockA.forEach {
                    if ((it as? Int) != null) {
                        result += it
                    }
                }
                return result
            }

            LocalDate::class -> {
                val dateArray = mutableListOf<LocalDate>()
                blockA.forEach {
                    if ((it as? LocalDate) != null) {
                        dateArray.add(it)
                    }
                }
                dateArray.sort()
                return dateArray.last().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
            }

            else -> {
                throw IllegalArgumentException("aaaa!")
            }
        }
    }
}
