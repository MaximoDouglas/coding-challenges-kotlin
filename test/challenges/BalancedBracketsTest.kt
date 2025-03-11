package challenges

import challenges.challenges.isBalanced
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import kotlin.test.assertEquals

@RunWith(JUnit4::class)
class BalancedBracketsTest {

    @Test
    fun `it works correctly on entry1`() {
        val input = "{[()]}"

        val actual = isBalanced(input)

        val expected = "YES"
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry2`() {
        val input = "{[(])}"

        val actual = isBalanced(input)

        val expected = "NO"
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry3`() {
        val input = "{{[[(())]]}}"

        val actual = isBalanced(input)

        val expected = "YES"
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry4`() {
        val input = "{{([])}}"

        val actual = isBalanced(input)

        val expected = "YES"
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry5`() {
        val input = "{{)[](}}"

        val actual = isBalanced(input)

        val expected = "NO"
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry6`() {
        val input = "{(([])[])[]}"

        val actual = isBalanced(input)

        val expected = "YES"
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry7`() {
        val input = "{(([])[])[]]}"

        val actual = isBalanced(input)

        val expected = "NO"
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry8`() {
        val input = "{(([])[])[]}[]"

        val actual = isBalanced(input)

        val expected = "YES"
        assertEquals(expected, actual)
    }
}