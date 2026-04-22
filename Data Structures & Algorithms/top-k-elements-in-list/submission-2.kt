class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val freqMap = HashMap<Int, Int>()
        for(num in nums) {
            freqMap[num] = freqMap.getOrDefault(num, 0) + 1
        }

        val freq = List(nums.size + 1) { mutableListOf<Int>() }
        for((num, count) in freqMap) {
            freq[count].add(num)
        }

        val res = mutableListOf<Int>()
        for(i in freq.size - 1 downTo 1) {
            for(num in freq[i]) {
              res.add(num)
              if(res.size == k) return res.toIntArray()
            }
        }
        return res.toIntArray()
    }
}

/*
frequencyMap
1 -> 1
2 -> 2
3 -> 3
*/
