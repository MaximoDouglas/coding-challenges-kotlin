package challenges

import challenges.challenges.checkMagazine
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4::class)
class HashTablesRansomNoteTest {

    @Test
    fun testCase1() {
        val magazine = "give me one grand today night"
        val note = "give one grand today"

        val actual = checkMagazine(
            magazine = magazine.split(" ").toTypedArray(),
            note = note.split(" ").toTypedArray()
        )

        val expected = "Yes"

        assertEquals(expected, actual)
    }

    @Test
    fun testCase2() {
        val magazine = "two times three is not four"
        val note = "two times two is four"

        val actual = checkMagazine(
            magazine = magazine.split(" ").toTypedArray(),
            note = note.split(" ").toTypedArray()
        )

        val expected = "No"

        assertEquals(expected, actual)
    }

    @Test
    fun testCase3() {
        val magazine = "ive got a lovely bunch of coconuts"
        val note = "ive got some coconuts"

        val actual = checkMagazine(
            magazine = magazine.split(" ").toTypedArray(),
            note = note.split(" ").toTypedArray()
        )

        val expected = "No"

        assertEquals(expected, actual)
    }
}