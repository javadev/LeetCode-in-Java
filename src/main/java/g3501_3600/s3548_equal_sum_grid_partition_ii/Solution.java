package g3501_3600.s3548_equal_sum_grid_partition_ii;

// #Hard #2025_05_11_Time_4_ms_(100.00%)_Space_66.33_MB_(97.99%)

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
        int m = grid.length;
        int n = grid[0].length;
        long s = 0;
        for (int i = 0; i < r.length - 1; i++) {
            s += r[i];
            if (s * 2 == total
                    || s * 2 - grid[i][n - 1] == total
                    || s * 2 - grid[i][0] == total
                    || s * 2 - grid[0][0] == total
                    || s * 2 - grid[0][n - 1] == total) {
                return true;
            }
            if (s * 2 > total) {
                break;
            }
        }
        s = 0;
        for (int i = m - 1; i >= 0; i--) {
            s += r[i];
            if (s * 2 == total
                    || s * 2 - grid[i][n - 1] == total
                    || s * 2 - grid[i][0] == total
                    || s * 2 - grid[m - 1][n - 1] == total
                    || s * 2 - grid[m - 1][0] == total) {
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
            if (s * 2 == total
                    || s * 2 - grid[0][0] == total
                    || s * 2 - grid[m - 1][0] == total
                    || s * 2 - grid[0][i] == total
                    || s * 2 - grid[m - 1][i] == total) {
                return true;
            }
            if (s * 2 > total) {
                break;
            }
        }
        s = 0;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                s += grid[j][i];
            }
            if (s * 2 == total
                    || s * 2 - grid[m - 1][n - 1] == total
                    || s * 2 - grid[0][n - 1] == total
                    || s * 2 - grid[0][i] == total
                    || s * 2 - grid[m - 1][i] == total) {
                return true;
            }
            if (s * 2 > total) {
                break;
            }
        }
        return false;
    }
}
