package arrays_hashing

import kotlin.test.Test
import kotlin.test.assertTrue

class ValidAnagramTest {

    @Test
    fun is_valid_anagram() {
        val solution = ValidAnagramSolution()
        assertTrue(solution.isAnagram("anagram", "nagaram"))
    }
}