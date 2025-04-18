package challenges.challenges

// https://www.hackerrank.com/challenges/sherlock-and-anagrams

fun sherlockAndAnagrams(s: String): Int {
    val combinations = mutableMapOf<String, Int>()

    for (i in s.indices) {
        for (j in i.inc()..s.length) {
            val key = s.substring(i, j).toCharArray().sorted().joinToString("")
            val amount = combinations[key] ?: 0

            combinations[key] = amount + 1
        }
    }

    var combinationsCounter = 0

    combinations.forEach { (_, value) ->
        combinationsCounter += (value * (value - 1))/2
    }

    return combinationsCounter
}