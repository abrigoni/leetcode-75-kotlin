package arrays_hashing

class ValidAnagramSolution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }
        val charCount = HashMap<Char, Int>()

        for (i in s.indices) {
            charCount[s[i]] = (charCount[s[i]] ?: 0) + 1
            charCount[t[i]] = (charCount[t[i]] ?: 0) - 1
        }

        for ((_, value) in charCount) {
            if (value != 0) {
                return false
            }
        }
        return true
    }
}