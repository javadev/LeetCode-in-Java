package g3401_3500.s3459_length_of_longest_v_shaped_diagonal_segment;

// #Hard #Array #Dynamic_Programming #Matrix #Memoization
// #2025_02_21_Time_51_ms_(77.23%)_Space_75.55_MB_(90.55%)

public class Solution {
    private final int[][] directions = {{-1, -1}, {-1, 1}, {1, 1}, {1, -1}};

    private void initializeArrays(
            int[][] bottomLeft,
            int[][] bottomRight,
            int[][] topLeft,
            int[][] topRight,
            int m,
            int n) {
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                bottomLeft[i][j] = 1;
                bottomRight[i][j] = 1;
                topLeft[i][j] = 1;
                topRight[i][j] = 1;
            }
        }
    }

    private int processBottomDirections(
            int[][] grid, int[][] bottomLeft, int[][] bottomRight, int m, int n) {
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
        return ans;
    }

    private void processTopDirections(
            int[][] grid, int[][] topLeft, int[][] topRight, int m, int n) {
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
    }

    private int findMaxDiagonal(int[][] grid, int[][][] memo, int m, int n, int initialAns) {
        int ans = initialAns;
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
                    if (v + memo[k + 3 & 3][i][j] > ans) {
                        int[] d = directions[k];
                        int ni = i - d[0] * v;
                        int nj = j - d[1] * v;
                        if (ni >= 0 && nj >= 0 && ni < m && nj < n && grid[ni][nj] == 1) {
                            ans = Math.max(ans, v + memo[k + 3 & 3][i][j]);
                        }
                    }
                }
            }
        }
        return ans;
    }

    public int lenOfVDiagonal(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] bottomLeft = new int[m][n];
        int[][] bottomRight = new int[m][n];
        int[][] topLeft = new int[m][n];
        int[][] topRight = new int[m][n];
        initializeArrays(bottomLeft, bottomRight, topLeft, topRight, m, n);
        int ans = processBottomDirections(grid, bottomLeft, bottomRight, m, n);
        processTopDirections(grid, topLeft, topRight, m, n);
        int[][][] memo = {topLeft, topRight, bottomRight, bottomLeft};
        return findMaxDiagonal(grid, memo, m, n, ans);
    }
}
