package hu.advent.of.code

import hu.advent.of.code.day1.Puzzle1A
import hu.advent.of.code.day1.Puzzle1B
import hu.advent.of.code.day2.Puzzle2A
import hu.advent.of.code.day2.Puzzle2B

class Application {
    private val puzzle1a = Puzzle1A()
    private val puzzle1b = Puzzle1B()
    private val puzzle2a = Puzzle2A()
    private val puzzle2b = Puzzle2B()

    fun start() {

        println("\nDay 1 - Puzzle 1")
        puzzle1a.run()

        println("\nDay 1 - Puzzle 2")
        puzzle1b.run()

        println("\nDay 2 - Puzzle 1")
        puzzle2a.run()

        println("\nDay 2 - Puzzle 2")
        puzzle2b.run()

    }
}
