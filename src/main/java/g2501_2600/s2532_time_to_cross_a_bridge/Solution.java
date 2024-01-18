package g2501_2600.s2532_time_to_cross_a_bridge;

// #Hard #Array #Heap_Priority_Queue #Simulation
// #2023_04_20_Time_67_ms_(72.50%)_Space_50.4_MB_(15.00%)

import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public int findCrossingTime(int n, int k, int[][] time) {
        // create 2 PQ
        PriorityQueue<int[]> leftBridgePQ =
                new PriorityQueue<>((a, b) -> (a[1] == b[1] ? b[0] - a[0] : b[1] - a[1]));
        PriorityQueue<int[]> rightBridgePQ =
                new PriorityQueue<>((a, b) -> (a[1] == b[1] ? b[0] - a[0] : b[1] - a[1]));
        PriorityQueue<int[]> leftWHPQ = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        PriorityQueue<int[]> rightWHPQ = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));
        for (int i = 0; i < k; i++) {
            int effciency = time[i][0] + time[i][2];
            leftBridgePQ.offer(new int[] {i, effciency});
        }
        int duration = 0;
        while (n > 0 || !rightBridgePQ.isEmpty() || !rightWHPQ.isEmpty()) {
            while (!leftWHPQ.isEmpty() && leftWHPQ.peek()[1] <= duration) {
                int id = leftWHPQ.poll()[0];
                int e = time[id][0] + time[id][2];
                leftBridgePQ.offer(new int[] {id, e});
            }
            while (!rightWHPQ.isEmpty() && rightWHPQ.peek()[1] <= duration) {
                int id = rightWHPQ.poll()[0];
                int e = time[id][0] + time[id][2];
                rightBridgePQ.offer(new int[] {id, e});
            }
            if (!rightBridgePQ.isEmpty()) {
                int id = rightBridgePQ.poll()[0];
                duration += time[id][2];
                leftWHPQ.offer(new int[] {id, duration + time[id][3]});
            } else if (!leftBridgePQ.isEmpty() && n > 0) {
                int id = leftBridgePQ.poll()[0];
                duration += time[id][0];
                rightWHPQ.offer(new int[] {id, duration + time[id][1]});
                --n;
            } else {
                // update duration
                int left = Integer.MAX_VALUE;
                if (!leftWHPQ.isEmpty() && n > 0) {
                    left = leftWHPQ.peek()[1];
                }
                int right = Integer.MAX_VALUE;
                if (!rightWHPQ.isEmpty()) {
                    right = rightWHPQ.peek()[1];
                }
                duration = Math.min(left, right);
            }
        }
        return duration;
    }
}
