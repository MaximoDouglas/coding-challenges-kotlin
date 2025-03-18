package challenges

import challenges.challenges.minimumBribes
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import kotlin.test.assertEquals

@RunWith(JUnit4::class)
class NewYearChaosTest {

    @Test
    fun `it works correctly on entry1`() {
        val input = arrayOf(2, 1, 5, 3, 4)

        val actual = minimumBribes(input)

        val expected = "3"
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry2`() {
        val input = arrayOf(2, 5, 1, 3, 4)

        val actual = minimumBribes(input)

        val expected = "Too chaotic"
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry3`() {
        val input = arrayOf(5, 1, 2, 3, 7, 8, 6, 4)

        val actual = minimumBribes(input)

        val expected = "Too chaotic"
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry4`() {
        val input = arrayOf(1, 2, 5, 3, 7, 8, 6, 4)

        val actual = minimumBribes(input)

        val expected = "7"
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry5`() {
        val input = arrayOf(1, 2, 5, 3, 4, 7, 8, 6)

        val actual = minimumBribes(input)

        val expected = "4"
        assertEquals(expected, actual)
    }
}