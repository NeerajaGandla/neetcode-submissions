class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val freqMap = HashMap<Int, Int>()
        for(num in nums) {
            freqMap[num] = freqMap.getOrDefault(num, 0) + 1
        }

        val arr = mutableListOf<Pair<Int, Int>>()
        for((num, freq) in freqMap) {
            arr.add(Pair(freq, num))
        }
        arr.sortByDescending { it.first }

        val res = IntArray(k)
        for(i in 0 until k) {
            res[i] = arr[i].second
        }
        return res
    }
}

/*
frequencyMap
1 -> 1
2 -> 2
3 -> 3
*/
