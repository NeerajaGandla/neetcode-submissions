class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        if(s.length == 0 && t.length == 0) return true
        val sCount = MutableList<Int>(26) {0}
        val tCount = MutableList<Int>(26) {0}
        for(i in s.indices) {
            sCount[s[i] - 'a']++
            tCount[t[i] - 'a']++
        }
        
        return sCount == tCount
    }
}
