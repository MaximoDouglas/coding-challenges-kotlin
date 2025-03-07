package challenges.challenges

// https://www.hackerrank.com/challenges/ctci-making-anagrams/

fun makeAnagram(a: String, b: String): Int {
    val mapLettersA = mutableMapOf<Char, Int>()
    val mapLettersB = mutableMapOf<Char, Int>()

    a.forEach { char ->
        mapLettersA[char] = (mapLettersA[char] ?: 0) + 1
    }

    b.forEach { char ->
        mapLettersB[char] = (mapLettersB[char] ?: 0) + 1
    }

    val uniqueChars = mapLettersA.keys + mapLettersB.keys

    var charactersToRemove = 0

    uniqueChars.forEach { char ->
        val valueInA = mapLettersA[char] ?: 0
        val valueInB = mapLettersB[char] ?: 0

        if (valueInA != 0 && valueInB != 0) {
            val diff = if (valueInA > valueInB) valueInA - valueInB else valueInB - valueInA

            charactersToRemove += diff
        } else {
            val diff = valueInA + valueInB

            charactersToRemove += diff
        }
    }

    return charactersToRemove
}