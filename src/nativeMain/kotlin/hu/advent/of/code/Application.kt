package hu.advent.of.code

import hu.advent.of.code.day1.Puzzle1A
import hu.advent.of.code.day1.Puzzle1B
import hu.advent.of.code.day2.Puzzle2A
import hu.advent.of.code.day2.Puzzle2B
import hu.advent.of.code.day3.Puzzle3A
import hu.advent.of.code.day3.Puzzle3B
import hu.advent.of.code.day4.Puzzle4A
import hu.advent.of.code.day4.Puzzle4B
import hu.advent.of.code.day5.Puzzle5A
import hu.advent.of.code.day5.Puzzle5B
import hu.advent.of.code.day6.Puzzle6A
import hu.advent.of.code.day6.Puzzle6B
import hu.advent.of.code.day7.Puzzle7A
import hu.advent.of.code.day7.Puzzle7B
import hu.advent.of.code.day8.Puzzle8A
import hu.advent.of.code.day8.Puzzle8B

class Application {
    private val puzzle1a = Puzzle1A()
    private val puzzle1b = Puzzle1B()
    private val puzzle2a = Puzzle2A()
    private val puzzle2b = Puzzle2B()
    private val puzzle3a = Puzzle3A()
    private val puzzle3b = Puzzle3B()
    private val puzzle4a = Puzzle4A()
    private val puzzle4b = Puzzle4B()
    private val puzzle5a = Puzzle5A()
    private val puzzle5b = Puzzle5B()
    private val puzzle6a = Puzzle6A()
    private val puzzle6b = Puzzle6B()
    private val puzzle7a = Puzzle7A()
    private val puzzle7b = Puzzle7B()
    private val puzzle8a = Puzzle8A()
    private val puzzle8b = Puzzle8B()

    fun start() {

        println("\nDay 1 - Puzzle 1")
        puzzle1a.run()

        println("\nDay 1 - Puzzle 2")
        puzzle1b.run()

        println("\nDay 2 - Puzzle 1")
        puzzle2a.run()

        println("\nDay 2 - Puzzle 2")
        puzzle2b.run()

        println("\nDay 3 - Puzzle 1")
        puzzle3a.run()

        println("\nDay 3 - Puzzle 2")
        puzzle3b.run()

        println("\nDay 4 - Puzzle 1")
        puzzle4a.run()

        println("\nDay 4 - Puzzle 2")
        puzzle4b.run()

        println("\nDay 5 - Puzzle 1")
        puzzle5a.run()

        println("\nDay 5 - Puzzle 2")
        puzzle5b.run()

        println("\nDay 6 - Puzzle 1")
        puzzle6a.run()

        println("\nDay 6 - Puzzle 2")
        puzzle6b.run()

        println("\nDay 7 - Puzzle 1")
        puzzle7a.run()

        println("\nDay 7 - Puzzle 2")
        puzzle7b.run()

        println("\nDay 8 - Puzzle 1")
        puzzle8a.run()

        println("\nDay 8 - Puzzle 2")
        puzzle8b.run()

    }
}
