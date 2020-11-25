package hu.advent.of.code

import hu.advent.of.code.day1.Puzzle1A
import hu.advent.of.code.day1.Puzzle1B


class Application {
    val puzzle1a = Puzzle1A()
    val puzzle1b = Puzzle1B()


    fun start() {



        println("Day 1 - Puzzle 1")
        puzzle1a.run()

        println("Day 1 - Puzzle 2")
        puzzle1b.run()

    }
}
