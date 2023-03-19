package g2101_2200.s2187_minimum_time_to_complete_trips;

// #Medium #Array #Binary_Search #2022_06_02_Time_187_ms_(95.03%)_Space_92.6_MB_(9.55%)

public class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        return bs(0, Long.MAX_VALUE, time, totalTrips);
    }

    private long bs(long left, long right, int[] time, long totalTrips) {
        if (left > right) {
            return Long.MAX_VALUE;
        }
        long mid = (left + right) >> 1;
        return isPossible(time, mid, totalTrips)
                ? Math.min(mid, bs(left, mid - 1, time, totalTrips))
                : bs(mid + 1, right, time, totalTrips);
    }

    private boolean isPossible(int[] time, long mid, long totalTrips) {
        long count = 0;
        for (int i : time) {
            count += mid / i;
            if (count >= totalTrips) {
                return true;
            }
        }
        return false;
    }
}
