class Solution {
    fun search(nums: IntArray, target: Int): Int {
        if(nums.size == 0) return -1

        var start = 0
        var end = nums.size-1
        while(start <= end) {
            val mid = start + (end-start)/2
            when {
               nums[mid] == target -> return mid
               nums[mid] < target -> start = mid+1
               nums[mid] > target -> end = mid-1
            }
        }
        return -1
    }
}
