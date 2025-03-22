package challenges

import challenges.challenges.sherlockAndAnagrams
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import kotlin.test.assertEquals

@RunWith(JUnit4::class)
class SherlockAndAnagramsTest {

    @Test
    fun `it works correctly on entry 1`() {
        val input = "abba"

        val actual = sherlockAndAnagrams(input)

        val expected = 4
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry 2`() {
        val input = "abcd"

        val actual = sherlockAndAnagrams(input)

        val expected = 0
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry 3`() {
        val input = "ifailuhkqq"

        val actual = sherlockAndAnagrams(input)

        val expected = 3
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry 4`() {
        val input = "kkkk"

        val actual = sherlockAndAnagrams(input)

        val expected = 10
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry 5`() {
        val input = "cdcd"

        val actual = sherlockAndAnagrams(input)

        val expected = 5
        assertEquals(expected, actual)
    }
}