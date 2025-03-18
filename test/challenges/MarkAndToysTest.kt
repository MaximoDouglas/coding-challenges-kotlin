package challenges

import challenges.challenges.maximumToys
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import utils.getIntArrayFromSpaceSeparatedString
import kotlin.test.assertEquals

@RunWith(JUnit4::class)
class MarkAndToysTest {

    @Test
    fun `it works correctly on entry1`() {
        val array = "1 12 5 111 200 1000 10".getIntArrayFromSpaceSeparatedString()
        val k = 50

        val actual = maximumToys(array, k)

        val expected = 4
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry2`() {
        val array = "1 2 3 4".getIntArrayFromSpaceSeparatedString()
        val k = 7

        val actual = maximumToys(array, k)

        val expected = 3
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry3`() {
        val array = "3 7 2 9 4".getIntArrayFromSpaceSeparatedString()
        val k = 15

        val actual = maximumToys(array, k)

        val expected = 3
        assertEquals(expected, actual)
    }
}