package hu.advent.of.code.day7

import hu.advent.of.code.BaseChallenge

class Puzzle7B : BaseChallenge() {

    private val bags = mutableSetOf<Bag>()

    override fun run() :Boolean {
        println("\nDay 7 - Puzzle 2")
        val data = loadStringDataFromFile("data/data7.txt")
        for (line in data) {
            val fragment = line.split(" bags contain ")
            val contents = fragment[1]
            val bag = Bag(fragment[0])
            bags.add(bag)

            if (contents != "no other bags.") {
                contents.split(", ").forEach {
                    val arg = it.split(" bag")[0].split(" ")
                    bag.addBag(Bag("${arg[1]} ${arg[2]}"), arg[0].toInt())
                }
            }
        }
        println("${searchFor("shiny gold")-1} individual bags are required")
        return true
    }

    private fun searchFor(str : String) : Int {
        var ret = 1
        val b = bags.find { it.name == str }

        if (b != null) {
            for (q in b.getBags()) {
                if (b.getBags().isEmpty()) {
                    return 1
                }
                ret += b.hasThatManyBags(q.name) * searchFor(q.name)
            }
            return ret
        }
        return 1
    }
}