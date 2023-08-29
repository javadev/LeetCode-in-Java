package g1301_1400.s1314_matrix_block_sum;

// #Medium #Array #Matrix #Prefix_Sum #Dynamic_Programming_I_Day_14
// #2022_03_18_Time_5_ms_(67.46%)_Space_49.1_MB_(41.82%)

public class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[][] prefixSum = new int[rows + 1][cols + 1];
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                prefixSum[i][j] =
                        mat[i - 1][j - 1]
                                - prefixSum[i - 1][j - 1]
                                + prefixSum[i - 1][j]
                                + prefixSum[i][j - 1];
            }
        }

        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int iMin = Math.max(i - k, 0);
                int iMax = Math.min(i + k, rows - 1);
                int jMin = Math.max(j - k, 0);
                int jMax = Math.min(j + k, cols - 1);
                result[i][j] =
                        prefixSum[iMin][jMin]
                                + prefixSum[iMax + 1][jMax + 1]
                                - prefixSum[iMax + 1][jMin]
                                - prefixSum[iMin][jMax + 1];
            }
        }
        return result;
    }
}
