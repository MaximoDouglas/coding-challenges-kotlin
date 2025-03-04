package challenges.algorithms.sorting

import challenges.algorithms.swapPositions

fun Array<Int>.selectionSort() {
    for (i in 0 until size.dec()) {
        var minIndex = i

        for (j in i..size.dec()) {
            if (this[j] < this[minIndex]) {
                minIndex = j
            }
        }

        this.swapPositions(i, minIndex)
    }
}