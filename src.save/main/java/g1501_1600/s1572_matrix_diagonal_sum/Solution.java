package g1501_1600.s1572_matrix_diagonal_sum;

// #Easy #Array #Matrix #Programming_Skills_I_Day_7_Array #Udemy_2D_Arrays/Matrix
// #2022_04_11_Time_3_ms_(10.25%)_Space_48.3_MB_(26.47%)

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int diagonalSum(int[][] mat) {
        int m = mat.length;
        Set<Integer> added = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    added.add(i * m + j);
                    sum += mat[i][j];
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = m - 1; j >= 0; j--) {
                if (i + j == m - 1 && added.add(i * m + j)) {
                    sum += mat[i][j];
                }
            }
        }
        return sum;
    }
}
