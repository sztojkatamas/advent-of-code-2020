package hu.advent.of.code

import hu.advent.of.code.day1.Puzzle1A
import hu.advent.of.code.day1.Puzzle1B

class Application {
    private val puzzle1a = Puzzle1A()
    private val puzzle1b = Puzzle1B()

    fun start() {

        println("\nDay 1 - Puzzle 1")
        puzzle1a.run()

        println("\nDay 1 - Puzzle 2")
        puzzle1b.run()
    }
}
