import java.io.File

class measurementDeepSonar {

    fun main() {
        var count = 0
        val lineList = mutableListOf<String>()

        File("C:/Users/amne.sampaio.fredo/OneDrive - Accenture/Documents/cursoKotlin_Julio/Puzzle/Puzzle_01.txt").useLines { lines -> lines.forEach { lineList.add(it) }}

        for (x in 1 until lineList.size){


        }
        println(count)
    }
}