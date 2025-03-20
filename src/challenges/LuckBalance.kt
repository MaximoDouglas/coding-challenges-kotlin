package challenges.challenges

// https://www.hackerrank.com/challenges/luck-balance

fun luckBalance(k: Int, contests: Array<Array<Int>>): Int {
    val orderedContests = mergeSort(contests)

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

private fun mergeSort(array: Array<Array<Int>>, p: Int = 0, r: Int = array.size.dec()): Array<Array<Int>> {
    if (p >= r) {
        return array
    }

    val q = (r.plus(p).floorDiv(2))

    mergeSort(array, p, q)
    mergeSort(array, q+1, r)

    merge(array, p, q, r)

    return array
}

private fun merge(array: Array<Array<Int>>, p: Int, q: Int, r: Int) {
    var i = 0
    var j = 0
    var k = p

    val arrayLeft = array.sliceArray(p..q)
    val arrayRight = array.sliceArray(q.inc()..r)

    while (i < arrayLeft.size) {
        while (j < arrayRight.size && arrayRight[j][0] >= arrayLeft[i][0]) {
            array[k] = arrayRight[j]
            k++
            j++
        }

        array[k] = arrayLeft[i]
        k++
        i++

        if (i == arrayLeft.size && j < arrayRight.size) {
            arrayRight.copyInto(array, destinationOffset = k, startIndex = j)
        }
    }
}