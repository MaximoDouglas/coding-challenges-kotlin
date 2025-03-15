package challenges.algorithms.sorting

import challenges.algorithms.swapPositions

fun Array<Int>.bubbleSort() {
    for (i in this.size.dec() downTo 1) {
        for (j in 0 until i) {
            if (this[j] > this[j.inc()]) {
                swapPositions(j, j.inc())
            }
        }
    }
}