package hu.advent.of.code.day2

import hu.advent.of.code.BaseChallenge
import kotlinx.cinterop.memScoped

class Puzzle2A: BaseChallenge() {

    override fun run() {
        println("Number of valid passwords are: ${
            loadStringDataFromFile("data/data2.txt")
                    .filter { PasswordPolicy(it).isvalid() }
                    .count()
        }")
    }
}

class PasswordPolicy(private var input:String) {

    private var min = 0
    private var max = 0
    private var character = ""
    private var password = ""

    init {
        memScoped {
            val splittedLine = input.trim().split(" ")

            val minmax = splittedLine[0].split("-")
            min = minmax[0].toInt()
            max = minmax[1].toInt()

            val len = splittedLine[1].trim().length - 1
            character = splittedLine[1].trim().substring(0, len)

            password = splittedLine[2].trim()
        }
    }

    fun isvalid() : Boolean {
        val occurence = password.split(character).size -1
        return ((occurence >= min) && (occurence <= max))
    }
}