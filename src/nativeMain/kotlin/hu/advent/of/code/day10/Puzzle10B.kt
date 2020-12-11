package hu.advent.of.code.day10

import hu.advent.of.code.BaseChallenge

class Puzzle10B : BaseChallenge() {

    override fun run(): Boolean {
        println("\nDay 10 - Puzzle 2")
        val baseData = loadIntDataFromFile("data/data10.txt").toMutableList()

        baseData.add(0)
        baseData.add(baseData.maxOrNull()!! + 3)

        val distanceList = makeDistanceList(baseData.sorted())
        var sum = 1L
        var lengthOfBlockOfOnes = 0

        for (i in distanceList.indices) {
            when (distanceList[i]) {
                1 -> {
                    lengthOfBlockOfOnes ++
                }
                3 -> {
                    if (lengthOfBlockOfOnes > 1) {
                        sum *= ways(lengthOfBlockOfOnes)
                    }
                    lengthOfBlockOfOnes = 0
                }
            }
        }
        println("The total number of distinct ways are: $sum")
        return true
    }

    private fun ways(len :Int) :Long{
        return when(len) {
            1 -> {1}
            2 -> {2}
            3 -> {4}
            4 -> {7}
            5 -> {13}
            6 -> {22}
            else -> 0
        }
    }

}