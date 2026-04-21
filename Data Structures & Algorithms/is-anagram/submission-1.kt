class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if(s.length != t.length) return false
        if(s.length == 0 && t.length == 0) return true
        val sMap = mutableMapOf<Char, Int>()
        val tMap = mutableMapOf<Char, Int>()
        for(i in s.indices) {
            sMap[s[i]] = (sMap[s[i]] ?: 0) + 1
            tMap[t[i]] = (tMap[t[i]] ?: 0) + 1
        }
        
        return sMap == tMap
    }
}
