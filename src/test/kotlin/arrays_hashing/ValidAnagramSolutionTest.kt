package arrays_hashing

import kotlin.test.Test
import kotlin.test.assertTrue

class ValidAnagramSolutionTest {

    @Test
    fun isValidAnagramTestCase() {
        val solution = ValidAnagramSolution()
        assertTrue(solution.isAnagram("anagram", "nagaram"))
    }
}