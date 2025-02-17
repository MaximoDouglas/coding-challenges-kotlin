package challenges.challenges

// https://www.hackerrank.com/challenges/ctci-bubble-sort/problem?isFullScreen=true&h_l=interview&
// playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=sorting

fun Array<Int>.countSwaps(): CountSwapsResult {
    var swapsMade = 0

    for (i in indices) {
        for (j in size.dec() downTo i.inc()) {
            if (get(j) < get(j.dec())) {
                swapsMade++
                val aux = this[j]
                this[j] = this[j.dec()]
                this[j.dec()] = aux
            }
        }
    }

    return CountSwapsResult(
        "Array is sorted in $swapsMade swaps.",
        "First Element: ${get(0)}",
        "Last Element: ${get(size.dec())}"
    )
}

data class CountSwapsResult(
    val messageLineOne: String,
    val messageLineTwo: String,
    val messageLineThree: String,
)