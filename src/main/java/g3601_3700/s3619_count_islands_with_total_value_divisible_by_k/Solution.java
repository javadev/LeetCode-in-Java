package g3601_3700.s3619_count_islands_with_total_value_divisible_by_k;

// #Medium #Biweekly_Contest_161 #2025_07_22_Time_16_ms_(96.65%)_Space_71.27_MB_(46.65%)

public class Solution {
    private int m;
    private int n;

    public int countIslands(int[][] grid, int k) {
        int count = 0;
        m = grid.length;
        n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] != 0) {
                    int curr = dfs(i, j, grid);
                    if (curr % k == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private int dfs(int i, int j, int[][] grid) {
        if (i >= m || j >= n || i < 0 || j < 0 || grid[i][j] == 0) {
            return Integer.MAX_VALUE;
        }
        int count = grid[i][j];
        grid[i][j] = 0;
        int x = dfs(i + 1, j, grid);
        int y = dfs(i, j + 1, grid);
        int a = dfs(i - 1, j, grid);
        int b = dfs(i, j - 1, grid);
        if (x != Integer.MAX_VALUE) {
            count += x;
        }
        if (y != Integer.MAX_VALUE) {
            count += y;
        }
        if (a != Integer.MAX_VALUE) {
            count += a;
        }
        if (b != Integer.MAX_VALUE) {
            count += b;
        }
        return count;
    }
}
