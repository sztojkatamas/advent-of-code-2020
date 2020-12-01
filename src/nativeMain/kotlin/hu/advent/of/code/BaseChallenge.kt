package hu.advent.of.code

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.allocArray
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.toKString
import platform.posix.fgets
import platform.posix.fopen

abstract class BaseChallenge:Challenge {

    fun loadIntDataFromFile(filename: String) : List<Int> {
        val intData = mutableListOf<Int>()
        memScoped {
            val stringData = loadStringDataFromFile(filename)
            for (str in stringData) {
                intData.add(str.toInt())
            }
        }
        return intData
    }

    fun loadStringDataFromFile(filename: String) : List<String> {

        val data = mutableListOf<String>()
        val file = fopen(filename, "rt")
        if (file == null) {
            println("Cannot open file $filename")
        }

        val pageSize = 2048
        memScoped {
            val sb = StringBuilder()
            val buffer = allocArray<ByteVar>(pageSize)
            while (fgets(buffer, pageSize, file) != null) {
                sb.append(buffer.toKString())
            }
            data += sb.split("\n")
        }
        return data
    }
}