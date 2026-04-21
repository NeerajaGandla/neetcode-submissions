class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String, MutableList<String>>()
        
        for(s in strs) {
            val updatedStr = s.toList().sorted().joinToString("")
            map.getOrPut(updatedStr) { mutableListOf() }.add(s)
        }
        
        return map.values.toList()
    }
}

/*
strs

*/