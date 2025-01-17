package challenges

fun minimumSwaps(arr: Array<Int>): Int {
    var swapAmount = 0
    var swap = true

    while (swap) {
        swap = false
        for (i in arr.indices) {
            if (arr[i] != i.inc()) {
                val aux = arr[arr[i].dec()]
                arr[arr[i].dec()] = arr[i]
                arr[i] = aux

                swap = true
                swapAmount++
            }
        }
    }

    return swapAmount
}