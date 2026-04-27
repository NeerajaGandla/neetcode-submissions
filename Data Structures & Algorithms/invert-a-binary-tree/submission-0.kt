/**
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        if(root?.left == null && root?.right == null) return root

        val temp = root.left
        root.left = root.right
        root.right = temp
        
        invertTree(root.left)
        invertTree(root.right)
        return root
    }
}
