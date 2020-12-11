package hu.advent.of.code

import hu.advent.of.code.day10.makeDistanceList
import kotlin.test.*


class Day10Test {

    @Test
    fun `Distance test`() {
        val data = mutableListOf(16,10,15,5,1,11,7,19,6,12,4)
        assertEquals(mutableListOf(6,5,10,4,10,4,12,13,6,8), makeDistanceList(data))
    }
}