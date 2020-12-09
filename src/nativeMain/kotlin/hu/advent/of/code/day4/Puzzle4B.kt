package hu.advent.of.code.day4

import hu.advent.of.code.BaseChallenge

class Puzzle4B : BaseChallenge() {

    override fun run(): Boolean {
        println("\nDay 4 - Puzzle 2")
        val data = loadStringDataFromFile("data/data4.txt")

        val listOfPassports = PassportLoader.createPassportsFromRawData(data)
        val valids = listOfPassports.filter { it.isStrictValid() }.count()

        println("There are $valids valid passports.")
        return true
    }
}