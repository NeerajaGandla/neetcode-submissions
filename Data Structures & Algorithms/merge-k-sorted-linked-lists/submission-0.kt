/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        val heap = PriorityQueue<ListNode>(compareBy { it.`val` })
        for(list in lists) {
            list?.let { heap.add(it) }
        }
        val dummy = ListNode(0)
        var cur: ListNode? = dummy
        while(heap.isNotEmpty()) {
            val root = heap.poll()
            cur?.next = root
            cur = cur?.next
            root?.next?.let{
                heap.add(it)
            }
        }
        return dummy.next
    }
}
