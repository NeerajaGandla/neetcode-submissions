/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        if(head == null) return null

        var newHead = head
        if(head.next != null) {
            newHead = reverseList(head.next)
            head.next?.next = head
        }
        head.next = null
        return newHead
    }
}

// 0 -> 1 -> 2 -> 3
// head = 0 newHead = 0 newHead = 3 1.next=0 0.next = null
// head = 1 newHead = 1 newHead=3 2.next = 1 1.next = null
// head = 2 newHead = 2 newHead = 3 3.next = 2 2.next = null 
// head = 3 newHead=3 3.next = null