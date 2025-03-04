package challenges.algorithms.sorting

fun mergeSort(array: Array<Int>, p: Int = 0, r: Int = array.size.dec()): Array<Int> {
    if (array.isEmpty()) {
        return array
    }

    if (p == r) {
        return arrayOf(array[p])
    }

    val q = (r.plus(p).floorDiv(2))
    return merge(mergeSort(array, p, q), mergeSort(array, q+1, r))
}

private fun merge(arrayLeft: Array<Int>, arrayRight: Array<Int>): Array<Int> {
    val mergedArray = mutableListOf<Int>()

    var i = 0
    var j = 0

    while (i < arrayLeft.size) {
        while (j < arrayRight.size && arrayRight[j] <= arrayLeft[i]) {
            mergedArray.add(arrayRight[j])
            j++
        }

        mergedArray.add(arrayLeft[i])
        i++

        if (i == arrayLeft.size && j < arrayRight.size) {
            mergedArray.addAll(arrayRight.slice(j until arrayRight.size))
        }
    }

    return mergedArray.toTypedArray()
}