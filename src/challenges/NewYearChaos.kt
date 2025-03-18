package challenges.challenges

// https://www.hackerrank.com/challenges/new-year-chaos
// This challenge is an Inversions Counter kind of problem - and I solved it using mergeSort

fun minimumBribes(q: Array<Int>): String {
    for (i in q.indices) {
        if (q[i] - i.inc() > 2) {
            return "Too chaotic"
        }
    }

    val result = inversionCounter(q).toString()

    return result
}

private fun inversionCounter(array: Array<Int>, start: Int = 0, end: Int = array.size.dec()): Int {
    if (end <= start) {
        return 0
    }

    val middle = start.plus(end).floorDiv(2)

    val left = inversionCounter(array, start, middle)
    val right = inversionCounter(array, middle + 1, end)

    return left + right + mergeAndCount(array, start, middle, end)
}

private fun mergeAndCount(array: Array<Int>, start: Int, middle: Int, end: Int): Int {
    var inversionCounter = 0
    var i = 0
    var j = 0
    var navigator = start

    val leftArray = array.sliceArray(start..middle)
    val rightArray = array.sliceArray(middle.inc()..end)

    while (i < leftArray.size) {
        while (j < rightArray.size && rightArray[j] < leftArray[i]) {
            array[navigator] = rightArray[j]
            navigator++
            inversionCounter += leftArray.size - i
            j++
        }

        array[navigator] = leftArray[i]
        navigator++
        i++
    }

    if (j < rightArray.size) {
        rightArray.copyInto(array, destinationOffset = navigator, startIndex = j)
    }

    return inversionCounter
}