package g3201_3300.s3256_maximum_value_sum_by_placing_three_rooks_i;

// #Hard #Array #Dynamic_Programming #Matrix #Enumeration
// #2024_08_20_Time_7_ms_(100.00%)_Space_45.1_MB_(90.97%)

import java.util.Arrays;

public class Solution {
    public long maximumValueSum(int[][] board) {
        int n = board.length;
        int m = board[0].length;
        int[][] tb = new int[n][m];
        tb[0] = Arrays.copyOf(board[0], m);
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < m; j++) {
                tb[i][j] = Math.max(tb[i - 1][j], board[i][j]);
            }
        }
        int[][] bt = new int[n][m];
        bt[n - 1] = Arrays.copyOf(board[n - 1], m);
        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j < m; j++) {
                bt[i][j] = Math.max(bt[i + 1][j], board[i][j]);
            }
        }
        long ans = Long.MIN_VALUE;
        for (int i = 1; i < n - 1; i++) {
            int[][] max3Top = getMax3(tb[i - 1]);
            int[][] max3Cur = getMax3(board[i]);
            int[][] max3Bottom = getMax3(bt[i + 1]);
            for (int[] topCand : max3Top) {
                for (int[] curCand : max3Cur) {
                    for (int[] bottomCand : max3Bottom) {
                        if (topCand[1] != curCand[1]
                                && topCand[1] != bottomCand[1]
                                && curCand[1] != bottomCand[1]) {
                            long cand = (long) topCand[0] + curCand[0] + bottomCand[0];
                            ans = Math.max(ans, cand);
                        }
                    }
                }
            }
        }
        return ans;
    }

    private int[][] getMax3(int[] row) {
        int m = row.length;
        int[][] ans = new int[3][2];
        Arrays.fill(ans, new int[] {Integer.MIN_VALUE, -1});
        for (int j = 0; j < m; j++) {
            if (row[j] >= ans[0][0]) {
                ans[2] = ans[1];
                ans[1] = ans[0];
                ans[0] = new int[] {row[j], j};
            } else if (row[j] >= ans[1][0]) {
                ans[2] = ans[1];
                ans[1] = new int[] {row[j], j};
            } else if (row[j] > ans[2][0]) {
                ans[2] = new int[] {row[j], j};
            }
        }
        return ans;
    }
}
