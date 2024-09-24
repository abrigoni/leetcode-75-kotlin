package arrays_hashing

class TwoSumSolution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val mapNumberToIndex = HashMap<Int, Int>()

        for (i in nums.indices) {
            val a = nums[i];
            val b = target - a

            if (mapNumberToIndex.contains(b)) {
                return intArrayOf(mapNumberToIndex[b]!!, i);
            }
            mapNumberToIndex[a] = i;
        }
        return intArrayOf(0, 0)
    }
}