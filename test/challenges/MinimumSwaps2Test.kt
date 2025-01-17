package challenges

import org.junit.Assert.assertEquals
import org.junit.Test

class MinimumSwaps2Test {

    @Test
    fun `minimumSwaps2 works correctly`() {
        val inputArray1 = arrayOf(7, 1, 3, 2, 4, 5, 6)
        val inputArray2 = arrayOf(4, 3, 1, 2)
        val inputArray3 = arrayOf(2, 3, 4, 1, 5)
        val inputArray4 = arrayOf(1, 3, 5, 2, 4, 6, 7)
        val thousands = (1..10000).toList().asReversed().toTypedArray()

        val time1 = System.currentTimeMillis()

        assertEquals(5, minimumSwaps(inputArray1))
        assertEquals(3, minimumSwaps(inputArray2))
        assertEquals(3, minimumSwaps(inputArray3))
        assertEquals(3, minimumSwaps(inputArray4))
        assertEquals(5000, minimumSwaps(thousands))

        val time2 = System.currentTimeMillis()

        println("RESULT: ${time2 - time1}")
    }

    @Test
    fun `minimumSwaps2 works for empty array`() {
        val inputArray = arrayOf<Int>()

        assertEquals(0, minimumSwaps(inputArray))
    }

}