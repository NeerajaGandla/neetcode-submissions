class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        var map = mutableMapOf<Int, Int>()
        for(num in nums) {
            map[num] = map.getOrDefault(num, 0) + 1
        }

        val heap = PriorityQueue<Pair<Int, Int>>(compareBy{it.first})
        for((num, freq) in map) {
            heap.add(Pair(freq, num))
            if(heap.size > k) heap.poll()
        }

        val res = IntArray(k)
        for(i in res.indices) {
            res[i] = heap.poll().second
        }
        return res
    }
}
