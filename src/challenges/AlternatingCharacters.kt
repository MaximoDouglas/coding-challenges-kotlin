package challenges.challenges

// https://www.hackerrank.com/challenges/alternating-characters

fun alternatingCharacters(s: String): Int {
    var deletions = 0

    var lastChar = s[0]

    for (i in 1 until s.length) {
        if (s[i] == lastChar) {
            deletions++
        } else {
            lastChar = s[i]
        }
    }

    return deletions
}