package hu.advent.of.code.day1

import hu.advent.of.code.BaseChallenge

class Puzzle1B: BaseChallenge() {

    override fun run() {
        val data = loadIntDataFromFile("data/data1.txt")

        for(A in data) {
            for(B in data) {
                for(C in data) {
                    if(A + B + C == 2020) {
                        println("A: $A")
                        println("B: $B")
                        println("C: $C")
                        println("Answer: ${A * B * C}")
                        return
                    }
                }
            }
        }

    }
}