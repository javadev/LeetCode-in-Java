package g0201_0300.s0221_maximal_square;

// #Medium #Array #Dynamic_Programming #Matrix #Dynamic_Programming_I_Day_16
// #Big_O_Time_O(m*n)_Space_O(m*n) #2022_07_04_Time_7_ms_(72.35%)_Space_59.5_MB_(10.55%)

public class Solution {
    public int maximalSquare(char[][] matrix) {
        int m = matrix.length;
        if (m == 0) {
            return 0;
        }
        int n = matrix[0].length;
        if (n == 0) {
            return 0;
        }
        int[][] dp = new int[m + 1][n + 1];
        int max = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == '1') {
                    // 1 + minimum from cell above, cell to the left, cell diagonal upper-left
                    int next = 1 + Math.min(dp[i][j], Math.min(dp[i + 1][j], dp[i][j + 1]));
                    // keep track of the maximum value seen
                    if (next > max) {
                        max = next;
                    }
                    dp[i + 1][j + 1] = next;
                }
            }
        }
        return max * max;
    }
}
