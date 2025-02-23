package g3401_3500.s3462_maximum_sum_with_at_most_k_elements;

// #Medium #2025_02_23_Time_278_ms_(_%)_Space_73.54_MB_(_%)

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        if (grid.length == 0) {
            return 0;
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> temp;
        for (int i = 0; i < grid.length; i++) {
            temp = new PriorityQueue<>(Collections.reverseOrder());
            for (int j = 0; j < grid[i].length; j++) {
                temp.add(grid[i][j]);
            }
            int cnt = 0;
            while (!temp.isEmpty() && cnt < limits[i]) {
                pq.add(temp.poll());
                cnt += 1;
            }
        }
        long result = 0;
        long count = 0;
        while (!pq.isEmpty() && count < k) {
            result += pq.poll();
            count += 1;
        }
        return result;
    }
}
