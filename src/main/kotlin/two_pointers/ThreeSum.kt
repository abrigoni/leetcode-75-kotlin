package two_pointers

class ThreeSum {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val res = mutableListOf<List<Int>>()
        nums.sort()
        for (i in nums.indices) {
            var l = i + 1
            var r = nums.size - 1
            if (i > 0 && nums[i] == nums[i-1]) {
                continue
            }
            while (l < r) {
                val sum = nums[i] + nums[l] + nums[r]
                if (sum > 0) {
                    r--
                } else if (sum < 0) {
                    l++
                } else {
                    res.add(listOf(nums[i], nums[l], nums[r]))
                    l++
                    while (nums[l] == nums[l - 1] && l < r) {
                        l++
                    }
                }
            }
        }
        return res
    }
}