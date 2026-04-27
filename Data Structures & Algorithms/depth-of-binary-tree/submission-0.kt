/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun maxDepth(root: TreeNode?): Int {
        return maxDepthHelper(root, 0)
    }

    fun maxDepthHelper(root: TreeNode?, depth: Int): Int {
        if(root == null) return depth

        val leftDepth = maxDepthHelper(root.left, depth+1)
        val rightDepth = maxDepthHelper(root.right, depth+1)

        return maxOf(leftDepth, rightDepth)
    }
}
