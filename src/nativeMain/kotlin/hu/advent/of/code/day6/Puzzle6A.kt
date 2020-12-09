package hu.advent.of.code.day6

import hu.advent.of.code.BaseChallenge

class Puzzle6A : BaseChallenge() {

    override fun run(): Boolean {
        println("\nDay 6 - Puzzle 1")
        val data = loadStringDataFromFile("data/data6.txt")

        val listOfGroups = mutableListOf<GroupOfPeople>()
        var groupOfPeople = GroupOfPeople()
        listOfGroups.add(groupOfPeople)

        for (line in data) {
            if (!groupOfPeople.processLine(line)) {
                groupOfPeople = GroupOfPeople()
                listOfGroups.add(groupOfPeople)
            }
        }

        println("Sum of YES answers: ${listOfGroups.sumOf { it.getAnswers() }}")
        return true
    }
}