package algorithms.sorting

import challenges.algorithms.sorting.selectionSort
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import kotlin.test.assertContentEquals

@RunWith(JUnit4::class)
class SelectionSortTest {

    @Test
    fun `selectionSort works on most common arrays`() {
        val originalArray = arrayOf(5, 4, 3, 2, 1)
        val expectedArray = arrayOf(1, 2, 3, 4, 5)

        originalArray.selectionSort()

        assertContentEquals(expectedArray, originalArray)
    }

    @Test
    fun `selectionSort works for empty array`() {
        val originalArray = arrayOf<Int>()
        val expectedArray = arrayOf<Int>()

        originalArray.selectionSort()

        assertContentEquals(expectedArray, originalArray)
    }

    @Test
    fun `selectionSort works for already sorted array`() {
        val originalArray = arrayOf(1, 2, 3, 4, 5)
        val expectedArray = arrayOf(1, 2, 3, 4, 5)

        originalArray.selectionSort()

        assertContentEquals(expectedArray, originalArray)
    }

    @Test
    fun `selectionSort works on arrays with repeated numbers`() {
        val originalArray = arrayOf(5, 5, 4, 4, 3, 3, 2, 2, 1, 1)
        val expectedArray = arrayOf(1, 1, 2, 2, 3, 3, 4, 4, 5, 5)

        originalArray.selectionSort()

        assertContentEquals(expectedArray, originalArray)
    }

}