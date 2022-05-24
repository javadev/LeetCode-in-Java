package g2001_2100.s2054_two_best_non_overlapping_events;

// #Medium #Array #Dynamic_Programming #Sorting #Binary_Search #Heap_Priority_Queue
// #2022_05_24_Time_45_ms_(89.71%)_Space_87.9_MB_(93.63%)

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int maxTwoEvents(int[][] events) {
        int n = events.length;
        Arrays.sort(events, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>((a, b) -> a[0] - b[0]);
        int maxVal = 0;
        int ans = 0;
        for (int[] e : events) {
            int start = e[0];
            while (!queue.isEmpty()) {
                if (queue.peek()[0] >= start) {
                    break;
                }
                int[] eve = queue.remove();
                maxVal = Math.max(maxVal, eve[1]);
            }
            ans = Math.max(ans, e[2] + maxVal);
            queue.add(new int[] {e[1], e[2]});
        }
        return ans;
    }
}
