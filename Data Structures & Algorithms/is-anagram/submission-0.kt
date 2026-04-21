class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        if(s.length == 0 && t.length == 0) return true
        val sMap = mutableMapOf<Char, Int>()
        val tMap = mutableMapOf<Char, Int>()
        for(c in s) {
            sMap[c] = (sMap[c] ?: 0) + 1
        }
        for(c in t) {
            tMap[c] = (tMap[c] ?: 0) + 1
        }
        for((key, value) in sMap) {
            if(tMap[key] != value) return false
        }
        return true
    }
}
