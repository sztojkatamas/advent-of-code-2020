package hu.advent.of.code.day9

import hu.advent.of.code.BaseChallenge

class Puzzle9A : BaseChallenge() {

    override fun run(): Boolean {
        println("\nDay 9 - Puzzle 1")
        val data :List<Long> = loadLongDataFromFile("data/data9.txt")
        val preamble = 25

        for (i in 1..(data.size - preamble)) {
            val workData = data.takeFrom(i-1, preamble)
            val wannabe  = data[i -1 + preamble]
            var found = false

            for (a in workData) {
                for (b in workData) {
                    if ((a + b) == wannabe ) {
                        found = true
                        break
                    }
                }
            }

            if (!found) {
                println("Number $wannabe at ${i + preamble} is corrupt.")
                return true
            }
        }
        return false
    }

    private fun List<Long>.takeFrom(from :Int, n :Int) :List<Long> {
        return this.take(from + n).takeLast(n)
    }
}