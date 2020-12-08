package hu.advent.of.code.day8

import hu.advent.of.code.BaseChallenge

class Puzzle8A : BaseChallenge() {

    private val executedLines = mutableSetOf<Int>()

    override fun run() {
        val data = loadStringDataFromFile("data/data8.txt")
        var currentLine = 0
        var accu = 0
        while (!executedLines.contains(currentLine)) {
            executedLines.add(currentLine)
            val s = data[currentLine].split(" ")
            when (s[0]) {
                "nop" -> {
                    currentLine++
                }
                "acc" -> {
                    accu += s[1].toInt()
                    currentLine++
                }
                "jmp" -> {
                    currentLine += s[1].toInt()
                }
            }
        }
        println("ACCU: $accu")
    }
}