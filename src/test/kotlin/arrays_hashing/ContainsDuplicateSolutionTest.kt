package arrays_hashing

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ContainsDuplicateSolutionTest {
    @Test
    fun test_duplicate_true() {
        val solution = ContainsDuplicateSolution()
        val nums = intArrayOf(1, 2, 4, 1)
        assertTrue(solution.containsDuplicate(nums))
    }
    @Test
    fun test_no_duplicate_false() {
        val solution = ContainsDuplicateSolution()
        val nums = intArrayOf(1, 2, 3)
        assertFalse(solution.containsDuplicate(nums))
    }
    @Test
    fun test_empty_false() {
        val solution = ContainsDuplicateSolution()
        val nums = intArrayOf()
        assertFalse(solution.containsDuplicate(nums))
    }
}