class Solution {
    fun countBits(n: Int): IntArray {
        if(n == 0) return IntArray(1) {0}

        var res = IntArray(n+1)
        for(i in 1..n) {
            res[i] = hammingWeight(i)
        }
        return res
    }

    fun hammingWeight(n: Int): Int {
        var res = 0
        for(i in 0 until 32) {
            if((1 shl i) and n != 0) {
                res++
            }
        }
        return res
    }
}
