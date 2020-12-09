package hu.advent.of.code.day1

import hu.advent.of.code.BaseChallenge

class Puzzle1A: BaseChallenge() {

    override fun run() :Boolean{
        println("\nDay 1 - Puzzle 1")
        val data = loadIntDataFromFile("data/data1.txt")

        for(A in data) {
            for(B in data) {
                if(A + B == 2020) {
                    println("A: $A")
                    println("B: $B")
                    println("Answer: ${A * B}")
                    return true
                }
            }
        }
        return false
    }
}