package subtask2

class Abbreviation {

    fun abbreviationFromA(a: String, b: String): String {
        val output = StringBuilder()
        var j = 0
        a.forEach { c: Char ->
            if (j == b.length)
                return@forEach
            if (c.toUpperCase() == b[j]) {
                output.append(b[j])
                j++
            }
        }
        return if (output.toString() == b) "YES" else "NO"
    }
}
