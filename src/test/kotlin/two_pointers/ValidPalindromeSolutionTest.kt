package two_pointers

import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidPalindromeSolutionTest {

    @Test
    fun testValidPalindrome() {
        val solution = ValidPalindromeSolution()
        val output = solution.isPalindrome("A man, a plan, a canal: Panama")
        assertTrue(output)
    }

    @Test
    fun testInvalidPalindrome() {
        val solution = ValidPalindromeSolution()
        val output = solution.isPalindrome("race a car")
        assertFalse(output)
    }

    @Test
    fun testValidPalindromeEmptyString() {
        val solution = ValidPalindromeSolution()
        val output = solution.isPalindrome("")
        assertTrue(output)
    }
}