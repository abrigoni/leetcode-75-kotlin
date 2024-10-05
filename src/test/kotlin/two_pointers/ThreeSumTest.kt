package two_pointers

import kotlin.test.Test
import kotlin.test.assertEquals

class ThreeSumTest {

    @Test
    fun testThreeSum() {
        val solution = ThreeSum()
        val input = intArrayOf(-1, 0, 1, 2, -1, -4)
        val expectedOutput = listOf(listOf(-1, -1, 2), listOf(-1, 0, 1))
        val output = solution.threeSum(input)
        assertEquals(expectedOutput, output)
    }
    @Test
    fun testThreeSumNoCombination() {
        val solution = ThreeSum()
        val input = intArrayOf(0,1,1)
        val expectedOutput = listOf<List<Int>>()
        val output = solution.threeSum(input)
        assertEquals(expectedOutput, output)
    }
    @Test
    fun testThreeSumOnlyOne() {
        val solution = ThreeSum()
        val input = intArrayOf(0, 0, 0)
        val expectedOutput = listOf(listOf(0, 0, 0))
        val output = solution.threeSum(input)
        assertEquals(expectedOutput, output)
    }

}