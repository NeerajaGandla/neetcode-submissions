class Solution {
    fun isPalindrome(s: String): Boolean {
        if(s.length == 0 || s.length == 1) return true
        var start:Int = 0
        var end: Int = s.length-1
        while(start < end) {
            while(start < end && !s[start].isLetterOrDigit()) start++
            while(end > start && !s[end].isLetterOrDigit()) end--
            if(s[start].lowercaseChar() == s[end].lowercaseChar()) {
                start++
                end--
            } else return false
        }
        return true
    }
}
