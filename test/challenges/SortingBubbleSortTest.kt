package challenges

import challenges.challenges.CountSwapsResult
import challenges.challenges.countSwaps
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

@RunWith(JUnit4::class)
class SortingBubbleSortTest {

    @Test
    fun `The sum works correctly on entry1`() {
        val originalArray = arrayOf(6, 4, 1)
        val expectedArray = arrayOf(1, 4, 6)
        val expectedResult = CountSwapsResult(
            messageLineOne = "Array is sorted in 3 swaps.",
            messageLineTwo = "First Element: 1",
            messageLineThree = "Last Element: 6"
        )

        val result = originalArray.countSwaps()

        assertContentEquals(expectedArray, originalArray)
        assertEquals(expectedResult, result)
    }

    @Test
    fun `The sum works correctly on entry2`() {
        val originalArray = arrayOf(1, 2, 3)
        val expectedArray = arrayOf(1, 2, 3)
        val expectedResult = CountSwapsResult(
            messageLineOne = "Array is sorted in 0 swaps.",
            messageLineTwo = "First Element: 1",
            messageLineThree = "Last Element: 3"
        )

        val result = originalArray.countSwaps()

        assertContentEquals(expectedArray, originalArray)
        assertEquals(expectedResult, result)
    }

    @Test
    fun `The sum works correctly on entry3`() {
        val originalArray = arrayOf(3, 2, 1)
        val expectedArray = arrayOf(1, 2, 3)
        val expectedResult = CountSwapsResult(
            messageLineOne = "Array is sorted in 3 swaps.",
            messageLineTwo = "First Element: 1",
            messageLineThree = "Last Element: 3"
        )

        val result = originalArray.countSwaps()

        assertContentEquals(expectedArray, originalArray)
        assertEquals(expectedResult, result)
    }
}