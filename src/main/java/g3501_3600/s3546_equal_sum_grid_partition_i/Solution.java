package g3501_3600.s3546_equal_sum_grid_partition_i;

// #Medium #Array #Matrix #Prefix_Sum #Enumeration
// #2025_05_13_Time_3_ms_(99.93%)_Space_71.13_MB_(5.07%)

public class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        long totalRowSum = 0L;
        long totalColSum;
        long[] prefixRowWise = new long[n];
        long[] prefixColWise = new long[m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int v = grid[i][j];
                prefixRowWise[i] += v;
                prefixColWise[j] += v;
            }
        }
        for (long r : prefixRowWise) {
            totalRowSum += r;
        }
        totalColSum = totalRowSum;
        long currentRowUpperSum = 0L;
        for (int i = 0; i < n - 1; i++) {
            currentRowUpperSum += prefixRowWise[i];
            long lowerSegmentSum = totalRowSum - currentRowUpperSum;
            if (currentRowUpperSum == lowerSegmentSum) {
                return true;
            }
        }
        long currentColLeftSum = 0L;
        for (int j = 0; j < m - 1; j++) {
            currentColLeftSum += prefixColWise[j];
            long rightSegmentSum = totalColSum - currentColLeftSum;
            if (currentColLeftSum == rightSegmentSum) {
                return true;
            }
        }
        return false;
    }
}
