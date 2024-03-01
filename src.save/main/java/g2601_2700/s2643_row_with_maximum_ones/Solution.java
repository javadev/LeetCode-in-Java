package g2601_2700.s2643_row_with_maximum_ones;

// #Easy #Array #Matrix #2023_09_05_Time_1_ms_(100.00%)_Space_44.6_MB_(89.31%)

public class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int row = -1;
        int best = -1;
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
            if (sum > best) {
                best = sum;
                row = i;
            }
        }
        return new int[] {row, best};
    }
}
