package g3401_3500.s3462_maximum_sum_with_at_most_k_elements;

// #Medium #Array #Sorting #Greedy #Matrix #Heap_Priority_Queue
// #2025_02_25_Time_62_ms_(99.82%)_Space_78.09_MB_(20.19%)

import java.util.Arrays;

public class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        int l = 0;
        for (int limit : limits) {
            l += limit;
        }
        int[] dp = new int[l];
        int a = 0;
        for (int i = 0; i < grid.length; i++) {
            int lim = limits[i];
            Arrays.sort(grid[i]);
            for (int j = grid[i].length - lim; j < grid[i].length; j++) {
                dp[a] = grid[i][j];
                a++;
            }
        }
        Arrays.sort(dp);
        long sum = 0L;
        for (int i = l - 1; i >= l - k; i--) {
            sum += dp[i];
        }
        return sum;
    }
}
