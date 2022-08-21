package g2301_2400.s2328_number_of_increasing_paths_in_a_grid;

// #Hard #Array #Dynamic_Programming #Depth_First_Search #Breadth_First_Search #Matrix #Graph
// #Memoization #Topological_Sort #2022_07_04_Time_43_ms_(100.00%)_Space_89.1_MB_(63.64%)

public class Solution {
    private int help(int[][] a, int i, int j, int n, int m, int[][] dp) {
        if (i < 0 || i >= n || j >= m || j < 0) {
            return 0;
        }
        if (dp[i][j] != 0) {
            return dp[i][j];
        }
        long res = 0;
        if (i < n - 1 && a[i + 1][j] > a[i][j]) {
            res += 1 + help(a, i + 1, j, n, m, dp);
        }
        if (i > 0 && a[i - 1][j] > a[i][j]) {
            res += 1 + help(a, i - 1, j, n, m, dp);
        }
        if (j > 0 && a[i][j - 1] > a[i][j]) {
            res += 1 + help(a, i, j - 1, n, m, dp);
        }
        if (j < m - 1 && a[i][j + 1] > a[i][j]) {
            res += 1 + help(a, i, j + 1, n, m, dp);
        }
        dp[i][j] = (int) res % 1000000007;
        return dp[i][j];
    }

    public int countPaths(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        long ans = (long) n * m;
        int[][] dp = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ans += help(grid, i, j, n, m, dp) % 1000000007;
            }
        }
        ans = ans % 1000000007;
        return (int) ans;
    }
}
