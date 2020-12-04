package hu.advent.of.code.day3

import hu.advent.of.code.BaseChallenge

class Puzzle3A: BaseChallenge() {

    override fun run() {
        val data = Maputils.expandMap(loadStringDataFromFile("data/data3.txt"), 100)
        val position = Position(0,0)
        var treecounter = 0

        while (position.y < data.size) {
            if(Maputils.mark(data, position)) {
                treecounter++
            }
            position.x = position.x+ 3
            position.y++
        }

        println("Hit $treecounter trees")
    }

}