package challenges.algorithms

fun Array<Int>.swapPositions(
    leftIndex: Int,
    rightIndex: Int
) {
    val aux = this[leftIndex]
    this[leftIndex] = this[rightIndex]
    this[rightIndex] = aux
}

