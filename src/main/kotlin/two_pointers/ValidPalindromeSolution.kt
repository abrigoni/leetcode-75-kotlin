package two_pointers

class ValidPalindromeSolution {


    fun isPalindrome(s: String): Boolean {
        var l = s.indices.first
        var r = s.indices.last

        while (l < r) {
            while (l < r && !s[l].isLetter()) {
                l++
            }
            while (r > l && !s[r].isLetter()) {
                r--
            }
            if (s[l].lowercaseChar() != s[r].lowercaseChar()) {
                return false
            }
            l++
            r--
        }

        return true
    }
}