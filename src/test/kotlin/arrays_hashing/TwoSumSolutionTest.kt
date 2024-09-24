package arrays_hashing

import kotlin.test.Test
import kotlin.test.assertContentEquals

class TwoSumSolutionTest {

    @Test
    fun testTwoSumValid() {
        val solution = TwoSumSolution()
        val res = solution.twoSum(intArrayOf(2,7,11,15), 9)
        val resExpected = intArrayOf(0, 1)
        assertContentEquals(res, resExpected)
    }

    @Test
    fun testTwoSumValidTwo() {
        val solution = TwoSumSolution()
        val res = solution.twoSum(intArrayOf(3, 2, 4), 6)
        val resExpected = intArrayOf(1, 2)
        assertContentEquals(res, resExpected)
    }

    @Test
    fun testTwoSumValidThree() {
        val solution = TwoSumSolution()
        val res = solution.twoSum(intArrayOf(3, 3), 6)
        val resExpected = intArrayOf(0, 1)
        assertContentEquals(res, resExpected)
    }
}