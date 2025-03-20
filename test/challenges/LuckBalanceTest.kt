package challenges

import challenges.challenges.luckBalance
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import kotlin.test.assertEquals

@RunWith(JUnit4::class)
class LuckBalanceTest {

    @Test
    fun `it works correctly on entry 1`() {
        val input1 = 3
        val input2 = arrayOf(
            arrayOf(5, 1),
            arrayOf(2, 1),
            arrayOf(1, 1),
            arrayOf(8, 1),
            arrayOf(10, 0),
            arrayOf(5, 0)
        )

        val actual = luckBalance(input1, input2)

        val expected = 29
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry 2`() {
        val input1 = 5
        val input2 = arrayOf(
            arrayOf(13, 1),
            arrayOf(10, 1),
            arrayOf(9, 1),
            arrayOf(8, 1),
            arrayOf(13, 1),
            arrayOf(12, 1),
            arrayOf(18, 1),
            arrayOf(13, 1)
        )

        val actual = luckBalance(input1, input2)

        val expected = 42
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry 3`() {
        val input1 = 2
        val input2 = arrayOf(
            arrayOf(5, 1),
            arrayOf(4, 0),
            arrayOf(6, 1),
            arrayOf(2, 1),
            arrayOf(8, 0)
        )

        val actual = luckBalance(input1, input2)

        val expected = 21
        assertEquals(expected, actual)
    }
}