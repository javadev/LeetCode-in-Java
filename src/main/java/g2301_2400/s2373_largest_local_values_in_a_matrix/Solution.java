package g2301_2400.s2373_largest_local_values_in_a_matrix;

// #Easy #Array #Matrix #2022_08_19_Time_2_ms_(99.97%)_Space_43.1_MB_(96.65%)

public class Solution {
    public int[][] largestLocal(int[][] grid) {
        int n = grid.length;
        int[][] res = new int[n - 2][n - 2];
        for (int i = 0; i < n - 2; i++) {
            for (int j = 0; j < n - 2; j++) {
                for (int p = i; p < i + 3; p++) {
                    for (int q = j; q < j + 3; q++) {
                        res[i][j] = Math.max(res[i][j], grid[p][q]);
                    }
                }
            }
        }
        return res;
    }
}
