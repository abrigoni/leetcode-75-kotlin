package arrays_hashing

class ContainsDuplicateSolution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()
        for (num in nums) {
            // add returns false if element already exists in set
            if (!set.add(num)) {
                return true
            }
        }
        return false
    }
}