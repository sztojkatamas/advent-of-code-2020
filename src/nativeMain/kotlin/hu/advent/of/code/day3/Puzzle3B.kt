package hu.advent.of.code.day3

import hu.advent.of.code.BaseChallenge

class Puzzle3B: BaseChallenge() {

    override fun run(): Boolean {
        println("\nDay 3 - Puzzle 2")
        println("${runSlope(1,1) * runSlope(3,1) * runSlope(5,1) * runSlope(7,1) * runSlope(1,2)}")
        return true
    }

    private fun runSlope(xInc :Int, yInc :Int) : Long {
        val data = Maputils.expandMap(loadStringDataFromFile("data/data3.txt"), 100)
        val position = Position(0,0)
        var treecounter = 0L

        while (position.y < data.size) {
            if(Maputils.mark(data, position)) {
                treecounter++
            }
            position.x = position.x + xInc
            position.y = position.y + yInc
        }

        println("($xInc, $yInc) -> Hit $treecounter trees")
        return treecounter
    }
}