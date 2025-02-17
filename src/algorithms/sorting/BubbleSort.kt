package challenges.algorithms.sorting

import challenges.algorithms.swapPositions

fun Array<Int>.bubbleSort() {
    for (i in indices) {
        for (j in size.dec() downTo i.inc()) {
            if (get(j) < get(j.dec())) {
                swapPositions(j, j.dec())
            }
        }
    }
}