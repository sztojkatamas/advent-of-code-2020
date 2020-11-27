package hu.advent.of.code

import kotlinx.cinterop.*
import platform.posix.*

abstract class BaseChallenge:Challenge {

    lateinit var data:List<String>

    fun loadDataFromFile(filename: String) {

        val file = fopen(filename, "rt")
        if (file == null) {
            println("Cannot open file $filename")
            return
        }
        val pagesize = 2048
        memScoped {
            val sb = StringBuilder()
            val buffer = allocArray<ByteVar>(pagesize)
            while (fgets(buffer, pagesize, file) != null) {
                sb.append(buffer.toKString())
            }
            data = sb.split("\n")
        }
    }
}