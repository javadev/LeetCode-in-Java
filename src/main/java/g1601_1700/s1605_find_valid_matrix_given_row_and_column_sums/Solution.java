package g1601_1700.s1605_find_valid_matrix_given_row_and_column_sums;

// #Medium #Array #Greedy #Matrix #2022_04_11_Time_2_ms_(98.45%)_Space_50.4_MB_(89.85%)

public class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int[][] ans = new int[rowSum.length][colSum.length];
        for (int i = 0; i < rowSum.length; i++) {
            for (int j = 0; j < colSum.length; j++) {
                if (rowSum[i] != 0 && colSum[j] != 0) {
                    ans[i][j] = Math.min(rowSum[i], colSum[j]);
                    rowSum[i] -= ans[i][j];
                    colSum[j] -= ans[i][j];
                }
            }
        }
        return ans;
    }
}
