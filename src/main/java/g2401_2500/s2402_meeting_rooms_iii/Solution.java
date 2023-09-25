package g2401_2500.s2402_meeting_rooms_iii;

// #Hard #Array #Sorting #Heap_Priority_Queue #2022_10_23_Time_124_ms_(72.79%)_Space_107_MB_(80.70%)

import java.util.Arrays;

public class Solution {
    public int mostBooked(int n, int[][] meetings) {
        int[] counts = new int[n];
        long[] endTimes = new long[n];
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));
        for (int[] meeting : meetings) {
            int id = findRoomId(endTimes, meeting[0]);
            counts[id]++;
            endTimes[id] = Math.max(endTimes[id], meeting[0]) + meeting[1] - meeting[0];
        }
        int res = 0;
        long count = 0;
        for (int i = 0; i < n; i++) {
            if (counts[i] > count) {
                count = counts[i];
                res = i;
            }
        }
        return res;
    }

    private int findRoomId(long[] endTimes, int start) {
        int n = endTimes.length;
        // Find the first one
        for (int i = 0; i < n; i++) {
            if (endTimes[i] <= start) {
                return i;
            }
        }
        // Only when non is not delayed, then we find the smallest one
        int id = 0;
        long min = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (endTimes[i] < min) {
                min = endTimes[i];
                id = i;
            }
        }
        return id;
    }
}
