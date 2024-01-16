package g1501_1600.s1572_matrix_diagonal_sum;

// #Easy #Array #Matrix #Programming_Skills_I_Day_7_Array #Udemy_2D_Arrays/Matrix
// #2023_09_03_Time_0_ms_(100.00%)_Space_43.9_MB_(57.91%)

public class Solution {
    public int diagonalSum(int[][] mat) {
        int len = mat.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += mat[i][i] + mat[i][len - 1 - i];
        }
        if (len % 2 != 0) {
            sum -= mat[len / 2][len / 2];
        }
        return sum;
    }
}
