package g3401_3500.s3459_length_of_longest_v_shaped_diagonal_segment;

// #Hard #Array #Dynamic_Programming #Matrix #Memoization
// #2025_02_21_Time_51_ms_(77.23%)_Space_75.55_MB_(90.55%)

public class Solution {
    private int[][] directions = {{-1, -1}, {-1, 1}, {1, 1}, {1, -1}};

    public int lenOfVDiagonal(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] bottomLeft = new int[m][n];
        int[][] bottomRight = new int[m][n];
        int[][] topLeft = new int[m][n];
        int[][] topRight = new int[m][n];
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                bottomLeft[i][j] = 1;
                bottomRight[i][j] = 1;
                topLeft[i][j] = 1;
                topRight[i][j] = 1;
            }
        }
        int ans = 0;
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                int x = grid[i][j];
                if (x == 1) {
                    ans = 1;
                    continue;
                }
                if (i > 0 && j + 1 < n && grid[i - 1][j + 1] == 2 - x) {
                    bottomLeft[i][j] = bottomLeft[i - 1][j + 1] + 1;
                }
                if (i > 0 && j > 0 && grid[i - 1][j - 1] == 2 - x) {
                    bottomRight[i][j] = bottomRight[i - 1][j - 1] + 1;
                }
            }
        }
        for (int i = m - 1; i >= 0; --i) {
            for (int j = n - 1; j >= 0; --j) {
                int x = grid[i][j];
                if (x == 1) {
                    continue;
                }
                if (i + 1 < m && j + 1 < n && grid[i + 1][j + 1] == 2 - x) {
                    topLeft[i][j] = topLeft[i + 1][j + 1] + 1;
                }
                if (i + 1 < m && j > 0 && grid[i + 1][j - 1] == 2 - x) {
                    topRight[i][j] = topRight[i + 1][j - 1] + 1;
                }
            }
        }
        int[][][] memo = {topLeft, topRight, bottomRight, bottomLeft};
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                int x = grid[i][j];
                if (x == 1) {
                    continue;
                }
                x >>= 1;
                for (int k = 0; k < 4; ++k) {
                    int v = memo[k][i][j];
                    if ((v & 1) != x) {
                        continue;
                    }
                    if (v + memo[k + 3 & 3][i][j] <= ans) {
                        continue;
                    }
                    int[] d = directions[k];
                    int ni = i - d[0] * v, nj = j - d[1] * v;
                    if (ni >= 0 && nj >= 0 && ni < m && nj < n && grid[ni][nj] == 1) {
                        ans = Math.max(ans, v + memo[k + 3 & 3][i][j]);
                    }
                }
            }
        }
        return ans;
    }
}
