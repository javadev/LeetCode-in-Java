package g0501_0600.s0576_out_of_boundary_paths;

// #Medium #Dynamic_Programming #2022_08_10_Time_5_ms_(92.95%)_Space_43.1_MB_(36.44%)

import java.util.Arrays;

public class Solution {
    private final int[][] dRowCol = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    private int dfs(int m, int n, int remainingMoves, int currRow, int currCol, int[][][] cache) {
        if (currRow < 0 || currRow == m || currCol < 0 || currCol == n) {
            return 1;
        }
        if (remainingMoves == 0) {
            return 0;
        }

        if (cache[currRow][currCol][remainingMoves] == -1) {
            int paths = 0;
            for (int i = 0; i < 4; i++) {
                int newRow = currRow + dRowCol[i][0];
                int newCol = currCol + dRowCol[i][1];
                int m1 = 1000000007;
                paths = (paths + dfs(m, n, remainingMoves - 1, newRow, newCol, cache)) % m1;
            }
            cache[currRow][currCol][remainingMoves] = paths;
        }
        return cache[currRow][currCol][remainingMoves];
    }

    public int findPaths(int m, int n, int maxMoves, int startRow, int startCol) {
        int[][][] cache = new int[m][n][maxMoves + 1];
        for (int[][] c1 : cache) {
            for (int[] c2 : c1) {
                Arrays.fill(c2, -1);
            }
        }

        return dfs(m, n, maxMoves, startRow, startCol, cache);
    }
}
