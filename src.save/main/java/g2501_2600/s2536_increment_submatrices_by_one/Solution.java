package g2501_2600.s2536_increment_submatrices_by_one;

// #Medium #Array #Matrix #Prefix_Sum #2023_04_22_Time_12_ms_(88.15%)_Space_50.9_MB_(65.40%)

public class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] g = new int[n][n];
        for (int[] q : queries) {
            int r1 = q[0];
            int c1 = q[1];
            int r2 = q[2];
            int c2 = q[3];
            g[r1][c1]++;
            if (c2 < n - 1) {
                g[r1][c2 + 1]--;
            }
            if (r2 < n - 1) {
                g[r2 + 1][c1]--;
            }
            if (c2 < n - 1 && r2 < n - 1) {
                g[r2 + 1][c2 + 1]++;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i > 0) {
                    g[i][j] += g[i - 1][j];
                }
                if (j > 0) {
                    g[i][j] += g[i][j - 1];
                }
                if (i > 0 && j > 0) {
                    g[i][j] -= g[i - 1][j - 1];
                }
            }
        }
        return g;
    }
}
