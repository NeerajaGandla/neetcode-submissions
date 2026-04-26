/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        if(list1 == null) return list2
        if(list2 == null) return list1
        var dummy = ListNode(0)
        var node: ListNode? = dummy

        var l1 = list1
        var l2 = list2

        while(l1 != null && l2 != null) {
            if(l1.`val`< l2.`val`) {
                node?.next = l1
                l1 = l1.next
            } else {
                node?.next = l2
                l2 = l2.next
            }
            node = node?.next
        }
        node?.next = l1 ?: l2

        return dummy.next
    }
}

// 1 2 4
// 1 3 5
// 1=1 1 < 2   1 1 2 4     3 5
// 3 > 2 3 < 4   1 1 2 3 4   5
// 5 > 3 5 > 4 1 1 2 3 4 5
