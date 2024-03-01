package g3001_3100.s3033_modify_the_matrix;

// #Easy #Array #Matrix #2024_03_01_Time_1_ms_(100.00%)_Space_45.4_MB_(77.37%)

public class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == -1) {
                    int y = 0;
                    for (int[] ints : matrix) {
                        if (ints[j] > y) {
                            y = ints[j];
                        }
                    }
                    matrix[i][j] = y;
                }
            }
        }
        return matrix;
    }
}
