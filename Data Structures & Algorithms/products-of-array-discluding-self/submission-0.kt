class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val size = nums.size
        val result = IntArray(size)
        val prefixArr = IntArray(size)
        val suffixArr = IntArray(size)
        prefixArr[0] = 1
        suffixArr[size-1] = 1
        for(i in 1 until size) {
            prefixArr[i] =  nums[i-1] * prefixArr[i-1]
        }
        for(i in size-2 downTo 0) {
            suffixArr[i] = nums[i+1] * suffixArr[i+1]
        }
        for(i in 0 until size) {
            result[i] = prefixArr[i] * suffixArr[i]
        }
        return result
    }
}
