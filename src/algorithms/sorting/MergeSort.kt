package challenges.algorithms.sorting

fun mergeSort(array: Array<Int>, p: Int = 0, r: Int = array.size.dec()): Array<Int> {
    if (p >= r) {
        return array
    }

    val q = (r.plus(p).floorDiv(2))

    mergeSort(array, p, q)
    mergeSort(array, q+1, r)

    merge(array, p, q, r)

    return array
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