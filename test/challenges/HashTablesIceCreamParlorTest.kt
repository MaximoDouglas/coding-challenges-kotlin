package challenges

import challenges.challenges.whatFlavors
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import kotlin.test.assertEquals

@RunWith(JUnit4::class)
class HashTablesIceCreamParlorTest {

    @Test
    fun `it works correctly on entry1`() {
        val cost = arrayOf(1, 4, 5, 3, 2)
        val money = 4

        val actual = whatFlavors(cost, money)

        val expected = Pair(1, 4)
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry2`() {
        val cost = arrayOf(2, 2, 4, 3)
        val money = 4

        val actual = whatFlavors(cost, money)

        val expected = Pair(1, 2)
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry3`() {
        val cost = arrayOf(1, 2, 3, 5, 6)
        val money = 5

        val actual = whatFlavors(cost, money)

        val expected = Pair(2, 3)
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry4`() {
        val cost = arrayOf(4, 3, 2, 5, 7)
        val money = 8

        val actual = whatFlavors(cost, money)

        val expected = Pair(2, 4)
        assertEquals(expected, actual)
    }

    @Test
    fun `it works correctly on entry5`() {
        val cost = arrayOf(7, 2, 5, 4, 11)
        val money = 12

        val actual = whatFlavors(cost, money)

        val expected = Pair(1, 3)
        assertEquals(expected, actual)
    }
}