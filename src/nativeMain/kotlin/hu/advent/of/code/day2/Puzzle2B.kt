package hu.advent.of.code.day2

import hu.advent.of.code.BaseChallenge
import kotlinx.cinterop.memScoped

class Puzzle2B: BaseChallenge() {

    override fun run(): Boolean {
        println("\nDay 2 - Puzzle 2")
        println("Number of valid passwords are: ${
            loadStringDataFromFile("data/data2.txt")
                    .filter { PasswordPolicyAdvanced(it).isvalid() }
                    .count()
        }")
        return true
    }
}

class PasswordPolicyAdvanced(private var input:String) {

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
        return ((password[max - 1].toString() == character) xor (password[min - 1].toString() == character))
    }
}