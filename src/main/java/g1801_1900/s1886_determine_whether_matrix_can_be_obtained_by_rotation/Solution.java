package g1801_1900.s1886_determine_whether_matrix_can_be_obtained_by_rotation;

// #Easy #Array #Matrix #Programming_Skills_II_Day_7
// #2022_05_10_Time_1_ms_(78.38%)_Space_40.8_MB_(83.17%)

import java.util.Arrays;

public class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {
        for (int i = 0; i < 4; i++) {
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }
            rotate(mat);
        }
        return false;
    }

    private void rotate(int[][] mat) {
        // Reverse Rows
        for (int i = 0, j = mat.length - 1; i < j; i++, j--) {
            int[] tempRow = mat[i];
            mat[i] = mat[j];
            mat[j] = tempRow;
        }
        // Transpose
        for (int i = 0; i < mat.length; i++) {
            for (int j = i + 1; j < mat.length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}
