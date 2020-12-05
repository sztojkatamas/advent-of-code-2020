package hu.advent.of.code.day5

import hu.advent.of.code.BaseChallenge

class Puzzle5A: BaseChallenge() {

    override fun run() {

        val data = loadStringDataFromFile("data/data5.txt")
        var max = 0
        for (line in data) {
            val current = calculateRow(line)
            if (current > max) {
                max = current
            }
        }
        println("Max ID number is: $max")
    }

    private fun calculateRow(str :String) : Int {
        var seatRows = mutableListOf<Int>()
        var seatCols = mutableListOf<Int>()

        for (i in 0..127) {
            seatRows.add(i)
        }

        for (i in 0..7) {
            seatCols.add(i)
        }

        for (s in str) {
            when (s) {
                'F' -> {
                    seatRows = seatRows.take(seatRows.size / 2).toMutableList()
                }
                'B' -> {
                    seatRows = seatRows.takeLast(seatRows.size / 2).toMutableList()
                }
                'R' -> {
                    seatCols = seatCols.takeLast(seatCols.size / 2).toMutableList()
                }
                'L' -> {
                    seatCols = seatCols.take(seatCols.size / 2).toMutableList()
                }
                else -> {
                    println("Something is wrong")
                }
            }

        }
        return seatRows[0] * 8 + seatCols[0]
    }
}