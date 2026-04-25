class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        val map = hashMapOf(')' to '(', '}' to '{', ']' to '[')
        for(c in s) {
            if(c in map) {
                if(stack.isNotEmpty() && stack.first() == map[c]) {
                    stack.pop()
                } else return false
            } else {
                stack.push(c)
            }
        }
        return stack.isEmpty()
    }
}
