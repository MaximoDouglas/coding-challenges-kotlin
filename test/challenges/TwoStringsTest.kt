package challenges

import challenges.challenges.twoStrings
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import kotlin.test.assertEquals

@RunWith(JUnit4::class)
class TwoStringsTest {

    @Test
    fun `it works correctly on entry 1`() {
        val str1 = "hello"
        val str2 = "world"

        val actual = twoStrings(str1, str2)

        val expected = "YES"
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry 2`() {
        val str1 = "hi"
        val str2 = "world"

        val actual = twoStrings(str1, str2)

        val expected = "NO"
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry 3`() {
        val str1 = "wouldyoulikefries"
        val str2 = "abcabcabcabcabcabc"

        val actual = twoStrings(str1, str2)

        val expected = "NO"
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry 4`() {
        val str1 = "hackerrankcommunity"
        val str2 = "cdecdecdecde"

        val actual = twoStrings(str1, str2)

        val expected = "YES"
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry 5`() {
        val str1 = "jackandjill"
        val str2 = "wentupthehill"

        val actual = twoStrings(str1, str2)

        val expected = "YES"
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry 6`() {
        val str1 = "writetoyourparents"
        val str2 = "fghmqzldbc"

        val actual = twoStrings(str1, str2)

        val expected = "NO"
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry 7`() {
        val str1 = "aardvark"
        val str2 = "apple"

        val actual = twoStrings(str1, str2)

        val expected = "YES"
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry 8`() {
        val str1 = "beetroot"
        val str2 = "sandals"

        val actual = twoStrings(str1, str2)

        val expected = "NO"
        assertEquals(expected, actual)
    }
}