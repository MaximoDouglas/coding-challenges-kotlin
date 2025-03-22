package challenges.challenges

// https://www.hackerrank.com/challenges/luck-balance

fun luckBalance(k: Int, contests: Array<Array<Int>>): Int {
    val orderedContests = contests.sortedByDescending { it[0] }

    var loseAmount = k
    var luck = 0

    for (contest in orderedContests) {
        val amountOfLuck = contest[0]

        if (contest[1] == 1 && loseAmount > 0) {
            loseAmount--
            luck += amountOfLuck
        } else if (contest[1] == 0) {
            luck += amountOfLuck
        } else if (contest[1] == 1) {
            luck -= amountOfLuck
        }
    }

    return luck
}