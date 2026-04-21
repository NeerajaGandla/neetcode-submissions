class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for(i in nums.indices) {
            map.get(target-nums[i])?.let {
                return intArrayOf(it, i)
            }
            map.put(nums[i], i)
        }
        return intArrayOf()
    }
}
