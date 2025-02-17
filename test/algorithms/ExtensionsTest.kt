package algorithms

import challenges.algorithms.swapPositions
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import kotlin.test.assertContentEquals

@RunWith(JUnit4::class)
class ExtensionsTest {

    @Test
    fun `Int array swap positions works correctly`() {
        val originalArray = arrayOf(1, 2, 3, 4, 5)
        val expectedArray = arrayOf(1, 3, 2, 4, 5)

        originalArray.swapPositions(1, 2)

        assertContentEquals(expectedArray, originalArray)
    }
}