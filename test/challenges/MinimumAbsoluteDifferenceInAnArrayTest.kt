package challenges

import challenges.challenges.minimumAbsoluteDifference
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import kotlin.test.assertEquals

@RunWith(JUnit4::class)
class MinimumAbsoluteDifferenceInAnArrayTest {

    @Test
    fun `The sum works correctly on entry1`() {
        val input = arrayOf(3, -7, 0)

        val actual = minimumAbsoluteDifference(input)

        val expected = 3
        assertEquals(expected, actual)
    }

    @Test
    fun `The sum works correctly on entry2`() {
        val input = arrayOf(-59, -36, -13, 1, -53, -92, -2, -96, -54, 75)

        val actual = minimumAbsoluteDifference(input)

        val expected = 1
        assertEquals(expected, actual)
    }

    @Test
    fun `The sum works correctly on entry3`() {
        val input = arrayOf(1, -3, 71, 68, 17)

        val actual = minimumAbsoluteDifference(input)

        val expected = 3
        assertEquals(expected, actual)
    }
}