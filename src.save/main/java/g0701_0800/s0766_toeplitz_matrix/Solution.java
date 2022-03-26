package g0701_0800.s0766_toeplitz_matrix;

// #Easy #Array #Matrix #2022_03_26_Time_1_ms_(83.45%)_Space_45.8_MB_(49.31%)

public class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int i = 0;
        int j = 0;
        int sameVal = matrix[i][j];
        while (++i < m && ++j < n) {
            if (matrix[i][j] != sameVal) {
                return false;
            }
        }

        for (i = 1, j = 0; i < m; i++) {
            int tmpI = i;
            int tmpJ = j;
            sameVal = matrix[i][j];
            while (++tmpI < m && ++tmpJ < n) {
                if (matrix[tmpI][tmpJ] != sameVal) {
                    return false;
                }
            }
        }
        for (i = 0, j = 1; j < n; j++) {
            int tmpJ = j;
            int tmpI = i;
            sameVal = matrix[tmpI][tmpJ];
            while (++tmpI < m && ++tmpJ < n) {
                if (matrix[tmpI][tmpJ] != sameVal) {
                    return false;
                }
            }
        }
        return true;
    }
}
