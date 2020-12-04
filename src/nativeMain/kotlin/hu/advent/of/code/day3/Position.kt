package hu.advent.of.code.day3

data class Position(var x:Int, var y:Int) {

    override fun toString(): String {
        return "($x,$y)"
    }
}