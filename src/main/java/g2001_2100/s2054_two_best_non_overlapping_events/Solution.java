package g2001_2100.s2054_two_best_non_overlapping_events;

// #Medium #Array #Dynamic_Programming #Sorting #Binary_Search #Heap_Priority_Queue
// #2022_05_24_Time_58_ms(70.59%)_Space_109.2_MB_(88.24%)

import java.util.Arrays;

public class Solution {
    public int maxTwoEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        int[] max = new int[events.length];
        for (int i = events.length - 1; i >= 0; i--) {
            if (i == events.length - 1) {
                max[i] = events[i][2];
            } else {
                max[i] = Math.max(events[i][2], max[i + 1]);
            }
        }
        int ans = 0;
        for (int i = 0; i < events.length; i++) {
            int end = events[i][1];
            int left = i + 1;
            int right = events.length;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (events[mid][0] <= end) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }
            int value = events[i][2];
            if (right >= 0 && right < events.length) {
                value += max[right];
            }
            ans = Math.max(ans, value);
        }
        return ans;
    }
}
