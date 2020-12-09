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
import hu.advent.of.code.day9.Puzzle9A
import hu.advent.of.code.day9.Puzzle9B
import kotlin.system.getTimeMillis

class Application {

    private val puzzles = listOf(
     Puzzle1A() ,Puzzle1B()
     ,Puzzle2A() ,Puzzle2B()
     ,Puzzle3A() ,Puzzle3B()
     ,Puzzle4A() ,Puzzle4B()
     ,Puzzle5A() ,Puzzle5B()
     ,Puzzle6A() ,Puzzle6B()
     ,Puzzle7A() ,Puzzle7B()
     ,Puzzle8A() ,Puzzle8B()
     ,Puzzle9A() ,Puzzle9B()
    )

    fun start() {
        val start = getTimeMillis()
        val allOK = puzzles.all { it.run() }
        repeat(40) {print("*")}
        println("\nDone in ${getTimeMillis() - start} ms. And all are OK: [$allOK]")
        repeat(40) {print("*")}
    }

    fun last() {
        puzzles.last { it.run() }
    }
}
