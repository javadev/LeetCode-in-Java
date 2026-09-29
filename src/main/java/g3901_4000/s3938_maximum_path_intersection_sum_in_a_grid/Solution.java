package g3901_4000.s3938_maximum_path_intersection_sum_in_a_grid;

// #Medium #Array #Dynamic_Programming #Matrix #Prefix_Sum #Staff #Biweekly_Contest_183
// #2026_09_29_Time_9_ms_(100.00%)_Space_181.37_MB_(48.98%)

public class Solution {
    public int maxScore(int[][] grid) {
        int ans = Integer.MIN_VALUE;
        int m = grid.length;
        int n = grid[0].length;
        // 1. Check all strictly interior single cells
        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                ans = Math.max(ans, grid[i][j]);
            }
        }
        // 2. Modified Kadane's for Rows (Minimum length 2)
        for (int[] ints : grid) {
            int currentSum = ints[0];
            for (int j = 1; j < n; j++) {
                ans = Math.max(ans, currentSum + ints[j]);
                currentSum = Math.max(ints[j], currentSum + ints[j]);
            }
        }
        // 3. Modified Kadane's for Columns (Minimum length 2)
        for (int j = 0; j < n; j++) {
            int currentSum = grid[0][j];
            for (int i = 1; i < m; i++) {
                ans = Math.max(ans, currentSum + grid[i][j]);
                currentSum = Math.max(grid[i][j], currentSum + grid[i][j]);
            }
        }
        return ans;
    }
}
