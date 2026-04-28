/**
 * Definition of Interval:
 * class Interval(var start: Int, var end: Int) {}
 */

class Solution {
    fun canAttendMeetings(intervals: List<Interval>): Boolean {
        if(intervals.size == 1) return true
        val arr = intervals.sortedBy { it.start }

        for(i in 1..arr.size-1) {
            if(arr[i].start < arr[i-1].end) return false
        }
        return true
    }
}

// (0,4),(5,10)

