package hu.advent.of.code

import kotlinx.cinterop.ByteVar
import kotlinx.cinterop.allocArray
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.toKString
import platform.posix.fclose
import platform.posix.fgets
import platform.posix.fopen
import platform.posix.fputs

abstract class BaseChallenge:Challenge {

    fun loadLongDataFromFile(filename: String): List<Long> {
        val longData = mutableListOf<Long>()
        memScoped {
            val stringData = loadStringDataFromFile(filename)
            for (str in stringData) {
                longData.add(str.toLong())
            }
        }
        return longData
    }

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
        fclose(file)
        return data
    }

    fun writeStringDataToFile(filename: String, data: List<String>) {
        val file = fopen(filename, "wt")
        if (file == null) {
            println("Cannot create file $filename")
        }
        for (x in data) {
            fputs(x+"\n", file)
        }

        fclose(file)
    }



}