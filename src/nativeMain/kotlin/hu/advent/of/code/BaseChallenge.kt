package hu.advent.of.code

import platform.posix.fopen

open class BaseChallenge:Challenge {

    lateinit var data:List<String>

    override fun run() {}

    fun loadDataFromFile(filename: String) {

        val file = fopen(filename, "r")
        if (file == null) {
            println("Cannot open file $filename")
            return
        }

        //data = File(Resources.getResource(filename).toURI()).readLines()
    }
}