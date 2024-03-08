package g2001_2100.s2088_count_fertile_pyramids_in_a_land;

// #Hard #Array #Dynamic_Programming #Matrix #2022_05_27_Time_12_ms_(83.56%)_Space_75.5_MB_(41.09%)

public class Solution {
    public int countPyramids(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] rev = new int[m][n];
        for (int i = 0; i < m; ++i) {
            System.arraycopy(grid[i], 0, rev[m - i - 1], 0, n);
        }
        return cal(grid) + cal(rev);
    }

    private int cal(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int res = 0;
        for (int i = 1; i < m; ++i) {
            int cnt = 0;
            for (int j = 0; j < n; ++j) {
                if (0 != grid[i][j]) {
                    cnt++;
                } else {
                    cnt = 0;
                }
                if (0 == cnt || 0 == j) {
                    continue;
                }
                grid[i][j] = Math.min(grid[i - 1][j - 1] + 1, (cnt + 1) >> 1);
                res += grid[i][j] - 1;
            }
        }
        return res;
    }
}
