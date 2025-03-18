package challenges.challenges

// https://www.hackerrank.com/challenges/two-strings/

fun twoStrings(s1: String, s2: String): String {
    val mapOfCharsS1 = s1.toHashSet()
    s2.forEach { charInS2 ->
        if (mapOfCharsS1.contains(charInS2) ) {
            return "YES"
        }
    }

    return "NO"
}