package g1301_1400.s1383_maximum_performance_of_a_team;

// #Hard #Array #Sorting #Greedy #Heap_Priority_Queue
// #2022_03_21_Time_66_ms_(66.03%)_Space_69.1_MB_(40.82%)

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int maxPerformance(int n, int[] speed, int[] efficiency, int k) {
        int[][] engineers = new int[n][2];
        for (int i = 0; i < n; i++) {
            engineers[i][0] = speed[i];
            engineers[i][1] = efficiency[i];
        }
        Arrays.sort(engineers, (engineer1, engineer2) -> engineer2[1] - engineer1[1]);
        long speedSum = 0;
        long maximumPerformance = 0;
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int[] engineer : engineers) {
            if (minHeap.size() == k) {
                speedSum -= minHeap.poll();
            }
            speedSum += engineer[0];
            minHeap.offer(engineer[0]);
            maximumPerformance = Math.max(maximumPerformance, speedSum * engineer[1]);
        }
        return (int) (maximumPerformance % 1000_000_007);
    }
}
