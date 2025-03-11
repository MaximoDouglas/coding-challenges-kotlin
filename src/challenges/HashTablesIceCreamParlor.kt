package challenges.challenges

// https://www.hackerrank.com/challenges/ctci-ice-cream-parlor/

fun whatFlavors(cost: Array<Int>, money: Int): Pair<Int, Int> {
    val hashTable = hashMapOf<Int, Int>()

    cost.forEachIndexed { index, currentValue ->
        val neededValue = money - currentValue
        val storedIndex = hashTable[neededValue]

        if (storedIndex != null) {
            return Pair(storedIndex.inc(), index.inc())
        } else {
            hashTable[currentValue] = index
        }
    }

    return Pair(1, 2)
}