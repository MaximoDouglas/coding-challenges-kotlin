package challenges.challenges

// https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array

fun minimumAbsoluteDifference(arr: Array<Int>): Int {
    arr.sort()

    var minDiff = kotlin.math.abs(arr[0] - arr[1])

    for (i in 1 until arr.size.dec()) {
        val localDiff = kotlin.math.abs(arr[i] - arr[i + 1])

        if (localDiff < minDiff) {
            minDiff = localDiff
        }
    }

    return minDiff
}