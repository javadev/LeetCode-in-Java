package g3201_3300.s3275_k_th_nearest_obstacle_queries;

// #Medium #2024_09_02_Time_126_ms_(100.00%)_Space_129.6_MB_(100.00%)

import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution {
    public int[] resultsArray(int[][] queries, int k) {
        int[] output = new int[queries.length];
        Arrays.fill(output, -1);
        PriorityQueue<int[]> heap =
                new PriorityQueue<>(
                        (a, b) ->
                                (Math.abs(b[0]) + Math.abs(b[1]))
                                        - (Math.abs(a[0]) + Math.abs(a[1])));
        for (int i = 0; i < output.length; ++i) {
            heap.offer(queries[i]);
            if (heap.size() > k) {
                heap.poll();
            }
            if (heap.size() == k) {
                int[] currkth = heap.peek();
                output[i] = Math.abs(currkth[0]) + Math.abs(currkth[1]);
            }
        }
        return output;
    }
}
