package challenges.algorithms.sorting

fun Array<Int>.mergeSort(p: Int = 0, r: Int = this.size.dec()) {
    if (p >= r) {
        return
    }

    val q = (r.plus(p).floorDiv(2))

    mergeSort(p, q)
    mergeSort(q + 1, r)

    merge(this, p, q, r)
}

private fun merge(array: Array<Int>, p: Int, q: Int, r: Int) {
    var i = 0
    var j = 0
    var k = p

    val arrayLeft = array.sliceArray(p..q)
    val arrayRight = array.sliceArray(q.inc()..r)

    while (i < arrayLeft.size) {
        while (j < arrayRight.size && arrayRight[j] <= arrayLeft[i]) {
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