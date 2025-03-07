package challenges

import challenges.challenges.makeAnagram
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import kotlin.test.assertEquals

@RunWith(JUnit4::class)
class StringsMakingAnagramsTest {

    @Test
    fun `The sum works correctly on entry1`() {
        val actual = makeAnagram("cde", "abc")
        val expected = 4

        assertEquals(expected, actual)
    }

    @Test
    fun `The sum works correctly on entry2`() {
        val actual = makeAnagram("fcrxzwscanmligyxyvym", "jxwtrhvujlmrpdoqbisbwhmgpmeoke")
        val expected = 30

        assertEquals(expected, actual)
    }

    @Test
    fun `The sum works correctly on entry3`() {
        val actual = makeAnagram("showman", "woman")
        val expected = 2

        assertEquals(expected, actual)
    }
}