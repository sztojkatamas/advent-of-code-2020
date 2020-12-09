package hu.advent.of.code.day4

import hu.advent.of.code.BaseChallenge

class Puzzle4A: BaseChallenge() {

    override fun run(): Boolean {
        println("\nDay 4 - Puzzle 1")
        val data = loadStringDataFromFile("data/data4.txt")

        val listOfPassports = PassportLoader.createPassportsFromRawData(data)
        val valids = listOfPassports.filter { it.isValid() }.count()

        println("There are $valids valid passports.")
        return true
    }
}