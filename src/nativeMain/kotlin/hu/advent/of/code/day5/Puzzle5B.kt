package hu.advent.of.code.day5

import hu.advent.of.code.BaseChallenge

class Puzzle5B : BaseChallenge() {
    var seats = mutableListOf<String>()

    override fun run() {

        for (i in 0..127) {
            seats.add("        ")
        }

        val data = loadStringDataFromFile("data/data5.txt")
        var max = 0
        for (line in data) {
            val current = calculateRow(line)
            if (current > max) {
                max = current
            }
        }
        println("Max ID number is: $max")

        for (i in seats.indices) {
            if (i>2 && seats[i].toCharArray().contains(' ')) {
                println("My ID: ${i * 8 + seats[i].indexOf(' ', 0, false)}")
                break
            }
        }
    }

    private fun createIntList(length: Int) : MutableList<Int> {
        val list = mutableListOf<Int>()
        for (i in 0 until length) {
            list.add(i)
        }
        return list
    }

    private fun calculateRow(str :String) : Int {
        var seatRows = createIntList(128)
        var seatCols = createIntList(8)


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
        mark(seatRows[0], seatCols[0])
        return seatRows[0] * 8 + seatCols[0]
    }

    private fun mark(row :Int, col :Int) {
        val s = seats[row].toCharArray()
        s[col] = 'X'
        seats[row] = s.concatToString()
    }
}