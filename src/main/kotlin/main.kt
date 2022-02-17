import java.io.File

fun main() {

        fun withPreviousItem() {var count = 0
            var previousItem = 0

            File("C:/Users/amne.sampaio.fredo/OneDrive - Accenture/Documents/cursoKotlin_Julio/Puzzle/Puzzle_01.txt")
                //.useLines { lines -> lines.forEach { println(it) }}
                .useLines { lines -> lines.forEach { when {
                    previousItem != 0 && it.toInt() > previousItem -> count++ }
                    previousItem = it.toInt() }
                    println("Counter with previous item : $count") }
        }

        fun withForAndWhen() {
        var count = 0
        val lineList = mutableListOf<Int>()

        File("C:/Users/amne.sampaio.fredo/OneDrive - Accenture/Documents/cursoKotlin_Julio/Puzzle/Puzzle_01.txt")
            .useLines { lines -> lines.forEach { lineList.add(it.toInt()) }}

        (0 until lineList.size-1).forEach { x ->
            when {
                lineList[x] < lineList[x+1] -> count++
            }
        }
        println("Counter with for and when : $count")
    }

        val mustBeEqual = withPreviousItem().equals(withForAndWhen())

        println("Comparing both functions the result was $mustBeEqual")
}