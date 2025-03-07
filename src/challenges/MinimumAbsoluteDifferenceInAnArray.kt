package challenges.challenges

// https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=greedy-algorithms

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