package challenges

import challenges.challenges.alternatingCharacters
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import kotlin.test.assertEquals

@RunWith(JUnit4::class)
class AlternatingCharactersTest {

    @Test
    fun `it works correctly on entry 1`() {
        val input = "AAAA"

        val actual = alternatingCharacters(input)

        val expected = 3
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry 2`() {
        val input = "BBBBB"

        val actual = alternatingCharacters(input)

        val expected = 4
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry 3`() {
        val input = "ABABABAB"

        val actual = alternatingCharacters(input)

        val expected = 0
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry 4`() {
        val input = "BABABA"

        val actual = alternatingCharacters(input)

        val expected = 0
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry 5`() {
        val input = "AAABBB"

        val actual = alternatingCharacters(input)

        val expected = 4
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry 6`() {
        val input = "AAABBBAABB"

        val actual = alternatingCharacters(input)

        val expected = 6
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry 7`() {
        val input = "AABBAABB"

        val actual = alternatingCharacters(input)

        val expected = 4
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry 8`() {
        val input = "ABABABAA"

        val actual = alternatingCharacters(input)

        val expected = 1
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry 9`() {
        val input = "ABBABBAA"

        val actual = alternatingCharacters(input)

        val expected = 3
        assertEquals(expected, actual)
    }
}