/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var cur: ListNode? = head
        var prev: ListNode? = null
        while(cur != null) {
            var next = cur.next
            cur.next = prev
            prev = cur
            cur = next
        }
        return prev
    }
}

// cur = 0, prev = null
// loop:
// next = 1 0.next = null prev = 0 cur = 1 null <- 0 -> 1 -> 2 -> 3
// next = 2 1.next = 0 prev = 1 cur =2 null <- 0 <- 1 ->2 -> 3
// next = 3 2.next = 1 prev = 2 cur = 3 null <- 0 <- 1 <-2 -> 3
// next = null 3.next = 2 prev = 3 cur = null  null <-0 <-1<-2<-3