package hu.advent.of.code.day7

import hu.advent.of.code.BaseChallenge

class Puzzle7A : BaseChallenge() {
    private val bags = mutableSetOf<Bag>()
    private val foundRules = mutableSetOf<String>()

    override fun run(): Boolean {
        println("\nDay 7 - Puzzle 1")
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

        searchFor("shiny gold")
        println("Eventually ${foundRules.size} bag colors can contain at least one shiny gold bag.")
        return true
    }

    private fun searchFor(str : String) {
        bags.filter {
            it.hasBag(str)
        }.forEach {
            foundRules.add(it.name)
            searchFor(it.name)
        }
    }
}