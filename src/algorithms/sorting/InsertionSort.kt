package challenges.algorithms.sorting

fun Array<Int>.insertionSort() {
    for (i in 1..size.dec()) {
        val key = this[i] // right hand key

        var leftHandIndex = i.dec()

        while (leftHandIndex >= 0 && this[leftHandIndex] > key) { // run through the left hand to find the proper index for key
            this[leftHandIndex.inc()] = this[leftHandIndex] // move to the right because the current left hand value is higher than key
            leftHandIndex--
        }

        this[leftHandIndex.inc()] = key // .inc() because the while will make one extra decrease at its end
    }
}