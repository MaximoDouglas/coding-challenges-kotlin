package challenges.challenges

// https://www.hackerrank.com/challenges/mark-and-toys

fun maximumToys(prices: Array<Int>, k: Int): Int {
    prices.mergeSort()
    var sum = 0
    var amount = 0

    for (value in prices) {
        if (sum.plus(value) < k) {
            sum += value
            amount++
        } else {
            break
        }
    }

    return amount
}

private fun Array<Int>.mergeSort(start: Int = 0, end: Int = this.size.dec()) {
    if (end <= start) {
        return
    }

    val middle = end.plus(start).floorDiv(2)

    mergeSort(start, middle)
    mergeSort(middle + 1, end)

    this.merge(start, middle, end)
}

private fun Array<Int>.merge(start: Int, middle: Int, end: Int) {
    var i = 0
    var j = 0
    var navigator = start

    val leftArray = this.sliceArray(start..middle)
    val rightArray = this.sliceArray(middle.inc()..end)

    while (i < leftArray.size) {
        while (j < rightArray.size && rightArray[j] <= leftArray[i]) {
            this[navigator] = rightArray[j]
            navigator++
            j++
        }

        this[navigator] = leftArray[i]
        navigator++
        i++
    }

    if (j < rightArray.size) {
        rightArray.copyInto(this, navigator, j)
    }
}