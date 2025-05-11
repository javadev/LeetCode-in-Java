package g3501_3600.s3546_equal_sum_grid_partition_i;

// #Medium #2025_05_11_Time_2_ms_(100.00%)_Space_64.40_MB_(67.36%)

public class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        if (grid.length == 1 && grid[0].length == 1) {
            return false;
        }
        long total = 0;
        int k = 0;
        int[] r = new int[grid.length];
        for (int[] i : grid) {
            int t = 0;
            for (int j : i) {
                t += j;
            }
            total += t;
            r[k++] = t;
        }
        if (total % 2 != 0) {
            return false;
        }
        long s = 0;
        for (int i = 0; i < r.length - 1; i++) {
            s += r[i];
            if (s * 2 == total) {
                return true;
            }
            if (s * 2 > total) {
                break;
            }
        }
        s = 0;
        for (int i = 0; i < grid[0].length - 1; i++) {
            for (int[] ints : grid) {
                s += ints[i];
            }
            if (s * 2 == total) {
                return true;
            }
            if (s * 2 > total) {
                break;
            }
        }
        return false;
    }
}
