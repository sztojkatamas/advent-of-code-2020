package hu.advent.of.code.day4

import hu.advent.of.code.BaseChallenge

class Puzzle4A: BaseChallenge() {

    override fun run() {

        val data = loadStringDataFromFile("data/data4.txt")

        val listOfPassports = PassportLoader.createPassportsFromRawData(data)
        val valids = listOfPassports.filter { it.isValid() }.count()

        println("There are $valids valid passports.")
    }
}